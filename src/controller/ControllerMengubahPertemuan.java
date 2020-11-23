/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.ControllerMengisiPertemuan.mengecekInputan;
import dao.DaoBeritaAcara;
import dao.DaoPresensi;
import helper.TabelIsiPresensi;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.BeritaAcara;
import model.Materi;
import model.Presensi;
import view.FrameUbahPresensiKelas;

/**
 *
 * @author RiansyahT
 */
public class ControllerMengubahPertemuan {
    private FrameUbahPresensiKelas frameUbahPresensi;
    private List<Presensi> listPresensi;
    private BeritaAcara beritaAcara;
    private DaoPresensi dbPresensi;    
    private DaoBeritaAcara dbBeritaAcara;    
    
    //konstruktor untuk frame ubah presensi kelas 
    public ControllerMengubahPertemuan(FrameUbahPresensiKelas frameUbahPresensi, int idPbm, int pertemuan) {
        this.frameUbahPresensi = frameUbahPresensi;
        dbPresensi = new DaoPresensi();
        dbBeritaAcara = new DaoBeritaAcara();
        listPresensi = dbPresensi.getPresensi(idPbm, pertemuan);
        beritaAcara = dbBeritaAcara.getBeritaAcara(pertemuan, idPbm);
    }
    
    public void melihatUbahPresensi(int idPbm) {
        DaoBeritaAcara bAcara = new DaoBeritaAcara();
        //TabelIsiPresensi dapat memuat 2 opsi yakni untuk penginputan presensi dan view presensi
        TabelIsiPresensi tbPresensi = new TabelIsiPresensi(listPresensi);
        frameUbahPresensi.getMateriComboBox().setModel(bAcara.getMateri(idPbm));
        frameUbahPresensi.getPresensiTable().setModel(tbPresensi);
        frameUbahPresensi.getPertemuanText().setText("" + beritaAcara.getPertemuan());
        frameUbahPresensi.getTanggalText().setDate((Date) beritaAcara.getTanggal());
        frameUbahPresensi.getBeritaAcaraText().setText(beritaAcara.getBeritaAcara());
    }

    public void mengubahPresensi(int idPbm) {
        //tidak bisa dibuat datanya dikarenakan terdapat 2 frame yg berbeda(frame ubah dengan frame isi)
        Presensi p = new Presensi();
        BeritaAcara b = new BeritaAcara();
        
        Materi materi = (Materi) frameUbahPresensi.getMateriComboBox().getSelectedItem();
        int pertemuan = Integer.parseInt(frameUbahPresensi.getPertemuanText().getText());
        Date tgl = frameUbahPresensi.getTanggalText().getDate();
        String berita_acara = frameUbahPresensi.getBeritaAcaraText().getText();
        String statusKehadiranGuru = frameUbahPresensi.getStatusKehadiranGuru();
        //method mengecek inputan berasal dari controller mengisi presensi
        if (mengecekInputan(berita_acara, tgl) == false) {
            JOptionPane.showMessageDialog(new JFrame(), "Presensi Gagal Diubah ! \nKolom berita acara atau tanggal tidak boleh kosong",
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            //buat pengulangan sebanyak siswa dalam 1 kelas ini
            int totalSiswa = frameUbahPresensi.getPresensiTable().getRowCount();
            String statusKehadiran;
            for (int i = 0; i < totalSiswa; i++) {
                String nis = (String) frameUbahPresensi.getPresensiTable().getValueAt(i, 0);
                boolean statusHadir = (boolean) frameUbahPresensi.getPresensiTable().getValueAt(i, 2);
                if (statusHadir == true) {
                    statusKehadiran = "hadir";
                } else {
                    statusKehadiran = "tidak";
                }
                p.setPertemuan(pertemuan);
                p.setNis(nis);
                p.setStatusKehadiran(statusKehadiran);
                //mengubah presensi
                b.setTanggal(tgl);
                b.setIdMateri(materi.getIdMateri());
                b.setBeritaAcara(berita_acara);
                b.setStatusHadirGuru(statusKehadiranGuru);
                if (i == totalSiswa - 1) {
                    new DaoPresensi().updatePresensi(p,b, idPbm);
                } else {
                    new DaoPresensi().updatePresensi(p,b, idPbm);
                }
            }
            JOptionPane.showMessageDialog(new JFrame(), "Presensi Berhasil Diubah !",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE);
            frameUbahPresensi.setVisible(false);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoBeritaAcara;
import dao.DaoPresensi;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import helper.TabelIsiPresensi;
import model.BeritaAcara;
import model.Materi;
import model.Presensi;
import view.FrameIsiPresensiKelas;

/**
 *
 * @author muhriansyah
 */
public class ControllerMengisiPertemuan {

    private FrameIsiPresensiKelas frameIsiPresensi;
    private List<Presensi> listPresensi;
    private DaoPresensi dataPresensi;
    
    //konstruktor untuk frame input presensi kelas 
    public ControllerMengisiPertemuan(FrameIsiPresensiKelas frameIsiPresensi, int idKelas, int pertemuan) {
        this.frameIsiPresensi = frameIsiPresensi;
        frameIsiPresensi.getPertemuanText().setText("" + pertemuan);
        dataPresensi = new DaoPresensi();
        listPresensi = dataPresensi.getPresensi(idKelas);
    }

    public static boolean mengecekInputan(String berita_acara, Date tgl) {
        return !(berita_acara.equals("") || tgl == null);
    }
        
    public void melihatIsiPresensi(int idMapel) {
        //TabelIsiPresensi dapat memuat 2 opsi yakni untuk penginputan presensi dan view presensi
        TabelIsiPresensi tbPresensi = new TabelIsiPresensi(listPresensi);
        frameIsiPresensi.getMateriComboBox().setModel(new DaoBeritaAcara().getMateri(idMapel));
        frameIsiPresensi.getPresensiTable().setModel(tbPresensi);
    }
    

    public void menyimpanPresensi(int idPbm) {
        //tidak bisa dibuat datanya dikarenakan terdapat 2 frame yg berbeda(frame ubah dengan frame isi)
        Presensi p = new Presensi();
        //presensi dan berita acara dibuat berbeda penginputannya
        BeritaAcara b = new BeritaAcara();
        Materi materi = (Materi) frameIsiPresensi.getMateriComboBox().getSelectedItem();
        int pertemuan = Integer.parseInt(frameIsiPresensi.getPertemuanText().getText());
        Date tgl = frameIsiPresensi.getTanggalText().getDate();
        String berita_acara = frameIsiPresensi.getBeritaAcaraText().getText();
        String statusHadirGuru = frameIsiPresensi.getStatusKehadiranGuru();
        if (mengecekInputan(berita_acara, tgl) == false) {
            JOptionPane.showMessageDialog(new JFrame(), "Presensi Gagal Disimpan ! \nKolom berita acara atau tanggal tidak boleh kosong",
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            //buat pengulangan sebanyak siswa dalam 1 kelas ini
            int totalSiswa = frameIsiPresensi.getPresensiTable().getRowCount();
            String statusKehadiran;
            for (int i = 0; i < totalSiswa; i++) {
                String nis = (String) frameIsiPresensi.getPresensiTable().getValueAt(i, 0);
                boolean statusHadir = (boolean) frameIsiPresensi.getPresensiTable().getValueAt(i, 2);
                if (statusHadir == true) {
                    statusKehadiran = "hadir";
                } else {
                    statusKehadiran = "tidak";
                }
                p.setPertemuan(pertemuan);
                p.setNis(nis);
                p.setStatusKehadiran(statusKehadiran);
                //data yang diisi pada beritaacara
                b.setTanggal(tgl);
                b.setIdMateri(materi.getIdMateri());
                b.setBeritaAcara(berita_acara);
                b.setStatusHadirGuru(statusHadirGuru);
                if (i == totalSiswa - 1) {
                    new DaoPresensi().insertPresensi(p,b, idPbm);
                } else {
                    new DaoPresensi().insertPresensi(p,b, idPbm);
                }
            }
            JOptionPane.showMessageDialog(new JFrame(), "Presensi Berhasil Disimpan!",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE);
            frameIsiPresensi.setVisible(false);
        }
    }


}

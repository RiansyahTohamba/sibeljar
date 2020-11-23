/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoBeritaAcara;
import dao.DaoPresensi;
import helper.ComboboxPertemuan;
import helper.TabelPresensi;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.BeritaAcara;
import model.Presensi;
import view.FramePresensiKelas;

/**
 *
 * @author RiansyahT
 */
public class ControllerMelihatPertemuan {
//    Presensi dataInputPresensi;

    private FramePresensiKelas framePresensi;
    private List<Presensi> listPresensi;
    private List<Presensi> listPertemuanCount;
    private BeritaAcara beritaAcara;
    private DaoPresensi dbPresensi;
    private DaoBeritaAcara dbBeritaAcara;

    //konstruktor untuk frame pengelolaan presensi kelas 
    public ControllerMelihatPertemuan(FramePresensiKelas framePresensi, int idPbm, int pertemuan) {
        this.framePresensi = framePresensi;
        dbPresensi = new DaoPresensi();
        dbBeritaAcara = new DaoBeritaAcara();
        listPresensi = dbPresensi.getPresensi(idPbm, pertemuan);
        listPertemuanCount = dbPresensi.getPertemuan(idPbm);
        beritaAcara = dbBeritaAcara.getBeritaAcara(pertemuan, idPbm);
    }

    public ControllerMelihatPertemuan(int idPbm, int pertemuan) {
        dbPresensi = new DaoPresensi();
        dbBeritaAcara = new DaoBeritaAcara();
        listPresensi = dbPresensi.getPresensi(idPbm, pertemuan);
        listPertemuanCount = dbPresensi.getPertemuan(idPbm);
        beritaAcara = dbBeritaAcara.getBeritaAcara(pertemuan, idPbm);
    }

    public void setComboBoxPertemuan() {
        //untuk mengisi combobox pertemuan
        if (listPertemuanCount == null) {
            framePresensi.getPertemuanComboBox().setModel(new DefaultComboBoxModel());
        } else {
            framePresensi.getPertemuanComboBox().setModel(new ComboboxPertemuan().getPertemuan(listPertemuanCount));
        }
    }

    public void setBeritaAcara(int idPbm) {
        framePresensi.getMataPelajaranText().setText(dbBeritaAcara.getBeritaAcara(idPbm).getMataPelajaran());
        framePresensi.getKelasText().setText(dbBeritaAcara.getBeritaAcara(idPbm).getKelas());
        framePresensi.getJamText().setText(dbBeritaAcara.getBeritaAcara(idPbm).getJam());
        framePresensi.getGuruText().setText(dbBeritaAcara.getBeritaAcara(idPbm).getGuru());
        framePresensi.getNipText().setText(dbBeritaAcara.getBeritaAcara(idPbm).getNip());
        if (beritaAcara == null) {
            framePresensi.getUbahButton().setVisible(false);
            framePresensi.getCetakButton().setVisible(false);
        } else {
            framePresensi.getUbahButton().setVisible(true);
            framePresensi.getCetakButton().setVisible(true);
            framePresensi.getPertemuanText().setText("" + beritaAcara.getPertemuan());
            framePresensi.getTanggalText().setText("" + beritaAcara.getTanggal());
            framePresensi.getBabText().setText(beritaAcara.getBab());
            framePresensi.getBeritaAcaraText().setText(beritaAcara.getBeritaAcara());
            framePresensi.getKehadiranGuruText().setText(beritaAcara.getStatusHadirGuru());
        }
    }

    public void setTabelPresensi() {
        TabelPresensi tbPresensi = new TabelPresensi(listPresensi);
        framePresensi.getPresensiTable().setModel(tbPresensi);
    }

//  digunakan untuk men-set data pertemuan saat ini, materi dan kelas sesuai kegiatan belajar mengajar
    public void setDataTambahPresensi(int idPbm) {
        BeritaAcara beritaAcaraTambahPresensi = new DaoBeritaAcara().getBeritaAcaraTambahPresensi(idPbm);
        int pertemuanSaatIni = beritaAcaraTambahPresensi.getTotalPertemuan() + 1;
        framePresensi.setIdMapel(beritaAcaraTambahPresensi.getIdMapel());
        framePresensi.setIdKelas(beritaAcaraTambahPresensi.getIdKelas());
        framePresensi.setPertemuan(pertemuanSaatIni);
    }

}

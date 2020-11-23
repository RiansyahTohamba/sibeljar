/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoBelajarMengajar;
import dao.DaoHari;
import java.util.List;
import model.BelajarMengajar;
import helper.ComboboxHari;
import model.Hari;
import helper.TabelBelajarMengajar;
import view.FrameBelajarMengajar;

/**
 *
 * @author RiansyahT
 */
public class ControllerMelihatBelajarMengajar {
    
    FrameBelajarMengajar frameBM;
    List<BelajarMengajar> listBelajarMengajar;
    List<Hari> listHari;
    DaoBelajarMengajar dbBelajarMengajar;
    DaoHari dbHari;
    
    //konstruktor untuk frame pengelolaan kegiatan belajar mengajar
    public ControllerMelihatBelajarMengajar(FrameBelajarMengajar frameBM, int idHari) {
        this.frameBM = frameBM;
        dbHari = new DaoHari();
        listHari = dbHari.getAll();
        dbBelajarMengajar = new DaoBelajarMengajar();
        listBelajarMengajar = dbBelajarMengajar.getAll(idHari);
    }
    
    public void setComboBoxHari() {
        //untuk mengisi combobox hari, dipisah dengan melihat tabel belajar mengajar, 
        //karena kalau digabung, hari tidak berubah saat terjadi event kombobox
        frameBM.getHariComboBox().setModel(new ComboboxHari().getHari(listHari));
    }

    public void setTabelBelajarMengajar() {
        TabelBelajarMengajar tblBM = new TabelBelajarMengajar(listBelajarMengajar);
        //pengisian tabel belajar mengajar
        frameBM.getBelajarMengajarTable().setModel(tblBM);
    }
    
}

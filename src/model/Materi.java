/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author muhriansyah
 */
public class Materi {
    int idMateri;
    String bab;

    //untuk helper combobox materi saat pengisian presensi
    public Materi(int idMateri, String bab) {
        this.idMateri = idMateri;
        this.bab = bab;
    }

    public int getIdMateri() {
        return idMateri;
    }

    public void setIdMateri(int idMateri) {
        this.idMateri = idMateri;
    }

    public String getBab() {
        return bab;
    }

    public void setBab(String bab) {
        this.bab = bab;
    }

    @Override
    public String toString() {
        return this.bab; //mengembalikan string bab
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author RiansyahT
 */
public class BeritaAcara {
    
    //objek matapelajaran
    private int idMapel;
    private String mataPelajaran;
    
    //objek bab
    private int idMateri;    
    private String bab;
    
    //objek kelas
    private int idKelas;
    private String kelas;
    
    private int totalPertemuan;
    private Date tanggal;
    private int pertemuan;
    private String beritaAcara;
    private String jam;
    
    //data guru
    private String nip;
    private String guru;
    private String statusHadirGuru;
    
    
    
    public BeritaAcara() {
    }
    
    //konstruktor untuk men-set data untuk pengubahan/penambahan presensi
    public BeritaAcara(int idMapel, int idKelas, int totalPertemuan) {
        this.idMapel = idMapel;
        this.idKelas = idKelas;
        this.totalPertemuan = totalPertemuan;
    }
    
//    untuk pengambilan nilai berita acara presensi jika pertemuan masih 0
    public BeritaAcara(String mataPelajaran, String kelas, String jam,
                String nip,String guru
    ) {
        this.mataPelajaran = mataPelajaran;
        this.kelas = kelas;
        this.jam = jam;
        this.nip = nip;
        this.guru = guru;
    }
     
    //konstruktor untuk meretrive berita acara jika pertemuan > 0
    public BeritaAcara(int pertemuan,Date tanggal, String beritaAcara, 
            String mataPelajaran, String bab, String kelas, String jam,
            String nip,String guru,String statusHadirGuru
    ) {
        this.pertemuan = pertemuan;
        this.tanggal = tanggal;
        this.beritaAcara = beritaAcara;
        this.mataPelajaran = mataPelajaran;
        this.bab = bab;
        this.kelas = kelas;
        this.jam = jam;
        this.nip = nip;
        this.guru = guru;
        this.statusHadirGuru = statusHadirGuru;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getGuru() {
        return guru;
    }

    public void setGuru(String guru) {
        this.guru = guru;
    }

    public String getStatusHadirGuru() {
        return statusHadirGuru;
    }

    public void setStatusHadirGuru(String statusHadirGuru) {
        this.statusHadirGuru = statusHadirGuru;
    }

    
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getTotalPertemuan() {
        return totalPertemuan;
    }

    public void setTotalPertemuan(int totalPertemuan) {
        this.totalPertemuan = totalPertemuan;
    }

    
    public int getIdMapel() {
        return idMapel;
    }

    public void setIdMapel(int idMapel) {
        this.idMapel = idMapel;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public int getIdMateri() {
        return idMateri;
    }

    public void setIdMateri(int idMateri) {
        this.idMateri = idMateri;
    }

    public int getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(int pertemuan) {
        this.pertemuan = pertemuan;
    }

    public String getBeritaAcara() {
        return beritaAcara;
    }

    public void setBeritaAcara(String beritaAcara) {
        this.beritaAcara = beritaAcara;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String getBab() {
        return bab;
    }

    public void setBab(String bab) {
        this.bab = bab;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

}

package model;
// Generated Oct 26, 2014 8:09:06 PM by Hibernate Tools 3.6.0

/**
 * TbBelajarMengajar generated by hbm2java
 */
public class BelajarMengajar implements java.io.Serializable {

    private String idHari;
    
    private int idKelas;
    
    //obj Guru    
    private int nip;
    private String guru;
    private String mapel;
    
    
    private Integer idPbm;    
    private String kelas;
    private String jam;
    
    
    

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getMapel() {
        return mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getGuru() {
        return guru;
    }

    public void setGuru(String guru) {
        this.guru = guru;
    }

    public Integer getIdPbm() {
        return this.idPbm;
    }

    public void setIdPbm(Integer idPbm) {
        this.idPbm = idPbm;
    }

    public String getIdHari() {
        return this.idHari;
    }

    public void setIdHari(String idHari) {
        this.idHari = idHari;
    }

    public int getIdKelas() {
        return this.idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

}

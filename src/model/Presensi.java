package model;
// Generated Oct 26, 2014 8:09:06 PM by Hibernate Tools 3.6.0



/**
 * TbPresensi generated by hbm2java
 */
public class Presensi  implements java.io.Serializable {


    private int pertemuan;
    private String statusKehadiran;//untuk menyimpan nilai "hadir" dan "tidak"
    private boolean statusHadir;//untuk kombobox saat menampilkan frame pengubahan kehadiran
    private String nis;
    private String namaSiswa;


    @Override
    public String toString() {
        return ""+pertemuan; 
    }
     
    public int getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(int pertemuan) {
        this.pertemuan = pertemuan;
    }

    public boolean isStatusHadir() {
        return statusHadir;
    }

    public void setStatusHadir(boolean statusHadir) {
        this.statusHadir = statusHadir;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }
    
    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }
   
    
    public String getStatusKehadiran() {
        return this.statusKehadiran;
    }
    
    public void setStatusKehadiran(String statusKehadiran) {
        this.statusKehadiran = statusKehadiran;
    }
   
    public String getNis() {
        return this.nis;
    }
    
    public void setNis(String nis) {
        this.nis = nis;
    }
 



}



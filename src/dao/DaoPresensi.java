/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.BeritaAcara;
import model.Presensi;

/**
 *
 * @author muhriansyah
 */
public class DaoPresensi {

    Connection conn;

    public DaoPresensi() {
        conn = Koneksi.connection();
    }

    
    
    //mengambil isi presensi siswa dari tabel
    public List<Presensi> getPresensi(int idPbm, int pertemuan) {
        String melihatPresensi = "SELECT DISTINCT (tb_siswa.nis),nama,status_kehadiran"
                + "            FROM tb_siswa,tb_kelas,tb_presensi,tb_belajar_mengajar "
                + "            WHERE pertemuan = " + pertemuan + " AND tb_presensi.id_pbm  = " + idPbm
                + "                AND tb_siswa.id_kelas = tb_kelas.id_kelas "
                + "                AND tb_siswa.nis = tb_presensi.nis                "
                + "                AND tb_presensi.id_pbm = tb_belajar_mengajar.id_pbm"
                + "            ORDER BY tb_siswa.nama ASC"
                + "";
        List<Presensi> listPresensi = null;
        try {
            listPresensi = new ArrayList<Presensi>();
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatPresensi);
            while (query.next()) {
                Presensi data = new Presensi();
                data.setNis(query.getString("nis"));
                data.setNamaSiswa(query.getString("nama"));
                data.setStatusKehadiran(query.getString("status_kehadiran"));
                if("hadir".equals(query.getString("status_kehadiran"))){
                    data.setStatusHadir(true);
                }else{
                    data.setStatusHadir(false);
                }
                listPresensi.add(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return listPresensi;
    }

    public boolean insertPresensi(Presensi p,BeritaAcara b, int idPbm) {
        Statement statement = null;
        
        boolean status = false;
        try {
            String tgl = (b.getTanggal().getYear()+1900)+"-"+b.getTanggal().getMonth()+"-"+b.getTanggal().getDate();
            statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_presensi (pertemuan, status_kehadiran, id_presensi, tanggal, id_pbm, nis, berita_acara,status_hadir_guru, id_materi)"
                    + "VALUES "
                    + "(" + p.getPertemuan() + ","
                    + "'" + p.getStatusKehadiran() + "',"
                    + "NULL,"
                    + "'"+tgl+"',"
                    + "" + idPbm + ","
                    + "'" + p.getNis() + "',"
                    + "'" + b.getBeritaAcara() + "',"
                    + "'" + b.getStatusHadirGuru()+ "',"
                    + "" + b.getIdMateri() + ")"
            );
            status = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }
    
    public boolean updatePresensi(Presensi p,BeritaAcara b, int idPbm) {
        Statement statement = null;
        boolean status = false;
        try {
            String tgl = (b.getTanggal().getYear()+1900)+"-"+b.getTanggal().getMonth()+"-"+b.getTanggal().getDate();
            statement = conn.createStatement();            
            statement.executeUpdate("UPDATE tb_presensi SET "
                    + "status_kehadiran = '"+p.getStatusKehadiran()+"', "
                    + "tanggal = '"+tgl+"', " 
                    + "berita_acara = '"+b.getBeritaAcara()+"', "
                    + "status_hadir_guru = '"+b.getStatusHadirGuru()+"', "
                    + "id_materi = "+b.getIdMateri()
                    + " WHERE id_pbm = "+idPbm+" AND pertemuan = "+p.getPertemuan()
                    + " AND nis = "+p.getNis()
            );
            status = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }

    //untuk input presensi
    public List<Presensi> getPresensi(int idKelas) {
        String melihatPresensi = "SELECT tb_siswa.nis,nama "
                + "            FROM tb_siswa,tb_kelas "
                + "            WHERE tb_kelas.id_kelas  = " + idKelas
                + "                AND tb_siswa.id_kelas = tb_kelas.id_kelas "
                + "            ORDER BY tb_siswa.nama ASC"
                + "";
        List<Presensi> listPresensi = null;
        try {
            listPresensi = new ArrayList<Presensi>();
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatPresensi);
            while (query.next()) {
                Presensi data = new Presensi();
                data.setNis(query.getString("nis"));
                data.setNamaSiswa(query.getString("nama"));
                listPresensi.add(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return listPresensi;
    }

    public List<Presensi> getPertemuan(int idPbm) {
        String pertemuan = "SELECT DISTINCT(pertemuan) FROM tb_presensi WHERE id_pbm = " + idPbm;
        List<Presensi> listPresensi = null;
        try {
            listPresensi = new ArrayList<Presensi>();
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(pertemuan);
            while (query.next()) {
                Presensi data = new Presensi();
                data.setPertemuan(query.getInt("pertemuan"));
                listPresensi.add(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return listPresensi;
    }

}

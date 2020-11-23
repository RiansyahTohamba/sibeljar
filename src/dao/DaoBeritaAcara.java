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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import koneksi.Koneksi;
import model.BeritaAcara;
import model.Materi;

/**
 *
 * @author RiansyahT
 */
public class DaoBeritaAcara {

    Connection conn;

    public DaoBeritaAcara() {
        conn = Koneksi.connection();
    }

    public DefaultComboBoxModel getMateri(int pertemuan, int idPbm) {
        pertemuan = 2;
        idPbm = 1;
        DefaultComboBoxModel materi = new DefaultComboBoxModel();
        String melihatBab = "SELECT tb_presensi.id_materi as idMateri,bab "
                + " FROM tb_presensi,tb_materi "
                + " WHERE pertemuan = " + pertemuan
                + " AND id_pbm = " + idPbm
                + " AND tb_presensi.id_materi = tb_materi.id_materi "
                + " LIMIT 0,1";
        try {
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatBab);
            while (query.next()) {
                materi.addElement(new Materi(2, query.getString("bab")));
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return materi;
    }

    public BeritaAcara getBeritaAcara(int idPbm) {
        String melihatPresensi = "SELECT kelas,tb_matapelajaran.nama as mapel,jam,tb_guru.nama as guru,tb_guru.nip  "
                + "            FROM tb_belajar_mengajar,tb_matapelajaran,tb_guru,tb_kelas "
                + "            WHERE tb_belajar_mengajar.id_pbm  = " + idPbm
                + "                AND tb_kelas.id_kelas = tb_belajar_mengajar.id_kelas"
                + "                AND tb_belajar_mengajar.nip = tb_guru.nip"
                + "                AND tb_guru.id_mapel = tb_matapelajaran.id_mapel"
                + "";
        BeritaAcara beritaAcara = null;
        try {
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatPresensi);
            while (query.next()) {
                beritaAcara = new BeritaAcara(query.getString("mapel"),
                        query.getString("kelas"),query.getString("jam"),
                        query.getString("nip"), query.getString("guru") 
                );
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoBeritaAcara.class.getName()).log(Level.SEVERE, null, e);
        }
        return beritaAcara;
    }
    
    public BeritaAcara getBeritaAcaraTambahPresensi(int idPbm) {
        String melihatPresensi = "SELECT max(pertemuan) as total_pertemuan,id_mapel,id_kelas "
                + "            FROM tb_presensi,tb_belajar_mengajar,tb_guru"
                + "            WHERE tb_presensi.id_pbm  = " + idPbm
                + "               AND tb_presensi.id_pbm = tb_belajar_mengajar.id_pbm"
                + "               AND tb_guru.nip = tb_belajar_mengajar.nip"
                + "";
        BeritaAcara beritaAcaraTambahPresensi = null;
        try {
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatPresensi);
            while (query.next()) {
                beritaAcaraTambahPresensi = new BeritaAcara(
                        query.getInt("id_mapel"),
                        query.getInt("id_kelas"),
                        query.getInt("total_pertemuan")
                );
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return beritaAcaraTambahPresensi;
    }
    
    public BeritaAcara getBeritaAcara(int pertemuan, int idPbm) {
        String melihatPresensi = "SELECT berita_acara,tanggal,tb_matapelajaran.nama as mapel,bab,kelas,jam,status_hadir_guru,tb_guru.nama as guru,tb_guru.nip "
                + "            FROM tb_presensi,tb_belajar_mengajar,tb_matapelajaran,tb_guru,tb_materi,tb_kelas "
                + "            WHERE pertemuan = " + pertemuan + " AND tb_presensi.id_pbm  = " + idPbm
                + "                AND tb_presensi.id_pbm = tb_belajar_mengajar.id_pbm"
                + "                AND tb_kelas.id_kelas = tb_belajar_mengajar.id_kelas"
                + "                AND tb_presensi.id_pbm = tb_belajar_mengajar.id_pbm"
                + "                AND tb_belajar_mengajar.nip = tb_guru.nip"
                + "                AND tb_guru.id_mapel = tb_matapelajaran.id_mapel"
                + "                AND tb_materi.id_materi = tb_presensi.id_materi"
                + "                AND tb_materi.id_mapel = tb_matapelajaran.id_mapel"
                + "";
        BeritaAcara beritaAcara = null;
        try {
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatPresensi);
            while (query.next()) {
                beritaAcara = new BeritaAcara(pertemuan, query.getDate("tanggal"),
                        query.getString("berita_acara"), query.getString("mapel"),
                        query.getString("bab"), query.getString("kelas"), query.getString("jam"), 
                        query.getString("nip"), query.getString("guru"), query.getString("status_hadir_guru")
                );
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoBeritaAcara.class.getName()).log(Level.SEVERE, null, e);
        }
        return beritaAcara;
    }
    
    public DefaultComboBoxModel getMateri(int idMapel) {
        DefaultComboBoxModel materi = new DefaultComboBoxModel();
        String pertemuan = "SELECT bab,id_materi "
                + " FROM tb_materi"
                + " WHERE id_mapel = " + idMapel
                + " ";
        try {
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(pertemuan);
            while (query.next()) {
                materi.addElement(new Materi(query.getInt("id_materi"), query.getString("bab")));
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoPresensi.class.getName()).log(Level.SEVERE, null, e);
        }
        return materi;
    }
}

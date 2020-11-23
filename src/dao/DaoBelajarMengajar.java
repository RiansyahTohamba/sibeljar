/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.BelajarMengajar;

/**
 *
 * @author muhriansyah
 */
public class DaoBelajarMengajar {

    Connection conn;

    public DaoBelajarMengajar() {
        conn = Koneksi.connection();
    }

    public List<BelajarMengajar> getAll(int idHari) {
        String melihatBelajarMengajar = "SELECT tb_belajar_mengajar.id_pbm as link,kelas,jam,tb_matapelajaran.nama as mapel,tb_guru.nama as guru "
                + "FROM tb_belajar_mengajar, tb_hari,tb_kelas,tb_guru,tb_matapelajaran "
                + "WHERE tb_hari.id_hari = "+idHari+" AND "
                + "tb_belajar_mengajar.id_hari = tb_hari.id_hari AND "
                + "tb_belajar_mengajar.id_kelas = tb_kelas.id_kelas AND "
                + "tb_belajar_mengajar.nip = tb_guru.nip AND "
                + "tb_guru.id_mapel = tb_matapelajaran.id_mapel "
                + "ORDER BY tb_kelas.kelas ASC";
        List<BelajarMengajar> listTbBelajarMengajar = null;
        try {
            listTbBelajarMengajar = new ArrayList<BelajarMengajar>();
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(melihatBelajarMengajar);
            
            while (query.next()) {
                BelajarMengajar data = new BelajarMengajar();
                data.setIdPbm(query.getInt("link"));
                data.setKelas(query.getString("kelas"));
                data.setJam(query.getString("jam"));
                data.setMapel(query.getString("mapel"));
                data.setGuru(query.getString("guru"));
                listTbBelajarMengajar.add(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoBelajarMengajar.class.getName()).log(Level.SEVERE, null, e);
        }
        return listTbBelajarMengajar;
    }

}

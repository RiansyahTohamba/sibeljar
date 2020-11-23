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
import model.Hari;

/**
 *
 * @author muhriansyah
 */
public class DaoHari {

    Connection conn;

    public DaoHari() {
        conn = Koneksi.connection();
    }

    public List<Hari> getAll() {
        List<Hari> listTbHari = null;
        String daftarHari = "SELECT * FROM tb_hari";
        try {
            listTbHari = new ArrayList<Hari>();
            Statement st = conn.createStatement();
            ResultSet query = st.executeQuery(daftarHari);
            while (query.next()) {
                Hari data = new Hari();
                data.setIdHari(query.getString("id_hari"));
                data.setHari(query.getString("hari"));
                listTbHari.add(data);
            }
        } catch (SQLException e) {
            Logger.getLogger(DaoHari.class.getName()).log(Level.SEVERE, null, e);
        }
        return listTbHari;
    }
    
}

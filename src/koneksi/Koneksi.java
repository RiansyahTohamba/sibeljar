/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author muhriansyah
 */
public class Koneksi {

    static Connection conn;

    public static Connection connection(){
        if (conn == null) {
            MysqlDataSource db = new MysqlConnectionPoolDataSource();
            db.setDatabaseName("db_sibelajar");
            db.setUser("root");
            db.setPassword("");
            try {
                conn = db.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}

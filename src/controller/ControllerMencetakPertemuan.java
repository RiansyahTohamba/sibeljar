/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RiansyahT
 */
public class ControllerMencetakPertemuan {

    public ControllerMencetakPertemuan() {
    }
    
    public void mencetakPertemuan(int idPbm, int pertemuan) {
       Connection koneksi = Koneksi.connection();
       try{
           HashMap paramater = new HashMap();
           paramater.put("idPbmText", idPbm);
           paramater.put("pertemuanText", pertemuan);
           JasperPrint jp = JasperFillManager.fillReport("src/aset/reportPresensi.jasper",paramater,koneksi);
           JasperViewer.viewReport(jp,false);
       } catch(JRException e){
       }        
    }
    
}

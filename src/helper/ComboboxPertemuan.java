/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import model.Presensi;

/**
 *
 * @author muhriansyah
 */
public class ComboboxPertemuan {
    
    public ComboBoxModel getPertemuan(List<Presensi> listTbPresensi) {
        DefaultComboBoxModel defaultComboModel = new DefaultComboBoxModel();
        Presensi presensi;
        for (Presensi objPresensi : listTbPresensi) {
//            presensi = new Presensi(objPresensi.getPertemuan(), null, null, 0, null, null);
//            defaultComboModel.addElement(presensi);
            defaultComboModel.addElement(objPresensi.getPertemuan());
        }
        return defaultComboModel;
    }

}

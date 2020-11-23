/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import model.Hari;

/**
 *
 * @author muhriansyah
 */
public class ComboboxHari {
    
    public ComboBoxModel getHari(List<Hari> listTbHari) {
        DefaultComboBoxModel defaultComboModel = new DefaultComboBoxModel();
        Hari hari;
        for (Hari objHari : listTbHari) {
            hari = new Hari(objHari.getIdHari(), objHari.getHari());
            defaultComboModel.addElement(hari);
        }
        return defaultComboModel;
    }

}

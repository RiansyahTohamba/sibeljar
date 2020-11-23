/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.BelajarMengajar;

/**
 *
 * @author muhriansyah
 */
public class TabelBelajarMengajar extends AbstractTableModel{

    List<BelajarMengajar> listBelajarMengajar;

    public TabelBelajarMengajar(List<BelajarMengajar> listBelajarMengajar) {
        this.listBelajarMengajar = listBelajarMengajar;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public int getRowCount() {
        return listBelajarMengajar.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id KBM";
            case 1:
                return "Kelas";
            case 2:
                return "Jam";
            case 3:
                return "Mata Pelajaran";
            case 4:
                return "Guru";
            default:
                return null;
        }
    }


   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //id p.belajar mengajar diambil dari id pbm
                return listBelajarMengajar.get(rowIndex).getIdPbm();
            case 1:
                //kelas diambil dari id kelas
                return listBelajarMengajar.get(rowIndex).getKelas();                
            case 2:
                //jampelajaran 
                return listBelajarMengajar.get(rowIndex).getJam();                
            case 3:
                //Matapelajaran diambil dari nip guru
                return listBelajarMengajar.get(rowIndex).getMapel();
            case 4:
                //nama guru diambil dari nip guru
                return listBelajarMengajar.get(rowIndex).getGuru();                
            default:
                return null;

        }
    }
    
}

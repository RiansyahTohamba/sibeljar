/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Presensi;

/**
 *
 * @author muhriansyah
 */
public class TabelPresensi extends AbstractTableModel{
    //untuk tabel yang status kehadirannya string("hadir"/"tidak")
    List<Presensi> listPresensi;

    public TabelPresensi(List<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public int getRowCount() {
        return listPresensi.size(); 
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIS";
            case 1:
                return "Nama";
            case 2:
                return "Status Kehadiran";
            default:
                return null;
        }
    }


   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listPresensi.get(rowIndex).getNis();
            case 1:
                return listPresensi.get(rowIndex).getNamaSiswa();                
            case 2:
                return listPresensi.get(rowIndex).getStatusKehadiran();                
            default:
                return null;

        }
    }
    
}

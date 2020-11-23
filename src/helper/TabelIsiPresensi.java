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
public class TabelIsiPresensi extends AbstractTableModel {
    //untuk tabel yang status kehadirannya booelan(karena checkbox pada tabel)
    List<Presensi> listPresensi;
    public TabelIsiPresensi(List<Presensi> listPresensi) {
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
                return listPresensi.get(rowIndex).isStatusHadir();                
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 2) {
            return Boolean.class;
        } else {
            return super.getColumnClass(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
        if (aValue != null && aValue instanceof Boolean && columnIndex == 2) {
            boolean select = (Boolean) aValue;
            listPresensi.get(rowIndex).setStatusHadir(select);
        }
    }
}

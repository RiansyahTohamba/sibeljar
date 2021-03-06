/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerMelihatPertemuan;
import controller.ControllerMencetakPertemuan;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author muhriansyah
 */
public class FramePresensiKelas extends javax.swing.JDialog {

    ControllerMelihatPertemuan cmp;
    //dibuat static karena dipake untuk frame ubah dan frame isi 
    static int idPbm;
    private int idKelas;
    private int idMapel;
    private int pertemuan;

    /**
     * Creates new form FramePresensiKelas
     */
    public FramePresensiKelas(java.awt.Frame parent, boolean modal, int idPbm) {
        super(parent, modal);
        initComponents();
        this.idPbm = idPbm;
        cmp = new ControllerMelihatPertemuan(this, idPbm, 1);//nilai default pertemuan adalah 1, untuk menampilkan frame presensi pada pertemuan 1
        cmp.setTabelPresensi();
        cmp.setComboBoxPertemuan();
        cmp.setBeritaAcara(idPbm);
    }
    
    public FramePresensiKelas(int idPbm) {
        initComponents();
        this.idPbm = idPbm;
        cmp = new ControllerMelihatPertemuan(this, idPbm, 1);//nilai default pertemuan adalah 1, untuk menampilkan frame presensi pada pertemuan 1
        cmp.setTabelPresensi();
        cmp.setComboBoxPertemuan();
        cmp.setBeritaAcara(idPbm);
    }

    public FramePresensiKelas() {
    }

    public JComboBox getPertemuanComboBox() {
        return pertemuanComboBox;
    }

    public void setPertemuanComboBox(JComboBox pertemuanComboBox) {
        this.pertemuanComboBox = pertemuanComboBox;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        presensiTable = new javax.swing.JTable();
        tambahPertemuanButton = new javax.swing.JButton();
        pertemuanComboBox = new javax.swing.JComboBox();
        ubahButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cetakButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        beritaAcaraText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kelasText = new javax.swing.JTextField();
        pertemuanText = new javax.swing.JTextField();
        tanggalText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        babText = new javax.swing.JTextField();
        mataPelajaranText = new javax.swing.JTextField();
        jamText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nipText = new javax.swing.JTextField();
        guruText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kehadiranGuruText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Hadir");

        presensiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123040226", "Riansyah", "hadir"},
                {"123040227", "Nanda", "hadir"},
                {"123040229", "Shelly", "tidak"},
                {"123040187", "Yepi Dedehidayat", "hadir"},
                {"123040141", "Fauzan", "tidak"},
                {"123040212", "Hilal ", "tidak"}
            },
            new String [] {
                "NRP", "Nama", "Status Kehadiran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(presensiTable);

        tambahPertemuanButton.setText("Tambah Pertemuan");
        tambahPertemuanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahPertemuanButtonActionPerformed(evt);
            }
        });

        pertemuanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pertemuanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pertemuanComboBoxActionPerformed(evt);
            }
        });

        ubahButton.setText("Ubah Presensi");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Pertemuan :");

        cetakButton.setText("Print ");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Berita Acara ");

        beritaAcaraText.setEditable(false);
        beritaAcaraText.setColumns(10);
        beritaAcaraText.setRows(5);
        beritaAcaraText.setTabSize(5);
        jScrollPane3.setViewportView(beritaAcaraText);

        jLabel3.setText("Pertemuan ke");

        jLabel4.setText("Tanggal");

        jLabel5.setText("Kelas-Pelajaran-Jam");

        kelasText.setEditable(false);

        pertemuanText.setEditable(false);

        tanggalText.setEditable(false);
        tanggalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Bab");

        babText.setEditable(false);

        mataPelajaranText.setEditable(false);

        jamText.setEditable(false);

        jLabel7.setText("-");

        jLabel8.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Daftar Hadir");

        refreshButton.setText("Perbaharui Data");
        refreshButton.setToolTipText("<html>klik untuk memperbaharui tampilan data</html>");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("NIP");

        jLabel11.setText("Nama Guru");

        nipText.setEditable(false);
        nipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipTextActionPerformed(evt);
            }
        });

        guruText.setEditable(false);
        guruText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guruTextActionPerformed(evt);
            }
        });

        jLabel12.setText("Status Kehadiran Guru");

        kehadiranGuruText.setEditable(false);
        kehadiranGuruText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kehadiranGuruTextActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Data pertemuan kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kehadiranGuruText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kelasText)
                                            .addComponent(pertemuanText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mataPelajaranText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jamText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(babText, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggalText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guruText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nipText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tambahPertemuanButton)
                                .addGap(18, 18, 18)
                                .addComponent(ubahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pertemuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(cetakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pertemuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(refreshButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahPertemuanButton)
                    .addComponent(ubahButton)
                    .addComponent(cetakButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pertemuanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(kehadiranGuruText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kelasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jamText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataPelajaranText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guruText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tanggalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(babText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public int getIdMapel() {
        return idMapel;
    }

    public void setIdMapel(int idMapel) {
        this.idMapel = idMapel;
    }

    public int getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(int pertemuan) {
        this.pertemuan = pertemuan;
    }


    private void tambahPertemuanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahPertemuanButtonActionPerformed
        // TODO add your handling code here:
        cmp.setDataTambahPresensi(idPbm);
        new FrameIsiPresensiKelas(new JFrame(), true, idKelas, pertemuan, idMapel).setVisible(true);
    }//GEN-LAST:event_tambahPertemuanButtonActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        // TODO add your handling code here:        
//        Presensi presensi = new Presensi();
//        presensi = (Presensi) pertemuanComboBox.getSelectedItem();
        int presensi =(int) pertemuanComboBox.getSelectedItem();
        cmp.setDataTambahPresensi(idPbm);
        new FrameUbahPresensiKelas(new JFrame(), true,presensi,idMapel).setVisible(true);
    }//GEN-LAST:event_ubahButtonActionPerformed

    private void tanggalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tanggalTextActionPerformed

    private void pertemuanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pertemuanComboBoxActionPerformed
//        // TODO add your handling code here:
        int presensi = (int) pertemuanComboBox.getSelectedItem();
        cmp = new ControllerMelihatPertemuan(this, idPbm, presensi);
        cmp.setTabelPresensi();
        cmp.setBeritaAcara(idPbm);
    }//GEN-LAST:event_pertemuanComboBoxActionPerformed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        // TODO add your handling code here:
        int presensi = (int) pertemuanComboBox.getSelectedItem();
        new ControllerMencetakPertemuan().mencetakPertemuan(idPbm, presensi);
    }//GEN-LAST:event_cetakButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        cmp = new ControllerMelihatPertemuan(this, idPbm, 1);//nilai default pertemuan adalah 1, untuk menampilkan frame presensi pada pertemuan 1
        cmp.setBeritaAcara(idPbm);
        cmp.setTabelPresensi();
        cmp.setComboBoxPertemuan();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void nipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipTextActionPerformed

    private void guruTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guruTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guruTextActionPerformed

    private void kehadiranGuruTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kehadiranGuruTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kehadiranGuruTextActionPerformed

    
    public JButton getCetakButton() {
        return cetakButton;
    }


    public JButton getUbahButton() {
        return ubahButton;
    }


    public JTextField getBabText() {
        return babText;
    }


    public JTextArea getBeritaAcaraText() {
        return beritaAcaraText;
    }

    public JTextField getJamText() {
        return jamText;
    }


    public JTextField getMataPelajaranText() {
        return mataPelajaranText;
    }


    public JTextField getKelasText() {
        return kelasText;
    }


    public JTextField getPertemuanText() {
        return pertemuanText;
    }


    public JTextField getTanggalText() {
        return tanggalText;
    }


    public JTextField getGuruText() {
        return guruText;
    }

    public JTextField getNipText() {
        return nipText;
    }

    public JTextField getKehadiranGuruText() {
        return kehadiranGuruText;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePresensiKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePresensiKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePresensiKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePresensiKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                FramePresensiKelas dialog = new FramePresensiKelas(new javax.swing.JFrame(), true, 1);
                FramePresensiKelas dialog = new FramePresensiKelas(1);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTable getPresensiTable() {
        return presensiTable;
    }

    public void setPresensiTable(JTable presensiTable) {
        this.presensiTable = presensiTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField babText;
    private javax.swing.JTextArea beritaAcaraText;
    private javax.swing.JButton cetakButton;
    private javax.swing.JTextField guruText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jamText;
    private javax.swing.JTextField kehadiranGuruText;
    private javax.swing.JTextField kelasText;
    private javax.swing.JTextField mataPelajaranText;
    private javax.swing.JTextField nipText;
    private javax.swing.JComboBox pertemuanComboBox;
    private javax.swing.JTextField pertemuanText;
    private javax.swing.JTable presensiTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton tambahPertemuanButton;
    private javax.swing.JTextField tanggalText;
    private javax.swing.JButton ubahButton;
    // End of variables declaration//GEN-END:variables
}

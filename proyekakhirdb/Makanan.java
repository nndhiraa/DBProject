package proyekakhirdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Makanan extends javax.swing.JFrame {

    public Makanan() {
        initComponents();
        Connect();
        RTable();

    }

    Connection con;
    PreparedStatement pst;

    public void Connect() {
        String connection = "jdbc:sqlserver://LAPTOP-24D05A2Q:1433;databaseName=PickAFood;user=sa;password=dearest123;encrypt=true;trustServerCertificate=true";

        try {
            con = DriverManager.getConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(Restoran.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btnsave.setEnabled(false);
    }

    public void RTable() {

        try {
            pst = con.prepareStatement("SELECT * FROM Makanan");
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rsm = rs.getMetaData();
            int count = rsm.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= count; i++) {
                    v2.add(rs.getString("Kode_Menu"));
                    v2.add(rs.getString("Kode_Resto"));
                    v2.add(rs.getString("No_Pesanan"));
                    v2.add(rs.getString("Nama_Menu"));
                    v2.add(rs.getString("Harga"));
                    

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Restoran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkresto = new javax.swing.JTextField();
        txtnopesan = new javax.swing.JTextField();
        txtmenu = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Kode Resto");

        jLabel5.setText("No Pesanan");

        jLabel6.setText("Nama Menu");

        jLabel7.setText("Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtkresto)
                    .addComponent(txtnopesan)
                    .addComponent(txtmenu)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkresto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnopesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Makanan");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Menu", "Kode Resto", "No Pesanan", "Nama Menu", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnupdate)
                            .addComponent(btndelete)
                            .addComponent(btnadd))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:

        
        String kresto = txtkresto.getText();
        String nopesan = txtnopesan.getText();
        String menu = txtmenu.getText();
        String harga = txtharga.getText();

        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this record?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            try {
                pst = con.prepareStatement("INSERT INTO MAKANAN(Kode_Resto,No_Pesanan,Nama_Menu,Harga) "
                        + "VALUES(?,?,?,?)");

                pst.setString(1, kresto);
                pst.setString(2, nopesan);
                pst.setString(3, menu);
                pst.setString(4, harga);

                int k = pst.executeUpdate();

                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Record Added");

                    txtkresto.setText("");
                    txtnopesan.setText("");
                    txtmenu.setText("");
                    txtharga.setText("");
                    
                    RTable();
                    btnsave.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Record Failed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Restoran.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("Cancel");
          
            txtkresto.setText("");
            txtnopesan.setText("");
            txtmenu.setText("");
            txtharga.setText("");
            
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
       
        txtkresto.setText("");
        txtnopesan.setText("");
        txtmenu.setText("");
        txtharga.setText("");
        txtkresto.requestFocus();
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btnsave.setEnabled(true);
    }//GEN-LAST:event_btnaddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel deft1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
      
        txtkresto.setText(deft1.getValueAt(SelectIndex, 1).toString());
        txtnopesan.setText(deft1.getValueAt(SelectIndex, 2).toString());
        txtmenu.setText(deft1.getValueAt(SelectIndex, 3).toString());
        txtharga.setText(deft1.getValueAt(SelectIndex, 4).toString());

        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        btnsave.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel deft1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();

        String kresto = txtkresto.getText();
        String nopesan = txtnopesan.getText();
        String menu = txtmenu.getText();
        String harga = txtharga.getText();
        String kodeR = deft1.getValueAt(SelectIndex, 0).toString();

        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this record?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            try {
                pst = con.prepareStatement("UPDATE MAKANAN SET Kode_Resto = ?, No_Pesanan = ?, Nama_Menu = ?,"
                        + "Harga = ? WHERE Kode_Menu = ?");

                pst.setString(1, kresto);
                pst.setString(2, nopesan);
                pst.setString(3, menu);
                pst.setString(4, harga);
                pst.setString(5, kodeR);

                int k = pst.executeUpdate();

                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Record Updated");

                    txtkresto.setText("");
                    txtnopesan.setText("");
                    txtmenu.setText("");
                    txtharga.setText("");
                    
                    RTable();
                    btnupdate.setEnabled(false);
                    btndelete.setEnabled(false);
                    btnsave.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Record Failed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Restoran.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("Cancel");
        
            txtkresto.setText("");
            txtnopesan.setText("");
            txtmenu.setText("");
            txtharga.setText("");
            
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel deft1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();

        String kodeR = deft1.getValueAt(SelectIndex, 0).toString();
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            try {
                pst = con.prepareStatement("DELETE FROM MAKANAN WHERE Kode_Menu = ?");

                pst.setString(1, kodeR);                


                int k = pst.executeUpdate();

                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Record Deleted");

                    txtkresto.setText("");
                    txtnopesan.setText("");
                    txtmenu.setText("");
                    txtharga.setText("");
                    
                    RTable();
                    btnupdate.setEnabled(false);
                    btndelete.setEnabled(false);
                    btnsave.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Record Failed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Restoran.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("Cancel");
        
            txtkresto.setText("");
            txtnopesan.setText("");
            txtmenu.setText("");
            txtharga.setText("");
            
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new MenuAwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Restoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkresto;
    private javax.swing.JTextField txtmenu;
    private javax.swing.JTextField txtnopesan;
    // End of variables declaration//GEN-END:variables
}

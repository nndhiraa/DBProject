/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyekakhirdb;

/**
 *
 * @author HP
 */
public class MenuAwal extends javax.swing.JFrame {

    /**
     * Creates new form MenuAwal
     */
    public MenuAwal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jPelanggan = new javax.swing.JMenuItem();
        jResto = new javax.swing.JMenuItem();
        jKB = new javax.swing.JMenuItem();
        jPesanan = new javax.swing.JMenuItem();
        jMakanan = new javax.swing.JMenuItem();
        jPembayaran = new javax.swing.JMenuItem();
        jDriver = new javax.swing.JMenuItem();
        jKendaraan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setText("PickAFood ");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setText("List:");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("- Pelanggan");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("- Makanan");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("- Restoran");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("- Keranjang Belanja");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("- Pesanan");

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel8.setText("- Pembayaran");

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("- Driver");

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel10.setText("- Kendaraan");

        jMenu1.setText("List");

        jPelanggan.setText("Pelanggan");
        jPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(jPelanggan);

        jResto.setText("Restoran");
        jResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestoActionPerformed(evt);
            }
        });
        jMenu1.add(jResto);

        jKB.setText("Keranjang Belanja");
        jKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKBActionPerformed(evt);
            }
        });
        jMenu1.add(jKB);

        jPesanan.setText("Pesanan");
        jPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesananActionPerformed(evt);
            }
        });
        jMenu1.add(jPesanan);

        jMakanan.setText("Makanan");
        jMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMakananActionPerformed(evt);
            }
        });
        jMenu1.add(jMakanan);

        jPembayaran.setText("Pembayaran");
        jPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPembayaranActionPerformed(evt);
            }
        });
        jMenu1.add(jPembayaran);

        jDriver.setText("Driver");
        jDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDriverActionPerformed(evt);
            }
        });
        jMenu1.add(jDriver);

        jKendaraan.setText("Kendaraan");
        jKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKendaraanActionPerformed(evt);
            }
        });
        jMenu1.add(jKendaraan);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPelangganActionPerformed
        // TODO add your handling code here:
        new Pelanggan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jPelangganActionPerformed

    private void jRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestoActionPerformed
        // TODO add your handling code here:
        new Restoran().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRestoActionPerformed

    private void jDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDriverActionPerformed
        // TODO add your handling code here:
        new Driver().setVisible(true);
        dispose();
    }//GEN-LAST:event_jDriverActionPerformed

    private void jKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKendaraanActionPerformed
        // TODO add your handling code here:
        new Kendaraan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jKendaraanActionPerformed

    private void jKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKBActionPerformed
        // TODO add your handling code here:
        new KeranjangB().setVisible(true);
        dispose();
    }//GEN-LAST:event_jKBActionPerformed

    private void jPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesananActionPerformed
        // TODO add your handling code here:
        new Pesanan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jPesananActionPerformed

    private void jMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMakananActionPerformed
        // TODO add your handling code here:
        new Makanan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMakananActionPerformed

    private void jPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPembayaranActionPerformed
        // TODO add your handling code here:
        new Pembayaran().setVisible(true);
        dispose();
    }//GEN-LAST:event_jPembayaranActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jDriver;
    private javax.swing.JMenuItem jKB;
    private javax.swing.JMenuItem jKendaraan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMakanan;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jPelanggan;
    private javax.swing.JMenuItem jPembayaran;
    private javax.swing.JMenuItem jPesanan;
    private javax.swing.JMenuItem jResto;
    // End of variables declaration//GEN-END:variables
}

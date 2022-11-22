/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hafidz Ridwan
 */
public class AplikasiToko extends javax.swing.JFrame {
    
     public int harga, jumlah, total;
    /**
     * Creates new form AplikasiToko
     */
    public AplikasiToko() {
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
        txtHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        btnUlang = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI TOKO");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setText("APLIKASI TOKO SEDERHANA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel2.setText("Harga");

        txtHarga.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHarga.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel3.setText("Jumlah barang");

        txtJumlah.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtJumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJumlah.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel4.setText("Total bayar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel6.setText("Uang kembalian");

        txtKembalian.setEditable(false);
        txtKembalian.setBackground(new java.awt.Color(204, 204, 204));
        txtKembalian.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtKembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtBayar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBayar.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel7.setText("Uang bayar");

        btnHitung.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHitungMouseClicked(evt);
            }
        });

        btnUlang.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnUlang.setText("Ulang");
        btnUlang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUlangMouseClicked(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });

        txtError.setFont(new java.awt.Font("Segoe UI", 2, 22)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 51, 51));

        btnBayar.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(151, 151, 151))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(91, 91, 91)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBayar)
                            .addComponent(txtKembalian)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addComponent(txtJumlah)))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(btnUlang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String toRupiah(int price) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(price);
    }
    
    public void prosesBayar(int bayar, int total) {
        int kembalian;
        
        if(bayar < total) { 
            txtBayar.setBorder(new LineBorder(Color.RED,1));
            txtError.setText("Maaf uang anda kurang!!");
            txtKembalian.setText("");
        }
        
        if(bayar >= total) {
            txtBayar.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
            kembalian = bayar - total;
            
            txtKembalian.setText(toRupiah(kembalian));
        }
    }
    
    private void btnHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitungMouseClicked
   
        if(!txtHarga.getText().isEmpty() && !txtJumlah.getText().isEmpty()) {
            
          txtHarga.setBorder(new LineBorder(Color.LIGHT_GRAY));
          txtJumlah.setBorder(new LineBorder(Color.LIGHT_GRAY));
            
          harga = Integer.parseInt(txtHarga.getText());
          jumlah = Integer.parseInt(txtJumlah.getText());
          
          total = harga * jumlah;
          
          txtTotal.setText(toRupiah(total));
            
        } else {
            
          txtTotal.setText("");
          txtBayar.setText("");
          txtBayar.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
          txtError.setText("");
            
          if(txtHarga.getText().isEmpty()) {
              txtHarga.setBorder(new LineBorder(Color.RED,1));
          } else {
              txtHarga.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
          }
          
          if(txtJumlah.getText().isEmpty()) {
              txtJumlah.setBorder(new LineBorder(Color.RED,1));
          } else {
              txtJumlah.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
          }
            
        }
    }//GEN-LAST:event_btnHitungMouseClicked

    private void btnUlangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseClicked
        txtHarga.setText("");
        txtHarga.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
        
        txtJumlah.setText("");
        txtJumlah.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
        
        txtTotal.setText("");
        
        txtBayar.setText("");
        txtBayar.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
        
        txtKembalian.setText("");
        txtError.setText("");
    }//GEN-LAST:event_btnUlangMouseClicked

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        System.exit(0);
        setVisible(false); 
        dispose(); 
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
       if(txtBayar.getText().isEmpty()) {
              txtBayar.setBorder(new LineBorder(Color.RED,1));
              txtError.setText("Masukkan uang pembayaran anda!!");
              txtKembalian.setText("");
          } else {
              txtBayar.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
              txtError.setText("");
              
              this.prosesBayar(Integer.parseInt(txtBayar.getText()), total);
          } 
    }//GEN-LAST:event_btnBayarMouseClicked

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
            java.util.logging.Logger.getLogger(AplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiToko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnUlang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
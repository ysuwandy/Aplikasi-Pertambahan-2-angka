
package aplikasipertambahan2angka;


public class NewJFrame extends javax.swing.JFrame {


    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitung = new javax.swing.JButton();
        operasi = new javax.swing.JComboBox<>();
        bil1 = new javax.swing.JTextField();
        judul = new javax.swing.JLabel();
        bil2 = new javax.swing.JTextField();
        bilangan1 = new javax.swing.JLabel();
        bilangan2 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        operasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perkalian", "Pembagian", "Penjumlahan", "Pengurangan" }));

        judul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        judul.setText("APLIKASI PERTAMBAHAN 2 ANGKA");

        bilangan1.setText("Bilangan 1");

        bilangan2.setText("Bilangan 2");

        hasil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(judul))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bilangan2)
                                    .addComponent(bilangan1)
                                    .addComponent(operasi, 0, 169, Short.MAX_VALUE)
                                    .addComponent(bil2)
                                    .addComponent(bil1))
                                .addComponent(hasil)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(judul)
                .addGap(33, 33, 33)
                .addComponent(bilangan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bilangan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(operasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
    if (operasi.getSelectedItem().toString().equalsIgnoreCase("Perkalian")){
   int a=Integer.parseInt(bil1.getText());
   int b=Integer.parseInt(bil2.getText());
   int jumlah=a*b;
   hasil.setText (Integer.toString (jumlah));   
}
if (operasi.getSelectedItem().toString().equalsIgnoreCase("Pembagian")){
   int a=Integer.parseInt(bil1.getText());
   int b=Integer.parseInt(bil2.getText());
   int jumlah=a/b;
   hasil.setText (Integer.toString (jumlah));   
}
if (operasi.getSelectedItem().toString().equalsIgnoreCase("Penjumlahan")){
   int a=Integer.parseInt(bil1.getText());
   int b=Integer.parseInt(bil2.getText());
   int jumlah=a+b;
   hasil.setText (Integer.toString (jumlah));   
}
if (operasi.getSelectedItem().toString().equalsIgnoreCase("Pengurangan")){
   int a=Integer.parseInt(bil1.getText());
   int b=Integer.parseInt(bil2.getText());
   int jumlah=a-b;
   hasil.setText (Integer.toString (jumlah));   
}
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JLabel bilangan1;
    private javax.swing.JLabel bilangan2;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel judul;
    private javax.swing.JComboBox<String> operasi;
    // End of variables declaration//GEN-END:variables
}

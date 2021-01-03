/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201009
 * date         20200925
 * @filename	ChangeApp.java
 * @author      hkamal
 * @version     1.1
 * @see         ChangeApp program assignment 1.4 - show breakdown of currency in Canadian coins
 */

public class ChangeApp extends javax.swing.JFrame {

    /**
     * Creates new form ChangeApp
     */
    public ChangeApp() {
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

        txtQuarters1 = new javax.swing.JTextField();
        txtPennies1 = new javax.swing.JTextField();
        lblChangeExchangeTitle = new javax.swing.JLabel();
        lblEnterCurrency = new javax.swing.JLabel();
        lblAmountUnderCurrency = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtCurrency = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblQuarters = new javax.swing.JLabel();
        lblDimes = new javax.swing.JLabel();
        lblNickels = new javax.swing.JLabel();
        lblPennies = new javax.swing.JLabel();
        txtQuarters = new javax.swing.JTextField();
        txtNickels = new javax.swing.JTextField();
        txtDimes = new javax.swing.JTextField();
        txtPennies = new javax.swing.JTextField();
        lblLoonies = new javax.swing.JLabel();
        lblToonies = new javax.swing.JLabel();
        txtToonies = new javax.swing.JTextField();
        txtLoonies = new javax.swing.JTextField();

        txtQuarters1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPennies1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeExchangeTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblChangeExchangeTitle.setForeground(new java.awt.Color(255, 0, 102));
        lblChangeExchangeTitle.setText("Change Exchange");

        lblEnterCurrency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnterCurrency.setText("Enter Currency");

        lblAmountUnderCurrency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAmountUnderCurrency.setText("Amount (xxxx.xx)");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtCurrency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrencyActionPerformed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAmount.setText("Amount");

        txtAmount.setEditable(false);
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblQuarters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuarters.setText("Quarters");

        lblDimes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDimes.setText("Dimes");

        lblNickels.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNickels.setText("Nickels");

        lblPennies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPennies.setText("Pennies");

        txtQuarters.setEditable(false);
        txtQuarters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNickels.setEditable(false);
        txtNickels.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDimes.setEditable(false);
        txtDimes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPennies.setEditable(false);
        txtPennies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblLoonies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLoonies.setText("Loonies");

        lblToonies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblToonies.setText("Toonies");

        txtToonies.setEditable(false);
        txtToonies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLoonies.setEditable(false);
        txtLoonies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblChangeExchangeTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalculate)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuarters)
                            .addComponent(lblDimes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDimes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNickels)
                                .addGap(28, 28, 28)
                                .addComponent(txtNickels, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPennies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPennies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLoonies)
                            .addComponent(lblToonies))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtToonies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoonies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lblAmount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblAmountUnderCurrency))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(txtCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblEnterCurrency)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblChangeExchangeTitle)
                .addGap(23, 23, 23)
                .addComponent(lblEnterCurrency)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAmountUnderCurrency)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnCalculate))
                .addGap(16, 16, 16)
                .addComponent(lblAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuarters)
                    .addComponent(lblNickels)
                    .addComponent(txtQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNickels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoonies)
                    .addComponent(txtLoonies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimes)
                    .addComponent(lblPennies)
                    .addComponent(txtDimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPennies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblToonies)
                    .addComponent(txtToonies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); // Exit the application.
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try {
            String amountIn; // the currency
            // declare vars
            int total, toonies, loonies, quarters, dimes, nickels, pennies;
            double convertIn;
            
            amountIn = txtCurrency.getText();
            // Convert the amount from $ to cents.
            convertIn = Double.parseDouble(amountIn)*100;
            // Truncate all the decimals that come after cents.
            total = (int)convertIn;

            // exception for negative currency
            if (total < 0) {
                txtAmount.setText("Negative cash money!?");
                return;
            }
            
            // Calculate the number of toonies.
            toonies = total / 200;
            total = total - (toonies*200);
            // Calculate the number of loonies.
            loonies = total / 100;
            total = total - (loonies*100);
            // Calculate the number of quarters.
            quarters = total / 25;
            total = total - (quarters*25);
            // Calculate the number of dimes.
            dimes = total/10;
            total = total - (dimes *10);
            // Calculate the number of nickels.
            nickels = total/5;
            total = total - (nickels * 5);
            // Calculate the number of pennies.
            pennies = total;

            // Output the input amount.
            txtAmount.setText(amountIn);
            // Output the number of toonies.
            txtToonies.setText(Integer.toString(toonies));
            // Output the number of loonies.
            txtLoonies.setText(Integer.toString(loonies));
            // Output the number of quarters.
            txtQuarters.setText(Integer.toString(quarters));
            // Output the number of dimes.
            txtDimes.setText(Integer.toString(dimes));
            // Output the number of nickels.
            txtNickels.setText(Integer.toString(nickels));
            // Output the number of pennies.
            txtPennies.setText(Integer.toString(pennies));
        }
        
        // handle exception when input != int
        catch (Exception e){
            txtAmount.setText("Please input an integer.");        
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrencyActionPerformed
    }//GEN-LAST:event_txtCurrencyActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountUnderCurrency;
    private javax.swing.JLabel lblChangeExchangeTitle;
    private javax.swing.JLabel lblDimes;
    private javax.swing.JLabel lblEnterCurrency;
    private javax.swing.JLabel lblLoonies;
    private javax.swing.JLabel lblNickels;
    private javax.swing.JLabel lblPennies;
    private javax.swing.JLabel lblQuarters;
    private javax.swing.JLabel lblToonies;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCurrency;
    private javax.swing.JTextField txtDimes;
    private javax.swing.JTextField txtLoonies;
    private javax.swing.JTextField txtNickels;
    private javax.swing.JTextField txtPennies;
    private javax.swing.JTextField txtPennies1;
    private javax.swing.JTextField txtQuarters;
    private javax.swing.JTextField txtQuarters1;
    private javax.swing.JTextField txtToonies;
    // End of variables declaration//GEN-END:variables
}

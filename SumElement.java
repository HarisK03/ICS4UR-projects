/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201012
 * date         20201006
 * @filename	SumElement.java
 * @author      hkamal
 * @version     1.1
 * @see         SumElement program assignment 2.2 - various methods using an ArrayList
 */

import java.util.*;
import javax.swing.JOptionPane;

public class SumElement extends javax.swing.JFrame {
    
    /**
     * Creates new form SumElement
     */
    public SumElement() {
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

        title = new javax.swing.JLabel();
        lblAddE = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSumA = new javax.swing.JButton();
        btnSumE = new javax.swing.JButton();
        btnSumO = new javax.swing.JButton();
        inputAddE = new javax.swing.JTextField();
        lblRemoveE = new javax.swing.JLabel();
        inputRemoveI = new javax.swing.JTextField();
        btnRemoveI = new javax.swing.JButton();
        lblSumE = new javax.swing.JLabel();
        lblSumA = new javax.swing.JLabel();
        lblSumO = new javax.swing.JLabel();
        inputSumE = new javax.swing.JTextField();
        inputSumA = new javax.swing.JTextField();
        inputSumO = new javax.swing.JTextField();
        inputRemoveN = new javax.swing.JTextField();
        btnRemoveN = new javax.swing.JButton();
        lblRemoveE1 = new javax.swing.JLabel();
        btnSumO1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SumElement");

        lblAddE.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblAddE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddE.setText("Add Element");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSumA.setText("Sum");
        btnSumA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumAActionPerformed(evt);
            }
        });

        btnSumE.setText("Sum");
        btnSumE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumEActionPerformed(evt);
            }
        });

        btnSumO.setText("Sum");
        btnSumO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumOActionPerformed(evt);
            }
        });

        lblRemoveE.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblRemoveE.setText("Remove Index");

        btnRemoveI.setText("Index");
        btnRemoveI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveIActionPerformed(evt);
            }
        });

        lblSumE.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblSumE.setText("Sum Even");

        lblSumA.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblSumA.setText("Sum All");

        lblSumO.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblSumO.setText("Sum Odd");

        inputSumE.setEditable(false);

        inputSumA.setEditable(false);
        inputSumA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSumAActionPerformed(evt);
            }
        });

        inputSumO.setEditable(false);

        btnRemoveN.setText("Number");
        btnRemoveN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNActionPerformed(evt);
            }
        });

        lblRemoveE1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblRemoveE1.setText("Remove Num");

        btnSumO1.setText("Exit");
        btnSumO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumO1ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblAddE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAddE, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(46, 46, 46)
                .addComponent(lblRemoveE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRemoveE1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemoveN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputRemoveN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoveI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(inputRemoveI, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lblSumE)
                                    .addGap(9, 9, 9))
                                .addComponent(inputSumE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSumE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputSumO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSumO)
                                .addGap(11, 11, 11))
                            .addComponent(btnSumO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSumA)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSumA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputSumA, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSumO1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRemoveE)
                            .addComponent(lblRemoveE1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputRemoveI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputRemoveN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoveI)
                            .addComponent(btnRemoveN)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputAddE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSumE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSumE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSumA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSumA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSumO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSumO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumA)
                    .addComponent(btnSumO)
                    .addComponent(btnSumE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSumO1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static ArrayList <Integer> elementList; 
    
    // adds elements to the ArrayList
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            int addE = Integer.parseInt(inputAddE.getText());
            if (addE < 0) {
                JOptionPane.showMessageDialog(null, "Only positive integers are allowed!");
            } 
            else {
                elementList.add(addE);
                listArrayList();
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Only integers are allowed!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // sum all elements in the ArrayList
    private void btnSumAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumAActionPerformed
        int sumAll = 0;
        for (int i = 0; i < elementList.size(); i++) {
            sumAll += elementList.get(i);
        }
        inputSumA.setText(Integer.toString(sumAll));
        listArrayList();
    }//GEN-LAST:event_btnSumAActionPerformed

    // sum even elements in the ArrayList
    private void btnSumEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumEActionPerformed
        ArrayList<String> evenArr = new ArrayList<String>();
        int sumEven = 0;
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i) % 2 == 0) {
                sumEven += elementList.get(i);
                evenArr.add(Integer.toString(elementList.get(i)));
            }
        }
        inputSumE.setText(Integer.toString(sumEven));
        String a;
        String temp = "";
        Iterator stepper = evenArr.iterator();
        while (stepper.hasNext()) {
            a = (String)stepper.next();
            temp = temp + a + "\n";
        }
        display.setText(temp);
    }//GEN-LAST:event_btnSumEActionPerformed

    // sum odd elements in the ArrayList
    private void btnSumOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumOActionPerformed
        ArrayList<String> oddArr = new ArrayList<String>();
        int sumOdd = 0;
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i) % 2 != 0) {
                sumOdd += elementList.get(i);
                oddArr.add(Integer.toString(elementList.get(i)));
            }
        }
        inputSumO.setText(Integer.toString(sumOdd));
        String a;
        String temp = "";
        Iterator stepper = oddArr.iterator();
        while (stepper.hasNext()) {
            a = (String)stepper.next();
            temp = temp + a + "\n";
        }
        display.setText(temp);
    }//GEN-LAST:event_btnSumOActionPerformed

    // remove element from ArrayList by index
    private void btnRemoveIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveIActionPerformed
        try {
            int index = Integer.parseInt(inputRemoveI.getText());
            if (elementList.isEmpty() || index < 0 || index >= elementList.size()) { 
                JOptionPane.showMessageDialog(null, "Index not valid!");
            }  
            else {
                elementList.remove(index);
                listArrayList();
            }
        }
        catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Only integers are allowed!");
        }
        catch (IndexOutOfBoundsException ie) {
            display.setText("Removed element!");
        }
    }//GEN-LAST:event_btnRemoveIActionPerformed

    // remove element(s) from ArrayList by number
    private void btnRemoveNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNActionPerformed
        ArrayList<Integer> removeAll = new ArrayList<Integer>(); 
        try {
            if (elementList.size() == 0) {
                JOptionPane.showMessageDialog(null, "ArrayList is empty!");
                return;
            }
            else {
                removeAll.add(Integer.parseInt(inputRemoveN.getText()));
                elementList.removeAll(removeAll);
                listArrayList();
            }
            // nothing will happen if number is not in the ArrayList
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Only integers are allowed!");
        }
    }//GEN-LAST:event_btnRemoveNActionPerformed

    // exit
    private void btnSumO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumO1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSumO1ActionPerformed

    private void inputSumAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSumAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSumAActionPerformed
    
    // list ArrayList in JTextArea
    public void listArrayList() {
        ArrayList<String> strArr = new ArrayList<String>();
        for (int i = 0; i < elementList.size(); i++) {
            strArr.add(Integer.toString(elementList.get(i)));
        }        
        // code cited from repl.it example student records (https://repl.it/@soteched2017/ics4u-src)
        String a;
        String temp = "";
        Iterator stepper = strArr.iterator();
        while (stepper.hasNext()) {
            a = (String)stepper.next();
            temp = temp + a + "\n";
        }
        display.setText(temp);        
    }
               
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // new ArrayList
        elementList = new ArrayList<>();
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
            java.util.logging.Logger.getLogger(SumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumElement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemoveI;
    private javax.swing.JButton btnRemoveN;
    private javax.swing.JButton btnSumA;
    private javax.swing.JButton btnSumE;
    private javax.swing.JButton btnSumO;
    private javax.swing.JButton btnSumO1;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField inputAddE;
    private javax.swing.JTextField inputRemoveI;
    private javax.swing.JTextField inputRemoveN;
    private javax.swing.JTextField inputSumA;
    private javax.swing.JTextField inputSumE;
    private javax.swing.JTextField inputSumO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddE;
    private javax.swing.JLabel lblRemoveE;
    private javax.swing.JLabel lblRemoveE1;
    private javax.swing.JLabel lblSumA;
    private javax.swing.JLabel lblSumE;
    private javax.swing.JLabel lblSumO;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

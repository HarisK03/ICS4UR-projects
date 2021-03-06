/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201030
 * date         20201025
 * @filename	SortingEfficiencies.java
 * @author      hkamal
 * @version     1.0
 * @see         SortingEfficiencies program Assignment 3.4.2 - 4 different sorting efficiencies
 */

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class SortingEfficiencies extends javax.swing.JFrame {

    /**
     * Creates new form SortingEfficiencies
     */
    public SortingEfficiencies() {
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

        val = new javax.swing.ButtonGroup();
        order = new javax.swing.ButtonGroup();
        radio10 = new javax.swing.JRadioButton();
        radio100 = new javax.swing.JRadioButton();
        radio1000 = new javax.swing.JRadioButton();
        radio5000 = new javax.swing.JRadioButton();
        radioAscending = new javax.swing.JRadioButton();
        radioDescending = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        display3 = new javax.swing.JTextArea();
        lblSortT = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblOrderT = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        lblOriginal = new javax.swing.JLabel();
        lblSorted = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblOrderT1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        val.add(radio10);
        radio10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio10.setText("10");

        val.add(radio100);
        radio100.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio100.setText("100");

        val.add(radio1000);
        radio1000.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio1000.setText("1000");

        val.add(radio5000);
        radio5000.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio5000.setText("5000");

        order.add(radioAscending);
        radioAscending.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radioAscending.setText("Ascending");

        order.add(radioDescending);
        radioDescending.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radioDescending.setText("Descending");

        display1.setEditable(false);
        display1.setColumns(5);
        display1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        display1.setRows(5);
        jScrollPane1.setViewportView(display1);

        display2.setEditable(false);
        display2.setColumns(5);
        display2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        display2.setRows(5);
        display2.setMaximumSize(new java.awt.Dimension(224, 84));
        display2.setMinimumSize(new java.awt.Dimension(5, 10));
        jScrollPane2.setViewportView(display2);

        display3.setEditable(false);
        display3.setColumns(5);
        display3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        display3.setRows(5);
        display3.setMaximumSize(new java.awt.Dimension(224, 84));
        display3.setMinimumSize(new java.awt.Dimension(5, 10));
        jScrollPane3.setViewportView(display3);

        lblSortT.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSortT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSortT.setText("Sorting Algorithm");

        lblTitle.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sorting Efficiencies");

        lblOrderT.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblOrderT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderT.setText("Sort Order");

        btnSort.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSort.setText("Sort Numbers");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        lblOriginal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblOriginal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOriginal.setText("Original Numbers");

        lblSorted.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSorted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSorted.setText("Sorted Numbers");

        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblOrderT1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblOrderT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderT1.setText("Sort Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSortT)
                                    .addComponent(radio100, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio1000, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio5000, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrderT)
                                    .addComponent(radioDescending)
                                    .addComponent(radioAscending)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(lblOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(lblSorted, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrderT1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSortT)
                            .addComponent(lblOrderT))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio1000)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio5000))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioAscending)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioDescending)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOriginal)
                            .addComponent(lblSorted))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrderT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort)
                    .addComponent(btnExit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList<Integer> bubbleArr = new ArrayList<Integer>();
    ArrayList<Integer> insertionArr = new ArrayList<Integer>();
    ArrayList<Integer> quicksortArr = new ArrayList<Integer>();
    int quickLoop = 0;
    int quickComp = 0;
    int quickShift = 0;
    
    @SuppressWarnings("unchecked")
    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        int min = -10000;
        int max = 10000;
        nums.clear();
        display1.setText("");
        display2.setText("");
        display3.setText("");
        quickLoop = 0;
        quickComp = 0;
        quickShift = 0;
        
        if (!(radioAscending.isSelected() || radioDescending.isSelected())) {
            JOptionPane.showMessageDialog(null, "Ascending or Descending?");
            return;
        }
        
        if (radio10.isSelected()) {
            for (int i = 0; i < 10; i ++) {
                nums.add((int)((Math.random()*(max - min))+min)); // src: https://www.baeldung.com/java-generating-random-numbers-in-range
                display1.append(nums.get(i).toString()+"\n");
            }
            bubbleArr = (ArrayList<Integer>)nums.clone();
            insertionArr = (ArrayList<Integer>)nums.clone();
            quicksortArr = (ArrayList<Integer>)nums.clone();
            selection();
            bubble();
            insertion();
            quick();
        }
        else if (radio100.isSelected()) {
            for (int i = 0; i < 100; i ++) {
                nums.add((int)((Math.random()*(max - min))+min)); 
                display1.append(nums.get(i).toString()+"\n");
            }
            bubbleArr = (ArrayList<Integer>)nums.clone();
            insertionArr = (ArrayList<Integer>)nums.clone();
            quicksortArr = (ArrayList<Integer>)nums.clone();
            selection();
            bubble();
            insertion();
            quick();
        }
        else if (radio1000.isSelected()) {
            for (int i = 0; i < 1000; i ++) {
                nums.add((int)((Math.random()*(max - min))+min));
                display1.append(nums.get(i).toString()+"\n");
            }
            bubbleArr = (ArrayList<Integer>)nums.clone();
            insertionArr = (ArrayList<Integer>)nums.clone();
            quicksortArr = (ArrayList<Integer>)nums.clone();
            selection();
            bubble();
            insertion();
            quick();
        }
        else if (radio5000.isSelected()) {
            for (int i = 0; i < 5000; i ++) {
                nums.add((int)((Math.random()*(max - min))+min)); 
                display1.append(nums.get(i).toString()+"\n");
            }
            bubbleArr = (ArrayList<Integer>)nums.clone();
            insertionArr = (ArrayList<Integer>)nums.clone();
            quicksortArr = (ArrayList<Integer>)nums.clone();
            selection();
            bubble();
            insertion();
            quick();
        }
        else {
            JOptionPane.showMessageDialog(null, "How many numbers?");
            return;
        }
    }//GEN-LAST:event_btnSortActionPerformed
    
    // src: https://www.youtube.com/watch?v=cqh8nQwuKNE
    private void selection() {
        int loop = 0;
        int comp = 0;
        int shift = 0;
        display3.append("Selection Sort" + "\n");
        display3.append("==============" + "\n");
        if (radioAscending.isSelected()) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < nums.size(); i++) {
                int minI = i;
                loop++;
                for (int j = i+1; j < nums.size(); j++) {
                    if (nums.get(j) < nums.get(minI)) {
                        minI = j;
                        shift += 2;
                    }
                    comp++;
                    loop++;
                }
                int temp = nums.get(minI);
                nums.set(minI, nums.get(i)); 
                nums.set(i, temp);
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        else {
            long start = System.currentTimeMillis();
            for (int i = 0; i < nums.size(); i++) {
                int minI = i;
                loop++;
                for (int j = i+1; j < nums.size(); j++) {
                    if (nums.get(j) > nums.get(minI)) {
                        minI = j;
                        shift += 2;
                    }
                    comp++;
                    loop++;
                }
                int temp = nums.get(minI);
                nums.set(minI, nums.get(i)); 
                nums.set(i, temp);
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        for (int b = 0; b < nums.size(); b++) {
            display2.append(nums.get(b).toString() + "\n");
        }
        display3.append("Loops executed: " + Integer.toString(loop)+ "\n");
        display3.append("Comparisons made: " + Integer.toString(comp) + "\n");
        display3.append("Shifts made: " + Integer.toString(shift) +" \n");
        display3.append("\n");
    }
    
    // src: https://www.youtube.com/watch?v=6Gv8vg0kcHc
    private void bubble() {
        int loop = 0;
        int comp = 0;
        int shift = 0;
        boolean isSorted = false;
        display3.append("Bubble Sort" + "\n");
        display3.append("==============" + "\n");
        if (radioAscending.isSelected()) {
            long start = System.currentTimeMillis();
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < bubbleArr.size() - 1; i++) {
                    if (bubbleArr.get(i) > bubbleArr.get(i + 1)) {
                        Collections.swap(bubbleArr, i, i + 1);
                        shift += 2;
                        isSorted = false;
                    }
                    comp++;
                    loop++;
                }
                loop++;
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        else {
            long start = System.currentTimeMillis();
            while (!isSorted) {
                comp++;
                isSorted = true;
                for (int i = 0; i < bubbleArr.size() - 1; i++) {
                    if (bubbleArr.get(i) < bubbleArr.get(i + 1)) {
                        Collections.swap(bubbleArr, i, i + 1);
                        shift += 2;
                        isSorted = false;
                    }
                    comp++;
                    loop++;
                }
                loop++;
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        display3.append("Loops executed: " + Integer.toString(loop)+"\n");
        display3.append("Comparisons made: " + Integer.toString(comp) + "\n");
        display3.append("Shifts made: " + Integer.toString(shift) +" \n");
        display3.append("\n");
    }
    
    // src: https://www.geeksforgeeks.org/insertion-sort/
    private void insertion() {
        int loop = 0;
        int comp = 0;
        int shift = 0;
        display3.append("Insertion Sort" + "\n");
        display3.append("==============" + "\n");
        if (radioAscending.isSelected()) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < insertionArr.size(); i++) {
                int target = insertionArr.get(i); 
                int j = i - 1;
                while (j >= 0 && insertionArr.get(j) > target) {
                    insertionArr.set(j + 1, insertionArr.get(j));
                    j = j - 1;
                    loop++;
                    comp += 2;
                    shift++;
                }
                insertionArr.set(j + 1, target);
                loop++;
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        else {
            long start = System.currentTimeMillis();
            for (int i = 0; i < insertionArr.size(); i++) {
                int target = insertionArr.get(i); 
                int j = i - 1;
                while (j >= 0 && insertionArr.get(j) < target) {
                    insertionArr.set(j + 1, insertionArr.get(j));
                    j = j - 1;
                    loop++;
                    comp += 2;
                    shift++;
                }
                insertionArr.set(j + 1, target);
                shift++;
                loop++;
            }
            long stop = System.currentTimeMillis();
            display3.append("Time taken: " + (stop-start) + "ms" + "\n");
        }
        display3.append("Loops executed: " + Integer.toString(loop)+"\n");
        display3.append("Comparisons made: " + Integer.toString(comp) + "\n");
        display3.append("Shifts made: " + Integer.toString(shift) +" \n");
        display3.append("\n");
    }
    
    private void quick() {
        long start = System.currentTimeMillis();
        quickSort(quicksortArr, 0, quicksortArr.size()-1);
        long stop = System.currentTimeMillis();
        display3.append("Quick Sort" + "\n");
        display3.append("==============" + "\n");
        display3.append("Time taken: " + (stop-start) + "ms"+" \n");
        display3.append("Loops executed: " + Integer.toString(quickLoop)+"\n");
        display3.append("Comparisons made: " + Integer.toString(quickComp) + "\n");
        display3.append("Shifts made: " + Integer.toString(quickShift));
    }
    
    // src: https://www.softwaretestinghelp.com/quicksort-in-java/
    private void quickSort(ArrayList<Integer> nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
        quickComp++;
    }
    
    private int partition(ArrayList<Integer> nums, int low, int high) {
        if (radioAscending.isSelected()) {
            int pi = nums.get(high);
            int i = (low-1);  
            for (int j = low; j < high; j++) { 
                if (nums.get(j) <= pi) { 
                    i++; 
                    int temp = nums.get(i); 
                    nums.set(i, nums.get(j)); 
                    nums.set(j, temp); 
                }
                quickComp++;
                quickLoop++;
            } 
            int temp = nums.get(i+1); 
            nums.set(i+1, nums.get(high));
            nums.set(high, temp);
            quickShift += 2;
            return i+1;
        }
        else {
            int pi = nums.get(high);
            int i = (low-1);  
            for (int j = low; j < high; j++) { 
                if (nums.get(j) >= pi) { 
                    i++; 
                    int temp = nums.get(i); 
                    nums.set(i, nums.get(j)); 
                    nums.set(j, temp); 
                }
                quickComp++;
                quickLoop++;
            } 
            int temp = nums.get(i+1); 
            nums.set(i+1, nums.get(high));
            nums.set(high, temp);
            quickShift += 2;
            return i+1;
        }
    } 
   
    // exit
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingEfficiencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSort;
    private javax.swing.JTextArea display1;
    private javax.swing.JTextArea display2;
    private javax.swing.JTextArea display3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblOrderT;
    private javax.swing.JLabel lblOrderT1;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblSortT;
    private javax.swing.JLabel lblSorted;
    private javax.swing.JLabel lblTitle;
    private javax.swing.ButtonGroup order;
    private javax.swing.JRadioButton radio10;
    private javax.swing.JRadioButton radio100;
    private javax.swing.JRadioButton radio1000;
    private javax.swing.JRadioButton radio5000;
    private javax.swing.JRadioButton radioAscending;
    private javax.swing.JRadioButton radioDescending;
    private javax.swing.ButtonGroup val;
    // End of variables declaration//GEN-END:variables
}

/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201012
 * date         20201009
 * @filename	TicTacEvent.java
 * @author      hkamal
 * @version     1.0
 * @see         TicTacToe program Assignment 2.5 - logic for the TicTacToe that runs the game and allows user input / winner declaration
 */

import javax.swing.*;
import java.awt.event.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    // initialize the GUI elements
    TicTacToe gui;
    Thread playing;
    String path = "./";
    ImageIcon a = new ImageIcon(path + "X.png"); // https://www.pinterest.ca/pin/333759022359653902/?nic_v2=1a4gXbA1q
    ImageIcon b = new ImageIcon(path + "O.png"); // https://www.pinterest.ca/pin/9359111702223618/
    int clicks = 0;
    int win = 0;
    int[][] check = new int[4][4];
    int xWin = 0;
    int yWin = 0;
    int tWin = 0;

    // get GUI and add values to each button
    public TicTacEvent (TicTacToe in){
        gui = in;
        for (int row=0; row<=3; row++){
           for (int col=0; col<=3; col++){
               check[row][col]=0;
           }
       }
    }

    // ActionListener events 
    public void actionPerformed (ActionEvent event) {
       String command = event.getActionCommand();
       
       if (command.equals("Reset")) {
           reset();
       }
       if (command.equals("Exit")) {
           System.exit(0);
       }
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
       if (command.equals("10")) {
           b10();
       }
       if (command.equals("11")) {
           b11();
       }
       if (command.equals("12")) {
           b12();
       }
       if (command.equals("13")) {
           b13();
       }
       if (command.equals("14")) {
           b14();
       }
       if (command.equals("15")) {
           b15();
       }
       if (command.equals("16")) {
           b16();
       }
    }
    
    // click x or o
    void b1() {
        if ((gui.boxes[0][0].getIcon() == a) || (gui.boxes[0][0].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        } else {
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        winner();

    }
    
    // click x or o
    void b2() {
        if ((gui.boxes[0][1].getIcon() == a) || (gui.boxes[0][1].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }
    
    // click x or o
    void b3() {
        if ((gui.boxes[0][2].getIcon() == a) || (gui.boxes[0][2].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }
    
    // click x or o
    void b4() {
        if ((gui.boxes[0][3].getIcon() == a) || (gui.boxes[0][3].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][3].setIcon(a);
            check[0][3] = 1;
        } else {
            gui.boxes[0][3].setIcon(b);
            check[0][3] = 2;
        }
        winner();
    }
    
    // click x or o
    void b5() {
        if ((gui.boxes[1][0].getIcon() == a) || (gui.boxes[1][0].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }
        winner();
    }
    
    // click x or o
    void b6() {
        if ((gui.boxes[1][1].getIcon() == a) || (gui.boxes[1][1].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }
    
    // click x or o
    void b7() {
        if ((gui.boxes[1][2].getIcon() == a) || (gui.boxes[1][2].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }
    
    // click x or o
    void b8() {
        if ((gui.boxes[1][3].getIcon() == a) || (gui.boxes[1][3].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][3].setIcon(a);
            check[1][3] = 1;
        } else {
            gui.boxes[1][3].setIcon(b);
            check[1][3] = 2;
        }
        winner();
    }
    
    // click x or o
    void b9() {
        if ((gui.boxes[2][0].getIcon() == a) || (gui.boxes[2][0].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }
    
    // click x or o
    void b10() {
        if ((gui.boxes[2][1].getIcon() == a) || (gui.boxes[2][1].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }
    
    // click x or o
    void b11() {
        if ((gui.boxes[2][2].getIcon() == a) || (gui.boxes[2][2].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }
    
    // click x or o
    void b12() {
        if ((gui.boxes[2][3].getIcon() == a) || (gui.boxes[2][3].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][3].setIcon(a);
            check[2][3] = 1;
        } else {
            gui.boxes[2][3].setIcon(b);
            check[2][3] = 2;
        }
        winner();
    }
    
    // click x or o
    void b13() {
        if ((gui.boxes[3][0].getIcon() == a) || (gui.boxes[3][0].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][0].setIcon(a);
            check[3][0] = 1;
        } else {
            gui.boxes[3][0].setIcon(b);
            check[3][0] = 2;
        }
        winner();
    }
    
    // click x or o
    void b14() {
        if ((gui.boxes[3][1].getIcon() == a) || (gui.boxes[3][1].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][1].setIcon(a);
            check[3][1] = 1;
        } else {
            gui.boxes[3][1].setIcon(b);
            check[3][1] = 2;
        }
        winner();
    }
    
    // click x or o
    void b15() {
        if ((gui.boxes[3][2].getIcon() == a) || (gui.boxes[3][2].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][2].setIcon(a);
            check[3][2] = 1;
        } else {
            gui.boxes[3][2].setIcon(b);
            check[3][2] = 2;
        }
        winner();
    }
    
    // click x or o
    void b16() {
        if ((gui.boxes[3][3].getIcon() == a) || (gui.boxes[3][3].getIcon() == b)) {
            return;
        }
        if (win != 0) {
            winner();
            return;
        }
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][3].setIcon(a);
            check[3][3] = 1;
        } else {
            gui.boxes[3][3].setIcon(b);
            check[3][3] = 2;
        }
        winner();
    }
    
    // verify if there is a winner
    void winner() {
        if (win > 0) {
            JOptionPane.showMessageDialog(null, "You need to reset to play again!");
            return;
        }
        
        /** Check rows for winner */
        for (int x=0; x<=3; x++){
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])&&(check[x][0]==check[x][3])) {
                if (check[x][0]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    xWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                    yWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x<=3; x++){
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x])) {
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    xWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                    yWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                }
            }
        }

        /** Check diagonals for winner */
        // diagonal from top left to bottom right
        if ((check[0][0]==check[1][1])&&(check[0][0]==check[2][2])&&(check[0][0]==check[3][3])){
            if (check[0][0]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
                xWin++;
                gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
            } else if (check[0][0]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner");
                win = 1;
                yWin++;
                gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
            }
        }
        // diagonal from bottom left to top right
        else {
            if ((check[0][3]==check[1][2])&&(check[0][3]==check[2][1])&&(check[0][3]==check[3][0])) {
                if (check[3][0]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                    xWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                } 
                else if (check[3][0]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                    yWin++;
                    gui.blank1.setText("Player X Wins: " + Integer.toString(xWin));
                    gui.blank2.setText("Player O Wins: " + Integer.toString(yWin));
                }
            }
        }
        
        /** Checks if the game is a tie */
        if ((clicks==16) && (win==0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
            tWin ++;
            gui.blank3.setText("Cat Wins: " + Integer.toString(tWin));
        }
    }
    
    // exception handling
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // exception handling
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // resets the game 
    public void reset() {
        clicks = 0;
        win = 0;
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                check[i][j] = 0;
                gui.boxes[i][j].setIcon(gui.back);
            }
        }
    }
}


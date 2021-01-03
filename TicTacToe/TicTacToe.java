/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201012
 * date         20201009
 * @filename	TicTacToe.java
 * @author      hkamal
 * @version     1.0
 * @see         TicTacToe program Assignment 2.5 - creates GUI elements for TicTacToe java game
 */

import java.awt.*;
import javax.swing.*;

public class TicTacToe extends JFrame {
    // create new instance for TicTacEvent
    TicTacEvent tictac = new TicTacEvent(this);

    // initialize the GUI elements
    JPanel titlePanel = new JPanel();
    JPanel row1 = new JPanel();
    JPanel row2 = new JPanel();
    JButton[][] boxes = new JButton[4][4];
    JLabel title = new JLabel("Tic Tac Toe");
    JButton reset = new JButton("Reset");
    JTextField blank1 = new JTextField("Player X Wins: 0");
    JTextField blank2 = new JTextField("Player O Wins: 0");
    JTextField blank3 = new JTextField("Cat Wins: 0");
    JButton exit = new JButton("Exit");
    JOptionPane win = new JOptionPane("Winner");
    String path = "./"; 
    ImageIcon back = new ImageIcon(path + "cardback.png"); // https://www.indiamart.com/proddetail/black-board-9098205688.html
    
    // initialize the GUI elements
    public TicTacToe() {
        super ("Tic Tac Toe");
        setSize (700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        // assign values to the button
        GridLayout layout1 = new GridLayout(5, 4, 10, 10);
        row1.setLayout(layout1);
        row2.setLayout(layout1);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        // add rows to the GUI
        titlePanel.add(title);
        row1.add(blank1);
        row1.add(blank2);
        row1.add(blank3);
        row1.add(reset);
        row2.add(exit);
        add(titlePanel);
        add(row1);
        add(row2);
        
        // make JTextArea uneditable
        blank1.setEditable(false);
        blank2.setEditable(false);
        blank3.setEditable(false);
        
        // add ActionListener to each element
        reset.addActionListener(tictac);
        exit.addActionListener(tictac);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        TicTacToe frame = new TicTacToe();
    }
}
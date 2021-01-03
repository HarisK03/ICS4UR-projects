/**
 * Description:	This program demonstrates the use of Java Swing graphics.
 * @author  vmso - virtual mr. so
 * date     20200915
 * @since   1.0
 * @version 1.0
 */

/* edited by Haris Kamal - incorporates textarea Class */

import javax.swing.*;
import java.awt.*;

public class Greetings extends JFrame {

    public Greetings () {
        super ("About Me.");
        setLayout(new FlowLayout());
        System.out.println("This is a little about me, Haris Kamal.");
        JTextArea textarea = new JTextArea("Name: Haris Kamal\nSchool: North Park Secondary School\nFavourite Musical Artist: Jeremy Zucker\nFavourite TV Show: Breaking Bad\nFavourite Colour: Black (If that doesn't count then orange)\n# of Siblings: 1\nFavourite Hobby: Reading (particularly about philosophy and Islamic theology)\nFavourite Video Game: League of Legends\nFastest Rubiks Cube Solve: 22.53s\nChess Elo: 1604");
        textarea.setEditable(false);
        add(textarea);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greetings gui = new Greetings();
        gui.setSize(500,250);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
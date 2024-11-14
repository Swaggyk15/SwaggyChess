package main;

import javax.swing.*;

public class Main {

//    static ImageIcon logo = new ImageIcon(Main.class.getClassLoader().
//            getResource("res/chess.png")); // commented out, loads the game icon

    public static void main(String[] args) {

        JFrame window = new JFrame("Chess Game"); // create the game window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the app when window is closed
        window.setResizable(false); // prevent resizing
//        window.getIconImage(logo.getImage()); // commented out, sets the game icon

        // add the game panel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); // resize window to fit the game panel

        window.setLocationRelativeTo(null); // center the window on the screen
        window.setVisible(true); // show the window

        gp.lauchGame(); // start the game
    }
}

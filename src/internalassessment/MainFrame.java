package internalassessment;

import java.awt.Color;
import java.awt.Component;

/**
 * MainFrame.java - builds the frame that the game displays on
 *
 * @author Ethan Alexander
 * @since Mar. 26, 2021,10:37:48 a.m.
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Default constructor, set class properties
     */
    public MainFrame() {

        GamePanel panel = new GamePanel();
        panel.setLocation(0,0);
        panel.setSize(this.getSize());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setVisible(true);
        this.add(panel);
        addKeyListener(new KeyChecker(panel));
//        ScorePanel scorePanel = new ScorePanel();
//        scorePanel.setLocation(0,0);
//        scorePanel.setSize(this.getSize());
//        scorePanel.setBackground(Color.LIGHT_GRAY);
//        scorePanel.setVisible(true);
//        this.add(scorePanel);
    }
}

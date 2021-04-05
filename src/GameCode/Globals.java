package GameCode;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;

/**
 * Globals.java - global variables for the running simulator
 *
 * @author Ethan Alexander
 * @since Mar. 24, 2021,10:25:34 a.m.
 */
public class Globals {

    /**
     * gets the dimensions of the screen of the monitor
     */
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * gets half the width of the screen
     */
    public int halfWidth = (int) (screenSize.getWidth() / 2);
    /**
     * gets half the height of the screen
     */
    public int halfHeight = (int) (screenSize.getHeight() / 2);

    public static int terrainCount = 0;
    /**
     * Default constructor, set class properties
     */
    public Globals() {

    }
}

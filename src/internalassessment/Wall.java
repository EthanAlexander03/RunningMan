package internalassessment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Wall.java - builds the wall in the game 
 *
 * @author Ethan Alexander
 * @since Apr. 3, 2021, 1:55:15 p.m.
 */
public class Wall {

    public int x;
    public int y;
    public int width;
    public int height;
    public int startX;

    Rectangle hitbox;

    /**
     * Default constructor, set class properties
     */
    public Wall(int x, int y, int width, int height) {
        this.x = x;
        startX = x;
        this.y = y;
        this.width = width;
        this.height = height;

        hitbox = new Rectangle(x, y, width, height);
    }

    public void draw(Graphics2D gtd) {
        gtd.setColor(Color.black);
        gtd.drawRect(x, y, width, height);
        gtd.setColor(Color.WHITE);
        gtd.fillRect(x + 1, y + 1, width - 2, height - 2);
    }

    public int set(int cameraX) {
        x = startX + cameraX;
        hitbox.x = x;
        
        return x;
      
    }

}

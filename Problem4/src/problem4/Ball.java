/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *Creates a ball
 * @author bachle
 */
public class Ball {

    Random rand = new Random();

    //Position where it will create a ball
    int x = rand.nextInt(800) + 1;
    int y = rand.nextInt(800) + 1;

    //Size of the ball
    int radius = 15;

    int dx = rand.nextInt(5) + 1; //The velocity in the x axis
    int dy = rand.nextInt(5) + 1;//The velocity in the y axis

    //Sets color of the ball
    Color c = Color.red;

    /**
     * Redraws the circle
     *
     * @param width
     * @param height
     * @param g
     */
    public void redraw(int width, int height, Graphics g) {

        if (x < radius) {
            dx = Math.abs(dx);
        }
        if (x > width - radius) {
            dx = -Math.abs(dx);
        }
        if (y < radius) {
            dy = Math.abs(dy);
        }
        if (y > height - radius) {
            dy = -Math.abs(dy);
        }

        x += dx;
        y += dy;
        g.setColor(c);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

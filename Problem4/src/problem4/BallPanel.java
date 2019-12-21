/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *Components
 * @author bachle
 */
class BallPanel extends JPanel implements ActionListener {

    int numOfBalls = 10; // Sets how many balls will appear 

    Ball[] balls = new Ball[numOfBalls];
    Timer timer;

    int delay = 5;
    

    public BallPanel() {
        timer = new Timer(delay, this);
        timer.start();
        for (int i = 0; i < numOfBalls; i++) {
            balls[i] = new Ball();
        }
    }
    
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    /**
     * 
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < numOfBalls; i++) {
            balls[i].redraw(getWidth(), getHeight(), g);
        }
    }
}

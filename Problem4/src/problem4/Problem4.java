/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import javax.swing.JFrame;

/**
 *Main method
 * @author bachle
 */
public class Problem4 {

    /**
     * Creates window
     */
    private static void createWindow() {
        JFrame frame = new JFrame("Balls Bouncing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BallPanel bp = new BallPanel();
        frame.add(bp);

        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });
    }
}

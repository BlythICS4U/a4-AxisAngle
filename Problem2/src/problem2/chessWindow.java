/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.awt.*;
import javax.swing.JPanel;

/**
 * Paints the chess board
 * @author bachle
 */
public class chessWindow extends JPanel {

    public chessWindow() {

    }

    /**
     * Paints the frame
     *
     * @param brush
     */
    @Override
    public void paintComponent(Graphics brush) {
        super.paintComponent(brush);
        brush.setColor(Color.black);
        brush.fillRect(0, 0, 400, 400);
        brush.setColor(Color.red);
        
        for (int i = 0; i < 400; i += 100) {
            for (int j = 0; j < 400; j += 100) {
                brush.fillRect(j, i, 50, 50);
                brush.fillRect(j + 50, i + 50, 50, 50);
            }
        }
    }
}

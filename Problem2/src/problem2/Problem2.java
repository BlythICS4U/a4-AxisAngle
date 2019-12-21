/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Main method to create board and run it
 * @author bachle
 */
public class Problem2 {

    /**
     * Creates the board
     */
    public static void createBoard() {
        JFrame board = new JFrame("Chess");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(400, 422);
        board.add(new chessWindow());
        board.setResizable(false);
        board.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createBoard();
            }
        });
    }
}

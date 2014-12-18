/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picture;

import javax.swing.JFrame;

/**
 *
 * @author struj3903
 */
public class Picture extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FraOne frame = new FraOne();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

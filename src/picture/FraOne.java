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
public class FraOne extends JFrame {

    Panone pan = new Panone();

    public FraOne() throws Exception{
        pan.setLayout(null);
        setSize(500, 500);
        add(pan);

    }
}

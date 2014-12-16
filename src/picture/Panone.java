/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picture;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author struj3903
 */
public class Panone extends JPanel implements ActionListener {

    private BufferedImage image;
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6= new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    

    public Panone() {
        //btnOne.setOpaque(false);
       // btnOne.setContentAreaFilled(false);
       // btnOne.setBorderPainted(false);
        btn1.setBounds(125, 100, 65, 70);
        btn1.addActionListener(this);
       //  add(btn1);
        btn2.setBounds(195, 100, 80, 70);
      //  add(btn2);
         btn3.setBounds(280, 100, 70, 70);
        // add(btn3);
             btn4.setBounds(123, 165, 75, 80);
             add(btn4);
        try {
            image = ImageIO.read(new File("tictactoe.png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 125, 100, null); // see javadoc for more info on the parameters     
    }

    public void actionPerformed(ActionEvent evt) {
        
btn1.setText("X");
        btn1.setFont(new Font("Serif", Font.PLAIN, 35));
        System.out.println("Clicked");
        revalidate();
        repaint();
    }
}

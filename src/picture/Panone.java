package picture;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panone extends JPanel implements ActionListener {

    private BufferedImage image;
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    boolean isX = true;

    public Panone() {
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn1.setBounds(125, 100, 65, 70);
        btn1.addActionListener(this);
        add(btn1);
        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
        btn2.setBounds(195, 100, 80, 70);
        btn2.addActionListener(this);
        add(btn2);
        btn3.setOpaque(false);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(false);
        btn3.setBounds(280, 100, 70, 70);
        btn3.addActionListener(this);
        add(btn3);
        btn4.setOpaque(false);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);
        btn4.setBounds(125, 172, 65, 80);
        btn4.addActionListener(this);
        add(btn4);
        btn5.setOpaque(false);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn5.setBounds(195, 172, 80, 80);
        btn5.addActionListener(this);
        add(btn5);
        btn6.setOpaque(false);
        btn6.setContentAreaFilled(false);
        btn6.setBorderPainted(false);
        btn6.setBounds(280, 172, 70, 80);
        btn6.addActionListener(this);
        add(btn6);
        btn7.setOpaque(false);
        btn7.setContentAreaFilled(false);
        btn7.setBorderPainted(false);
        btn7.setBounds(125, 255, 65, 70);
        btn7.addActionListener(this);
        add(btn7);
        btn8.setOpaque(false);
        btn8.setContentAreaFilled(false);
        btn8.setBorderPainted(false);
        btn8.setBounds(195, 255, 80, 70);
        btn8.addActionListener(this);
        add(btn8);
        btn9.setOpaque(false);
        btn9.setContentAreaFilled(false);
        btn9.setBorderPainted(false);
        btn9.setBounds(280, 255, 70, 69);
        btn9.addActionListener(this);
        add(btn9);
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
        if (isX) {
            System.out.println("Clicked - X :)");
        } else if (!isX) {
            System.out.println("Clicked - O :)");
        }
        if (evt.getSource() == btn1) {
            if (isX) {
                btn1.setText("X");
                btn1.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn1.setText("O");
                btn1.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn1.setEnabled(false);
        }
        if (evt.getSource() == btn2) {
            if (isX) {
                btn2.setText("X");
                btn2.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn2.setText("O");
                btn2.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn2.setEnabled(false);
        }
        if (evt.getSource() == btn3) {
            if (isX) {
                btn3.setText("X");
                btn3.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn3.setText("O");
                btn3.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn3.setEnabled(false);
        }
        if (evt.getSource() == btn4) {
            if (isX) {
                btn4.setText("X");
                btn4.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn4.setText("O");
                btn4.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn4.setEnabled(false);
        }
        if (evt.getSource() == btn5) {
            if (isX) {
                btn5.setText("X");
                btn5.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn5.setText("O");
                btn5.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn5.setEnabled(false);
        }
        if (evt.getSource() == btn6) {
            if (isX) {
                btn6.setText("X");
                btn6.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn6.setText("O");
                btn6.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn6.setEnabled(false);
        }
        if (evt.getSource() == btn7) {
            if (isX) {
                btn7.setText("X");
                btn7.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn7.setText("O");
                btn7.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn7.setEnabled(false);
        }
        if (evt.getSource() == btn8) {
            if (isX) {
                btn8.setText("X");
                btn8.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn8.setText("O");
                btn8.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn8.setEnabled(false);
        }
        if (evt.getSource() == btn9) {
            if (isX) {
                btn9.setText("X");
                btn9.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = false;
            } else if (!isX) {
                btn9.setText("O");
                btn9.setFont(new Font("Fawn Script", Font.PLAIN, 45));
                isX = true;
            }
            btn9.setEnabled(false);
        }
        revalidate();
        repaint();
    }
}

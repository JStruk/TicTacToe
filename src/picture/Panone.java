package picture;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

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
    JLabel lblWin = new JLabel();
    boolean isX = true;
    private static AudioInputStream sound;
    private static File fBruh;
    public static Clip cBruh;
    private static DataLine.Info info;
    public Image img, img2, newimg;

    public Panone() throws Exception {

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

    class ColourChangeListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            try {
                img = ImageIO.read(getClass().getResource("bruhguy.jpg"));
                img2 = ImageIO.read(getClass().getResource("bruhgirl.jpg"));
            } catch (IOException ex) {
            }
            fBruh = new File("Bruh-Sound.wav");
            try {
                AudioInputStream sound = AudioSystem.getAudioInputStream(fBruh);
                info = new DataLine.Info(Clip.class, sound.getFormat());
                cBruh = (Clip) AudioSystem.getLine(info);
                cBruh.open(sound);
            } catch (Exception ex) {
                Logger.getLogger(Panone.class.getName()).log(Level.SEVERE, null, ex);
            }
            BtnText btn = (BtnText) event.getSource();
            if (isX) {
                int nW = btn.getWidth();
                int nH = btn.getHeight();
                if (isX) {
                    newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
                    btn.setIcon(new ImageIcon(newimg));
                    btn.setDisabledIcon(new ImageIcon(newimg));
                    isX = false;
                } else if (!isX) {
                    newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
                    btn.setIcon(new ImageIcon(newimg));
                    btn.setDisabledIcon(new ImageIcon(newimg));
                    isX = true;
                }
            }
            ActionListener colourChangeListener = new ColourChangeListener();
            // all 3 buttons call the same listener
            btn1.addActionListener(colourChangeListener);
            btn2.addActionListener(colourChangeListener);
            btn3.addActionListener(colourChangeListener);
            btn4.addActionListener(colourChangeListener);
            btn5.addActionListener(colourChangeListener);
            btn6.addActionListener(colourChangeListener);
            btn7.addActionListener(colourChangeListener);
            btn8.addActionListener(colourChangeListener);
            btn9.addActionListener(colourChangeListener);
        }
        /* public void actionPerformed(ActionEvent evt) {

         try {
         img = ImageIO.read(getClass().getResource("bruhguy.jpg"));
         img2 = ImageIO.read(getClass().getResource("bruhgirl.jpg"));
         } catch (IOException ex) {
         }
         fBruh = new File("Bruh-Sound.wav");
         try {
         AudioInputStream sound = AudioSystem.getAudioInputStream(fBruh);
         info = new DataLine.Info(Clip.class, sound.getFormat());
         cBruh = (Clip) AudioSystem.getLine(info);
         cBruh.open(sound);
         } catch (Exception ex) {
         Logger.getLogger(Panone.class.getName()).log(Level.SEVERE, null, ex);
         }
         if (isX) {
         System.out.println("Clicked - X :)");
         } else if (!isX) {
         System.out.println("Clicked - O :)");
         }
         if (evt.getSource() == btn1) {
         int nW = btn1.getWidth();
         int nH = btn1.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn1.setIcon(new ImageIcon(newimg));
         btn1.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn1.setIcon(new ImageIcon(newimg));
         btn1.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }

         btn1.setEnabled(false);
         }
         if (evt.getSource() == btn2) {
         int nW = btn2.getWidth();
         int nH = btn2.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn2.setIcon(new ImageIcon(newimg));
         btn2.setDisabledIcon(new ImageIcon(newimg));
         //btn2.setText("X");
         //btn2.setFont(new Font("Fawn Script", Font.PLAIN, 45));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn2.setIcon(new ImageIcon(newimg));
         btn2.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn2.setEnabled(false);
         }
         if (evt.getSource() == btn3) {
         int nW = btn3.getWidth();
         int nH = btn3.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn3.setIcon(new ImageIcon(newimg));
         btn3.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn3.setIcon(new ImageIcon(newimg));
         btn3.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn3.setEnabled(false);
         }
         if (evt.getSource() == btn4) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn4.setIcon(new ImageIcon(newimg));
         btn4.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn4.setIcon(new ImageIcon(newimg));
         btn4.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn4.setEnabled(false);

         }
         if (evt.getSource() == btn5) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn5.setIcon(new ImageIcon(newimg));
         btn5.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn5.setIcon(new ImageIcon(newimg));
         btn5.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn5.setEnabled(false);
         }
         if (evt.getSource() == btn6) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn6.setIcon(new ImageIcon(newimg));
         btn6.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn6.setIcon(new ImageIcon(newimg));
         btn6.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn6.setEnabled(false);
         }
         if (evt.getSource() == btn7) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn7.setIcon(new ImageIcon(newimg));
         btn7.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn7.setIcon(new ImageIcon(newimg));
         btn7.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn7.setEnabled(false);
         }
         if (evt.getSource() == btn8) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn8.setIcon(new ImageIcon(newimg));
         btn8.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn8.setIcon(new ImageIcon(newimg));
         btn8.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn8.setEnabled(false);
         }
         if (evt.getSource() == btn9) {
         int nW = btn4.getWidth();
         int nH = btn4.getHeight();
         if (isX) {
         newimg = img.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn9.setIcon(new ImageIcon(newimg));
         btn9.setDisabledIcon(new ImageIcon(newimg));
         isX = false;
         } else if (!isX) {
         newimg = img2.getScaledInstance((nW - 15), (nH - 15), java.awt.Image.SCALE_SMOOTH);
         btn9.setIcon(new ImageIcon(newimg));
         btn9.setDisabledIcon(new ImageIcon(newimg));
         isX = true;
         }
         btn9.setEnabled(false);
         }
         cBruh.start();
         revalidate();
         repaint();
         }*/
    }
}
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class frameClass extends JFrame{
    frameClass()
    {
    this.setVisible(true);
    this.setSize(420,420);
    this.setTitle("gui window");
    this.setResizable(true);
    ImageIcon image = new ImageIcon("image.jpeg");
    this.setIconImage(image.getImage());
    // this.getContentPane().setBackground(Color.BLACK);
    this.getContentPane().setBackground(new Color(124,23,234));
    this.getContentPane().setBackground(new Color(0x654321));
    }
}

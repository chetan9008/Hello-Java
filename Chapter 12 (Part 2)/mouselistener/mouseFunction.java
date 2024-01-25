import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseFunction extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon pain;
    ImageIcon dizzy;
    ImageIcon nervous;
    mouseFunction()
    {
        smile = new ImageIcon("smile.png");
        nervous = new ImageIcon("nervous.png");
        dizzy = new ImageIcon("dizzy.png");
        pain = new ImageIcon("pain.png");

        Image image = smile.getImage(); // transform it 
        Image newimg = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        smile = new ImageIcon(newimg); // transform it back
        
        Image image1 = nervous.getImage(); // transform it 
        Image newimg1 = image1.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        nervous = new ImageIcon(newimg1); // transform it back
        
        Image image2 = dizzy.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        dizzy = new ImageIcon(newimg2); // transform it back
        
        Image image3 = pain.getImage(); // transform it 
        Image newimg3 = image3.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        pain = new ImageIcon(newimg3);  // transform it back

        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        label = new JLabel();
        label.addMouseListener(this);
        label.setIcon(smile);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked the mouse");
        // label.setBackground(Color.blue);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed the mouse");
        // label.setBackground(Color.green);
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released the mouse");
        // label.setBackground(Color.yellow);
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered the component");
        // label.setBackground(Color.magenta);
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited the component");
        // label.setBackground(Color.red);
        label.setIcon(smile);
    }
}

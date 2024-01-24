import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keylistenerInJava extends JFrame implements KeyListener {
    JLabel label = new JLabel();
    keylistenerInJava()
    {
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        ImageIcon icon = new ImageIcon("rocket.jpg");
        label.setBounds(0,0,100,100);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 20,label.getY());
                break;
            case 'd':
                label.setLocation(label.getX()+20,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY() -20);
                break;
            case 's':
                label.setLocation(label.getX(),label.getY()+20);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 20,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-20);
                break;
            case 39:
                label.setLocation(label.getX()+20,label.getY());
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+20);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key char on releasing is "+e.getKeyChar());
        System.out.println("Key code on releasing is "+e.getKeyCode());
    }
}

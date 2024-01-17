import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton button = new JButton();
        button.setText("1");
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.yellow);
        frame.add(panel);
        
        panel.add(button);
        panel.add(new JButton("2"));        
        panel.add(new JButton("3"));        
        panel.add(new JButton("4"));        
        panel.add(new JButton("5"));        
        panel.add(new JButton("6"));        
        panel.add(new JButton("7"));        
        panel.add(new JButton("8"));        
        panel.add(new JButton("9"));        
        panel.add(new JButton("10"));        

    }}

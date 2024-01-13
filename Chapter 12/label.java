import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setSize(500,500);
        JLabel label = new JLabel();
        label.setText("GUI IN JAVA");
        frame.add(label);
        ImageIcon image = new ImageIcon("image.jpeg");
        label.setIcon(image);
        label.setForeground(Color.white);
        label.setFont(new Font("San sareif",Font.ITALIC,30));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        Border border = BorderFactory.createLineBorder(Color.orange, 3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // frame.setLayout(null);
        // label.setBounds(0,0,300,300);
        frame.pack();
    }
}

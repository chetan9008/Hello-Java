import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class layerPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0, 0, 500, 500);
        
        frame.add(layeredpane);

        JLabel label1 = new JLabel();
        label1.setBounds(50, 50, 100, 100);
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        // layeredpane.add(label1,JLayeredPane.DEFAULT_LAYER);
        layeredpane.add(label1, Integer.valueOf(0));

        JLabel label2 = new JLabel();
        label2.setBounds(100, 100, 100, 100);
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        // layeredpane.add(label2,JLayeredPane.PALETTE_LAYER);
        layeredpane.add(label2, Integer.valueOf(1));


        JLabel label3 = new JLabel();
        label3.setBounds(150, 150, 100, 100);
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        // layeredpane.add(label3,JLayeredPane.MODAL_LAYER);
        layeredpane.add(label3, Integer.valueOf(2));
    }
}

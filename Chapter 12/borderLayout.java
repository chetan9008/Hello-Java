import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class borderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        // frame.setLayout(new BorderLayout(20, 30));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.pink);
        panel5.setBackground(Color.black);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        JPanel subPanel1 = new JPanel();
        JPanel subPanel2 = new JPanel();
        JPanel subPanel3 = new JPanel();
        JPanel subPanel4 = new JPanel();
        JPanel subPanel5 = new JPanel();

        subPanel1.setBackground(Color.red);
        subPanel2.setBackground(Color.blue);
        subPanel3.setBackground(Color.green);
        subPanel4.setBackground(Color.pink);
        subPanel5.setBackground(Color.black);

        subPanel1.setPreferredSize(new Dimension(50, 50));
        subPanel2.setPreferredSize(new Dimension(50, 50));
        subPanel3.setPreferredSize(new Dimension(50, 50));
        subPanel4.setPreferredSize(new Dimension(50, 50));
        subPanel5.setPreferredSize(new Dimension(50, 50));

        panel5.setLayout(new BorderLayout());

        panel5.add(subPanel1, BorderLayout.NORTH);
        panel5.add(subPanel2, BorderLayout.SOUTH);
        panel5.add(subPanel3, BorderLayout.EAST);
        panel5.add(subPanel4, BorderLayout.WEST);
        panel5.add(subPanel5, BorderLayout.CENTER);
    }
}

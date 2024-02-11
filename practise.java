/**
 * practise
 */
import javax.swing.*;
import java.awt.*;
public class practise {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("1");
        JButton button3 = new JButton("1");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
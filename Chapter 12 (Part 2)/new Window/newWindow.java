import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    newWindow()
    {
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(300,200);

        label.setText("Hello Window");
        label.setFont(new Font(null, Font.ITALIC, 30));
        label.setBounds(10, 10, 200, 50);
        frame.add(label);
    }
}

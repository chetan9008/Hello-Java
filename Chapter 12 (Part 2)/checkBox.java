import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

// import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
public class checkBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(500, 500);


        JCheckBox box = new JCheckBox();
        box.setText("I'm not a robot");
        box.setFont(new Font("contra",Font.ITALIC,40));
        box.setFocusable(false);
        
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            boolean status = box.isSelected();
            System.out.println(status);
        });
        
        frame.add(button);
        frame.add(box);
        frame.setVisible(true);
        frame.pack();
    }
}

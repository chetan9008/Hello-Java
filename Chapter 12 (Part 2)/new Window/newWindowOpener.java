import javax.swing.JButton;
import javax.swing.JFrame;

public class newWindowOpener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);

        JButton button = new JButton("New Window");
        button.setFocusable(false);
        button.setBounds(150, 200, 200, 50);
        frame.add(button);

        button.addActionListener(e -> {
            if(e.getSource() == button)
            {
                frame.dispose();
                newWindow window = new newWindow();
            }
        });
    }    
}

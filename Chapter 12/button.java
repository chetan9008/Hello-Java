public class button {
    public static void main(String[] args) {
        new MyFrame();
    }
}

// MyFrame file code 

// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MyFrame extends JFrame implements ActionListener {
//     JButton button;
//     JLabel label;
//     MyFrame()
//     {
//     button = new JButton();
//     button.setBounds(200,100,100,50);
//     button.addActionListener(this);
//     button.addActionListener(w -> System.out.println("poo"));
//     button.setText("Click me");
//     button.setForeground(Color.black);
//     button.setBackground(Color.green);
//     button.setFocusable(false);

//     label = new JLabel();
//     ImageIcon image = new ImageIcon("image.jpeg");
//     label.setIcon(image);
//     label.setBounds(200,300,100,100);
//     label.setVisible(false);

//     this.setVisible(true);
//     this.setSize(420,420);
//     this.setTitle("gui window");
//     this.setResizable(true);
//     this.setIconImage(image.getImage());
//     // this.getContentPane().setBackground(Color.BLACK);
//     this.getContentPane().setBackground(new Color(124,23,234));
//     this.getContentPane().setBackground(new Color(0x654321));


//     // // // //
//     this.add(button);
//     this.add(label);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         System.out.println("pop");
//         button.setEnabled(false);
//         label.setVisible(true);
//     }
// }


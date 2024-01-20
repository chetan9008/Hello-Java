import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class joptionpane {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "This is message", "Title is null", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is message", "Title is null", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is information", "Question", JOptionPane.QUESTION_MESSAGE);
        // while(true)
        // JOptionPane.showMessageDialog(null, "This is warning", "Warning", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is and error", "Error", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Bro, Do you even code?", "Bro code", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(answer);
        // if(answer == 0)
        // {
        //     String name = JOptionPane.showInputDialog("What is your Name?");
        //     System.out.println(name);
        // int answer = JOptionPane.showOptionDialog(null, "Are you awesome", "Coll", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, null,null,0);
        // System.out.println(answer);

        ImageIcon icon = new ImageIcon("image.jpeg");
        int answer = JOptionPane.showOptionDialog(null, "Are you Serious", "Reply", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, new Object[]{"Nope","Yuup","No way"}, 0);
        System.out.println(answer);
        }
        
    }

// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

public class menubar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.addActionListener(e -> {
            System.out.println("Loaded a file");
        });

        saveItem.addActionListener(e -> {
            System.out.println("Save a file");
        });

        exitItem.addActionListener(e -> {
            System.out.println("Exiting");
            System.exit(0);
        });

        fileMenu.setMnemonic(KeyEvent.VK_F); //Press Alt+ F to open
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        // ImageIcon icon = new ImageIcon("check.png");

        // loadItem.setIcon(icon);
        // saveItem.setIcon(icon);
        // exitItem.setIcon(icon);
        
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}

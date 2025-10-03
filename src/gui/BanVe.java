package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BanVe extends JFrame {
    public BanVe(){
        super("Cinema");
        setSize(Home.sizeConsole);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lbl_title = new JLabel("Bán vé");
        Font f_title = new Font("Arial", Font.BOLD, 30);
        lbl_title.setFont(f_title);
        lbl_title.setForeground(Color.red);
        JPanel pNorth = new JPanel();
        pNorth.add(lbl_title);
        add(pNorth, BorderLayout.NORTH);
    }
    private void createModal(){
            // Tạo JDialog modal
            JDialog modal = new JDialog(this, "This is a modal dialog", true); // true = modal
            modal.setSize(250, 150);
            modal.setLayout(new FlowLayout());

            JLabel label = new JLabel("Hello, this is modal!");
            JButton closeBtn = new JButton("Close");
            closeBtn.addActionListener(e -> modal.dispose()); // đóng modal

            modal.add(label);
            modal.add(closeBtn);

            modal.setLocationRelativeTo(this); // căn giữa main window
            modal.setVisible(true); // show modal
    }
}

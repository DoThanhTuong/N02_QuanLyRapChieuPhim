package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Home extends JFrame {
    public Dimension sizeConsole = new Dimension(900, 650);
    private String str_cmpName = "Trang chủ bán vé";
    private JButton btnBanVe;
    private JButton btnBanBapNuoc;
    private JButton btnXemThongKe;
    private JButton btnTaiKhoan;
    private JButton btnLogOut;
    private JButton btnHelp;
    private JButton btnClose;
    private ImageIcon icon_bapNuoc;
    private Image img_bapNuoc;
    private ImageIcon icon_acc;
    private Image img_acc;
    private ImageIcon icon_banVe;
    private Image img_banVe;
    private ImageIcon icon_thongKe;
    private Image img_thongKe;

    public Home() {
        super("Trang chủ");
        setSize(sizeConsole);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pNorth = new JPanel();
        JLabel lbl_cmpName = new JLabel(str_cmpName, SwingConstants.CENTER);
        Font fCmpName = new Font("Arial", Font.BOLD, 30);
        lbl_cmpName.setFont(fCmpName);
        lbl_cmpName.setForeground(Color.red);
        pNorth.add(lbl_cmpName, BorderLayout.CENTER);
        add(pNorth, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(2, 2, 20, 20));
        // icon
        icon_bapNuoc = new ImageIcon(getClass().getResource("/img/icon_bapNuoc.png"));
        img_bapNuoc = icon_bapNuoc.getImage();

        icon_acc = new ImageIcon(getClass().getResource("/img/icon_acc.png"));
        img_acc = icon_acc.getImage();

        icon_banVe = new ImageIcon(getClass().getResource("/img/icon_banVe.jpg"));
        img_banVe = icon_banVe.getImage();

        icon_thongKe = new ImageIcon(getClass().getResource("/img/icon_thongKe.jpg"));
        img_thongKe = icon_thongKe.getImage();

        // Tạo nút
        btnBanVe = new JButton();
        btnBanBapNuoc = new JButton();
        btnXemThongKe = new JButton();
        btnTaiKhoan = new JButton();
        // set size
        btnBanBapNuoc.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int w = btnBanBapNuoc.getWidth();
                int h = btnBanBapNuoc.getHeight();
                Image scaled = img_bapNuoc.getScaledInstance(w, h, Image.SCALE_SMOOTH);
                btnBanBapNuoc.setIcon(new ImageIcon(scaled));
            }
        });
        btnTaiKhoan.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int w = btnTaiKhoan.getWidth();
                int h = btnTaiKhoan.getHeight();
                Image scaled = img_acc.getScaledInstance(w, h, Image.SCALE_SMOOTH);
                btnTaiKhoan.setIcon(new ImageIcon(scaled));
            }
        });
        btnBanVe.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int w = btnBanVe.getWidth();
                int h = btnBanVe.getHeight();
                Image scaled = img_banVe.getScaledInstance(w, h, Image.SCALE_SMOOTH);
                btnBanVe.setIcon(new ImageIcon(scaled));
            }
        });
        btnXemThongKe.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                int w = btnXemThongKe.getWidth();
                int h = btnXemThongKe.getHeight();
                Image scaled = img_thongKe.getScaledInstance(w, h, Image.SCALE_SMOOTH);
                btnXemThongKe.setIcon(new ImageIcon(scaled));
            }
        });

        Font fButton = new Font("Arial", Font.BOLD, 20);
        btnBanVe.setFont(fButton);
        btnBanBapNuoc.setFont(fButton);
        btnXemThongKe.setFont(fButton);
        btnTaiKhoan.setFont(fButton);

        // Thêm vào panel
        pCenter.add(btnBanVe);
        pCenter.add(btnBanBapNuoc);
        pCenter.add(btnXemThongKe);
        pCenter.add(btnTaiKhoan);

        // Thêm vào background chính
        add(pCenter, BorderLayout.CENTER);
        btnBanVe.addActionListener(e -> banVe());
        btnBanBapNuoc.addActionListener(e -> banBapNuoc());
        btnXemThongKe.addActionListener(e -> xemThongKe());
        btnTaiKhoan.addActionListener(e -> taiKhoan());

        JPanel pSouth = new JPanel();
        btnLogOut = new JButton("Đăng xuất");
        btnHelp = new JButton("Trợ giúp");
        btnClose = new JButton("Đóng");
        pSouth.add(btnLogOut);
        pSouth.add(btnHelp);
        pSouth.add(btnClose);
        add(pSouth, BorderLayout.SOUTH);
        btnLogOut.addActionListener(e -> logout());
        btnHelp.addActionListener(e -> help());
        btnClose.addActionListener(e -> close());
    }

    private void logout() {
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }

    private void close() {
        System.exit(0);
    }

    private void help() {
        JOptionPane.showMessageDialog(this, "Hello world", "Trợ giúp", JOptionPane.INFORMATION_MESSAGE);
    }

    private void banBapNuoc() {
        dispose();
        // chuyển qua giao diện bán bắp nước

    }

    private void banVe() {
        dispose();
        // chuyển giao diện bán vé
    }

    private void xemThongKe() {
        dispose();
        // chuyển giao diện thống kê
    }

    private void taiKhoan() {
        dispose();
        // chuyển giao diện tài khoản
    }

}

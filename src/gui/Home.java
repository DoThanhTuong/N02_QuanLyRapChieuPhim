package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Home extends JFrame {
    // Biến toàn cục cho chương trình nhớ
    //kích thước của sổ
    public static Dimension sizeConsole = new Dimension(900, 630);
    //tên ứng dụng
    public static String nameApp = "Hệ thống Absolution Cinema";
    //kích thước nút bấm trái
    public static Dimension sizeBtnWest = new Dimension(150, 50);

    private JButton btnBanVe;
    private JButton btnBanBapNuoc;
    private JButton btnXemThongKe;
    private JButton btnTaiKhoan;
    private JButton btnLogOut;
    private JButton btnHelp;
    private JButton btnClose;
    private JButton btnPhim, btnNhanVien, btnLichChieu;

    private Font fCmpName;
    private Font fBtnName;
    private ImageIcon icon_bg;
    private JLabel lbl_bg;

    public Home() {
        super("Absolution Cinema");
        setSize(sizeConsole);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        // North
        JPanel pNorth = new JPanel();
        JLabel lbl_cmpName = new JLabel(nameApp, SwingConstants.CENTER);
        fCmpName = new Font("Arial", Font.BOLD, 30);
        lbl_cmpName.setFont(fCmpName);
        lbl_cmpName.setForeground(Color.yellow);
        pNorth.add(lbl_cmpName, BorderLayout.CENTER);
        pNorth.setBackground(Color.RED);
        // West
        JPanel pWest = new JPanel();
        pWest.setLayout(new BoxLayout(pWest, BoxLayout.X_AXIS));
        pWest.setBackground(Color.BLACK);
        JPanel pWest_btn = new JPanel();
        pWest_btn.setLayout(new BoxLayout(pWest_btn, BoxLayout.Y_AXIS));
        pWest_btn.setBackground(Color.BLACK);
        // Create Font for west button
        fBtnName = new Font("Arial", Font.BOLD, 15);

        btnBanVe = new JButton("Bán vé");
        btnBanVe.setMaximumSize(sizeBtnWest);
        btnBanVe.setBackground(Color.RED);
        btnBanVe.setForeground(Color.WHITE);
        btnBanVe.setFont(fBtnName);

        btnBanBapNuoc = new JButton("Bán bắp nước");
        btnBanBapNuoc.setMaximumSize(sizeBtnWest);
        btnBanBapNuoc.setBackground(Color.RED);
        btnBanBapNuoc.setForeground(Color.WHITE);
        btnBanBapNuoc.setFont(fBtnName);

        btnXemThongKe = new JButton("Xem thống kê");
        btnXemThongKe.setMaximumSize(sizeBtnWest);
        btnXemThongKe.setBackground(Color.RED);
        btnXemThongKe.setForeground(Color.WHITE);
        btnXemThongKe.setFont(fBtnName);

        btnTaiKhoan = new JButton("Tài khoản");
        btnTaiKhoan.setMaximumSize(sizeBtnWest);
        btnTaiKhoan.setBackground(Color.RED);
        btnTaiKhoan.setForeground(Color.WHITE);
        btnTaiKhoan.setFont(fBtnName);

        btnPhim = new JButton("Danh sách phim");
        btnPhim.setMaximumSize(sizeBtnWest);
        btnPhim.setBackground(Color.RED);
        btnPhim.setForeground(Color.WHITE);
        btnPhim.setFont(fBtnName);

        btnLichChieu = new JButton("Lịch chiếu");
        btnLichChieu.setMaximumSize(sizeBtnWest);
        btnLichChieu.setBackground(Color.RED);
        btnLichChieu.setForeground(Color.WHITE);
        btnLichChieu.setFont(fBtnName);

        btnNhanVien = new JButton("Nhân viên");
        btnNhanVien.setMaximumSize(sizeBtnWest);
        btnNhanVien.setBackground(Color.RED);
        btnNhanVien.setForeground(Color.WHITE);
        btnNhanVien.setFont(fBtnName);
        // Thêm vào panel
        pWest_btn.add(btnBanVe);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnPhim);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnLichChieu);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnBanBapNuoc);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnXemThongKe);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnNhanVien);
        pWest_btn.add(Box.createVerticalStrut(15));

        pWest_btn.add(btnTaiKhoan);

        pWest.add(Box.createHorizontalStrut(5));
        pWest.add(pWest_btn);
        pWest.add(Box.createHorizontalStrut(5));

        // pCenter
        JPanel pCenter = new JPanel(new BorderLayout());
        icon_bg = new ImageIcon(getClass().getResource("/img/backGround.jpg"));
        lbl_bg = new JLabel(icon_bg);
        pCenter.add(lbl_bg, BorderLayout.CENTER);

        //add sự kiện
        btnBanVe.addActionListener(e -> UIManager.OpenBanVeUI(this));
        btnBanBapNuoc.addActionListener(e -> UIManager.OpenBanBapNuocUI(this));
        btnXemThongKe.addActionListener(e -> UIManager.OpenXemThongKeUI(this));
        btnTaiKhoan.addActionListener(e -> UIManager.OpenTaiKhoanUI(this));
        btnLichChieu.addActionListener(e -> UIManager.OpenLichChieuUI(this));
        btnNhanVien.addActionListener(e -> UIManager.OpenNhanVienUI(this));
        btnPhim.addActionListener(e -> UIManager.OpenDanhSachPhimUI(this));
        
        // pSouth
        JPanel pSouth = new JPanel();
        btnLogOut = new JButton("Đăng xuất");
        btnLogOut.setFont(fBtnName);
        btnHelp = new JButton("Trợ giúp");
        btnHelp.setFont(fBtnName);
        btnClose = new JButton("Đóng");
        btnClose.setFont(fBtnName);
        pSouth.add(btnLogOut);
        pSouth.add(btnHelp);
        pSouth.add(btnClose);
        //add sự kiện
        btnLogOut.addActionListener(e -> logout());
        btnHelp.addActionListener(e -> help());
        btnClose.addActionListener(e -> System.exit(0));
        // Thêm vào background chính
        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pWest, BorderLayout.WEST);
        add(pSouth, BorderLayout.SOUTH);
    }

    private void logout() {
        int result = JOptionPane.showConfirmDialog(this,
                "Bạn chắc chắn muốn đăng xuất",
                "Xác nhận đăng xuất",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }

    private void help() {
        String helpText = "Mọi chi tiết xin liên hệ quản lí hệ thống - Chí Tâm\nSđt: 0347269410";
        JOptionPane.showMessageDialog(this, helpText, "Trợ giúp", JOptionPane.INFORMATION_MESSAGE);
    }

}

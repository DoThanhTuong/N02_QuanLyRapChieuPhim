package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BanVe extends JFrame {
    // kích thước cửa sổ chuẩn cho chương trình
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
    private JComboBox cb_phim;
    private JComboBox cb_phong;
    private JComboBox cb_suatChieu;
    private JButton btn_chonGhe;

    public BanVe() {
        super("Absolution Cinema");
        setSize(Home.sizeConsole);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // North
        JPanel pNorth = new JPanel();
        JLabel lbl_cmpName = new JLabel(Home.nameApp, SwingConstants.CENTER);
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
        btnBanVe.setMaximumSize(Home.sizeBtnWest);
        btnBanVe.setBackground(new Color(140, 0, 0));
        btnBanVe.setForeground(Color.WHITE);
        btnBanVe.setFont(fBtnName);

        btnBanBapNuoc = new JButton("Bán bắp nước");
        btnBanBapNuoc.setMaximumSize(Home.sizeBtnWest);
        btnBanBapNuoc.setBackground(Color.RED);
        btnBanBapNuoc.setForeground(Color.WHITE);
        btnBanBapNuoc.setFont(fBtnName);

        btnXemThongKe = new JButton("Xem thống kê");
        btnXemThongKe.setMaximumSize(Home.sizeBtnWest);
        btnXemThongKe.setBackground(Color.RED);
        btnXemThongKe.setForeground(Color.WHITE);
        btnXemThongKe.setFont(fBtnName);

        btnTaiKhoan = new JButton("Tài khoản");
        btnTaiKhoan.setMaximumSize(Home.sizeBtnWest);
        btnTaiKhoan.setBackground(Color.RED);
        btnTaiKhoan.setForeground(Color.WHITE);
        btnTaiKhoan.setFont(fBtnName);

        btnPhim = new JButton("Danh sách phim");
        btnPhim.setMaximumSize(Home.sizeBtnWest);
        btnPhim.setBackground(Color.RED);
        btnPhim.setForeground(Color.WHITE);
        btnPhim.setFont(fBtnName);

        btnLichChieu = new JButton("Lịch chiếu");
        btnLichChieu.setMaximumSize(Home.sizeBtnWest);
        btnLichChieu.setBackground(Color.RED);
        btnLichChieu.setForeground(Color.WHITE);
        btnLichChieu.setFont(fBtnName);

        btnNhanVien = new JButton("Nhân viên");
        btnNhanVien.setMaximumSize(Home.sizeBtnWest);
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
        JPanel pCen_north = new JPanel();
        pCen_north.setLayout(new BoxLayout(pCen_north, BoxLayout.Y_AXIS));
        pCen_north.setBorder(BorderFactory.createTitledBorder("CHỌN VÉ XEM PHIM"));
        JPanel pPhim = new JPanel();
        pPhim.setLayout(new BoxLayout(pPhim, BoxLayout.X_AXIS));
        JLabel lbl_phim = new JLabel("Chọn phim:              ");

        // Tạo 1 danh sách phim tạm thời
        Object[] danhSachPhim = { "Mưa đỏ", "Chị ngã em nâng", "Tết ở làng địa ngục", "Kimetsu no yaiba" };
        cb_phim = new JComboBox<>(danhSachPhim);
        pPhim.add(lbl_phim);
        pPhim.add(cb_phim);

        JPanel pPhong = new JPanel();
        pPhong.setLayout(new BoxLayout(pPhong, BoxLayout.X_AXIS));
        JLabel lbl_phong = new JLabel("Chọn phòng:            ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        Object[] danhSachPhong = { "Phòng 1", "Phòng 2", "Phòng 3", "Phòng 4" };
        cb_phong = new JComboBox<>(danhSachPhong);
        pPhong.add(lbl_phong);
        pPhong.add(cb_phong);

        JPanel pSuatChieu = new JPanel();
        pSuatChieu.setLayout(new BoxLayout(pSuatChieu, BoxLayout.X_AXIS));
        JLabel lbl_suatChieu = new JLabel("Chọn suất chiếu:    ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        Object[] danhSachSuatChieu = { "05-10-2025T6:30", "05-10-2025T7:20", "05-10-2025T9:30", "05-10-2025T18:30" };
        cb_suatChieu = new JComboBox<>(danhSachSuatChieu);
        // button chọn ghế
        btn_chonGhe = new JButton("Chọn ghế");
        btn_chonGhe.setFont(fBtnName);
        btn_chonGhe.setBackground(Color.red);
        btn_chonGhe.setForeground(Color.white);
        pSuatChieu.add(lbl_suatChieu);
        pSuatChieu.add(cb_suatChieu);
        pSuatChieu.add(Box.createHorizontalStrut(20));
        pSuatChieu.add(btn_chonGhe);
        pCen_north.add(Box.createVerticalStrut(10));
        pCen_north.add(pPhim);
        pCen_north.add(Box.createVerticalStrut(10));
        pCen_north.add(pPhong);
        pCen_north.add(Box.createVerticalStrut(10));
        pCen_north.add(pSuatChieu);
        pCen_north.add(Box.createVerticalStrut(10));
        pCenter.add(pCen_north, BorderLayout.NORTH);

        // add sự kiện
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
        btnHelp = new JButton("Trợ giúp");
        btnClose = new JButton("Đóng");
        pSouth.add(btnLogOut);
        pSouth.add(btnHelp);
        pSouth.add(btnClose);
        // add sự kiện
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
        String helpText = "Mọi chi tiết xin liên hệ quản lí hệ thống - Minh Tân\nSđt: 0347269410";
        JOptionPane.showMessageDialog(this, helpText, "Trợ giúp", JOptionPane.INFORMATION_MESSAGE);
    }
}

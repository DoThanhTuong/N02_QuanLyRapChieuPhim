package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class BanVe extends JFrame {
    // kích thước cửa sổ chuẩn cho chương trình
    private JButton btnBanVe;
    private JButton btnBanBapNuoc;
    private JButton btnXemThongKe;
    private JButton btnTaiKhoan;
    private JButton btnDatVe;
    private JButton btnPhim, btnNhanVien, btnLichChieu;
    private Font fCmpName;
    private Font fBtnName;
    private JComboBox cb_phim;
    private JComboBox cb_phong;
    private JComboBox cb_suatChieu;
    private JButton btn_chonGhe;
    private JTextField txt_tenPhim, txt_tenPhong, txt_thoiLuong, txt_theLoai, txt_thoiGian, txt_soGhe;
    private JButton btnHome;
    private JButton btnDeleteAll;

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
        JPanel pCen_north_clone = new JPanel();
        pCen_north_clone.setLayout(new BoxLayout(pCen_north_clone, BoxLayout.Y_AXIS));
        JPanel pCen_north = new JPanel();
        pCen_north.setLayout(new BoxLayout(pCen_north, BoxLayout.Y_AXIS));
        pCen_north.setBorder(BorderFactory.createTitledBorder("CHỌN VÉ XEM PHIM"));
        JPanel pPhim = new JPanel();
        pPhim.setLayout(new BoxLayout(pPhim, BoxLayout.X_AXIS));
        JLabel lbl_phim = new JLabel("Chọn phim:              ");

        // Tạo 1 danh sách phim tạm thời
        Object[] danhSachPhim = { "---Chọn phim---", "Mưa đỏ", "Chị ngã em nâng", "Tết ở làng địa ngục",
                "Kimetsu no yaiba" };
        cb_phim = new JComboBox<>(danhSachPhim);
        pPhim.add(lbl_phim);
        pPhim.add(cb_phim);

        JPanel pPhong = new JPanel();
        pPhong.setLayout(new BoxLayout(pPhong, BoxLayout.X_AXIS));
        JLabel lbl_phong = new JLabel("Chọn phòng:            ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        Object[] danhSachPhong = { "---Chọn phòng---", "Phòng 1", "Phòng 2", "Phòng 3", "Phòng 4" };
        cb_phong = new JComboBox<>(danhSachPhong);
        pPhong.add(lbl_phong);
        pPhong.add(cb_phong);

        JPanel pSuatChieu = new JPanel();
        pSuatChieu.setLayout(new BoxLayout(pSuatChieu, BoxLayout.X_AXIS));
        JLabel lbl_suatChieu = new JLabel("Chọn suất chiếu:    ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        Object[] danhSachSuatChieu = { "---Chọn suất chiếu---", "05-10-2025T6:30", "05-10-2025T7:20", "05-10-2025T9:30",
                "05-10-2025T18:30" };
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
        pCen_north_clone.add(Box.createVerticalStrut(20));
        pCen_north_clone.add(pCen_north);
        pCen_north_clone.add(Box.createVerticalStrut(30));
        pCenter.add(pCen_north_clone, BorderLayout.NORTH);

        // Thông tin vé
        JPanel pCen_Center = new JPanel();
        pCen_Center.setLayout(new BoxLayout(pCen_Center, BoxLayout.Y_AXIS));
        pCen_Center.setBorder(BorderFactory.createTitledBorder("THÔNG TIN VÉ"));

        JPanel pTenPhim = new JPanel();
        pTenPhim.setLayout(new BoxLayout(pTenPhim, BoxLayout.X_AXIS));
        JLabel lbl_tenPhim = new JLabel("Tên phim:      ");
        txt_tenPhim = new JTextField();
        txt_tenPhim.setEditable(false);
        pTenPhim.add(lbl_tenPhim);
        pTenPhim.add(txt_tenPhim);

        JPanel pSoPhong = new JPanel();
        pSoPhong.setLayout(new BoxLayout(pSoPhong, BoxLayout.X_AXIS));
        JLabel lbl_soPhong = new JLabel("Số phòng:      ");
        txt_tenPhong = new JTextField();
        txt_tenPhong.setEditable(false);
        pSoPhong.add(lbl_soPhong);
        pSoPhong.add(txt_tenPhong);

        JPanel pThoiLuong = new JPanel();
        pThoiLuong.setLayout(new BoxLayout(pThoiLuong, BoxLayout.X_AXIS));
        JLabel lbl_thoiLuong = new JLabel("Thời lượng:  ");
        txt_thoiLuong = new JTextField();
        txt_thoiLuong.setEditable(false);
        pThoiLuong.add(lbl_thoiLuong);
        pThoiLuong.add(txt_thoiLuong);

        JPanel pTheLoai = new JPanel();
        pTheLoai.setLayout(new BoxLayout(pTheLoai, BoxLayout.X_AXIS));
        JLabel lbl_theLoai = new JLabel("Thể loại:         ");
        txt_theLoai = new JTextField();
        txt_theLoai.setEditable(false);
        pTheLoai.add(lbl_theLoai);
        pTheLoai.add(txt_theLoai);

        JPanel pThoiGian = new JPanel();
        pThoiGian.setLayout(new BoxLayout(pThoiGian, BoxLayout.X_AXIS));
        JLabel lbl_thoiGian = new JLabel("Thời gian:      ");
        txt_thoiGian = new JTextField();
        txt_thoiGian.setEditable(false);
        pThoiGian.add(lbl_thoiGian);
        pThoiGian.add(txt_thoiGian);

        JPanel pSoGhe = new JPanel();
        pSoGhe.setLayout(new BoxLayout(pSoGhe, BoxLayout.X_AXIS));
        JLabel lbl_soGhe = new JLabel("Số ghế:           ");
        txt_soGhe = new JTextField();
        txt_soGhe.setEditable(false);
        pSoGhe.add(lbl_soGhe);
        pSoGhe.add(txt_soGhe);

        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pTenPhim);
        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pSoPhong);
        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pThoiLuong);
        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pThoiGian);
        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pTheLoai);
        pCen_Center.add(Box.createVerticalStrut(15));
        pCen_Center.add(pSoGhe);
        pCen_Center.add(Box.createVerticalStrut(15));

        pCenter.add(pCen_Center, BorderLayout.CENTER);

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
        pSouth.setLayout(new BoxLayout(pSouth, BoxLayout.Y_AXIS));
        JPanel pSouthButton = new JPanel();
        pSouthButton.add(Box.createHorizontalStrut(150));
        pSouthButton.setLayout(new BoxLayout(pSouthButton, BoxLayout.X_AXIS));
        // btn Quay về trang chủ
        btnHome = new JButton("Trang chủ");
        btnHome.setFont(fBtnName);
        btnHome.addActionListener(e -> UIManager.OpenHomeUI(this));
        pSouthButton.add(btnHome);
        pSouthButton.add(Box.createHorizontalStrut(10));
        // btn Xóa lựa chọn
        btnDeleteAll = new JButton("Xóa lựa chọn");
        btnDeleteAll.setFont(fBtnName);
        btnDeleteAll.addActionListener(e -> DeleteAllChoosen());
        pSouthButton.add(btnDeleteAll);
        pSouthButton.add(Box.createHorizontalStrut(10));
        // Button đặt vé
        btnDatVe = new JButton("Xác nhận đặt vé");
        btnDatVe.setBackground(Color.GREEN);
        btnDatVe.setFont(fBtnName);
        btnDatVe.addActionListener(e -> AcceptOrderTicket());
        pSouthButton.add(btnDatVe);

        pSouth.add(Box.createVerticalStrut(10));
        pSouth.add(pSouthButton);
        pSouth.add(Box.createVerticalStrut(10));

        // Thêm vào background chính
        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pWest, BorderLayout.WEST);
        add(pSouth, BorderLayout.SOUTH);
    }

    private void DeleteAllChoosen() {
        cb_phim.setSelectedIndex(0);
        cb_phong.setSelectedIndex(0);
        cb_suatChieu.setSelectedIndex(0);
        DeleteAllTextField();
    }

    private void AcceptOrderTicket() {

    }

    private void DeleteAllTextField() {
        txt_soGhe.setText("");
        txt_tenPhim.setText("");
        txt_tenPhong.setText("");
        txt_theLoai.setText("");
        txt_thoiGian.setText("");
        txt_thoiLuong.setText("");
    }
}

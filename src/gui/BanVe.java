package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entity.Phim;
import entity.Rap;
import entity.SuatChieu;
import dao.QuanLyPhim_DAO;
import dao.QuanLyRap_DAO;
import dao.QuanLySuatChieu_DAO;

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
    private JTextField txt_tenPhim, txt_tenPhong, txt_thoiLuong, txt_theLoai, txt_suatChieu, txt_soGhe;
    private JButton btnHome;
    private JButton btnDeleteAll;
    private QuanLyPhim_DAO movieManager;
    private QuanLySuatChieu_DAO suatChieuManager;
    private QuanLyRap_DAO rapManager;

    public BanVe() {
        super("Absolution Cinema");
        setSize(Home.sizeConsole);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        LoadMovieManager();
        LoadSuatChieuManager();
        LoadRapManager();
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
        // danh sách phim

        String[] danhSachPhim = { "---Chọn phim---" };
        cb_phim = new JComboBox<>(danhSachPhim);
        for (Phim phim : movieManager.getDanhSachPhim()) {
            cb_phim.addItem(phim.getTenPhim());
        }
        pPhim.add(lbl_phim);
        pPhim.add(cb_phim);

        JPanel pPhong = new JPanel();
        pPhong.setLayout(new BoxLayout(pPhong, BoxLayout.X_AXIS));
        JLabel lbl_phong = new JLabel("Chọn phòng:            ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        Object[] danhSachPhong = { "---Chọn phòng---"};
        cb_phong = new JComboBox<>(danhSachPhong);
        cb_phong.setEnabled(false);
        pPhong.add(lbl_phong);
        pPhong.add(cb_phong);

        JPanel pSuatChieu = new JPanel();
        pSuatChieu.setLayout(new BoxLayout(pSuatChieu, BoxLayout.X_AXIS));
        JLabel lbl_suatChieu = new JLabel("Chọn suất chiếu:    ");
        // Tạo 1 danh sách phòng tạm thời trong lúc đợi Tâm push cái code của nó lên
        String[] danhSachSuatChieu = { "---Chọn suất chiếu---" };
        cb_suatChieu = new JComboBox<>(danhSachSuatChieu);
        cb_suatChieu.setEnabled(false);
        // add event to JComboBox
        cb_phim.addActionListener(e -> CapNhatThongTinPhim());
        cb_phong.addActionListener(e -> CapNhatPhong());
        cb_suatChieu.addActionListener(e -> CapNhatSuatChieu());
        // button chọn ghế
        btn_chonGhe = new JButton("Chọn ghế");
        btn_chonGhe.setFont(fBtnName);
        btn_chonGhe.setBackground(Color.red);
        btn_chonGhe.setForeground(Color.white);
        btn_chonGhe.setEnabled(false);
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
        JLabel lbl_theLoai = new JLabel("Thể loại:        ");
        txt_theLoai = new JTextField();
        txt_theLoai.setEditable(false);
        pTheLoai.add(lbl_theLoai);
        pTheLoai.add(txt_theLoai);

        JPanel pThoiGian = new JPanel();
        pThoiGian.setLayout(new BoxLayout(pThoiGian, BoxLayout.X_AXIS));
        JLabel lbl_thoiGian = new JLabel("Suất chiếu:   ");
        txt_suatChieu = new JTextField();
        txt_suatChieu.setEditable(false);
        pThoiGian.add(lbl_thoiGian);
        pThoiGian.add(txt_suatChieu);

        JPanel pSoGhe = new JPanel();
        pSoGhe.setLayout(new BoxLayout(pSoGhe, BoxLayout.X_AXIS));
        JLabel lbl_soGhe = new JLabel("Số ghế:          ");
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
        txt_suatChieu.setText("");
        txt_thoiLuong.setText("");
    }

    private void CapNhatThongTinPhim() {
        if (cb_phim.getItemCount() == 0 || cb_phim.getSelectedIndex() == 0)
            return;
        txt_tenPhim.setText("");
        txt_theLoai.setText("");
        txt_thoiLuong.setText("");
        Phim phim = movieManager.getPhimByIndex(cb_phim.getSelectedIndex() - 1);
        txt_tenPhim.setText(phim.getTenPhim());
        txt_theLoai.setText(phim.getTheLoai());
        txt_thoiLuong.setText(Integer.toString(phim.getThoiLuong()) + " phút");
    }

    private void CapNhatSuatChieu() {
        if (cb_suatChieu.getItemCount() == 0)
            return;
        txt_suatChieu.setText("");
        int index = cb_suatChieu.getSelectedIndex();
        if (index == 0)
            return;
        txt_suatChieu.setText(cb_suatChieu.getSelectedItem().toString());
    }

    private void CapNhatPhong() {
        txt_tenPhong.setText("");
        if (cb_phong.getItemCount() == 0)
            return;
        int index = cb_phong.getSelectedIndex();
        if (index == 0)
            return;
        txt_tenPhong.setText(cb_phong.getSelectedItem().toString());
        
    }

    // Database giả
    private QuanLyPhim_DAO FakeMovieDB() {
        Phim phim1 = new Phim("phim01", "Mưa đỏ", "Quân đội nhân dân Việt Nam", "Hành động", 210, "Việt Nam");
        Phim phim2 = new Phim("phim02", "Tử chiến trên không", "Bộ công an Việt Nam", "Hành động", 240, "Việt Nam");
        Phim phim3 = new Phim("phim03", "Kimetsu no Yaiba - pháo đài vô cực", "Ufotable", "2D - Hành động", 240,
                "Nhật Bản");
        Phim phim4 = new Phim("phim04", "Cậu bé bóng cười", "NoHope", "Hài hước - Hành động", 180, "Trung quốc");
        QuanLyPhim_DAO movieManager = new QuanLyPhim_DAO();
        movieManager.addNewMovie(phim1);
        movieManager.addNewMovie(phim2);
        movieManager.addNewMovie(phim3);
        movieManager.addNewMovie(phim4);
        return movieManager;
    }

    private QuanLySuatChieu_DAO FakeSuatChieuDB() {
        SuatChieu suat1 = new SuatChieu("suat01", "phim01", "phong01", LocalTime.of(7, 20), LocalDate.of(2025, 10, 5));
        SuatChieu suat2 = new SuatChieu("suat02", "phim01", "phong01", LocalTime.of(9, 30), LocalDate.of(2025, 11, 26));
        SuatChieu suat3 = new SuatChieu("suat03", "phim03", "phong02", LocalTime.of(18, 00), LocalDate.of(2025, 11, 5));
        QuanLySuatChieu_DAO suatChieuManager = new QuanLySuatChieu_DAO();
        suatChieuManager.addNewSuatChieu(suat1);
        suatChieuManager.addNewSuatChieu(suat2);
        suatChieuManager.addNewSuatChieu(suat3);
        return suatChieuManager;
    }
    private QuanLyRap_DAO FakeRapDB(){
        Rap phong1 = new Rap("phong01", 30, "Phòng 1");
        Rap phong2 = new Rap("phong02", 30, "Phòng 2");
        Rap phong3 = new Rap("phong03", 35, "Phòng 3");
        Rap phong4 = new Rap("phong04", 20, "Phòng 4");
        QuanLyRap_DAO roomManager = new QuanLyRap_DAO();
        roomManager.addNewRoom(phong1);
        roomManager.addNewRoom(phong2);
        roomManager.addNewRoom(phong3);
        roomManager.addNewRoom(phong4);
        return roomManager;
    }

    private void LoadMovieManager() {
        // load database movie
        movieManager = FakeMovieDB(); // tải database ảo xuống
    }

    private void LoadSuatChieuManager() {
        suatChieuManager = FakeSuatChieuDB();
    }
    private void LoadRapManager(){
        rapManager = FakeRapDB();
    }

}

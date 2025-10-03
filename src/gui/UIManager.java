package gui;

//Mô tả: class này có chức năng giúp đóng mở tab UI
//Yêu cầu: Kế thừa JFrame để sử dụng

import javax.swing.JFrame;

public class UIManager {
    public UIManager(){}

    public static void OpenHomeUI(JFrame currentTab){
        currentTab.dispose();
        new Home().setVisible(true);
    }

    public static void OpenLoginUI(JFrame currentTab){
        currentTab.dispose();
        new Login().setVisible(true);
    }

    public static void OpenBanVeUI(JFrame currentTab){
        currentTab.dispose();
        new BanVe().setVisible(true);
    }

    public static void OpenBanBapNuocUI(JFrame currentTab) {
        currentTab.dispose();
        // chuyển qua giao diện bán bắp nước

    }

    public static void OpenXemThongKeUI(JFrame currentTab) {
        currentTab.dispose();
        // chuyển giao diện thống kê
    }

    public static void OpenTaiKhoanUI(JFrame currentTab) {
        currentTab.dispose();
        // chuyển giao diện tài khoản
    }
    public static void OpenDanhSachPhimUI(JFrame currentTab){
        currentTab.dispose();
        //Chuyển giao diện danh sách phim
    }
    public static void OpenLichChieuUI(JFrame currentTab){
        currentTab.dispose();
        //Chuyển giao diện danh lịch chiếu
    }
    public static void OpenNhanVienUI(JFrame currentTab){
        currentTab.dispose();
        //Chuyển giao diện nhân viên
    }
}

package dao;

import java.util.ArrayList;

import entity.Rap;
import entity.SuatChieu;

public class QuanLySuatChieu_DAO {
    protected ArrayList<SuatChieu> danhSachSuatChieu;

    public QuanLySuatChieu_DAO() {
        danhSachSuatChieu = new ArrayList<>();
    }

    public boolean addNewSuatChieu(SuatChieu suatChieu) {
        if (suatChieu == null || danhSachSuatChieu.contains(suatChieu)) {
            return false;
        }
        SuatChieu suatChieuById = findSuatChieuById(suatChieu.getMaSuatChieu());
        if (suatChieuById != null)
            return false; // đã tồn tại mã suất chiếu này
        danhSachSuatChieu.add(suatChieu);
        return true;
    }

    public SuatChieu findSuatChieuById(String maSuatChieu) {
        for (SuatChieu suat : danhSachSuatChieu) {
            if (suat.getMaSuatChieu().equalsIgnoreCase(maSuatChieu))
                return suat;
        }
        return null;
    }

    public ArrayList<SuatChieu> getDanhSachSuatChieu() {
        return danhSachSuatChieu;
    }

    public SuatChieu getSuatChieuByIndex(int index) {
        if (index < 0 || index >= danhSachSuatChieu.size())
            return null;
        return danhSachSuatChieu.get(index);
    }

    //lấy tất cả suất chiếu có chứa mã phim Input
    public ArrayList<SuatChieu> getSuatChieuByMaPhim(String maPhim){ 
        ArrayList<SuatChieu> suatChieus = new ArrayList<>();
        for (SuatChieu suatChieu : danhSachSuatChieu) {
            if(suatChieu.getMaPhim().equalsIgnoreCase(maPhim)){
                suatChieus.add(suatChieu);
            }
        }
        return suatChieus;
    }
}

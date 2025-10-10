package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class SuatChieu {
	private String maSuatChieu;
	private String maPhim;
	private String maPhong; 
	private LocalTime gioChieu;
	private LocalDate ngay;

	public SuatChieu(){
		maSuatChieu = "";
		maPhim = "";
		maPhong = "";
		gioChieu = LocalTime.of(0, 0);
		ngay = LocalDate.of(0, 1, 1);
	}

	public SuatChieu(String maSuatChieu){
		setMaSuatChieu(maSuatChieu);
		maPhim = "";
		maPhong = "";
		gioChieu = LocalTime.of(0, 0);
		ngay = LocalDate.of(0, 1, 1);
	}
	

	public SuatChieu(String maSuatChieu, String maPhim, String maPhong, LocalTime gioChieu, LocalDate ngay) {
		setMaSuatChieu(maSuatChieu);
		setMaPhim(maPhim);
		setMaPhong(maPhong);
		setGioChieu(gioChieu);
		setNgay(ngay);
	}


	public String getMaSuatChieu() {
		return maSuatChieu;
	}

	public void setMaSuatChieu(String maSuatChieu) {
		if (maSuatChieu.trim().equals(""))
			throw new IllegalArgumentException("Mã suất chiếu rỗng!");
		this.maSuatChieu = maSuatChieu;
	}

	public String getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(String maPhim) {
		if (maPhim.trim().equals(""))
			throw new IllegalArgumentException("Mã phim rỗng!");
		this.maPhim = maPhim;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		if (maPhong.trim().equals(""))
			throw new IllegalArgumentException("Mã phòng rỗng!");
		this.maPhong = maPhong;
	}

	public LocalTime getGioChieu() {
		return gioChieu;
	}

	public void setGioChieu(LocalTime gioChieu) {
		this.gioChieu = gioChieu;
	}

	public LocalDate getNgay() {
		return ngay;
	}

	public void setNgay(LocalDate ngay) {
		this.ngay = ngay;
	}
	
}

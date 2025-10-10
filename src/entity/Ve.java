package entity;

import java.time.LocalDate;

public class Ve {
	private String maVe;
	private LoaiVe loaiVe;
	private Ghe ghe;
	private LocalDate ngayBan;
	private String maKH;
	private String maNhanVien;
	private String maPhim;
	private String maRap;
	private String maSuatChieu;
	private double gia;

	public Ve(String maVe, String maPhim, String maRap, String maSuatChieu, LocalDate ngayBan){
		setMaVe(maVe);
		setMaPhim(maPhim);
		setMaRap(maRap);
		setMaSuatChieu(maSuatChieu);
		setNgayBan(ngayBan);
	}

	public Ve(String maVe, LoaiVe loaiVe, Ghe ghe, LocalDate ngayBan, String maKH, String maNhanVien, String maPhim,
			String maRap, String maSuatChieu, double gia) {
		setGhe(ghe);
		setGia(gia);
		setLoaiVe(loaiVe);
		setMaKH(maKH);
		setMaNhanVien(maNhanVien);
		setMaPhim(maPhim);
		setMaRap(maRap);
		setMaSuatChieu(maSuatChieu);
		setMaVe(maVe);
		setNgayBan(ngayBan);
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public LoaiVe getLoaiVe() {
		return loaiVe;
	}
	public void setLoaiVe(LoaiVe loaiVe) {
		this.loaiVe = loaiVe;
	}
	public Ghe getGhe() {
		return ghe;
	}
	public void setGhe(Ghe ghe) {
		this.ghe = ghe;
	}
	public LocalDate getNgayBan() {
		return ngayBan;
	}
	public void setNgayBan(LocalDate ngayBan) {
		this.ngayBan = ngayBan;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getMaRap() {
		return maRap;
	}
	public void setMaRap(String maRap) {
		this.maRap = maRap;
	}
	public String getMaSuatChieu() {
		return maSuatChieu;
	}
	public void setMaSuatChieu(String maSuatChieu) {
		this.maSuatChieu = maSuatChieu;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public Object[] getData(){
		Object[] dataTicket = {maVe, maPhim, maRap, maSuatChieu, maKH, maNhanVien, 
			loaiVe.toString(), ghe.getMaGhe(), loaiVe.toString(), gia};
		return dataTicket;
	}
	
}

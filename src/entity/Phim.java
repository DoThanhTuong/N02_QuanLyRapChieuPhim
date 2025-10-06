package entity;

public class Phim {
	private String maPhim;
	private String tenPhim;
	private String nhaSanXuat;
	private String theLoai;
	private int thoiLuong;
	private String quocGia;

	public Phim(String maPhim) {
		setMaPhim(maPhim);
		tenPhim = "";
		nhaSanXuat = "";
		theLoai = "";
		thoiLuong = 0;
		quocGia = "";

	}

	public Phim(String maPhim, String tenPhim, String nhaSanXuat, String theLoai, int thoiLuong, String quocGia) {
		setMaPhim(maPhim);
		setTenPhim(tenPhim);
		setNhaSanXuat(nhaSanXuat);
		setTheLoai(theLoai);
		setThoiLuong(thoiLuong);
		setQuocGia(quocGia);
	}

	public String getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(String maPhim) {
		if (maPhim.trim().equals(""))
			throw new IllegalArgumentException("Mã phim rỗng!");
		this.maPhim = maPhim;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		if (tenPhim.trim().equals("")) {
			throw new IllegalArgumentException("Tên phim rỗng!");
		}
		this.tenPhim = tenPhim;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		if (nhaSanXuat.trim().equals(""))
			throw new IllegalArgumentException("nhaSanXuat rỗng!");
		this.nhaSanXuat = nhaSanXuat;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		if (theLoai.trim().equals(""))
			throw new IllegalArgumentException("theLoai rỗng!");
		this.theLoai = theLoai;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		if (thoiLuong <= 0)
			throw new IllegalArgumentException("Thời lượng <= 0!");
		this.thoiLuong = thoiLuong;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		if (quocGia.trim().equals(""))
			throw new IllegalArgumentException("quocGia rỗng!");
		this.quocGia = quocGia;
	}

}

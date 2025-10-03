package entity;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String gioiTinh;
	private String soDT;
	private String diaChi;
	public KhachHang(String maKH, String hoTen, String gioiTinh, String soDT, String diaChi) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.soDT = soDT;
		this.diaChi = diaChi;
	}
	
	public KhachHang() {
		this("", "", "", "","");
	}
	
	public KhachHang(String maKH) {
		super();
		this.maKH = maKH;
	}
}

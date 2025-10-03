package entity;

import java.time.LocalDate;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String diaChi;
	private int soDienThoai;
	private String trangThai;
	private LocalDate ngaySinh;
	private String chucVu;
	private String email;
	private String gioiTinh;
	
	public NhanVien() {
		this("","","",0,"",LocalDate.now(),"","","");
	}

	public NhanVien(String maNV, String tenNV, String diaChi, int soDienThoai, String trangThai, LocalDate ngaySinh,
			String chucVu, String email, String gioiTinh) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.trangThai = trangThai;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.email = email;
		this.gioiTinh = gioiTinh;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ ", trangThai=" + trangThai + ", ngaySinh=" + ngaySinh + ", chucVu=" + chucVu + ", email=" + email
				+ ", gioiTinh=" + gioiTinh + "]";
	}
	
	
}

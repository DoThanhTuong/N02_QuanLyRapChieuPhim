package entity;

public class Rap {
	private String maRap;
	private int soLuongGhe;
	private String tenRap;
	public Rap(String maRap){
		setMaRap(maRap);
		soLuongGhe = 0;
	}
	public Rap(String maRap, int soLuongGhe, String tenRap){
		setMaRap(maRap);
		setSoLuongGhe(soLuongGhe);
	}
	public String getMaRap() {
		return maRap;
	}
	public void setMaRap(String maRap) {
		if (maRap.trim().equals(""))
			throw new IllegalArgumentException("Mã rạp rỗng!");
		this.maRap = maRap;
	}
	public int getSoLuongGhe() {
		return soLuongGhe;
	}
	public void setSoLuongGhe(int soLuongGhe) {
		if(soLuongGhe <= 0)
			throw new IllegalArgumentException("Số lượng <= 0!");
		this.soLuongGhe = soLuongGhe;
	}
	public String getTenRap() {
		return tenRap;
	}
	public void setTenRap(String tenRap) {
		if (tenRap.trim().equals(""))
			throw new IllegalArgumentException("Tên rạp rỗng!");
		this.tenRap = tenRap;
	}
	
	
}

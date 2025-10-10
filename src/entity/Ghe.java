package entity;

public class Ghe {
	private String maGhe;
	private int soGhe;
	private Rap rap;
	private boolean tinhTrang;

	
	public Ghe(String maGhe, int soGhe, Rap rap, boolean tinhTrang) {
		setMaGhe(maGhe);
		setRap(rap);
		setSoGhe(soGhe);
		setTinhTrang(tinhTrang);
	}

	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public Rap getRap() {
		return rap;
	}
	public void setRap(Rap rap) {
		this.rap = rap;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}

	
}

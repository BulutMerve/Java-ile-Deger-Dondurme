package degerDondur;

public class Ogrenci {
	
	private String ogrenciAdi = "";
	private Integer yas = null;
	
	public Ogrenci(String ogrenciAdi, Integer yas) {
		this.ogrenciAdi = ogrenciAdi;
		this.yas = yas;
	}
	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}
	public Integer getYas() {
		return yas;
	}
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	
	

}

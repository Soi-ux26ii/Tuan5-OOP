package dungtichxe;
import java.util.Scanner;

public class vehicle {
	private String chuxe;
	private String loaixe;
	private int dungtich;
	private double trigiaxe;
	public String getChuxe() {
		return chuxe;
	}
	public void setChuxe(String chuxe) {
		if (chuxe == null || chuxe.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên chủ xe không được để trống!");
        }
		this.chuxe = chuxe;
	}
	public String getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(String loaixe) {
		if (loaixe == null || loaixe.trim().isEmpty()) {
            throw new IllegalArgumentException("Loại xe không được để trống!");
        }
		this.loaixe = loaixe;
	}
	public int getDungtich() {
		return dungtich;
	}
	public void setDungtich(int dungtich) {
		if (dungtich <= 0) {
            throw new IllegalArgumentException("Dung tích phải lớn hơn 0!");
        }
		this.dungtich = dungtich;
	}
	public double getTrigiaxe() {
		return trigiaxe;
	}
	public void setTrigiaxe(double trigiaxe) {
		if (trigiaxe < 0) {
            throw new IllegalArgumentException("Trị giá xe không được âm!");
        }
		this.trigiaxe = trigiaxe;
	}
	public double thue() {
		double thue;
		if(dungtich < 100) {
			thue = trigiaxe * 0.01;
		}else if(dungtich >= 100 && dungtich < 200) {
			thue = trigiaxe * 0.03;
		}else {
			thue = trigiaxe * 0.05;
		}
		return thue;
	}
	
	public vehicle(String chuxe, String loaixe, int dungtich, double trigiaxe) {
		super();
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.trigiaxe = trigiaxe;
	}
	//tao rang buoc:
	public vehicle () {
		this.setChuxe(chuxe);
		this.setLoaixe(loaixe);
        this.setDungtich(dungtich);
        this.setTrigiaxe(trigiaxe);
	}
}
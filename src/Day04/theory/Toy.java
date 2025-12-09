package Day04.theory;

public class Toy {
	private String name;
	private String brand;
	private Integer miniAge;
	
	public Toy(String name, String brand, Integer miniAge) {
		this.name = name;
		this.brand = brand;
		this.miniAge = miniAge;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Integer getMiniAge() {
		return miniAge;
	}
	
	public void setMiniAge(Integer miniAge) {
		this.miniAge = miniAge;
	}
}

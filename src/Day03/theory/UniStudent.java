package Day03.theory;
//Has - a 관계는 멤버 변수
//Is - a 관계는 상속
public class UniStudent extends Student {
	private Laptop laptop;
	private Major major;
	
	public UniStudent(String name, Integer age, String gender, Major major, Laptop laptop) {
		super(name, age, gender);
		this.major = major;
		this.laptop = laptop;
	}
	
	void parttime() {
		System.out.println("파트타임 알바합니다.");
	}
}

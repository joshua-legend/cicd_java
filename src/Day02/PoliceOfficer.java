package Day02;

//접근 제한 연산자: private + protected + default + public

public class PoliceOfficer {
	private String name;
	private String rank;
	private int age;
	private String department;
	private boolean isMale;
	
	public PoliceOfficer(String name, String rank, int age, String department, boolean isMale) {
		this.name = name;
		this.rank = rank;
		this.age = age;
		this.department = department;
		this.isMale = isMale;
	}
	
	void introduce() {
		System.out.println("이름:" + this.name);
		System.out.println("직급:" + this.rank);
		System.out.println("나이:" + this.age);
		System.out.println("부서:" + this.department);
		System.out.println("성별:" + (this.isMale ? "남" : "여"));
	}
	
	void changeDepartment(String a) {
		if (a == "교통과" || a == "마약과" || a == "형사과") {
			this.department = a;
		} else {
			System.out.println(a + "과는 없습니다.");
		}
		
	}
	
	
}

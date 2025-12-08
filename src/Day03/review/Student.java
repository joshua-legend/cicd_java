package Day03.review;

public class Student {
	static int students_count = 0;
	private String name;
	private Integer age;
	private Integer fee;
	
	public Student(String name, Integer age, Integer fee) {
		this.name = name;
		this.age = age;
		this.fee = fee;
	}
	
	void introduce() {
		System.out.println("이름:" + this.name + " 나이:" + this.age + " 수강료:" + this.fee);
	}
}

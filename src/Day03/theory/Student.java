package Day03.theory;

/*
종속 관계 판단하기
* Is - a: extends 사용
* Has - a: 변수 사용
* Uses - a
* */
public class Student {
	private String name;
	private Integer age;
	private String gender;
	
	public Student(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void study() {
		System.out.println("공부하기");
	}
	
	void introduce() {
		System.out.println("이름: " + this.name + "나이: " + this.age + "성별: " + this.gender);
	}
	
	
}

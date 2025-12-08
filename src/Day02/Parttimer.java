package Day02;

public class Parttimer {
	private String name;
	private int age;
	private int wage;
	private Schedule schedule;
	
	public Parttimer(String name, int age, int wage) {
		this.name = name;
		this.age = age;
		this.wage = wage > 10030 ? wage : 10030;
		this.schedule = new Schedule("금", 10, 14);
	}
	
	void introduce(){
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age);
		System.out.println("시급:" + this.wage);
		this.schedule.timetable();
	}
	
	void changeWage(int a) {
		if (a < 10320) {
			System.out.println("노동청 ㄱ");
		} else {
			this.wage = a;
			System.out.println("시급이 조정되었습니다.");
		}
	}
}

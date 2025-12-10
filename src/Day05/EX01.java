package Day05;

import java.util.ArrayList;

public class EX01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.stream().forEach((v) -> {
			System.out.println(v);
		});
		
		//학생클래스 [이름,나이,주소]
		//스트림 foreach 학생의 주소를 찍어는 코드
		ArrayList<Student> ban = new ArrayList<>();
		ban.add(new Student("여진", 25, "인천"));
		ban.add(new Student("태진", 24, "인천"));
		ban.add(new Student("영선", 27, "인천"));
		ban.add(new Student("영철", 22, "시흥"));
		
		ban.stream().forEach((v)->{
			System.out.println(v.getLocation());
		});
		
		
		
		
	}
}

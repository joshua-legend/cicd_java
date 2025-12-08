package Day03.review;

import java.util.Scanner;

public class Register {
	static Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 등록 하기");
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("나이:");
		Integer age = sc.nextInt();
		System.out.print("수업료:");
		Integer fee = sc.nextInt();
		return new Student(name, age, fee);
	}
}

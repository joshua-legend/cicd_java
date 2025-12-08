package Day03.review;

/*
 * 1. 변수 [입출력]
 * 2. 데이터 타입
 * 3. 타입캐스팅
 * 4. 연산자, 조건문, 반복문
 * 5. 클래스, 상속
 * */


import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student students[] = new Student[10];
		
		
		while (true) {
			int num = Manual.guide();
			switch (num) {
				case 1:
					Student st = Register.createStudent();
					if (Student.students_count >= 10) {
						System.out.println("학생 정원이 꽉 찼습니다.");
					} else {
						students[Student.students_count++] = st;
						System.out.println("등록 되었습니다.");
					}
					break;
				case 2:
					break;
				case 3:
					if (students.length == 0) {
						System.out.println("등록된 학생 없음");
					} else {
						for (int i = 0; i < students.length; i++) {
							students[i].introduce();
						}
					}
					break;
				case 4:
					System.out.println("시스템 종료");
					return;
				default:
					System.out.println("번호 입력 오류");
					break;
			}
			
		}
	}
}

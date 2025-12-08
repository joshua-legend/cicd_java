package Day03.review;

import java.util.Scanner;

public class Manual {
//	공유함수,정적함수 같은말
	static int guide(){
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 등록 프로그램");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 조회");
		System.out.println("4. 프로그램 종료");
		return sc.nextInt();
	}
}

package Day04.theory;

import java.util.ArrayList;

public class EX03 {
	public static void main(String[] args) {
		IStudent is = (x) -> {
			int sum = 0;
			for (int i = 0; i < x.size(); i++) {
				sum = sum + x.get(i).getAge();
			}
			return (double) (sum / x.size());
		};
		ArrayList<Student> koreait = new ArrayList<>();
		koreait.add(new Student("율1", 15));
		koreait.add(new Student("율2", 31));
		koreait.add(new Student("장수", 19));
		koreait.add(new Student("영철", 26));
		System.out.println(is.avg(koreait));
		
	}
}

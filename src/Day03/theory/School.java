package Day03.theory;

import java.util.ArrayList;
// 배열[구문법] -> 컬렉션프레임워크의 리스트는 [신문법]

public class School {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("이영철", 25, "남자"));
		studentsList.add(new Student("손정우", 25, "남자"));
		for (int i = 0; i < studentsList.toArray().length; i++) {
			studentsList.get(i).introduce();
		}
	}
}

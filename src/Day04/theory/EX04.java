package Day04.theory;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class EX04 {
	public static void main(String[] args) {
//		Function<Integer, Integer> get100 = (x) -> x + 100;
//		System.out.println(get100.apply(100));
//		Function<String, String> sayHello = (x) -> x + " Hello ";
//		System.out.println(sayHello.apply("영철이"));
		
		Consumer<Integer> cs = integer -> System.out.println("숫자: " + integer);
		
		BiConsumer<ArrayList<Student>, ArrayList<Student>> bc = (s1, s2) -> {
			int sum = 0;
			for (int i = 0; i < s1.size(); i++) {
				sum = sum + s1.get(i).getAge();
			}
			for (int i = 0; i < s2.size(); i++) {
				sum = sum + s2.get(i).getAge();
			}
			System.out.println(sum / (s1.size() + s2.size()));
		};
		
		ArrayList<Student> a = new ArrayList<>();
		ArrayList<Student> b = new ArrayList<>();
		
		a.add(new Student("여진이", 25));
		a.add(new Student("유나", 24));
		a.add(new Student("정순", 28));
		b.add(new Student("율", 31));
		b.add(new Student("영선", 31));
		b.add(new Student("진정인", 33));
		bc.accept(a,b);
	}
}

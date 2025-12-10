package Day05;

import java.util.function.Consumer;

public class EX03 {
	public static void main(String[] args) {
		//화살표함수에서 더 꿀 버전 -> 크리닝
		//메소드 참조는 매개변수 쌩으로 들어갈때만 가능
		Consumer<String> cs = System.out::println;
		Consumer<String> cs1 = (x) -> System.out.println(x + "님 안녕!");
		
		
	}
}

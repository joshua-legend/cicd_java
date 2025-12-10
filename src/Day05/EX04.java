package Day05;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EX04 {
	public static void main(String[] args) {
		//[1~100] 리스트 만들어주셈
		//IntStream.range(1,100).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
		
		
		//[1~100] -> 홀수,짝수,홀수,짝수 콘솔찍기
		IntStream.rangeClosed(1, 100).mapToObj((v) -> v % 2 == 1 ? v + ":홀수" : v + ":짝수").forEach((v) -> System.out.println(v));
		
	}
}

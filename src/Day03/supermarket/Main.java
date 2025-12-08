package Day03.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> cart = new ArrayList<>();
		
		while (true) {
			System.out.println("상품 프로그램");
			System.out.println("1. 상품 담기");
			System.out.println("2. 상품 전체 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("번호 입력:");
			int num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.print("상품 이름 입력:");
					String productName = sc.next();
					System.out.print("상품 가격 입력:");
					Integer productPrice = sc.nextInt();
					cart.add(new Product(productName, productPrice));
					System.out.println("상품 추가 됐삼");
					break;
				case 2:
					cart.forEach((v) -> v.info());
					Integer sum = cart.stream().map((v) -> v.getPrice()).reduce(0, Integer::sum);
					System.out.println("총 가격: " + sum);
					break;
				case 3:
					System.out.println("프로그램 종료");
					return;
				case 504:
					System.out.println("여진아!");
					break;
				default:
					System.out.println("번호 재입력 부탁");
					break;
			}
		}
	}
}

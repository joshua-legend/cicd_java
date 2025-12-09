package Day04.theory;

import java.util.ArrayList;

public class EX02 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>(new Fruit("키위", 10));
		Box<Toy> toyBox = new Box<>(new Toy("레고", "레고", 19));
		
		Fruit a = fruitBox.getValue();
		Toy b = toyBox.getValue();
		
	}
}

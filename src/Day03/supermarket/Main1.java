package Day03.supermarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
	public static void main(String[] args) {
		//1.사과 바구니
		//2.오렌지 바구니
		//3.바나나 바구니
		HashMap<Integer, ArrayList<Fruit>> map = new HashMap();
		ArrayList<Fruit> appleBox = new ArrayList<Fruit>();
		ArrayList<Fruit> orangeBox = new ArrayList<Fruit>();
		ArrayList<Fruit> bananaBox = new ArrayList<Fruit>();
		
		appleBox.add(new Apple("풋사과",10,"초록"));
		appleBox.add(new Apple("홍로사과",12,"빨간"));
		map.put(1, appleBox);
		
		orangeBox.add(new Orange("천혜향",10,"주황색"));
		orangeBox.add(new Orange("한라봉",11,"주황색"));
		map.put(2, orangeBox);
		
		bananaBox.add(new Banana("몽키바나나",5,"노란색"));
		bananaBox.add(new Banana("동킹콩바나나",4,"초록색"));
		map.put(3, bananaBox);
		
		map.get(3).forEach((v)-> v.getInfo());
		
		
		//Arraylist [중복 가능, 순서 있음]
		//HashSet [중복 불가능, 순서 없음]
		//Iterator: 자료를 하나씩 읽어주는 타입

//		Iterator it = test.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
	}
}

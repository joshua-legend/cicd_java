package Day05;

public class AutoCar {
	private Battery battery = new Battery();
	void operator() {
		System.out.println("뛰뛰빵빵");
		battery.supply();
	}
}

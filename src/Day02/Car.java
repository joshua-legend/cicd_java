package Day02;

// Car 클래스 [name,fuel,speed,year,isEngineOn] + engine() + acc() + stop()
// Truck 클래스  [name,fuel,speed,year,isEngineOn, loadWeight] + engine() +  + acc() + stop() + load() [현재몇kg]

public class Car {
	private String name;
	private int fuel;
	private int speed;
	private int year;
	private boolean isEngineOn;
	
	public Car(String name, int fuel, int speed, int year) {
		this.name = name;
		this.fuel = fuel;
		this.speed = speed;
		this.year = year;
		this.isEngineOn = false;
	}
	
	void status() {
		System.out.println("차 이름:" + this.name);
		System.out.println("차 연료:" + this.fuel);
		System.out.println("차 속도:" + this.speed);
		System.out.println("차 연식:" + this.year);
		System.out.println("차 엔진상태:" + (this.isEngineOn ? "켜짐" : "꺼짐"));
	}
	
	
	void engine() {
		this.isEngineOn = !this.isEngineOn;
		String status = this.isEngineOn ? "시동 켜짐" : "시동 꺼짐";
		System.out.println(status);
	}
	
	void accelerate() {
		if (!this.isEngineOn) {
			System.out.println("시동을 먼저 켜주세요.");
			return;
		}
		System.out.println("출발 부릉부릉!");
		this.speed = this.speed + 10;
		this.fuel = this.fuel - 1;
	}
	
	void stop() {
		System.out.println("차 멈춤!");
		this.speed = 0;
	}
	
}





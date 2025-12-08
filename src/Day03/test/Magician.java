package Day03.test;

public class Magician extends Character {
	private int hp = 50;
	private int mp = 50;
	
	
	@Override
	void attack() {
		System.out.println("마법 쓰기");
	}
	
	@Override
	void specialAttack() {
		if (this.mp < 5) {
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println("마법봉 휘두르기");
			this.mp -= 5;
		}
		
	}
	
	
}

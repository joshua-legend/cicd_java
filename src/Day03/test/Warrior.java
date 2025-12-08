package Day03.test;

public class Warrior extends Character implements Attackable {
	private int hp = 100;
	private int mp = 10;
	private int attackDamage = 10;
	private int specialDamage = 30;
	
	public Warrior() {
	}
	
	@Override
	public int specialAttack() {
		if (this.mp == 0) {
			System.out.println("마나가 부족합니다.");
			return 0;
		} else {
			this.mp--;
			System.out.println("연속 베기");
			return this.specialDamage;
		}
	}
	@Override
	public int attack() {
		System.out.println("검으로 공격하기");
		return this.attackDamage;
	}
}

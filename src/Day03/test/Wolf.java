package Day03.test;

public class Wolf extends Monster {
	private int hp = 10;
	private int attack = 3;
	
	public Wolf() {
	}
	
	@Override
	int getHp() {
		return this.hp;
	}
	
	@Override
	int attack() {
		System.out.println("발톱 긁기");
		return this.attack;
	}
	
	@Override
	void getDamage(int damage) {
		this.hp = this.hp - damage;
	}
}

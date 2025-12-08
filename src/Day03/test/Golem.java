package Day03.test;

public class Golem extends Monster {
	private int hp = 30;
	private int attack = 10;
	
	@Override
	int attack() {
		System.out.println("듬직 공격");
		return this.attack;
	}
}

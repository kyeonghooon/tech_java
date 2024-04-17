package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메서드를 만들어 주세요
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getIsDie() {
		return this.isDie;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.hp = hp;
		}
	}
	public void setPower(int power) {
		if (power < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.power = power;
		}
	}
	public void setDefense(double defense) {
		if (defense < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.defense = defense;
		}
	}
//	public void setIsDie(boolean isDie) {
//		this.isDie = isDie;
//	}
	public void isDie() {
		if (this.hp <= 0) {
			this.isDie = true;
		}
		
	}
}

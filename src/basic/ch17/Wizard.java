package basic.ch17;

public class Wizard extends Hero {
	public Wizard(String name, int hp) {
		super(name, hp);
	}
	@Override
	public void attack() {
		System.out.println("위자드가 기본 공격을 합니다.");
	}
	
	public void freezing() {
		System.out.println("위자드가 얼음마법 공격을 시전합니다.");
	}
}

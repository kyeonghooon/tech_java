package basic.ch17;

public class Archer extends Hero {
	public Archer(String name, int hp) {
		super(name, hp);
	}
	@Override
	public void attack() {
		System.out.println("아처가 기본 공격을 합니다.");
	}
	
	public void fireArrow() {
		System.out.println(name + "가 불화살 공격을 시전합니다.");
	}
}

package starcraft.ver05;

/**
 * public protected -- 상속관계에서 설정할 수 있다. default private
 */
public class Unit {
	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 상태창 출력
	@Override
	public String toString() {
		return "==== 상태창 ====" +
				"\n이름 : " + this.name +
				"\n공격력 : " + this.power + 
				"\n생명력 : " + this.hp;
	}
	

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다.");
			return;
		}
		hp -= power;
		if (hp < 0)
			hp = 0;
	}

	public void attack(Unit unit) {
		System.out.println("[" + this.name + "]이 [" + unit.getName() + "]을 공격합니다.");
		unit.beAttacked(this.power);
	}


}

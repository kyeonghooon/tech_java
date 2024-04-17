package basic.ch09;

public class Magician {

	String name;
	int healthPower;
	int attackPower;
	int deffencePower;
	double critical;
	boolean check;
	
	public Magician(String name) {
		this.name = name;
		for (int i = 0; i < 10; i++) {
			healthPower += (int) (Math.random() * 400);
			attackPower += (int) (Math.random() * 75);
			deffencePower += (int) (Math.random() * 10);
		}
		critical = 0.3;
	}
	public void attacked(Warrior warrior) {
		int realDamage = warrior.attackPower - deffencePower;
		if (realDamage < 0){
			realDamage = 0;
		}
		healthPower -= realDamage;
	}
	
	public void critical() {
		if (Math.random() > critical) {
			attackPower *= 4;
			check = true;
			System.out.println(name + "이(가) 크리티컬 공격을 시전");
		}
	}
	
	public void offCritical() {
		if (check) {
			attackPower = attackPower - (int)(attackPower * 0.75);
			check = false;
		}
	}
	
	public void showInfo() {
		System.out.println("----------상태창----------");
		System.out.println("마법사의 이름 : " + name);
		System.out.println("체력 : " + healthPower);
		System.out.println("공격력 : " + attackPower);
		System.out.println("방어력 : " + deffencePower);
	}
}

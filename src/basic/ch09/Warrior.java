package basic.ch09;

public class Warrior {

	String name;
	int healthPower;
	int attackPower;
	int deffencePower;
	int defaultHP;
	boolean checkBerserk;

	public Warrior(String name) {
		this.name = name;
		for (int i = 0; i < 10; i++) {
			healthPower += (int) (Math.random() * 1000);
			attackPower += (int) (Math.random() * 40);
			deffencePower += (int) (Math.random() * 50);
		}
		defaultHP = healthPower;
	}

	public void attacked(Magician magician) {
		// 마법사의 크리티컬 확률을 이용해 랜덤적용
		magician.critical();
		int realDamage = magician.attackPower - deffencePower;
		magician.offCritical();
		if (realDamage < 0) {
			realDamage = 0;
		}
		healthPower -= realDamage;
	}

	public void berserkMode() {
		// 이미 버서크 모드 상태 인지 확인 후 돌입
		if (!checkBerserk) {
			attackPower *= 2;
			healthPower *= 3;
			checkBerserk = true;
			System.out.println(name + "이(가) 버서크모드 돌입. 현재 체력 : " + healthPower);
		}

	}
	
	public boolean ifHP_under_quarter(){
		return healthPower <= (int)(defaultHP * 0.25);
	}


	public void showInfo() {
		System.out.println("----------상태창----------");
		System.out.println("전사의 이름 : " + name);
		System.out.println("체력 : " + healthPower);
		System.out.println("공격력 : " + attackPower);
		System.out.println("방어력 : " + deffencePower);
	}
}

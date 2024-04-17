package basic.ch07;

public class Warrior {

	String name;
	int level;
	int str;
	int health;

	public void showInfo() {
		System.out.println("----------상태창----------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("힘 : " + str);
		System.out.println("체력 : " + health);
		System.out.println("공격력 : " + attakPower());
		System.out.println("방어력 : " + defensePower());
	}

	public int attakPower() {
		return (level * 10) + (str * 5);
	}
	public int defensePower() {
		return (level * 10) + 100;
	}
}

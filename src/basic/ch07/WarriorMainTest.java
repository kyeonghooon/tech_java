package basic.ch07;

public class WarriorMainTest {

	public static void main(String[] args) {

		Warrior ork = new Warrior();
		ork.name = "오크";
		ork.level = 10;
		ork.str = 55;
		ork.health = 1580;

		Warrior human = new Warrior();
		human.name = "인간";
		human.level = 12;
		human.str = 70;
		human.health = 1200;
		ork.showInfo();
		human.showInfo();

		int redTeam = ork.health;
		int blueTeam = human.health;
		int i = 0;
		boolean flag = true;
		while (flag) {
			i++;
			redTeam -= (human.attakPower() - ork.defensePower());
			blueTeam -= (ork.attakPower() - human.defensePower());
			System.out.println("---------" + i + "번째 턴 결과 -----------");
			System.out.println("오크의 남은체력 : " + redTeam);
			System.out.println("인간의 남은체력 : " + blueTeam);
			if (redTeam < 0 && blueTeam < 0) {
				System.out.println("비겼습니다.");
				break;
			} else if (redTeam < 0) {
				System.out.println("인간이 이겼습니다. ");
				break;
			} else if (blueTeam < 0) {
				System.out.println("오크가 이겼습니다. ");
				break;
			}
		}

	}

}

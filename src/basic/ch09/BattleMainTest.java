package basic.ch09;

public class BattleMainTest {

	public static void main(String[] args) {
		// 한쪽이 n번 이길때 까지 반복
		int n = 10;
		int checkWar = 0;
		int checkMag = 0;
		while (true) {
			Warrior warrior1 = new Warrior("오크");
			Magician magician1 = new Magician("엘프");
			System.out.println(checkWar + checkMag + 1 + "번째 선수");
			warrior1.showInfo();
			magician1.showInfo();
			int checkRound = 0;
			while (true) {
				// 전사의 체력이 25% 이하라면 버서크 모드 돌입.
				if (warrior1.ifHP_under_quarter()) {
					warrior1.berserkMode();
				}
				warrior1.attacked(magician1);
				magician1.attacked(warrior1);
				System.out.println(++checkRound + "번째 턴 결과----------");
				System.out.println(warrior1.name + "의 체력 : " + warrior1.healthPower);
				System.out.println(magician1.name + "의 체력 : " + magician1.healthPower);
				if (warrior1.healthPower <= 0 && magician1.healthPower <= 0) {
					System.out.println("비겼습니다.");
					checkWar++;
					checkMag++;
					break;
				} else if (warrior1.healthPower <= 0) {
					System.out.println(magician1.name + "의 승리!");
					checkMag++;
					break;
				} else if (magician1.healthPower <= 0) {
					System.out.println(warrior1.name + "의 승리!");
					checkWar++;
					break;
				}
			}
			if (checkWar == n && checkMag == n) {
				System.out.println("최종 결과 " + n + " : " + n + " 비겼습니다.");
				break;
			} else if (checkWar == 10) {
				System.out.print("최종 결과 " + n + " : " + checkMag);
				System.out.println(" " + warrior1.name + "가 이겼습니다.");
				break;
			} else if (checkMag == 10) {
				System.out.print("최종 결과 " + n + " : " + checkWar);
				System.out.println(" " + magician1.name + "가 이겼습니다.");
				break;
			}
		}
	}
}

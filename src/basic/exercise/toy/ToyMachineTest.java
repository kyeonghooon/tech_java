package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 샘플
		ToyMachine machine1 = new ToyMachine(1111);
		Product tiger1 = new TigerDoll("호랑이1");
		Product tiger2 = new TigerDoll("호랑이2");
		Product tiger3 = new TigerDoll("호랑이3");
		Product bear1 = new BearDoll("곰1",1);
		Product bear2 = new BearDoll("곰1",2);
		Product bear3 = new BearDoll("곰1",3);
		Product airpod1 = new Airpod("가짜1", 2);
		Product airpodreal1 = new Airpod("진짜1", 1);
		
		// 상수
		final int MANAGE_MODE = 1;
		final int USER_MODE = 2;
		final int TIGERDOLL = 1;
		final int BEARDOLL = 2;
		final int AIRPOD = 3;
		final int USER_PRODUCTLIST = 4;
		final int END = 0;
		
		User user = new User();
		
		boolean flag1 = true;
		boolean flag2 = false;
		boolean flag3 = true;
		while (flag1) {
			System.out.println("-------메뉴를 선택하세요-------");
			System.out.println("1. 관리자모드 2. 사용자모드 0. 종료");
			int choiceMode = sc.nextInt();
			sc.nextLine();
			switch (choiceMode) {
			case MANAGE_MODE :
				for (int countPin = 0; countPin < 3; countPin++) {
					System.out.println("PIN 번호를 입력하세요. 4자리숫자");
					int pin = sc.nextInt();
					sc.nextLine();
					if (machine1.pinCheck(pin)){
						flag2 = true;
						break;
					} else {
						System.out.println("PIN번호가 틀렸습니다. 다시 입력해주세요");
					}
				}
				if (flag2 == false) {
					System.out.println("3회 틀려서 처음으로 돌아갑니다.");
					break;
				}
				while (flag2) {
					System.out.println("-------관리자 모드-------");
					System.out.println("추가 할 상품을 선택하세요");
					System.out.println("1. 호랑이인형 2. 곰인형 3. 에어팟 0. 종료");
					int choice = sc.nextInt();
					sc.nextLine();
					if (choice == TIGERDOLL) {
						// 더 세분화 해서 원하는 크기의 인형을 만들어 낼수 있지만 샘플로 진행
						machine1.addProduct(tiger1);
						TigerDoll.count++;
						machine1.addProduct(tiger2);
						TigerDoll.count++;
						machine1.addProduct(tiger3);
						TigerDoll.count++;
						System.out.println("호랑이인형이 추가됨");
					} else if (choice == BEARDOLL) {
						// 원하는 타입의 곰인형을 선택하는 기능 추가도 되지만 일단 샘플로 진행
						machine1.addProduct(bear1);
						BearDoll.count++;
						machine1.addProduct(bear2);
						BearDoll.count++;
						machine1.addProduct(bear3);
						BearDoll.count++;
						System.out.println("곰인형이 추가됨");
					} else if (choice == AIRPOD) {
						// 원하는 타입의 에어팟을 선택하여 추가할 수 있지만 샘플로 진행
						machine1.addProduct(airpodreal1);
						Airpod.countReal++;
						machine1.addProduct(airpod1);
						Airpod.countFake++;
						System.out.println("에어팟이 추가됨");
					} else if (choice == END) {
						System.out.println("관리자 모드를 종료합니다.");
						machine1.showInfo();
						System.out.println(machine1.count);
						flag2 = false;
					}
				}
				break;
			case USER_MODE :
				while (flag3) {
					System.out.println("-------사용자 모드-------");
					System.out.println("뽑을 상품을 선택하세요");
					System.out.println("1. 호랑이인형 2. 곰인형 3. 에어팟 4. 리스트 확인 0. 종료");
					int choice = sc.nextInt();
					sc.nextLine();
					if (choice == TIGERDOLL) {
						user.getProduct(machine1.pickProduct(TIGERDOLL));
					} else if (choice == BEARDOLL) {
						user.getProduct(machine1.pickProduct(BEARDOLL));
					} else if (choice == AIRPOD) {
						user.getProduct(machine1.pickProduct(AIRPOD));
					} else if (choice == USER_PRODUCTLIST) {
						user.productsList();
					} else if (choice == END) {
						System.out.println("사용자 모드를 종료합니다.");
						flag3 = false;
					}
				}
				break;
			case END :
				flag1 = false;
				break;
			}
		}
		
		
		sc.close();
	}

}

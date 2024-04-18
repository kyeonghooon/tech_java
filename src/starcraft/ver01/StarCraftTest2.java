package starcraft.ver01;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(2);
		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);
		Barracks barracks1 = new Barracks(1);
		Barracks barracks2 = new Barracks(2);
		
		Zealot zealot1 = gateWay1.createZealot("질럿1");
		Zealot zealot2 = gateWay1.createZealot("질럿2");
		System.out.println(gateWay1.getGateWayNumber() + " : " + gateWay1.getCount());
		System.out.println(gateWay2.getGateWayNumber() + " : " + gateWay2.getCount());
		System.out.println("-----------------------------------------");
		Zergling zergling1 = hatchery1.createZergling("저글링1");
		Zergling zergling2 = hatchery2.createZergling("저글링2");
		System.out.println(hatchery1.getHatcheryNumber() + " : " + hatchery1.getCount());
		System.out.println(hatchery2.getHatcheryNumber() + " : " + hatchery2.getCount());
		System.out.println("-----------------------------------------");
		Marine marine1 = barracks2.createMarine("마린1");
		Marine marine2 = barracks2.createMarine("마린2");
		System.out.println(barracks1.getBarracksNumber() + " : " + barracks1.getCount());
		System.out.println(barracks2.getBarracksNumber() + " : " + barracks2.getCount());
		System.out.println("-----------------------------------------");
		
		System.out.println("GateWay의 총 생산량은 : " + GateWay.getTotalCount());
		System.out.println("Hatchery의 총 생산량은 : " + Hatchery.getTotalCount());
		System.out.println("Barracks의 총 생산량은 : " + Barracks.getTotalCount());
		
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닉을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChoice = sc.nextInt();
			
			if (unitChoice == ZEALOT) {
				
			} else if (unitChoice == MARINE) {
				
			} else if (unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로그램을 종료 합니다.");
				unitChoice = GAME_END;
			}
			System.out.println("값 확인 : " + unitChoice);
		} while(unitChoice != GAME_END);
		
		
		
		
		sc.close();
	} // end of main

} // end of class

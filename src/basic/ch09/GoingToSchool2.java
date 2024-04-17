package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한대로 실행의 흐름을 만들어 보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름 만들기
		// 2번을 누르면 지하철을 태우는 실행의 흐름 만들기.
		Bus bus1 = new Bus(100); 
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);
		Scanner sc = new Scanner(System.in);
		System.out.println("1번을 누르면 티모, 2번을 누르면 야스오");
		int choiceStudent = sc.nextInt();
		if (choiceStudent == 1) {
			System.out.println("티모가 선택되었습니다. 교통수단을 선택해주세요.");
			System.out.println("1번을 누르면 버스, 2번을 누르면 지하철");
			int choiceTrans = sc.nextInt();
			if (choiceTrans == 1) {
				System.out.println("버스가 선택되었습니다. 버스 번호를 입력해주세요 100 or 200");
				int choiceBus = sc.nextInt();
				if (choiceBus == 100) {
					s1.takeBus(bus1);
					s1.showInfo();
					bus1.showInfo();
				} else if (choiceBus == 200){
					s1.takeBus(bus2);
					s1.showInfo();
					bus2.showInfo();
				} else {
					System.out.println("잘못된 입력입니다. 다시 실행해주세요");
				}
			} else if (choiceTrans == 2) {
				System.out.println("지하철이 선택되었습니다. 호선을 입력해주세요 1 or 2");
				int choiceBus = sc.nextInt();
				if (choiceBus == 1){
					s1.takeSubway(subway1);
					s1.showInfo();
					subway1.showInfo();
				} else if (choiceBus == 2){
					s1.takeSubway(subway2);
					s1.showInfo();
					subway2.showInfo();
				} else {
					System.out.println("잘못된 입력입니다. 다시 실행해주세요");
				}
			}
			
		} else if (choiceStudent == 2) {
			System.out.println("야스오가 선택되었습니다. 교통수단을 선택해주세요.");
			System.out.println("1번을 누르면 버스, 2번을 누르면 지하철");
			int choiceTrans = sc.nextInt();
			if (choiceTrans == 1) {
				System.out.println("버스가 선택되었습니다. 버스 번호를 입력해주세요 100 or 200");
				int choiceBus = sc.nextInt();
				if (choiceBus == 100 || choiceBus == 1) {
					s2.takeBus(bus1);
					s2.showInfo();
					bus1.showInfo();
				} else if (choiceBus == 200 || choiceBus == 2){
					s2.takeBus(bus2);
					s2.showInfo();
					bus2.showInfo();
				} else {
					System.out.println("잘못된 입력입니다. 다시 실행해주세요");
				}
			} else if (choiceTrans == 2) {
				System.out.println("지하철이 선택되었습니다. 호선을 입력해주세요 1 or 2");
				int choiceBus = sc.nextInt();
				if (choiceBus == 1){
					s2.takeSubway(subway1);
					s2.showInfo();
					subway1.showInfo();
				} else if (choiceBus == 2){
					s2.takeSubway(subway2);
					s2.showInfo();
					subway2.showInfo();
				} else {
					System.out.println("잘못된 입력입니다. 다시 실행해주세요");
				}
			}
			
		} else {
			System.out.println("잘못된 입력입니다. 다시 실행해주세요");
		}
		sc.close();
		
		
	} // end of main

}
// end of class

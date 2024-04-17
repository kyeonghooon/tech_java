package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		//int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형을 스스로 결정하고 식을 만들어 보세요
		int result6 = (12 + 3) / 3;
		System.out.println("result6 : " + result6);
		
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		int result7 = (25 % 2);
		System.out.println("result7 : " + result7);
		
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		int result8 = Math.abs(15/4);
		System.out.println("result8 : " + result8);
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 - (2문제 만들기)
		
		// 수학 85.5 국어 97.5 영어 64.5 점수의 평균 구하기
		double math = 85.5;
		double korean = 97.5;
		double english = 64.5;
		double avg = (math + korean + english) / 3;
		System.out.println(avg);
		
		// 한 송이에 알이 83알 있는 포도 5개를 30명이서 똑같이 나눠 먹고 남은 알은 선생님께 드리려고 한다.
		// 한명당 몇알을 먹을 수 있으며, 선생님께 드릴 포도는 몇알인가?
		
		final int grape = 83;
		int grape2 = 5;
		int student = (grape * grape2) / 30;
		int teacher = (grape * grape2) % 30;
		
		System.out.println("한명당 : " + student + "알");
		System.out.println("선생님 : " + teacher + "알");

	} // end of main

} // end of class

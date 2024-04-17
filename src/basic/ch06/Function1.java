package basic.ch06;

import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 2개 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int s1 = n1 < n2 ? n1: n2;
		int s2 = n1 < n2 ? n2: n1;
		System.out.println(calcSum(s1, s2));
		sc.close();

	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;

	}

	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2
	// 1, 10 ---> 55
	// 7, 200 ---> ...
	static int calcSum(int s1, int s2) {

		int sum = 0;
		for (int i = s1; i <= s2; i++) {
			sum += i;
		}
		return sum;
	}

}

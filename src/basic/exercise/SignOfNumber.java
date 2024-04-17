package basic.exercise;

import java.util.Scanner;

public class SignOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println(signOfNumber(number));
		sc.close();
	}

	// 입력받은 정수의 부호에 따라 "positive", "negative", "zero" 중 하나를 반환합니다.
	static String signOfNumber(int n) {
		if (n > 0) {
			return "positive";
		} else if (n == 0) {
			return "zero";
		} else {
			return "negative";
		}
	}
}

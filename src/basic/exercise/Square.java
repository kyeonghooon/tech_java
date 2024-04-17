package basic.exercise;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하세요 : ");
		int number = sc.nextInt();
		int result = square(number);
		System.out.println(number + "의 제곱은 : " + result);
		sc.close();
	}

	// 하나의 정수를 입력받아 그 수의 제곱을 반환하는 함수입니다.
	static int square(int n) {
		return n*n;
	}
}

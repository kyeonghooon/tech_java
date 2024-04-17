package basic.exercise;

import java.util.Scanner;

public class CheckAdult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요, 성인이면 true, 성인이 아니면 false가 출력됩니다 ");
		int age = sc.nextInt();
		boolean adult = checkAdult(age);
		System.out.println(adult);
		sc.close();
	}

	// 입력받은 나이가 18세 이상인지 확인하여 성인이면 true, 아니면 false를 반환합니다.
	static boolean checkAdult(int age) {
		return (age >= 18) ? true : false;
	}
}

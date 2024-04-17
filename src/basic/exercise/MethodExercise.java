package basic.exercise;

import java.util.Scanner;

public class MethodExercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("다음중 원하는 기능을 선택하세요");
		System.out.println("① 인사말 출력하기");
		System.out.println("② 제곱 계산하기");
		System.out.println("③ 나이 확인");
		System.out.println("④ 수의 부호 판별");
		System.out.println("⑤ 최대값 찾기 함수");
		System.out.println("\"1 ~ 5중 숫자만 입력해주세요\"");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			greet(name);
			break;
		case 2:
			System.out.print("정수를 입력 하세요 : ");
			int number2 = sc.nextInt();
			int result2 = square(number2);
			System.out.println(number2 + "의 제곱은 : " + result2);
			break;
		case 3:
			System.out.println("나이를 입력하세요, 성인이면 true, 성인이 아니면 false가 출력됩니다 ");
			int age = sc.nextInt();
			boolean adult = checkAdult(age);
			System.out.println(adult);
			break;
		case 4:
			System.out.print("정수를 입력하세요 : ");
			int number = sc.nextInt();
			System.out.println(signOfNumber(number));
			break;
		case 5:
			while (true) {
				System.out.println("정수를 2개 입력 하세요");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				if (num1 == num2) {
					System.out.print("잘못된 입력입니다. 다시 ");
				} else {
					System.out.println("두 수중 큰 수는 : " + findMax(num1, num2));
					break;
				}
			}
			break;
		default:
			System.out.println("잘못된 입력입니다. 다시 실행해주세요.");
		}
		sc.close();
	}
	// 사용자의 이름을 입력받아 "안녕하세요, [이름]님!"이라고 콘솔에 출력하는 함수입니다.
	static void greet(String s1) {
		System.out.println("안녕하세요, [" + s1 + "]님!");
	}
	// 하나의 정수를 입력받아 그 수의 제곱을 반환하는 함수입니다.
	static int square(int n) {
		return n * n;
	}
	// 입력받은 나이가 18세 이상인지 확인하여 성인이면 true, 아니면 false를 반환합니다.
	static boolean checkAdult(int age) {
		return (age >= 18) ? true : false;
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
	// 입력받은 두 수중에서 가장 큰 값을 반환하는 함수를 작성하세요.
	static int findMax(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
}

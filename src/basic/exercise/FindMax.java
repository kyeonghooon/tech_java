package basic.exercise;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 2개 입력 하세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if (num1 == num2) {
				System.out.print("잘못된 입력입니다. 다시 ");
			} else {
				System.out.println("두 수중 큰 수는 : " + findMax(num1,num2));
				break;
			}
		}
		sc.close();
	}

	// 입력받은 두 수중에서 가장 큰 값을 반환하는 함수를 작성하세요.
	static int findMax(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
}

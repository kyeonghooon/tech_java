package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {

		// 사용자의 입력값을 받아서 1 부터 x 까지 숫자의 홀수를 더하고 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int maxNumber = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= maxNumber; i += 2) {
			sum += i;
		}

//		for (int i = 1; i <= maxNumber; i++) {
//			if (i % 2 == 1) {
//				sum += i;
//			}
//		}

		System.out.println("1부터 " + maxNumber + "까지 홀수들의 합은 : " + sum);
		sc.close();

	} // end of main

} // end of class

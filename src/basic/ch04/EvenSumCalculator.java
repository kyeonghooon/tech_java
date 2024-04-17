package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {

		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();
		int sum = 0;
		
		// 10
		// 반복적인 패턴이 확인 된다.
		// 1 2 3 4 5 6 7 8 9 10;
		for (int i = 2; i <= maxNumber; i += 2) {
			
			sum += i;
			System.out.print("sum : " + sum + " \n"); // " \n"은 한줄 띄워라 " \t"는 탭해라
			
		}
//		for (int i = 1; i <= maxNumber; i++) {
//			if ( i % 2 == 0 ) {
//				sum += i;
//			}
//		}
		System.out.println("sum : " + sum);
		sc.close();
		
	} // end of main

} // end of class

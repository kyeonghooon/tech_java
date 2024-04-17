package basic.exercise;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		greet(name);
		sc.close();

	}

	// 사용자의 이름을 입력받아 "안녕하세요, [이름]님!"이라고 콘솔에 출력하는 함수입니다.
	static void greet(String s1) {
		System.out.println("안녕하세요, [" + s1 + "]님!");
	}
}

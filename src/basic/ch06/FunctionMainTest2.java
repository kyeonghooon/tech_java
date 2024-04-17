package basic.ch06;

public class FunctionMainTest2 {

	public static void main(String[] args) {

		// 함수를 언제든지 호출해서 사용할 수 있다.

		addNum(10, 10, 10);
		System.out.println(30);
		System.out.println(addNum(10, 10, 10));
		int result = addNum(10, 10, 10);
		System.out.println("result : " + result);
		System.out.println("-------------------------------");
		sayHello("안녕 반가워"); // 함수의 호출은 모양 맞추기이다.
		int result2 = calcSum();
		System.out.println("result2 : " + result2);
		

	} // end of main

	// 함수 설계, 함수 사용

	// 세 개의 정수값을 받아서 덧셈하는 기능을 만들어보자.
	static int addNum(int n1, int n2, int n3) {
		int result = 0;
		result = n1 + n2 + n3;
		return result;
	}

	// 리턴 값이 없는 함수를 만들어 보자.
	static void sayHello(String greeting) {
		System.out.println(greeting + " ^^");
	}

	// 매개 변수가 없는 함수를 만들어 보자.
	static int calcSum() {

		int sum = 0;
		int i;
		for (i = 1; i < 101; i++) { // 횟수 100 번 동작 하는 녀석
			sum += i; // 5050
		}
		return sum;
	}

} // end of class

package basic.ch04;

public class WhileTest2_1 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 5
		
		int start = 1; // 시작값은 1
		int end = 5; //  5번
		int sum = 0;
		
		// 특정 조건식을 만들어 반복문을 멈추게 해야 한다.
		// 만약 start 값이 10일 때 종료 하라
		while (true) {
			
			if (start == 10) {
				// 실행의 제어권을 반납한다.
				return;
			}
			sum += start;
			System.out.println("sum(" + start + "): " + sum);
			start++; // 1씩 증가
		}
		
		
	} // end of main

} // end of class

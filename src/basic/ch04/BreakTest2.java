package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라

		int start = 1;
		while (start < 11) {
			System.out.println("start의 값 : " + start);
			// 단독 if문은 수행이 될 수도 있고 안될 수도 있다.
			if ((start % 7) == 0) {
				break;
			}
			start++;
		}

	} // end of main

} // end of class

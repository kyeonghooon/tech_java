package useful.ch03;

import java.util.Scanner;

public class FinallyHandling {

	public static void main(String[] args) {

		// try-catch-finally
		// 언제 finally를 사용해야 해?
		// 자원을 반드시 닫아 주어야 할 때 등등...
		Scanner sc = new Scanner(System.in);
		try {
			int result = sc.nextInt();
			System.out.println("result : " + result);
			// scanner 의 자원을 다 사용 했다면 자원을 해제해야 된다.
		} finally {
			sc.close();
			System.out.println("자원 해제 완료");
		}

	}

}

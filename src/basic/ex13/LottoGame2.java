package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1 ~ 6 까지 나온 결과값을 오름 차순으로 정렬
		// 단, 중복 값은 무시!

		// 수식을 작성해주세요
		// 만약 if --> 반복문 사용 금지 if문 6개로 구성해주세요
		//

		int tempBox = 0;
		// 5, 1, 9, 7, 2, 3

		// 5 > 1
		if (gameNumber1 > gameNumber2) {
			// 5
			tempBox = gameNumber1;
			// 1 <-- 1
			gameNumber1 = gameNumber2;
			// 5 <-- 5
			gameNumber2 = tempBox;
		}
		// 1, 5, 9, 7, 2, 3

		// 5 > 9
		if (gameNumber2 > gameNumber3) {
			tempBox = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = tempBox;
		}

		// 1, 5, 9, 7, 2, 3

		// 9 > 7
		if (gameNumber3 > gameNumber4) {
			// 9 <-- 9
			tempBox = gameNumber3;
			// 7 <--- 7
			gameNumber3 = gameNumber4;
			// 9 <--- 9
			gameNumber4 = tempBox;
		}

		// 1, 5, 7, 9, 2, 3

		// 9 2
		if (gameNumber4 > gameNumber5) {
			// 9 <--- 9
			tempBox = gameNumber4;
			// 2 <-- 2
			gameNumber4 = gameNumber5;
			// 2 <-- 9
			gameNumber5 = tempBox;
		}

		// 1, 5, 7, 2, 9, 3

		// 9 > 3
		if (gameNumber5 > gameNumber6) {
			// 9 <-- 9
			tempBox = gameNumber5;
			// 3 <-- 3
			gameNumber5 = gameNumber6;
			// 9 <--- 9
			gameNumber5 = tempBox;
		}

		// 1, 5, 7, 2, 3, 9
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	} // end of main
}

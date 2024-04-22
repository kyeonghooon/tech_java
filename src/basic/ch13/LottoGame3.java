package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		System.out.print(gameNumber1 + " ");
		System.out.print(gameNumber2 + " ");
		System.out.print(gameNumber3 + " ");
		System.out.print(gameNumber4 + " ");
		System.out.print(gameNumber5 + " ");
		System.out.println(gameNumber6 + " ");

		int tempBox = 0;

		for (int i = 0; i < 6; i++) {
			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}

			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}

			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}

			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}

			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}
		}

		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	} // end of main
}

package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
//		int gameNumber3 = LottoNumberMaker.makeNumber();
//		int gameNumber4 = LottoNumberMaker.makeNumber();
//		int gameNumber5 = LottoNumberMaker.makeNumber();
//		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
//		System.out.println(gameNumber3 + "\t");
//		System.out.println(gameNumber4 + "\t");
//		System.out.println(gameNumber5 + "\t");
//		System.out.println(gameNumber6 + "\t");
		// 오름차순으로 정렬해보기
		// 만약 1상자가 2상자보다 크다면 어떤 행동을 하라
		int tempBox = 0;
		if (gameNumber1 > gameNumber2) {
			tempBox = gameNumber2;
			gameNumber2  = gameNumber1;
			gameNumber1 = tempBox;
		}
		
		// 변수에 값을 담고 출력 하세요.
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
		
		
	} // end of main

}

package basic.ch13;

// 가지고 오다. 수입하다.
import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0"; // major.minor.hotfix
	
	// 함수
	public static void main(String[] args) {
		
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
	}
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
//		System.out.println("ver : " + version);
		// 자바 도구 -- 표준 API
		// 난수 발생기 -> 랜덤적인 값을 생성
		Random random = new Random();
		// nextInt(int bound) : 0 ~ bound-1 범위의 난수 생성
		int resultNumber = random.nextInt(45) + 1; // 0 ~~~ 44
		return resultNumber;
	}
}

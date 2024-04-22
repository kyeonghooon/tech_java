package basic.exercise;

import java.util.Arrays;
// 가지고 오다. 수입하다.
import java.util.Random;

public class LottoNumberMaker {

	// 함수
	public static void main(String[] args) {
		int[] lottoNumbers = makeNumbers();
		Arrays.sort(lottoNumbers); // 알아서 오름차순으로 해주는 기능
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
	}

	/// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					System.out.println("작동됨");
				}
			}
		}

		return numbers;
	}
}

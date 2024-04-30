package useful.ch04;

public class MaxMin {

	public static void main(String[] args) {
		int[] array = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
		int max = 0;
		int maxPos = 0;
		int min = 0;
		int minPos = 0;
		// 첫번째 반복 : 타겟 숫자
		for (int i = 0; i < array.length; i++) {
			boolean isMax = true;
			boolean isMin = true;
			// 두번째 반복 : 타겟 숫자와 다른 모든 숫자 비교
			for (int j = 0; j < array.length; j++) {
				// 타겟숫자가 한번이라도 다른 숫자보다 작다면
				// 타겟숫자는 최대값이 아니다
				if (array[i] < array[j]) {
					isMax = false;
				}
				// 타겟숫자가 한번이라도 다른 숫자보다 크다면
				// 타겟숫자는 최솟값이 아니다
				if (array[i] > array[j]) {
					isMin = false;
				}
			}
			// 모든 숫자와 비교해서 한번도 isMax값이 변하지 않았다면 타겟숫자는 최대값
			if (isMax) {
				max = array[i];
				maxPos = i + 1;
			}
			// 모든 숫자와 비교해서 한번도 isMin값이 변하지 않았다면 타겟숫자는 최솟값
			if (isMin) {
				min = array[i];
				minPos = i + 1;
			}

		}
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");

	}

}

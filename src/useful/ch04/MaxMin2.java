package useful.ch04;

import java.util.Arrays;

public class MaxMin2 {

	public static void main(String[] args) {
		int[] array = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
		int maxPos = 0;
		int minPos = 0;
		int max = array[maxPos];
		int min = array[minPos];
		for (int i = 0; i < array.length; i++) {
			// 0번부터 비교하여 더 큰 값을 max에 담아서 끝까지 감
			if (max < array[i]) {
				max = array[i];
				maxPos = i + 1;
			}
			// 0번부터 비교하여 더 작은 값을 min에 담아서 끝까지 감
			if (min > array[i]) {
				min = array[i];
				minPos = i + 1;
			}
		}
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");

	}

}

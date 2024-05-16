package useful;

public class BinarySearch {

	public static void main(String[] args) {

		// 정렬되어 있는 데이터 상태
		int[] numbers = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		int target = 84;

		// 이진 탐색을 하기 위해 필요한 초기값을 설정 하시오
		int left;
		int right;
		int mid;
		int temp;

		boolean find = false;

		// 코드를 구현
		left = 0;
		right = numbers.length - 1;
		while (!find) {
			mid = (right + left) / 2;
			if (target == numbers[mid]) {
				System.out.println("찾는 수는 인덱스 " + mid + "번째에 있습니다.");
				find = true;
			} else if (target < numbers[mid]) {
				right = mid - 1;
			} else if (target > numbers[mid]) {
				left = mid + 1;
			} 
			if (right < left) {
				System.out.println("찾는 수가 없습니다.");
				find = true;
			}
			
		}
		// 결과
		// System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		// 또는
		// System.out.println("찾는 수가 없습니다.");
	}

}
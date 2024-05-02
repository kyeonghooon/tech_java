package structure;

/**
 * 배열을 활용한 클래스를 설계 
 * 물론 이미 자바 표준 API 개발자들이 잘 만들어 준 클래스들이 존재한다.
 * 하지만 직접 기능을 확장해서 만들어 보자.
 */
public class TencoIntArray {

	int[] intArr;
	int count; // 배열안에 들어간 요소의 개수
	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 1. 배열에 요소를 추가하는 기능
	// 배열 요소 제일 뒤에 값을 추가하는 기능을 가진다.
	public void addElement(int inputData) {
		// 방어적 코드 필요
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납
		}
		intArr[count++] = inputData;
	}

	// 2. 배열에서 지정한 인덱스 위치에 값을 추가하는 기능
	public void insertElement(int position, int inputData) {
		// 방어적 코드 1
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}
		// 방어적 코드 2
		if (position < 0 || position > count - 1) {
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
			return;
		}
		// 요청값 : position --> 3
		// [11, 12, 13, 14, 15]
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩 뒤로 밀기
		}

		intArr[position] = inputData;
		count++;
	}

	// 3. 지정한 인덱스 번호에 맞는 요소를 반환하는 기능
	public int getElement(int position) {
		if (position < 0 || position > count - 1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 4. 지정한 인덱스 번호에 맞는 요소를 삭제하는 기능
	public void removeElement(int position) {
		if (isEmpty()) {
			System.out.println("삭제할 요소가 없습니다.");
			return;
		}

		// 인덱스 범위를 잘못 지정했다면 방어적 코드
		if (position < 0 || position >= count) {
			System.out.println("잘못된 요청입니다.");
			return;
		}
		// intArr[position]; --> 사용자가 인덱스 0번 요청
		// [100, 200, 300, 400]
		for (int i = position; i < intArr.length - position; i++) {
			intArr[i] = intArr[i + 1];
		}
		count--;
	}

	// 5. 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for (int i = 0; i < count; i++) {
			System.out.println(intArr[i]);
		}

	}

	// 6. 전체 삭제 하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소의 개수 상태를 항상 관리하고 처리해야 한다.
		count = 0;
	}

	// 7. 배열의 크기가 아닌 현재 요소의 개수를 반환
	public int getElementSize() {
		return count;
	}

	// 8. 현재 요소가 하나도 없는 상태이다.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

}

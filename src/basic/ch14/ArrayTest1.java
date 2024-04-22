package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!!
		
		// 배열의 특징(중요)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.
		
		// 배열 메모리 공간 만들기
		int[] numbers = new int[3]; // 둘다 되는데 이걸로 하자
		int intBoxes[] = new int[5];
		
		// 값 넣기 (초기화)
		// 배열의 길이 -> 3
		// 인덱스 최대값 : 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		// numbers[3] = 1003; // 인덱스의 길이를 벗어남, 오류 발생
		// 사전기반지식 - 모든 프로그래밍에 인덱스 번호의 시작은 0부터 시작한다.
		
		// 배열의 선언과 동시에 초기화
		int[] grades = new int[] {5, 3, 1};
		int[] grades2 = {5, 3, 1}; // new int[] 생략 가능하다.
		
		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하시오.
		// 단, 배열의 이름은 마음대로 작성하세요
		double[] doubleboxes = new double[5];
		
		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2 까지 초기화 하시오.
		// 값은 아무거나 상관 없음
		doubleboxes[0] = 0.0;
		doubleboxes[1] = 2.57;
		doubleboxes[2] = 3.14;
		// doubleboxes[4] == 0.0
		// doubleboxes[5] == 0.0
		
		// 문제 3
		// String 타입의 배열을 선언, 크기는 3
		// 선언과 동시에 초기화 하세요.
		String[] names = new String[]{"홍길동","이순신","강감찬"}; 
		String[] names2 = {"홍길동","이순신","강감찬"}; 
		
	} // end of main

} // end of class

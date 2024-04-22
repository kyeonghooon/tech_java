package basic.ch15;

public class BookTest {

	public static void main(String[] args) {

		// 배열이란 - 연관된 데이터를 하나의 변수의 통으로 관리하고 싶을때 사용 - 자료구조
		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book[] booklist = new Book[10]; // 배열의 메모리 공간 선언

		booklist[0] = new Book("플러터UI실전", "김근호");
		booklist[1] = new Book("무궁화꽃이피었습니다", "김진명");
		booklist[2] = new Book("흐르는강물처럼", "파울로코엘료");
		booklist[3] = new Book("리딩으로리드하라", "이지성");
		booklist[4] = new Book("사피엔스", "유발하라리");
		booklist[9] = new Book("홍길동전", "허균");

		// 배열은 반복문과 함께 많이 활용된다.
		// 배열의 크기와 요소의 개수는 꼭 동일한 것은 아니다.

		// booklist[3] --> Book
		// System.out.println(booklist[3].getTitle());
		// System.out.println(booklist[3].getAuthor());
		for (int i = 0; i < booklist.length; i++) {
			// 방어적 코드를 작성해주어야 한다.
			if (booklist[i] != null) {
				System.out.println(booklist[i].getTitle());
				System.out.println(booklist[i].getAuthor());
				System.out.println("---------------------------");
			}
		}
		
	} // end of main

} // end of class

package basic.ch15;

import java.util.Scanner;

/**
 * author - 김근호 모든 프로그래밍의 기본은 C R U D 이다.
 */
public class MyBookStore {
	
	static int LAST_INDEX_NUMBER = 0; // 요소의 개수

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		
		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		boolean flag = true;
		while (flag) {
			System.out.println("\n ** 메뉴 선택 ** ");
			System.out.println("1. 저장 2. 전체조회 3. 선택조회 4. 전체삭제 0. 프로그램 종료");
			String selectedNumber = sc.nextLine();
			System.out.println("selectedNumber : " + selectedNumber);
			System.out.println();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				save(sc, books);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByTitle(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deletaAll(books);
			} else if (selectedNumber.equals(END)) {
				System.out.println("프로그램을 종료.");
				flag = false;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
		sc.close();
	} // end of main

	// 함수 활용
	// 1. 저장 하기(하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("-----저장 하기-----");
		if(LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}
		System.out.println("책의 제목을 입력 하세요");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력 하세요");
		String bookAuthor = sc.nextLine();
		
		Book book = new Book(bookTitle ,bookAuthor);
		
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++;
				System.out.println("인덱스 번호 " + i + "번에 저장되었습니다.");
				break;
			}
		}
		
	}
	// 2. 전체 조회 하기
	public static void readAll(Book[] books) {
		if (LAST_INDEX_NUMBER == 0) {
			System.out.println("저장된 책이 없습니다.");
			return;
		}
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}
		System.out.println("총 " + LAST_INDEX_NUMBER + "권 저장되어있습니다.");
	}
	// 3. 선택 조회 하기
	public static void readByTitle(Scanner sc, Book[] books) {
		if (LAST_INDEX_NUMBER == 0) {
			System.out.println("저장된 책이 없습니다.");
			return;
		}
		System.out.println("-----선택 조회하기-----");
		System.out.println(">>> 책 제목을 입력하세요 <<<");
		String title = sc.nextLine();
		
		// 만약 사용자가 입력한 책 제목과 배열 요소안의 title 값이 같다면
		// books 전부 조사 books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals
		// books[0].getTitle().equals() // 배열안에 객체가 없다면 --> null pointer --> 방어적 코드
		
		// 화면에 책 제목, 저자 이름을 출력하고
		// 아니라면
		// 해당하는 책이 없습니다. 문구를 출력 하시오.
		
		// 심화 -- 반복문을 전부 돌리면 안됩니다.
		boolean isFind = false;
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			// 논리곱을 사용해도 되는데 이중 if 까지는 쓰자. 만약 삼중 if 써야되면 논리곱 활용
			if (books[i] != null) {
				if (books[i].getTitle().equals(title)) {
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true;
					break;
				} 
			}
			
		}
		// 만약 선택된 값이 없다면
		// 해당 제목의 책이 없습니다.
		if (!isFind) {
			System.out.println("해당하는 책이 없습니다.");
		}
	}
	
	// 4. 전체 삭제 하기
	public static void deletaAll(Book[] books) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
		}
		LAST_INDEX_NUMBER = 0;
		System.out.println("삭제가 완료 되었습니다.");
	}

} // end of class

package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int lastIndexNumber = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneBook[] list = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NAME = "3";
		final String DELETE_ALL = "4";
		final String DELETE_BY_NAME = "5";
		final String UPDATE_BY_NAME = "6";
		final String END = "0";

		// 샘플 데이터
		list[0] = new PhoneBook("홍길동", "01011111111");
		list[1] = new PhoneBook("이순신", "01022222222");
		list[2] = new PhoneBook("강감찬", "01033333333");
		lastIndexNumber = 3;

		boolean flag = true;
		while (flag) {
			System.out.println("\n ** 메뉴 선택 ** ");
			System.out.println("1. 저장 2. 전체조회 3. 선택조회 4. 전체삭제 "
					+ "5. 선택삭제 6. 선택수정 0. 프로그램 종료");
			String selectedNumber = sc.nextLine();
			System.out.println("selectedNumber : " + selectedNumber);
			System.out.println();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				save(sc, list);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(list);
			} else if (selectedNumber.equals(SEARCH_BY_NAME)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByName(sc, list);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deleteAll(sc, list);
			} else if (selectedNumber.equals(DELETE_BY_NAME)) {
				System.out.println(">> 선택 삭제 하기 <<");
				deleteByName(sc, list);
			} else if (selectedNumber.equals(UPDATE_BY_NAME)) {
				System.out.println(">> 선택 수정 하기 <<");
				updateByName(sc, list);
			} else if (selectedNumber.equals(END)) {
				System.out.println("프로그램을 종료.");
				flag = false;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}

		sc.close();
	} // end of main

	// 1. 저장하기
	public static void save(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("-----저장 하기-----");
		if (lastIndexNumber >= phonebook.length) {
			System.out.println("더이상 연락처를 저장할 공간이 없습니다.");
			return;
		}

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = sc.nextLine();
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] == null) {
				phonebook[i] = new PhoneBook(name, phoneNumber);
				System.out.println("인덱스 번호 " + i + "번에 저장되었습니다.");
				lastIndexNumber++;
				break;
			}
		}
	}

	// 2. 전체 조회 하기
	public static void readAll(PhoneBook[] phonebook) {
		if (lastIndexNumber == 0) {
			System.out.println("저장된 연락처가 없습니다.");
			return;
		}
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName() + ", " + phonebook[i].getPhoneNumber());
			}
		}
		System.out.println("총 " + lastIndexNumber + "명 저장되어있습니다.");

	}
	
	// 3. 선택 조회 하기
	public static void readByName(Scanner sc, PhoneBook[] phonebook) {
		if (lastIndexNumber == 0) {
			System.out.println("저장된 연락처가 없습니다.");
			return;
		}
		System.out.println("-----선택 조회하기-----");
		System.out.println(">>> 이름을 입력하세요 <<<");
		String name = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(name)) {
					System.out.println(phonebook[i].getName() + ", " + phonebook[i].getPhoneNumber());
					isFind = true;
					break;
				}
			}
		}
		if (!isFind) {
			System.out.println("해당하는 이름이 없습니다.");
		}
	}
	// 4. 전체 삭제하기
	public static void deleteAll(Scanner sc, PhoneBook[] phonebook) {
		while (true) {
			System.out.println("전체 삭제시 되돌릴 수 없습니다. 정말 삭제 하시겠습니까?");
			System.out.println("전체 삭제를 원하면 1번 입력 원하지 않으면 0번 입력");
			String choice = sc.nextLine();
			if (choice.equals("0")) {
				System.out.println("전체삭제를 취소합니다.");
				return;
			} else if (choice.equals("1")) {
				for (int i = 0; i < phonebook.length; i++) {
					phonebook[i] = null;
				}
				lastIndexNumber = 0;
				System.out.println("전체삭제가 완료 되었습니다.");
				break;
			} else {
				System.out.println("잘못된 입력 입니다.");
			}
		}
	}

	// 5. 선택 삭제하기
	public static void deleteByName(Scanner sc, PhoneBook[] phonebook) {
		if (lastIndexNumber == 0) {
			System.out.println("저장된 연락처가 없습니다.");
			return;
		}
		System.out.println("-----선택 삭제하기-----");
		System.out.println(">>> 이름을 입력하세요 <<<");
		String name = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(name)) {
					phonebook[i] = null;
					lastIndexNumber--;
					System.out.println("삭제가 완료되었습니다.");
					isFind = true;
					break;
				}
			}
		}
		if (!isFind) {
			System.out.println("해당하는 이름이 없습니다.");
		}
	}
	// 6. 선택 수정하기
	public static void updateByName(Scanner sc, PhoneBook[] phonebook) {
		if (lastIndexNumber == 0) {
			System.out.println("저장된 연락처가 없습니다.");
			return;
		}
		System.out.println("-----선택 수정하기-----");
		System.out.println(">>> 이름을 입력하세요 <<<");
		String name = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(name)) {
					System.out.println("수정할 이름을 입력하세요 (이름 수정을 원치 않으면 0 입력)");
					String updateName = sc.nextLine();
					System.out.println("수정할 연락처를 입력하세요");
					String updatePhoneNumber = sc.nextLine();
					if (updateName.equals("0")) {
						phonebook[i].setPhoneNumber(updatePhoneNumber);
						isFind = true;
						break;
					} else {
						phonebook[i].setName(updateName);
						phonebook[i].setPhoneNumber(updatePhoneNumber);
						isFind = true;
						break;
					}
				}
			}
		}
		if (!isFind) {
			System.out.println("해당하는 이름이 없습니다.");
		}
	}
} // end of class

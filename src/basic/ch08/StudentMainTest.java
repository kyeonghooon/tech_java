package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 101, 3); // 객체
		System.out.println(s1); // 주소값이 출력이 된다.
		// s1.showInfo();
		System.out.println("-----------------------");
		// 연습문제
		// s2 참조 변수의 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		Student s2 = new Student("이순신", 102, 1);
		System.out.println(s2); // 주소값이 출력이 된다.
		System.out.println("-----------------------");
		// s2.showInfo();
		Student s3 = new Student(); // 기본 생성자로 메모리에 올림
		s3.name = "야스오";
		s3.grade = 1;
		s3.number = 103;
		s3.showInfo();
		System.out.println(s3); // 주소값이 출력이 된다.
		
		// 생성자를 여러개 만들어 줄 수 있다.
		// 생성자 오버로딩이라고 한다.
		
	} // end of main

} // end of class

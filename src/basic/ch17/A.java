package basic.ch17;

// 상상력 추가
// 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;

	// 1. 바로 수정...
	// int level;
	// String nickName;
	// 문제가 생길수 있음
}
// 하나의 자바 파일안에 여러개의 클래스를 작성할 수 있다.
// 단, public 클래스는 오직 하나만 정의 가능하다.
// 2. 복사 붙여 넣기도 가능
class B {

	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName;
}

// 상속이라는 문법을 배운 개발자라면

class C extends A {
	
	int level;
	int nickName;
	String phone;
}
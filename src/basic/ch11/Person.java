package basic.ch11;

public class Person {

	// this의 3가지 사용 방법
	// 1. this는 자기 자신을 가리킨다. (인스턴스의 주소)
	
	// 변수 --> private
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	// 생성자
	public Person(String name, int age) {
		// 자기 자신의 멤버 변수 name에 외부에서 들어오는 지역 변수 name을 대입
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다. this(...)
		this(name, age);
		this.phone = phone;
		// 다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다.
		
//		this.name = name;
//		this.age = age;
	}
	
	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
	}
	
	// 3. 자신의 주소값을 반환 시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환 시킨다.
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public String getNane() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

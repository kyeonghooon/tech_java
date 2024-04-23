package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.startCar();
		
		// 엔진의 속성인 name 변수의 값을 초기화 해보자.
		car1.engine.name = "V8";
		car1.engine.price = 4_000;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
	}

}

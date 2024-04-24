package basic.exercise.toy;

public class Product {
	protected String name;
	protected double resistance;
	
	// 저항 메소드 : 성공확률을 랜덤으로 받고 저항값 보다 높다면 true 반환
	public boolean resist() {
		double successPercent = Math.random();
		if (successPercent > resistance) {
			return true;
		} else return false;
	}
	
	public void showInfo() {
		System.out.println(">>>>상품 정보<<<<");
	}
	
}

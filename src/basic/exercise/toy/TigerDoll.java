package basic.exercise.toy;

public class TigerDoll extends Product{
	private double size;
	static int count;
	
	public TigerDoll(String name) {
		super.name = name;
		size = Math.random() * 10; // 0 ~ 10 사이의 크기
		if (size >= 5) {
			resistance = size / 10; // 크기가 클수록 저항이 커짐
		} else {
			resistance = 1 - size / 10; // 크기가 작을수록 저항이 커짐
		}
		this.showInfo();
	}
	
	@Override
	public boolean resist() {
		boolean temp = super.resist();
		if (!temp) {
			System.out.println("호랑이 인형이 미끄러졌습니다.");
		} else {
			System.out.println("호랑이 인형을 잡았습니다.");
		}
		return temp;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("호랑이 인형 " + name +"의 크기 : "+ (int)size);
	}
	

}

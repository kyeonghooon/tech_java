package basic.ch20;

public class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

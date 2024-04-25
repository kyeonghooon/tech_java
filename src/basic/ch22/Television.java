package basic.ch22;

public class Television extends HomeAppliances implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다");
	}
	
}

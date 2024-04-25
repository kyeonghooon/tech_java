package basic.ch22;

public class Refrigerator extends HomeAppliances 
							implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끈다");
	}

	@Override
	public void soundOn() {
		System.out.println("띠리링 ~~~~");
	}
	
	
}

package basic.exercise.toy;

public class BearDoll extends Product{
	private final int DADDY_BEAR = 1;
	private final int MOMMY_BEAR = 2;
	private final int BABY_BEAR = 3;
	private int type;
	static int count;
	
	public BearDoll(String name) {
		super.name = name;
		type = (int)(Math.random() * 3) + 1; // 타입을 랜덤으로 부여하기 위함
		showInfo();
	}
	// 원하는 타입을 골라서 생성
	public BearDoll(String name, int type) {
		super.name = name;
		this.type = type;
		showInfo();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("곰 인형 " + name +"타입 : "+ typeName(type));
	}
	
	@Override
	public boolean resist() {
		resistance = 1 - type * 0.3; // 아빠곰 70% 엄마곰 40% 애기곰 10%
		boolean temp = super.resist();
		if (!temp) {
			System.out.println("곰인형이 미끄러졌습니다.");
		} else {
			System.out.println("곰인형을 잡았습니다.");
		}
		return temp;
	}
	
	public String typeName(int type) {
		switch (type) {
		case DADDY_BEAR : return "아빠곰";
		case MOMMY_BEAR : return "엄마곰";
		case BABY_BEAR : return "애기곰";
		default : return null;
		}
	}
}

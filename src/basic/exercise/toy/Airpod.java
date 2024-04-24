package basic.exercise.toy;

public class Airpod extends Product{
	final int REAL = 1;
	final int FAKE = 2;
	private int type;
	static int countReal;
	static int countFake;
	
	public Airpod(String name, int type) {
		this.name = name;
		this.type = type;
		showInfo();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		if (type == REAL) System.out.println("진짜 에어팟");
		else	System.out.println("가짜 에어팟");
	}
	
	@Override
	public boolean resist() {
		if (type == REAL) {
			resistance = 0.99;
			boolean temp = super.resist();
			if (temp == false) {
				System.out.println("에어팟을 놓쳤습니다 진짜에어팟이었는데 말이죠 ㅠㅠ.");
			} else {
				System.out.println("축하합니다. 진짜에어팟을 뽑으셨습니다.");
			}
			return temp;
		} else if (type == FAKE) {
			resistance = 0.3;
			boolean temp = super.resist();
			if (temp == false) {
				System.out.println("축하합니다. 어차피 가짜였습니다");
			} else {
				System.out.println("축하합니다. 어라? 가짜 에어팟이네요");
			}
			return temp;
		} else return false;
		
	}

	public int getType() {
		return type;
	}
	
	
}

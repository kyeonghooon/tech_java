package starcraft.ver01;

public class Barracks {

	private int barracksNumber;
	private int count;
	private static int totalCount;
	
	public Barracks(int number) {
		this.barracksNumber = number;
	}
	
	public int getBarracksNumber() {
		return barracksNumber;
	}
	public int getCount() {
		return count;
	}
	public static int getTotalCount() {
		return totalCount;
	}
	public Marine createMarine(String name) {
		count++;
		totalCount++;
		return new Marine(name);
	}
}

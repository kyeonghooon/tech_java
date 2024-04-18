package starcraft.ver01;

public class Hatchery {

	private int hatcheryNumber;
	private int count;
	private static int totalCount;

	public Hatchery(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
	}

	public int getHatcheryNumber() {
		return hatcheryNumber;
	}

	public int getCount() {
		return count;
	}
	public static int getTotalCount() {
		return totalCount;
	}

	public Zergling createZergling(String name) {
		count++;
		totalCount++;
		return new Zergling(name);
	}
}

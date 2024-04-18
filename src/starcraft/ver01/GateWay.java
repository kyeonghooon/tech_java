package starcraft.ver01;

public class GateWay {

	private int gateWayNumber;
	private int count;
	private static int totalCount;
	
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
	}
	public int getCount() {
		return count;
	}
	public int getGateWayNumber() {
		return gateWayNumber;
	}
	public static int getTotalCount() {
		return totalCount;
	}
	
	// 기능 - 질럿 생산하는 기능을 만들어 보세요
	public Zealot createZealot(String name) {
		count++;
		totalCount++;
		return new Zealot(name);
	}
	
}

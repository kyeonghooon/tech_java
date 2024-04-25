package starcraft.ver05;

public class StarCraft {

	public static void main(String[] args) {
		
		Unit zealot1 = new Zealot("질럿1");
		Unit marine1 = new Marine("마린1");
		Unit zergling1 = new Zergling("저글링1");
		
		System.out.println(zealot1);
		System.out.println(marine1);
		System.out.println(zergling1);
		System.out.println("------------------");
		zealot1.attack(marine1);
		zergling1.attack(marine1);
		zergling1.attack(zealot1);
		System.out.println(marine1);
	} // end of main

} // end of class

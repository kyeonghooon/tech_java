package basic.exercise;

public class Stars3 {

	public static void main(String[] args) {

		for (int i = 3; 0 <= i && i < 4; i--) {
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}

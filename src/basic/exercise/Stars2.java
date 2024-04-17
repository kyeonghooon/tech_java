package basic.exercise;

public class Stars2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i += 2) {
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}

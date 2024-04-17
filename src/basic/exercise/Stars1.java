package basic.exercise;

public class Stars1 {

	public static void main(String[] args) {

		// 이중 for구문을 활용해 별표 찍기
//		System.out.println("*");
//		System.out.print("*");
//		System.out.println("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println("*");
		
		for (int i = 0; i < 4; i++) {
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}

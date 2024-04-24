package basic.exercise.toy;

public class User {
	Product[] products = new Product[100];
	int count;
	int money;
	private final int MAX_COUNT = 100;
	private final int ONCE_COIN = 500;
	
	public User() {
		money = 10000;
	}
	
	public void getProduct(Product product) {
		if (product == null) {
		} else {
			if (count < MAX_COUNT && money >= ONCE_COIN) {
				money -= ONCE_COIN;
				for (int i = 0; i < products.length; i++) {
					if (products[i] == null) {
						products[i] = product;
					}
				}
			} else if (count >= MAX_COUNT){
				System.out.println("더이상 담을 수 없습니다.");
			} else if (money < ONCE_COIN) {
				System.out.println("돈이 부족합니다.");
			}
		}
	}
	
	public void productsList() {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				products[i].showInfo();
			}
		}
	}
}

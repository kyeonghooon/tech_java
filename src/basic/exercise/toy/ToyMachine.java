package basic.exercise.toy;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구조건
// 1. 배열을 활용해서 객체들을 담아라.
public class ToyMachine {
	Product[] products;
	int count;
	private final int MAX_COUNT = 100;
	private int pin;
	final int TIGERDOLL = 1;
	final int BEARDOLL = 2;
	final int AIRPOD = 3;

	public ToyMachine(int pin) {
		products = new Product[100];
		this.pin = pin;
	}

	// 머신의 상품통에 상품 집어넣기
	// 단, 이미 최대치 이상이라면 더이상 담을 수 없습니다. 출력
	public void addProduct(Product product) {
		if (count < MAX_COUNT) {
			for (int i = 0; i < this.products.length; i++) {
				if (products[i] == null) {
					products[i] = product;
					count++;
					break;
				}
			}
		} else {
			System.out.println("더이상 담을 수 없습니다.");
		}
	}

	// 머신에서 상품 뽑기 (이미 뭘 뽑을지는 입력을 받아온 상태)
	// 단, 머신에 상품이 없다면 메세지 출력
	public Product pickProduct(int choice) {
		if (count <= 0) {
			System.out.println("상품이 존재하지 않습니다.");
			return null;
		} else {
			switch (choice) {
			// 호랑이 인형을 뽑는다
			case TIGERDOLL:
				if (TigerDoll.count == 0) {
					System.out.println("상품이 존재하지 않습니다.");
					return null;
				}
				for (int i = 0; i < products.length; i++) {
					if (products[i] instanceof TigerDoll) {
						// 저항 메서드를 통해 랜덤적으로 뽑을 수 있게함
						if (products[i].resist()) {
							TigerDoll.count--;
							count--;
							Product temp = products[i];
							products[i] = null; // 뽑힌 자리는 null 값으로
							return temp;
						} else {
							return null;
						}
					}
				}
				// 곰 인형을 뽑는다
			case BEARDOLL:
				if (BearDoll.count == 0) {
					System.out.println("상품이 존재하지 않습니다.");
					return null;
				}
				System.out.println("dd");
				for (int i = 0; i < products.length; i++) {
					if (products[i] instanceof BearDoll) {
						// 저항 메서드를 통해 랜덤적으로 뽑을 수 있게함
						if (products[i].resist()) {
							BearDoll.count--;
							count--;
							Product temp = products[i];
							products[i] = null; // 뽑힌 자리는 null 값으로
							return temp;
						} else {
							return null;
						}
					}
				}
			case AIRPOD:
				if (Airpod.countFake == 0 && Airpod.countReal == 0) {
					System.out.println("상품이 존재하지 않습니다.");
					return null;
				}
				// 50% 확률로 가짜에어팟 뽑기, 진짜에어팟 뽑기를 하게됨
				int random = (int) (Math.random() * 2); // 랜덤값이 0 일때 가짜 뽑기, 1일때 진짜 뽑기
				if (Airpod.countFake == 0)
					random = 1; // 가짜 에어팟을 다뽑아서 없다면 진짜 뽑기를 할 수 있게함
				// 가짜 뽑기
				if (random == 0) {
					for (int i = 0; i < products.length; i++) {
						if (products[i] instanceof Airpod // airpod 객체이면서 fake 인지 확인
								&& ((Airpod) products[i]).getType() == ((Airpod) products[i]).FAKE) {
							// 저항 메서드를 통해 랜덤적으로 뽑을 수 있게함
							if (products[i].resist()) {
								Airpod.countFake--;
								count--;
								Product temp = products[i];
								products[i] = null;
								return temp;
							} else {
								return null;
							}
						}
					}

				} else {
					// 진짜 뽑기
					for (int i = 0; i < products.length; i++) {
						if (products[i] instanceof Airpod // airpod 객체이면서 real 인지 확인
								&& ((Airpod) products[i]).getType() == ((Airpod) products[i]).REAL) {
							if (products[i].resist()) {
								count--;
								Product temp = products[i];
								products[i] = null;
								return temp;
							} else {
								return null;
							}
						}
					}
				}
			}

		}
		return null;
	}
	// 관리자 모드를 나갈때 개수 확인을 위한 코드
	public void showInfo() {
		System.out.println("호랑이인형 : " + TigerDoll.count + "개");
		System.out.println("곰인형 : " + BearDoll.count + "개");
		System.out.println("진짜 에어팟 : " + Airpod.countReal + "개");
		System.out.println("가짜 에어팟 : " + Airpod.countFake + "개");
	}
	// 관리자 모드 돌입을 위해 pin 번호 확인
	public boolean pinCheck(int pin) {
		if (pin == this.pin) {
			return true;
		} else {
			return false;
		}
	}

}

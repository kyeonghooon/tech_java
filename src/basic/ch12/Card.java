package basic.ch12;

public class Card {
	
	// 멤버 변수, static 변수
	static int cardNumberCount = 1;
	String ownerName;
	String type;
	int cardNumber;
	
	// 생성자
	public Card(String ownername, String type) {
		this.ownerName = ownername;
		this.type = type;
		cardNumber = issueCardNumber();
	}
	
	// 멤버 함수
	public void showInfo() {
		System.out.println(ownerName + "님의 카드는 " + type + "이고, 번호는 " + cardNumber + "입니다.");
	}
	public int issueCardNumber() {
		return cardNumberCount++;
	}
	
	// get, set 작성
	public String getOwnerName() {
		return ownerName;
	}
	public String getType() {
		return type;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setType(String type) {
		this.type = type;
	}

	// 코드 테스트(메인함수)
	public static void main(String[] args) {
		Card card1 = new Card("홍길동", "체크카드");
		Card card2 = new Card("이순신", "신용카드");
		Card card3 = new Card("강감찬", "교통카드");
		card1.showInfo();
		card2.showInfo();
		card3.showInfo();

	} // end of main
	
} // end of class

package basic.ch12;

public class Account {
	public static void main(String[] args) {
		Bank account1 = new Bank("111-111");
		Bank account2 = new Bank("222-222");
		Bank account3 = new Bank("333-333");
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
	}
}

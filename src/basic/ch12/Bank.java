package basic.ch12;

public class Bank {

	private static String bankName = "우리은행";
	private String accoutNumber;

	public Bank(String accountNumber) {
		this.accoutNumber = accountNumber;
	}
	public String toString() {
		return bankName + " " + accoutNumber;
	}
}

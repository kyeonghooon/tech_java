package useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {
		NickName nickName = new NickName();
		String inputNick = null;
		inputNick = "ㄱㄱㄱㄱ";
		try {
			nickName.setNick(inputNick);
		} catch (NickNameException e) {
			System.out.println("사용자 정의 예외 발생 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		System.out.println(nickName.getNick());
	}

}

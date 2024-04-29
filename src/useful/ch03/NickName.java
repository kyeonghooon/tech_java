package useful.ch03;

public class NickName {
	private String nick;
	
	// getter
	public String getNick() {
		return nick;
	}
	// setter
	public void setNick(String nick) throws NickNameException{
		if (nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다.");
		}
		if (nick.length() < 2) {
			throw new NickNameException("닉네임은 두 글자 이상이어야 합니다.");
		}
		if (nick.length() > 10) {
			throw new NickNameException("닉네임은 열 글자 이하여야 합니다.");
		}
		if (!nick.matches("[0-9a-zA-Z가-힣_]+")) {
			throw new NickNameException("닉네임은 _를 제외한 특수문자 혹은 한글자음을 포함할 수 없습니다.");
		}
		this.nick = nick;
	}
}

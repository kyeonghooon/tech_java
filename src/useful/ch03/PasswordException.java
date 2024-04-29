package useful.ch03;

/**
 * 사용자 정의 예외 클래스 생성
 */
public class PasswordException extends IllegalArgumentException{
	
	// getMessage를 쓰기 위해서 멤버 변수 message 초기화
	public PasswordException(String message) {
		super(message);
	}
}

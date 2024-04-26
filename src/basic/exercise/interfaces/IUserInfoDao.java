package basic.exercise.interfaces;

public interface IUserInfoDao {
	
	// C R U D
	// public abstract 생략 가능
	// TODO - 매개변수 수정 예정 --> 습관적으로 TODO 적어놓기
	public abstract void insertUserInfo(UserInfo info);
	// 단 수정이 되면 안되는 것은 제외.
	public abstract void updateUserInfo(UserInfo info);
	public abstract void deleteUserInfo(int id);
	public abstract void selectUserInfo(); // 전체 조회
	
	
}

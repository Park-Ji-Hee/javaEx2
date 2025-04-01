package ch06.di;
// == 비지니스 클래스 / 데이터 저장 및 가져오기 위함

public class User {

	private UserVO[] list;
	private int count;
	
	public User() {
		count = 0;
		list = new UserVO[10];
	}
	
	public int append(UserVO vo) {
		if(count >= list.length) {
			System.out.println("등록불가 !!");
			return count;
		}
		
		list[count++] = vo;	//==> lsit[] = vo ; count++;
		
		return count++;
		
	}
	
	public int getCount() {
		return count;
	}
	
	public UserVO[] listUser() {
		return list;
	}
	
}


public class ClientMain {

	public static void main(String[] args) {
		IUserInfo info = new UserInfo();
		IUserInfo info1 = new OuterUserInfo();
		for(int i = 0;i < 100;i++) {
			info.getMobileNumber();
			info1.getMobileNumber();
		}
	}
}

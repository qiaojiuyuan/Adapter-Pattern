
public class UserInfo implements IUserInfo{

	@Override
	public String getUserName() {
		System.out.println("这是员工姓名");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("这是员工家庭住址");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("这是员工手机号");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("这是员工办公定电话号");
		return null;
	}

	@Override
	public String getJobPositioin() {
		System.out.println("这是员工职位");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("这是员工家庭电话");
		return null;
	}

}

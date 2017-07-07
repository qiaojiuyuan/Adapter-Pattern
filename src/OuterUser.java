import java.util.HashMap;
import java.util.Map;
/**
 * 劳动服务公司人员信息
 * @author qiaojy
 *
 */
public class OuterUser implements IOuterUser{

	@Override
	public Map getUserBaseInfo() {
		HashMap<String, String> baseInfo = new HashMap<String, String>();
		baseInfo.put("userName", "张三");
		baseInfo.put("mobileNumber", "1100");
		return baseInfo;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "经理");
		officeInfo.put("officeTelNumber", "1200");
		return null;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeAddress", "北京");
		homeInfo.put("homeTelNumber", "1500");
		return null;
	}

}

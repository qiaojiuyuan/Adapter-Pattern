import java.util.Map;

/**
 * 劳动服务公司的人员信息接口
 * @author qiaojy
 *
 */
public interface IOuterUser {

	//基本信息，如名字、性别、手机号等
	public Map getUserBaseInfo();
	//工作区域
	public Map getUserOfficeInfo();
	//用户的家庭信息
	public Map getUserHomeInfo();
}

package week5;

public class NormalRole extends Role{

	public NormalRole(String role) {
		super("普通用户");
		
	}

	@Override
	public void login(String name) {
		System.out.println("欢迎普通用户 " + name + " 登录系统");
		
	}

}

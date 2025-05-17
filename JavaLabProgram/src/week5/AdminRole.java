package week5;

public class AdminRole extends Role{

	public AdminRole(String role) {
		super("admin");
	}
	
	@Override
	public void login(String name) {
		System.out.println("欢迎管理员" + name + "登录系统");
	}

}

package week3;

public class VertifyBy3 {
	String name;
	int psw;
	public void getInfo(String name, int psw) {
		this.name = name;
		this.psw = psw;
	}
	public boolean vertify3() {
		if("Tom".equals(name) && psw == 654321) 
		{
			System.out.println("成功登陆系统");
			return true;
		}
		else 
		{
			System.out.println("用户名或密码错误,请重新输入");
			return false;
		}
		
		
	}
}

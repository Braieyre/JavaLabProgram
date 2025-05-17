package week3;

public class Identification {
	String name;
	int psw;
	public void getInfo(String name, int psw) {
		this.name = name;
		this.psw = psw;
	}
	public void vertify() {
		if("Tom".equals(name) && psw == 654321) {
			System.out.println("成功登陆系统");
		}else {
			System.out.println("用户名或密码错误");
		}
	}
}

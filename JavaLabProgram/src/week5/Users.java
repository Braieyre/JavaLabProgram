package week5;

public class Users extends Role{
	String name;
	String password;
	String gender;
	int age;
	int phone;
	public Users(String name, String password, String gender, int age, int phone, String role){
		super(role);		
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}
	
	void printInfo() {
		System.out.println("用户名是" + name + " 年龄是" + age + " 性别是" + gender +
				" 密码是" + password + " 电话是" + phone);
	}
	public void login(String name) {
		System.out.println("欢迎普通用户" + name + "登陆系统");
	}
}
	

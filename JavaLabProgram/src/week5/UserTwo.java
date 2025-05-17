package week5;

public class UserTwo extends Role {
	String name;
	String password;
	String gender;
	int age;
	int phone;
	public UserTwo(String name, String password, String gender, int age, int phone, String role) {
		super(role);
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}
	

	void printInfo() {
		System.out.println("用户名是" + name + " 年龄是" + age + " 性别是" + gender +
				" 密码是" + password + " 电话是" + phone + " 角色名称是" + role);
	}
	public void login(String name) {
		System.out.println("欢迎admin" + name + "登陆系统");
	}
}	

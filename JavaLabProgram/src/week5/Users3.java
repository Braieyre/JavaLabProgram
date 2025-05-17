package week5;

public class Users3 {
	String name, password;
	Role role;
	public Users3(String name, String password, Role role) {
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public boolean check(String n, String p) {
		return name.equals(n)&&password.equals(p);
	}
	public void login() {
		role.login(name);
	}
}

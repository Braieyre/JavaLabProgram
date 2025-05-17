package week5;

import java.util.Scanner;

public class Test5_3 {
	public static void main(String[] args) {
		Users3 admin = new Users3("张三","1234567",new AdminRole("admin"));
		Users3 normal = new Users3("李四","123456",new NormalRole("普通用户"));
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名（回车）和密码");
		String name = sc.nextLine();
		String password = sc.nextLine();
		sc.close();
		if(admin.check(name, password)){
			admin.login();
		}else if(normal.check(name, password)){
			normal.login();
		}else {
			System.out.println("账户不存在或则用户或名密码错误");
		}
	}
}

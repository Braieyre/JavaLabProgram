package week5;

import java.util.Scanner;

public class Users5_2 {
	public static void main(String[] args) {
		System.out.println("请依次输入括用户名、密码、性别、年龄、电话、角色名称");
		Scanner sc = new Scanner(System.in);
		System.out.println("用户名：");
		String name = sc.nextLine();
		System.out.println("密码：");
		String password = sc.next();
		System.out.println("性别：");
		sc.nextLine();
		String gender = sc.next();
		System.out.println("年龄：");
		sc.nextLine();
		int age = sc.nextInt();
		System.out.println("手机号：");
		sc.nextLine();
		int phone = sc.nextInt();
		System.out.println("角色：");
		sc.nextLine();
		String role = sc.nextLine();
		sc.close();
		UserTwo ust = new UserTwo(name, password, gender, age, phone, role);
		ust.printInfo();
	}
}

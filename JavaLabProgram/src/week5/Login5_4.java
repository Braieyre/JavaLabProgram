package week5;

import java.util.Scanner;

public class Login5_4{
	public static void main(String args[]) {
		System.out.println("请依次输入括用户名、密码、性别、年龄、电话、角色、级别");
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
		System.out.println("角色名称：");
		sc.nextLine();
		String role = sc.next();
		System.out.println("级别：");
		sc.nextLine();
		String level = sc.next();
		sc.close();
		Users us = new Users(name, password, gender, age, phone, role);
		Level gold = new Gold();
		Level silver = new Silver();
		Level cupper = new Cupper();
		if (level.equals(gold.getLevel())) {
			System.out.print("欢迎" + gold.getLevel() + "用户" + name + "登陆到系统");
			gold.scores();
		}
		if (level.equals(silver.getLevel())) {
			System.out.print("欢迎" + silver.getLevel() + "用户" + name + "登陆到系统");
			silver.scores();
		}
		if (level.equals(cupper.getLevel())) {
			System.out.print("欢迎" + cupper.getLevel() + us.role +"用户" + name + "登陆到系统");
			cupper.scores();
		}
	}
}

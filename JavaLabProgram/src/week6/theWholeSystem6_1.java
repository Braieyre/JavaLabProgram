package week6;

import java.util.Scanner;
public class theWholeSystem6_1 {
	
	public static void main(String[] args) {
		System.out.println("请输入学生的姓名，if you will.");
		String stuName;
		Scanner sc = new Scanner(System.in);
		stuName = sc.next();
		TestPaper paper = new ArithmeticPaper();
		Student stu = new Student(stuName);
		Teacher tea = new Teacher();
		paper.accept(stu);
		paper.accept(tea);
	}

}

package week3;

import java.util.Scanner;

public class LeapYear3_1 {

	public static void main(String[] args) {
		int year;
		System.out.println("请输入年份");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		sc.close();
		IfLeapYear leap = new IfLeapYear();
		leap.getYear(year);
		leap.isLeap();
	}

}

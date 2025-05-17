package week4;

import java.util.Scanner;
public class SearchUser4_3 {
	public static void main(String[] args) {
		String name;
		int time;
		System.out.println("请输入用户名（回车），以及在线时长");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		time = sc.nextInt();
		TimeSort search = new TimeSort();
		search.printList(name,time);
		sc.close();
	}

}

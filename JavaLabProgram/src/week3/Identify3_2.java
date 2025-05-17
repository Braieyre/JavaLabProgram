package week3;
import java.util.Scanner;

public class Identify3_2 {

	public static void main(String[] args) {
		System.out.println("请输入用户名（回车）和密码");
		String name;
		int psw;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		psw = sc.nextInt();
		sc.close();
		Identification identity = new Identification();
		identity.getInfo(name, psw);
		identity.vertify();
	}

}

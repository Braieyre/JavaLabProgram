package week3;
import java.util.Scanner;
public class Days3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date;
		System.out.println("请输入您首次登陆的年月日(yyyy-mm-dd)");
		date = sc.nextInt();
		Days day = new Days();
		day.getDate(date);
		day.numLeap();
		int length = day.Length();
		System.out.println("本系统已经陪您度过了" + length + "天。");
		//day.test();
		sc.close();
	}

}

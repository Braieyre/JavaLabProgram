package week2;
import java.util.Scanner;

public class GetBirthday {
	String id;
	public void getID() {
		System.out.println("输入您的身份证号码");
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		sc.close();
	}
	public char[] getBirthdayFromID() {
		System.out.println("您的生日是：");
		char[] theID = id.toCharArray();
		for(int i=6; i < 10; i++) {
			System.out.print(theID[i]);
		}
		System.out.print("-");
		for(int i=10; i < 12; i++) {
			System.out.print(theID[i]);
		}
		System.out.print("-");
		for(int i=12; i < 14; i++) {
			System.out.print(theID[i]);
		}
		return theID;
		
	}
}
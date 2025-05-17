package week1;
import java.util.Scanner;

public class JRE {
	String s;
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
	}
	public void outputJRE() {
		System.out.println("JRE可以让计算机系统运行Java应用程序(JavaApplication)。"
				 +"JRE的内部有一个Java 虚拟机以及一些标准的类别函数库。");
	}
}

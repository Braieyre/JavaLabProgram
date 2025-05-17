package week2;
import java.util.Scanner;

public class ChangeR {
		double r1,r2;
		public void inputR() {
				System.out.println("请输入r1和r2的值");
				Scanner sc = new Scanner(System.in);
				r1 = sc.nextDouble();
				r2 = sc.nextDouble();
				sc.close();
		}
		public void changeR() {
			double a = 0;
			a = r1;
			r1 = r2;
			r2 = a;
		}
		public void outputR(){
			System.out.println("R1 = " + r1 + "   R2 = " + r2);
		}
	}

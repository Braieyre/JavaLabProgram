package week2;
import java.util.Scanner;

public class ComputCircle {
	double pai, r;
	public void input() {
		System.out.println("输入Π的值和半径的值");
		Scanner sc = new Scanner(System.in);
		pai = sc.nextDouble();
		r = sc.nextDouble();
		sc.close();
	}
	public void getArea() {
		double s = pai*r*r;
		System.out.println("游泳池底的面积是 " + s + " 平方米");
	}
}

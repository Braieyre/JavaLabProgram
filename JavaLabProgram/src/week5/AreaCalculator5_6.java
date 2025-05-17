package week5;

import java.util.Scanner;

public class AreaCalculator5_6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次按照提示输入数据");
		
		Triangle tri = new Triangle();
		System.out.println("三角形的底:");
		tri.setBottom(sc.nextDouble());
		System.out.println("三角形的高:");		
		tri.setHeight(sc.nextDouble());
		
		Rectangle rec = new Rectangle();
		System.out.println("矩形的长:");
		rec.setBottom(sc.nextDouble());
		System.out.println("矩形的宽:");
		rec.setHeight(sc.nextDouble());
		
		Ladder lad = new Ladder();
		System.out.println("梯形的上底:");
		lad.setUpper(sc.nextDouble());
		System.out.println("梯形的下底:");
		lad.setBottom(sc.nextDouble());
		System.out.println("梯形的高:");
		lad.setHeight(sc.nextDouble());
		
		Circle cir = new Circle();	
		System.out.println("圆形的半径:");
		cir.setRadius(sc.nextDouble());
		
		sc.close();
		
		System.out.println("——————————————————————————");
		System.out.println("三角形的面积：" + tri.getArea());
		System.out.println("矩形的面积：" + rec.getArea());
		System.out.println("梯形的面积：" + lad.getArea());
		System.out.println("圆形的面积：" + cir.getArea());
		System.out.println("——————————————————————————");
	}
}

package FrogStuff;

import java.util.Scanner;

public class Application
{
	public static void main(String[] args) 
	{
		System.out.println("欢迎来到青蛙跳小游戏");	//用户交互
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要挑战的局数，便于为您计算胜率");
		int times = sc.nextInt();		//用于传值给第二部分，决定进行几次游戏
		System.out.println("请分别输入青蛙距离目标的距离和最大的跳跃次数");
		int goal = sc.nextInt();
		int max = sc.nextInt();
		while (goal <= 0 || max <= 0) 
		{
			System.out.println("请输入正整数数值");
			goal = sc.nextInt();
			max = sc.nextInt();
		}

		FrogSimulation sim = new FrogSimulation(goal, max);		//创建对象开始游戏
		double rate = sim.runSimulations(times);		//调用run开始游戏，接受胜率
		System.out.println("胜率为：" + rate + "!");
		sc.close();
	}
}

package FrogStuff;

import java.util.Scanner;

public class FrogSimulation
{
											/** 从起始位置到目标的距离，以英寸为单位。*/
		private int goalDistance;		/** 允许达到目标的最大跳数。 */
		private int maxHops;
		private int hopDis;
												/*** FrogSimulation的构造方法，其中 dist 是从开始到目标的距离，
												 ***numHops 是允许到达目标的最大跳数.
												 *** dist > 0; numHops > 0  */
		public FrogSimulation(int dist, int numHops)
		{
				goalDistance = dist;
				maxHops = numHops;
		}
					/***返回一个整数，表示青蛙跳跃时要移动的距离.*/
		private int hopDistance()
		{
			System.out.println("青蛙跳了" + hopDis + "英寸~");
			System.out.println();
			return hopDis;
		}//despite hopDis worked, I will still use hopDistance(), to make sure OOP
						/***模拟一只青蛙试图达到（1）部分所述的目标.
						 			*如果青蛙在模拟过程中成功到达或通过目标，则返回 true，否则返回false; */
		public boolean simulate()
		{
			int rest = goalDistance;		//傀儡量，不伤害原值
			Scanner sc = new Scanner(System.in);
			int count = 0;		//记录消极地带最后一次挣扎
			for(int i = 1; i <= maxHops; i++)
			{
				System.out.println("请输入第"+ i +"次青蛙跳的距离~");
				hopDis = sc.nextInt();
				rest -= hopDistance();		//体现出oop的编程思想
				if(rest <= 0 ) 
				{
					return true;
				}
				if(rest > goalDistance) 
				{
					if(count == 1)
					{
						return false;
					}
					count++;
					System.out.println("青蛙已经进入消极地带，Last chance~");
				}
			}
			return false;
		}
					/***运行 num 模拟并返回青蛙在其中的模拟比例成功达到或通过目标.
					 	*** num > 0 */
		public double runSimulations(int num)
		{
			int win = 0;
			for (int i = 1; i <= num; i++) 
			{
				System.out.println("——————————————————————————");
				System.out.println("第" + i + "局~");  //界面交互提示
				boolean result = simulate();
				if (result)
				{
					System.out.println(result + ", You win!!!");
					System.out.println();
					win++;
				} else 
				{
					System.out.println(result + ", You lose!!!");
					System.out.println();
				}
			}
			return (double)win/num;
		}
}
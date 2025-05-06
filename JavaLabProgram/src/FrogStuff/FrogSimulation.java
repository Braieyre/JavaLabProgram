package FrogStuff;

public class FrogSimulation
{
											/** 从起始位置到目标的距离，以英寸为单位。*/
		private int goalDistance;		/** 允许达到目标的最大跳数。 */
		private int maxHops;
		int hopDis
		int hopTimes = 0;
												/*** FrogSimulation的构造方法，其中 dist 是从开始到目标的距离，
												 ***numHops 是允许到达目标的最大跳数.
												 *** dist > 0; numHops > 0  */
		public FrogSimulation(int dist, int numHops)
		{
				goalDistance = dist;
				maxHops = numHops;
		}
		public void getDistance(int hopDis)
		{
			this.hopDis = hopDis;
		}
					/***返回一个整数，表示青蛙跳跃时要移动的距离.*/
		private int hopDistance()
		{
			return hopDis;
		}
						/***模拟一只青蛙试图达到（1）部分所述的目标.
						 			*如果青蛙在模拟过程中成功到达或通过目标，则返回 true，否则返回false; */
		public boolean simulate()
		{
			
		}
					/***运行 num 模拟并返回青蛙在其中的模拟比例成功达到或通过目标.
					 	*** num > 0 */
		public double runSimulations(int num)
		{
					/* 将在(2)部分实现 */
		}
}
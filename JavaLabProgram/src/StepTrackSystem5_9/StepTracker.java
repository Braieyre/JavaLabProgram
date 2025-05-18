package StepTrackSystem5_9;

public class StepTracker {
	int minSteps;	  	//规定最小活跃步数
	int active = 0;		//初始活跃天数
	int sumSteps = 0;	//初始总步数
	int countDays = 0;	//初始每天的计数器，便于求平均
	public StepTracker(int minSteps) {
		this.minSteps = minSteps;
	}		//setter
	public void addDailySteps(int steps) {
		if(steps >= minSteps) {
			active++;
			System.out.println("增加一天活跃");
		}
		sumSteps += steps;		//虽活跃天数+1，并趁机计入总步数和总天数
		countDays++;
		System.out.println("总活跃日为：" + active);
		System.out.println("总步数为：" + sumSteps);		//信息报备
	}
	public int activeDays() {
		return active;
	}		//getter
	
	public double averageSteps() {
		double average = (double)sumSteps/countDays;
		System.out.println("截至目前，日平均步数为：" + average);
		return average;
	}
}

package StepTrackSystem5_9;

public class StepTracker {
	int minSteps;
	int active = 0;
	int sumSteps = 0;
	int countDays = 0;
	public StepTracker(int minSteps) {
		this.minSteps = minSteps;
	}
	public void addDailySteps(int steps) {
		if(steps >= minSteps) {
			active++;
			System.out.println("增加一天活跃");
		}
		sumSteps += steps;
		countDays++;
		System.out.println("总活跃日为：" + active);
		System.out.println("总步数为：" + sumSteps);
	}
	public int activeDays() {
		return active;
	}
	public double averageSteps() {
		double average = (double)sumSteps/countDays;
		System.out.println("截至目前，日平均步数为：" + average);
		return average;
	}
}

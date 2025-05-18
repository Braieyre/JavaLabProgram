package StepTrackSystem5_9;

public class User {

	public static void main(String[] args) {
		//依照题目进行传值
		StepTracker tr =new StepTracker(10000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(13000);
		tr.activeDays();
		tr.averageSteps();
		tr.addDailySteps(23000);
		tr.addDailySteps(1111);
		tr.activeDays();
		tr.averageSteps();

	}

}

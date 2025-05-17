package week5;

public class Cupper extends Level {
	String level = "铜牌";
	void scores() {
		System.out.println("本次积分1分");
	}
	@Override
	String getLevel() {
		return level;
	}
	
}

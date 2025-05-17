package week5;

public class Gold extends Level{
	String level = "金牌";

	void scores() {
		System.out.println("本次积分5分");
	}

	@Override
	String getLevel() {		
		return level;
	}
}

package week5;

public class Silver extends Level {
	String level = "银牌";
	void scores() {
		System.out.println("本次积分3分");		
	}
	@Override
	String getLevel() {
		return level;
	}

}

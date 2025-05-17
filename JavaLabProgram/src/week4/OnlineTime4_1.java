package week4;

public class OnlineTime4_1 {
	public static void main(String[] args) {
		int maxTime;
		String userName;
		OnlineTime day = new OnlineTime();
		maxTime = day.theLongerst();
		userName = day.theUser();
		System.out.println("在线时长最长的是： " + userName + "，共在线： " + maxTime + " 秒");
		
	}
}

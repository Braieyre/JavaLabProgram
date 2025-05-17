package week4;

public class OnlineTime {
	String userName[] = {"Tom", "Xiaoming", "Xiaogang", "admin", "Jeson", "LIli", "Rudy", "Mike"};
	int[] onlineTime = {50, 60, 65, 80, 92, 95, 150, 90};
	int max = onlineTime[0];
	int maxIndex = 0;
	public int theLongerst() {
		for(int i= 0; i < onlineTime.length; i++) {
			if(max < onlineTime[i]) {
				max = onlineTime[i];
				maxIndex = i;
			}
		}
		return max;
	}
	public String theUser() {
		return userName[maxIndex];
	}
}

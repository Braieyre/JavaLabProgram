package week4;

public class TimeSort {
	String userName[] = {"Tom", "Xiaoming", "Xiaogang", "admin", "Jeson", "LIli", "Rudy", "Mike"};
	int[] onlineTime = {50, 60, 65, 80, 92, 95, 150, 90};
	int n = onlineTime.length;		
	//我其实想直接sort，但是现在已有的知识还不足以让两个数组同步更新
	//所以只能采用底层冒泡排序法，然后顺带让名字交换;
	public void nameList() {
	for(int i=0; i<n-1; i++) {
		for(int j=0; j< n-1-i; j++) {
			if(onlineTime[j] < onlineTime[j+1]) {
				int temp = onlineTime[j];
				onlineTime[j] = onlineTime[j+1];
				onlineTime[j+1] = temp;
				String tempName = userName[j];
				userName[j] = userName[j+1];
				userName[j+1] = tempName;
				
			}
		}
	}
	}
	public void printList() {
		for(int i=0; i < n; i++) {
			System.out.println("用户名： " + userName[i] + "在线时长： " + onlineTime[i] + " 秒");
		}
	}
	public void printList(String name, int time) {
		boolean ifThere = false;
		for(int i = 0; i < n; i++) {
			if(name.equals(userName[i]) && time == onlineTime[i]) {
				ifThere = true;
			}
		}
		if(ifThere) {
			System.out.println("用户名： " + name + "在线时长： " + time + " 秒");
		}
		else
			System.out.println("用户名不存在，或时长不存在，或用户名与时长不符");
		
	}
}

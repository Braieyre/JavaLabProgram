package week4;

import java.util.Scanner;

public class ShowingUps {
	int[] times;
	int n = 0;

	void setArray() {
		System.out.println("请输入一个数组（在线时长/分钟），输入-1终止，将判断出现次数大于n/2的元素");
		Scanner sc = new Scanner(System.in);
		times = new int[100]; // 没学动态数组，先设一个超大容量的代之吧~
		while (true) {
			times[n] = sc.nextInt();
			if (times[n] == -1) {
				break;
			}
			n++; // 放这里，方便判断-1的输入。
		}
		sc.close();
	}

	public int showingCases() {
		int target = -1;				//关键元素
		int factor;				//比较值
		int count = 0;
		for (int j = 0; j <= n / 2 + 1; j++) { // 内外两层循环
			factor = times[j]; // 关键比较值逐步推进
			if (count > n/2) {
				target = times[j-1];
				break;
			}
			count = 0; // 刷新值，这个真的很常见逻辑漏洞
			for (int i = j; i <= n; i++) {
				if (times[i] == factor) {
					count++;
				}
			}
		}
		if (target == -1) {
			return -1;
		}
		return target;
	}
}

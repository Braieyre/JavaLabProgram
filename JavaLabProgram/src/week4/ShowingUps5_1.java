package week4;

public class ShowingUps5_1 {
	public static void main(String[] args) {
		ShowingUps sup = new ShowingUps();
		int result;
		sup.setArray();
		result = sup.showingCases();
		if (result == -1) {
			System.out.println("不存在");
		} else {
			System.out.println("出现次数大于n/2的元素：");
			System.out.println(result);
		}
	}
}


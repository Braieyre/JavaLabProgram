package week3;

public class IfLeapYear {
	int year;
	public void getYear(int year){
		this.year = year;
	}
	public void isLeap() {
		if(year%4 == 0 && year%100 !=0 || year%400 == 0) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
	}
}

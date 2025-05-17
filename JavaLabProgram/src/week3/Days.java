package week3;

public class Days {
	boolean ifLeap;
	int date;
	int leaps = 0;
	int years;
	int months;
	int days;
	
	
	void getDate(int date) {
		this.date = date;
		years = date/1000;
		years = years/10;
		months = date%1000/100;
		days = date%10000;
		days = days%100;
	}
	/*void test() {
		System.out.println(days);
		System.out.println(months);
		System.out.println(years);
		System.out.println(leaps);
	//20050925
	}*/
	void numLeap() {
		int tempYear = years;
		while(tempYear++ < 2025) {
			if(tempYear%4 == 0 && tempYear%100 !=0 || tempYear%400 == 0) {
				leaps++;
			}
		}
	}
	int Length() {
		int sumOne = 0, sumTwo = 0;
		int length = 0;
		int[] monthlyDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<months-1; i++) {
			sumOne += monthlyDays[i];
		}
		for(int i=0; i<3-1; i++) {
			sumTwo += monthlyDays[i];
		}
		//已知sumTwo对应的绝对天数为2025年3月1日
		sumOne = sumOne + years*365 + days;
		sumTwo = sumTwo + 2025*365 + 1;
		length = sumTwo - sumOne + leaps;
		return length;
	}
}

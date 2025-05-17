package week2;

public class ChargeFees {
	int year;
	public void BirthYear() {
		GetBirthday ID = new GetBirthday();
		ID.getID();
		char[] birth =ID.getBirthdayFromID();
		for(int i=6; i < 10; i++) {
			year = year*10 + (birth[i] - '0');
		}
		System.out.println("");
	}
	public void ifAdult() {
		int age = 2025 - year;
		if(age >= 18) {
			System.out.println("成年人，收费50元");
		}else{
			System.out.println("未成年人，收费10元");
		}
	}
	
}

package week3;

public class Scores {
	int[]data  = {50, 60, 65, 80, 90, 95, 150, 90};
	int id;
	void  getID(int a) {
		id = a;
	}
	int outPutScores(){
		switch(data[id]/10) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return 3;
		case 6:
			return 5;
		case 7:
		case 8:
			return 8;
		case 9:
			return 9;
		default:
			return 0;
		}
	}
}

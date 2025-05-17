package Equation5_7;

public class Test {
	public static void main(String args[]) {
		APLine line1 = new APLine(5, 4, -17);
		double slope1 = line1.getSlope(); // slope1 是 -1.25
		System.out.println(" slope1 是 :" + slope1);
		boolean onLine1 = line1.onLine(5, -2); // true ，因为 5(5) + 4(-2) + (-17) = 0
		if (onLine1) {
			System.out.println("yes, because  5(5) + 4(-2) + (-17) = 0");
		} else {
			System.out.println("no , because  5(5) + 4(-2) + (-17) ≠ 0");
		}
		APLine line2 = new APLine(-25, 40, 30);
		double slope2 = line2.getSlope(); // slope2 是 0.625
		System.out.println(" slope2 是 :" + slope2);
		boolean onLine2 = line2.onLine(5, -2); // false ，因为 -25(5) + 40(-2) + 30 ≠ 0
		if (onLine2) {
			System.out.println("yes, because  -25(5) + 40(-2) + 30 = 0");
		} else {
			System.out.println("no , because  -25(5) + 40(-2) + 30 ≠ 0");
		}
	}
}

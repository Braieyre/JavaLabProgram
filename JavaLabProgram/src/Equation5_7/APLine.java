package Equation5_7;

public class APLine {
	int a,b,c;
	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSlope() {
		return (double)-a/b;
	}

	public boolean onLine(int x, int y) {
		if(a*x + b*y + c == 0)
			return true;
		else
			return false;
	}
}

package week5;

public class Circle extends Geometry {
	double radius;
	double pai = 3.14;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return pai * radius * radius;
	}
}

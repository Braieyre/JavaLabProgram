package week5;

public class Rectangle extends Geometry {
	double bottom, height;

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return bottom * height;
	}
}

package week5;

public class Triangle extends Geometry {
	double bottom, height;

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return bottom * height / 2;
	}

}

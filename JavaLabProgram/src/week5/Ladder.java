package week5;

public class Ladder extends Geometry{
	double bottom, upper, height;

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public void setUpper(double upper) {
		this.upper = upper;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return (bottom + upper) * height / 2;
	}

}

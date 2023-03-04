package data;

public class Vektor {
	double x, y;

	public Vektor(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getMagnitude() {
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}

	public Vektor add(Vektor v) {
		this.x += v.x;
		this.y += v.y;
		return this;
	}

	public Vektor scale(double magnitude) {
		this.x *= magnitude;
		this.y *= magnitude;
		return this;
	}

	public double getDistanceTo(Vektor v) {
		return this.copy().subtract(v).getMagnitude();
	}
	
	public Vektor negate() {
		this.x = -this.x;
		this.y = -this.y;
		return this;
	}
	
	public Vektor subtract(Vektor v) {
		return this.add(v.copy().negate());
	}
	
	public Vektor copy() {
		return new Vektor(this.x, this.y);
	}
}

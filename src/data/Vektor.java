package data;

public class Vektor {
	public double x, y;

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

	public Vektor setMagnitude(double magnitude) {
		return this.normalize().scale(magnitude);
	}

	public Vektor setDirection(double direction) {
		double magnitude = this.getMagnitude();
		this.x = magnitude * Math.cos(direction);
		this.y = magnitude * Math.sin(direction);
		return this;
	}

	public double getDirection() {
		return Math.atan2(this.y, this.x);
	}

	public Vektor addScaled(Vektor v, double magnitude) {
		return this.add(v.copy().scale(magnitude));
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

	public Vektor normalize() {
		return this.scale(1/this.getMagnitude());
	}

	public double dotProduct(Vektor v) {
		return this.x * v.x + this.y * v.y;
	}

	// get the angle between two vectors
	public double getAngleBetween(Vektor v) {
		return Math.acos(this.dotProduct(v) / (this.getMagnitude() * v.getMagnitude()));
	}

	// getters and setters
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public int getIntX() {
		return (int) this.x;
	}

	public int getIntY() {
		return (int) this.y;
	}

	public boolean boundedBy(Vektor topLeft, Vektor bottomRight) {
		return this.x >= topLeft.x && this.x <= bottomRight.x && this.y >= topLeft.y && this.y <= bottomRight.y;
	}

	public boolean boundedBy(Vektor bottomRight) {
		return this.boundedBy(new Vektor(0, 0), bottomRight);
	}

	public void print() {
		System.out.println("x: " + this.x + " y: " + this.y);
	}

	public Vektor crossProduct(Vektor v) {
		this.x = this.y * v.x;
		this.y = this.x * v.y;
		return this;
	}

	public Vektor getCrossProduct(Vektor v) {
		return this.copy().crossProduct(v);
	}

	public Vektor polarize() {
		return new Vektor(this.getMagnitude(), this.getDirection());
	}
}

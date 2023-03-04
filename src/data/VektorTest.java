package data;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class VektorTest {

	@Test
	public void testMagnitude() {
		Vektor five = new Vektor(3, 4);
		Vektor thirteen = new Vektor(5, 12);
		Vektor notThirteen = new Vektor(6, 12);
		assertTrue(5.0 == five.getMagnitude());
		assertTrue(13.0 == thirteen.getMagnitude());
		assertFalse(13 == notThirteen.getMagnitude());
	}

	@Test
	public void testAdd() {
		Vektor sum = new Vektor(0, 0);
		Vektor one = new Vektor(3, 0);
		Vektor two = new Vektor(0, 4);
		sum.add(one);
		sum.add(two);
		assertTrue(one.x == sum.x);
		assertTrue(two.y == sum.y);
	}

	@Test
	public void testScale() {
		Vektor unit = new Vektor(3, 4);
		unit.scale(5);
		assertTrue(unit.x == 15);
		assertTrue(unit.y == 20);
	}

	@Test
	public void testSubtract() {
		Vektor one = new Vektor(1, 1);
		Vektor three = new Vektor(3, 3);
		one.subtract(three);
		assertTrue(one.x == -2);
		assertTrue(one.y == -2);
		assertTrue(three.x == 3);
		assertTrue(three.y == 3);
	}

	@Test
	public void testGetDistanceTo() {
		Vektor three = new Vektor(3, 0);
		Vektor four = new Vektor(0, 4);
		assertTrue(5.0 == three.getDistanceTo(four));
		assertTrue(5.0 == four.getDistanceTo(three));
		assertTrue(0.0 == three.getDistanceTo(three));
	}

}

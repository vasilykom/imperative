package imperative;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static imperative.perfectNumber.STATE.ABUNDANT;
import static imperative.perfectNumber.STATE.DEFICIENT;
import static imperative.perfectNumber.STATE.PERFECT;

import org.junit.Test;

public class perfectNumberTest {

	@Test
	public void test6Perfect() {
		assertEquals(PERFECT, perfectNumber.process(6));
	}

	@Test
	public void test8Deficient() {
		assertEquals(DEFICIENT, perfectNumber.process(8));
	}

	@Test
	public void test20Abundant() {
		assertEquals(ABUNDANT, perfectNumber.process(20));
	}

	@Test
	public void test16DeficientWithIntSqrt() {
		assertEquals(DEFICIENT, perfectNumber.process(16));
	}

	@Test
	public void test1Deficient() {
		assertEquals(DEFICIENT, perfectNumber.process(1));
	}

	@Test
	public void testDivisors1() {
		Object[] expected = new Integer[] { 1 };
		int n = 1;
		assertArrayEquals(expected, perfectNumber.divisors(n).toArray());
	}

	@Test
	public void testDivisors6() {
		Object[] expected = new Integer[] { 1, 2, 3, 6 };
		int n = 6;
		assertArrayEquals(expected, perfectNumber.divisors(n).toArray());
	}

	@Test
	public void testDivisors8() {
		Object[] expected = new Integer[] { 1, 2, 4, 8 };
		int n = 8;
		assertArrayEquals(expected, perfectNumber.divisors(n).toArray());
	}


	
	
}

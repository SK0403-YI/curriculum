package test03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest{
	
	@Test
	void tasizanTestB() {
		Calc calc = new Calc();
		int actual = calc.tasizan(3, 5);
		int expect = 15;
		assertEquals(expect, actual);
	}
}
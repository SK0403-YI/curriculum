package test01;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		Calc c = new Calc();
		c.tasizan(3, 5);
	}
	
	@Test
	void testB() {
		Calc c = new Calc();
		c.hikizan(3,5);
	}
	
	@Test
	void testC() {
		Calc c = new Calc();
		c.kakezan(3, 5);
	}
	
	@Test
	void testD() {
		Calc c = new Calc();
		c.warizan(3,5);
	}

}

package test02;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void testA() {
		Calc c = new Calc();
		c.tasizan(3,5);
	}
	
	@Test
	void testB() {
		Calc c = new Calc();
		c.hikizan(3,5);
	}
	
	@Test
	void testC() {
		Calc c = new Calc();
		c.kakezan(3,5);
	}
	
	@Test
	void testD() {
		Calc c = new Calc();
		c.warizan(3,1);
	}
	
	@Test
	void testE() {
		Calc c = new Calc();
		c.warizan(0,0);
	}
	
	@Test
	void testF() {
		Calc c = new Calc();
		c.warizanB(0,0);
	}

}

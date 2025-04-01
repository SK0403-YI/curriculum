package test07;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class SampleTest {

	// 単純な疎通確認をしたい場合
	@Test
	void testA() {
		try {
			Sample s = new Sample();
			s.additionA();
		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testB() {
		int expect = 0;
		int actual = 0;
		try {
			Sample s = new Sample();
			actual = s.additionB();
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals(expect, actual);
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testC() {
		try {
			Sample s = new Sample();
			Method method = s.getClass().getDeclaredMethod("additionC");
			method.setAccessible(true);
			method.invoke(s);
		} catch (InvocationTargetException e) {
			assertEquals(new ArrayIndexOutOfBoundsException().getClass(), e.getTargetException().getClass());
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testD() {
		int actual = 0;
		try {
			Sample s = new Sample();
			Method method = s.getClass().getDeclaredMethod("additionD");
			method.setAccessible(true);
			actual = (int) method.invoke(s);
		} catch (InvocationTargetException e) {
			assertEquals(new ArrayIndexOutOfBoundsException().getClass(), e.getTargetException().getClass());
			assertEquals(0, actual);
		} catch (Exception e) {
			fail();
		}
	}

}
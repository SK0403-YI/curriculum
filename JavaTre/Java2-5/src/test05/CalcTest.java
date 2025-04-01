package test05;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	@Test
	void additionA() {
		// 期待値準備
				int expect = 3 + 5;

				// 実際値準備
				SuperCalc calc = new SuperCalc();
				try {

					// メソッドにint.classやString.classで引数の型を指定する
					Method method = calc.getClass().getDeclaredMethod("addition", int.class, int.class);

					// 外部からのアクセスを許可する。
					method.setAccessible(true);

					// 実行 クラス型、引数
					int actual = (int) method.invoke(calc, 3, 5);

					// 実行結果確認
					assertEquals(expect, actual);
				} catch (Exception e) {
					fail();
				}
	}
}
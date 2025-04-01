package test04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SampleTest{

	@Test
	void testA() {
		// 期待値準備
		Human h1 = new Human();

		// 実際値準備

		// 実行
		Human h2 = new Human();

		// 実行結果確認
		assertEquals(h1, h2);
	}

	@Test
	void testB() {
		// 期待値準備
		Human h1 = new Human();
		// 実際値準備

		// 実行
		Human h2 = new Human();
		// 実行結果確認
		assertEquals(h1.getName(), h2.getName());
		assertEquals(h1.getHp(), h2.getHp());
		assertEquals(h1.getMp(), h2.getMp());
	}

	@Test
	void testC() {
		// 期待値準備
		Human h1 = new Human();

		// 実際値準備

		// 実行
		HumanInterface h2 = new Human();

		// 実行結果確認
		assertEquals(h1.getClass(), h2.getClass());
	}

	@Test
	void testD() {
		// 期待値準備
		Human h1 = new Human();
		// 実際値準備

		// 実行
		Human h2 = new Human("田中", 100000, 5000);
		// 実行結果確認
		assertNotEquals(h1.getName(), h2.getName());
		assertNotEquals(h1.getHp(), h2.getHp());
		assertNotEquals(h1.getMp(), h2.getMp());
	}

	@Test
	void testE() {
		// 期待値準備
		int[] savedata = new int[4];
		savedata[0] = 12468912;
		savedata[1] = 12246;
		savedata[2] = 9744311;
		savedata[3] = 346714689;

		// 実際値準備
		Human h1 = new Human();
		// 実行
		h1.save();

		// 実行結果確認
		assertEquals(savedata, h1.getSavedata());
	}

	@Test
	void testF() {
		// 期待値準備
		int[] savedata = new int[4];
		savedata[0] = 12468912;
		savedata[1] = 12246;
		savedata[2] = 9744311;
		savedata[3] = 346714689;

		// 実際値準備
		Human h1 = new Human();
		// 実行
		h1.save();

		// 実行結果確認
		assertArrayEquals(savedata, h1.getSavedata());
	}

	@Test
	void testG() {
		// 期待値準備
		List<String> list = new ArrayList<String>();
		list.add("きのこ");
		list.add("雑草");
		list.add("石ころ");

		// 実際値準備
		Human h1 = new Human();

		// 実行
		h1.haveItem();

		// 実行結果確認
		assertEquals(list, h1.getList());
		
		assertEquals(list.get(0), h1.getList().get(0));
		assertEquals(list.get(1), h1.getList().get(1));
		assertEquals(list.get(2), h1.getList().get(2));
	}

	@Test
	void testH() {

		// 期待値準備
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ひのきの棒", 5);
		map.put("お土産の木刀", 6);
		map.put("ハンドスピナー", 2);
		map.put("水鉄砲", 1);
		int[] data = { 5, 6, 2, 1 };

		// 実際値準備
		Human h1 = new Human();

		// 実行
		h1.weapon();

		// 実行結果確認
		assertEquals(map, h1.getWeapon());

		// 順序確認
		int i = 0;
		for (String key : h1.getWeapon().keySet()) {
			assertEquals(data[i], h1.getWeapon().get(key));
			i++;
		}
	}

	@Test
	void testI() {

		// 期待値準備
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ひのきの棒", 5);
		map.put("お土産の木刀", 6);
		map.put("ハンドスピナー", 2);
		map.put("水鉄砲", 1);

		// 実際値準備
		Human h1 = new Human();

		// 実行
		h1.weapon();

		// 実行結果確認
		assertEquals(map, h1.getWeapon());

		// 順序確認
		for (String key : h1.getWeapon().keySet()) {
			assertEquals(map.get(key), h1.getWeapon().get(key));
		}
	}

	@Test
	void testJ() {

		// 期待値準備
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("木の盾", 5);
		map.put("あああああ", 6);
		map.put("お鍋のふた", 2);
		map.put("画用紙", 1);

		int[] data = { 5, 6, 2, 1 };

		// 実際値準備
		Human h1 = new Human();

		// 実行
		h1.haveGuard();

		// 実行結果確認
		assertEquals(map, h1.getGuard());

		// 順序確認
		int i = 0;
		for (String key : h1.getGuard().keySet()) {
			assertEquals(data[i], h1.getGuard().get(key));
			i++;
		}
	}

	@Test
	void testK() {
		assertTrue(true);
	}

	@Test
	void testL() {
		assertFalse(false);
	}

	@Test
	void testM() {
		assertNull(null);
	}

	@Test
	void testN() {
		assertNotNull(null);
	}

}
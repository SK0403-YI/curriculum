package test03.in;

import test03.on.Onner;
import test03.on.OnnerSub;
import test03.under.Underer;
import test03.under.UndererSub;

public class InnerSub {
	public String in_innerSub_public;
	protected String in_innerSub_protected;
	String in_innerSub_default;
	private String in_innerSub_private;
	
	public void test(){
		/*
		 * ①自分のクラス内の変数を使用できるか確認
		 */

		in_innerSub_public = "test";
		in_innerSub_protected = "test";
		in_innerSub_default = "test";
		in_innerSub_private = "test";
		
		//警告文回避用
		System.out.println(in_innerSub_private);
		
		/*
		 * ②同じパッケージ直下のInnerクラスの変数を使えるのか
		 */
		Inner inner = new Inner();
		inner.in_inner_public = "test";
		inner.in_inner_protected = "test";
		inner.in_inner_default = "test";
		//privateはクラス内でしか使えないため、エラー
		inner.in_inner_private = "test";
		
		/*
		 * ③別パッケージのOnnerクラス、OnnerSubの変数を使えるのか
		 */
		Onner onner = new Onner();
		onner.on_onner_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		onner.on_onner_protected = "test";
		
		//デフォルトで使えるのは同じパッケージのみのため、エラー
		onner.on_onner_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		onner.on_onner_private = "test";
		
		OnnerSub onnersub = new OnnerSub();
		onnersub.on_onnerSub_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		onnersub.on_onnerSub_protected = "test";
		
		//デフォルトで使えるのは同じパッケージ内のため、エラー
		onnersub.on_onnerSub_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		onnersub.on_onnerSub_private = "test";
		
		/*
		 * ③別パッケージのUndererクラス、UndererSubの変数を使えるのか
		 */
		Underer underer = new Underer();
		underer.under_underer_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		underer.under_underer_protected = "test";
		
		//デフォルトで使えるのは同じパッケージのみのため、エラー
		underer.under_underer_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		underer.under_underer_private = "test";
		
		UndererSub undererSub = new UndererSub();
		undererSub.under_undererSub_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		undererSub.under_undererSub_protected = "test";
		
		//デフォルトで使えるのは同じパッケージ内のため、エラー
		undererSub.under_undererSub_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		undererSub.under_undererSub_private = "test";
		
	}
}
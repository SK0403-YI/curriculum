package test03.on;

import test03.in.Inner;
import test03.in.InnerSub;
import test03.under.Underer;
import test03.under.UndererSub;

public class onner {
	public String on_onner_public;
	protected String on_onner_protected;
	String on_onner_default;
	private String on_onner_private;
	
	public void test() {
		/*
		 * ①自分のクラス内の変数を使用できるか確認
		 */
		on_onner_public = "test";
		on_onner_protected = "test";
		on_onner_default = "test";
		on_onner_private = "test";

		// 警告文回避用
		System.out.println(on_onner_private);

		/*
		 * ②同じパッケージ直下のOnnerSubクラスの変数を使えるのか
		 */
		OnnerSub onnersub = new OnnerSub();
		onnersub.on_onnerSub_public = "test";
		onnersub.on_onnerSub_protected = "test";
		onnersub.on_onnerSub_default = "test";
		// privateはクラス内でしか使えないため、エラー
		onnersub.on_onnerSub_private = "test";
		
		/*
		 * ③別パッケージのInnerクラス、InnerSubの変数を使えるのか
		 */
		Inner inner = new Inner();
		inner.in_inner_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		inner.in_inner_protected = "test";
		
		//デフォルトで使えるのは同じパッケージのみのため、エラー
		inner.in_inner_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		inner.in_inner_private = "test";
		
		InnerSub innerSub = new InnerSub();
		innerSub.in_innerSub_public = "test";
		
		//protctedは同じパッケージ内でないため、エラー
		innerSub.in_innerSub_protected = "test";
		
		//デフォルトで使えるのは同じパッケージ内のため、エラー
		innerSub.in_innerSub_default = "test";
		
		// privateはクラス内でしか使えないため、エラー
		innerSub.in_innerSub_private = "test";
		
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

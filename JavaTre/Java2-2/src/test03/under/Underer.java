package test03.under;

import test03.in.Inner;
import test03.in.InnerSub;
import test03.on.Onner;
import test03.on.OnnerSub;

public class Underer {
	public String under_underer_public;
	protected String under_underer_protected;
	String under_underer_default;
	private String under_underer_private;

	public void test() {
		/*
		 * ①自分のクラス内の変数を使用できるか確認
		 */
		under_underer_public = "test";
		under_underer_protected = "test";
		under_underer_default = "test";
		under_underer_private = "test";

		// 警告文回避用
		System.out.println(under_underer_private);

		/*
		 * ②同じパッケージ直下のUndererSubクラスの変数を使えるのか
		 */
		UndererSub undererSub = new UndererSub();
		undererSub.under_undererSub_public = "test";
		undererSub.under_undererSub_protected = "test";
		undererSub.under_undererSub_default = "test";
		// privateはクラス内でしか使えないため、エラー
		undererSub.under_undererSub_private = "test";

		/*
		 * ③別パッケージのInnerクラス、InnerSubの変数を使えるのか
		 */
		Inner inner = new Inner();
		inner.in_inner_public = "test";

		// protctedは同じパッケージ内でないため、エラー
		inner.in_inner_protected = "test";

		// デフォルトで使えるのは同じパッケージのみのため、エラー
		inner.in_inner_default = "test";

		// privateはクラス内でしか使えないため、エラー
		inner.in_inner_private = "test";

		InnerSub innersub = new InnerSub();
		innersub.in_innerSub_public = "test";

		// protctedは同じパッケージ内でないため、エラー
		innersub.in_innerSub_protected = "test";

		// デフォルトで使えるのは同じパッケージ内のため、エラー
		innersub.in_innerSub_default = "test";

		// privateはクラス内でしか使えないため、エラー
		innersub.in_innerSub_private = "test";

		/*
		 * ③別パッケージのOnnerクラス、OnnerSubの変数を使えるのか
		 */
		Onner onner = new Onner();
		onner.on_onner_public = "test";

		// protctedは同じパッケージ内でないため、エラー
		onner.on_onner_protected = "test";

		// デフォルトで使えるのは同じパッケージのみのため、エラー
		onner.on_onner_default = "test";

		// privateはクラス内でしか使えないため、エラー
		onner.on_onner_private = "test";

		OnnerSub onnersub = new OnnerSub();
		onnersub.on_onnerSub_public = "test";

		// protctedは同じパッケージ内でないため、エラー
		onnersub.on_onnerSub_protected = "test";

		// デフォルトで使えるのは同じパッケージ内のため、エラー
		onnersub.on_onnerSub_default = "test";

		// privateはクラス内でしか使えないため、エラー
		onnersub.on_onnerSub_private = "test";

	}
}

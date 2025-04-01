package test03;

import test03.in.inner;
import test03.in.innerSub;

public class High extends inner {
	
	public String high_public;
	protected String high_protected;
	String high_default;
	private String high_private;
	
	public void test() {
		
		System.out.println(high_private);
		
		/*
		 * ④1つ上のパッケージから各パッケージ内のクラスに対して変数を使えるのか
		 */
		innerSub innerSub = new innerSub();
		innerSub.in_innerSub_public = "test";

		//protctedは同じパッケージ内でないため、エラー
		innerSub.in_innerSub_protected = "test";

		//デフォルトで使えるのは同じパッケージのみのため、エラー
		innerSub.in_innerSub_default = "test";

		//privateはクラス内でしか使えないため、エラー
		innerSub.in_innerSub_private = "test";
		
		/*
		 * ⑤継承したクラスに対して変数を使えるのか
		 */
		High innerhigh = new High();
		innerhigh.in_inner_public = "test";
		//[extends Inner]で継承しているので、パッケージ外でもエラーにならない
		innerhigh.in_inner_protected = "test";
		//デフォルトで使えるのは同じパッケージのみのため、エラー
		innerhigh.in_inner_default = "test";
		//privateはクラス内でしか使えないため、エラー
		innerhigh.in_inner_private = "test";
	}
	

}

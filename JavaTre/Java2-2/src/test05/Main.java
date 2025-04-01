package test05;

public class Main {
public static void main(String[] args) {
		
		//コンストラクタを実行
		System.out.println("コンストラクタを実行1");
		Book b1 = new Book();
	
		System.out.println("    本の名前は:"+b1.getName());
		System.out.println("        料金は:"+b1.getTax());
		System.out.println("本のローマ字は:"+b1.getRomaName());
		System.out.println();
		
		//オーバーロードしたコンストラクタを実行してみる
		System.out.println("コンストラクタを実行2");
		Book b2 = new Book(1000);
		
		System.out.println("    本の名前は:"+b2.getName());
		System.out.println("        料金は:"+b2.getTax());
		System.out.println("本のローマ字は:"+b2.getRomaName());
		System.out.println();

		//オーバーロードしたコンストラクタを実行してみる
		System.out.println("コンストラクタを実行3");
		Book b3 = new Book(1000,"銀河鉄道の夜");
		
		System.out.println("    本の名前は:"+b3.getName());
		System.out.println("        料金は:"+b3.getTax());
		System.out.println("本のローマ字は:"+b3.getRomaName());
		System.out.println();
		
		//オーバーロードしたコンストラクタを実行してみる
		System.out.println("コンストラクタを実行4");
		Book b4 = new Book(1000,"銀河鉄道の夜","ginga tetudou no yoru");
		
		System.out.println("    本の名前は:"+b4.getName());
		System.out.println("        料金は:"+b4.getTax());
		System.out.println("本のローマ字は:"+b4.getRomaName());
		System.out.println();

	}

}

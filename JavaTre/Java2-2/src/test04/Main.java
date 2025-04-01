package test04;

public class Main {
	public static void main(String[] args) {
		//他のクラスを使用するときはnew クラス名でインスタンス化
		Book b = new Book();
		
		//set～で本の内容を格納する。
		b.setName("銀河鉄道の夜");
		b.setTax(1000);
		
		//bookで条件判定を実施
		b.setRomaName("ginga tetudou no yoru");
		
		
		System.out.println("    本の名前は:"+b.getName());
		System.out.println("        料金は:"+b.getTax());
		System.out.println("本のローマ字は:"+b.getromaName());
		
		//条件をクリアする値を入れる
		b.setRomaName("GINGATETUDOUNOYORU");	
		System.out.println("本のローマ字は:"+b.getromaName());
	}
}
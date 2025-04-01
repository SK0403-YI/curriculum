package test05;

public class Book {
	private int tax;

	private String name;

	private String romaName;
	

	//①コンストラクタを作成する
	//コンストラクタはクラス名と同じメソッド名にすること
	public Book() {
		tax = 0;
		name = "未設定";
		romaName = "未設定";
	}
	
	//②コンストラクタもメソッドなのでオーバーロードが可能
	public Book(int tax) {
		this.tax = tax;
		name = "未設定";
		romaName = "未設定";
	}

	//②コンストラクタもメソッドなのでオーバーロードが可能
	public Book(int tax, String name) {
		this.tax = tax;
		this.name = name;
		romaName = "未設定";
	}
	
	//②コンストラクタもメソッドなのでオーバーロードが可能	
	public Book(int tax, String name,String romaName) {
		this.tax = tax;
		this.name = name;
		setRomaName(romaName);
	}
	

	// ①getter基本形
	public int getTax() {
		return this.tax;
	}

	// ②setter基本形
	public void setTax(int tax) {
		this.tax = tax;
	}
	// ①getter基本形

	public String getName() {
		return this.name;
	}

	// ②setter基本形
	public void setName(String name) {
		this.name = name;
	}

	// ①getterの基本形
	public String getRomaName() {
		return this.romaName;
	}

	// ③setterを応用してみる。特定の条件の時のみデータを格納できる。
	public void setRomaName(String romaName) {
		boolean check = spaceCheck(romaName);
		boolean check2 = alphabetCheck(romaName);

		// 判定条件を2つクリアした場合はデータが入る
		// 判定条件をクリアできなかった場合は未設定となる。
		if (check && check2) {
			this.romaName = romaName.toUpperCase();
		} else {
			this.romaName = "未設定";
		}
	}

	//スペースが含まれているかを判定するメソッド
	public boolean spaceCheck(String s) {
		if (s.contains(" ") || s.contains("　")) {
			return false;
		} else {
			return true;
		}
	}

	// 大文字以外の文字が含まれているかを判定するメソッド
	// 大文字だけならtrueを返す、小文字だけならfalseを返す
	public boolean alphabetCheck(String s) {
		String check = "^[A-Z]";
		check += "{" + s.length() + "}";

		// s.matches(確認用の正規表現)
		if (s.matches(check)) {
			return true;
		} else {
			return false;
		}
	}

}

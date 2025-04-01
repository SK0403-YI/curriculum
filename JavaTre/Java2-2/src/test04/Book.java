package test04;

public class Book {
	private int tax;
	
	private String name;
	
	private String romaName;
	
	public int getTax() {
		return this.tax;
	}
	
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getromaName() {
		return this.romaName;
		
	}
	public void setRomaname(String romaName) {
		boolean check = spaceCheck(romaName);
		boolean check2 = AlphabetCheck(romaName);
		
		if(check && check2) {
			this.romaName = romaName.toUpperCase();
		}else {
			this.romaName = "未設定";
		}
		
	}
	public boolean spaceCheck(String s) {
		if(s.contains(" ") || s.contains(" ")) {
			return false;
		}else {
			return true;
		}
	}
	public boolean AlphabetCheck(String s) {
		String check = "^[A-Z]";
		check += "{"+s.length()+"}";
		
		if(s.matches(check)) {
			return true;
		}else {
			return false;
		}
	}

}

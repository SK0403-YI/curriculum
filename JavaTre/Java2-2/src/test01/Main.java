package test01;

public class Main {
	public static void main(String[] args) {
		
		Calc.addition(5,3);
		
		Calc.subtraction(10,-5);
		
		int x = 3;
		int y = 15;
		
		Calc.multiplication(x,y);
		
		Calc.division(x,y);
		
		String word = "trendly Circle";
		Calc.characterConversion(word);
		
		Calc.FirstCharacterConversion(word,70);
		
		int allIn[] = {25,74,347,83, 291, 362, 22, 19, 469, 2926, 721, 2723, 111, 387 };
		//
		Calc.sumArray(allIn);
		
	}

}

package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		System.out.println("");
//		練習問題1
		System.out.println("○練習問題1");
		final double TAX = 1.1;
		System.out.println(TAX );
		
		System.out.println("");
//		練習問題2
		System.out.println("○練習問題2");
		
		int x = 480;
		double price = x*TAX;
		System.out.println((int)price+"円");
		
		
		System.out.println("");
//		練習問題3
		System.out.println("○練習問題3");
		
		String name = "田中 歩夢";
		System.out.println(name);
		
		
		System.out.println("");
//		練習問題4
		System.out.println("○練習問題4");
		
		String string_1 = "この商品の値段は";
		String string_2 = "円です。";
		System.out.println(string_1+(int)price+string_2);
		
	}

}

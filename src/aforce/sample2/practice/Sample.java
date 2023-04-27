package jp.co.aforce.sample.practice;

public class Sample {
	public static void main(String[] args) {

		double myWeight = 69.5;
		double myHeight = 174.5 / 100;

		double bmi = myWeight / (myHeight * myHeight);
		System.out.println(bmi);

		int x;
		x = 1;
		System.out.println(x);
		x++;
		System.out.println(x);

		int y = (int) 10.12345;
		System.out.println(y);

		final int z;
		z = 100;
		System.out.println("");
		System.out.println("練習問題①");
		int value = 100;
		value += 10;
		value--;
		System.out.println(value);

		String letter = "Hello";
		System.out.println(letter);

		String haiku = "古池や" + "蛙飛び込む" + "水の音" + 1 + letter;
		System.out.println(haiku);
		String goodHaiku = haiku.replace("音", "呼吸");
		System.out.println(goodHaiku);

		System.out.println("文字の長さは" + goodHaiku.length());
		System.out.println(goodHaiku.substring(5,8));
		System.out.println(goodHaiku);
		System.out.println(goodHaiku);
		System.out.println(goodHaiku);
		
		
		String lastName = "田中";
		String firstName = "歩夢";
		
		String myName = lastName +" "+ firstName;
		System.out.println("私の名前は" + myName + "です。");
		
		
		String saying ="明日は明日の風が吹く";
	
		boolean result = saying.contains("風");
		
		System.out.println(result);

	}
}

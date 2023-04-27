package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTest5 {
	public static void main(String[] args) {
		System.out.println("");
		//		練習問題2
		System.out.println("○練習問題2");

		List<String> animals = new ArrayList<>() {
			{
				add("犬");
				add("猫");
				add("うさぎ");
				add("へび");
			}
		};
		System.out.println("");
		//		練習問題3
		System.out.println("○練習問題3");
		String likeAnimal = "サイ";

		//		動作確認用
		//		likeAnimal = "へび";

		if (animals.contains(likeAnimal)) {
			System.out.println(likeAnimal + "はリストに含まれています");
		} else {
			System.out.println(likeAnimal + "はリストに含まれていません");
		}

		System.out.println("");
		//		練習問題4
		System.out.println("○練習問題4");
		List<String> message = new ArrayList<>() {
			{
				add("不正な月です");//例外
				add("冬物セール");//1月
				add("春物を売る");//2,3,4月
				add("春物セール");//5月
				add("夏物を売る");//6,7月
				add("夏物セール");//8月
				add("秋物を売る");//9月
				add("冬物を売る");//10,11,12月
			}
		};

		Calendar calendar = Calendar.getInstance();
		int month_pre = calendar.get(Calendar.MONTH);
		int month = month_pre + 1;
		System.out.println(month);

		//		動作確認用
		//		month = 9;

		switch (month) {
		case 1:
			System.out.println(message.get(1));
			break;
		case 2:
		case 3:
		case 4:
			System.out.println(message.get(2));
			break;
		case 5:
			System.out.println(message.get(3));
			break;
		case 6:
		case 7:
			System.out.println(message.get(4));
			break;
		case 8:
			System.out.println(message.get(5));
			break;
		case 9:
			System.out.println(message.get(6));
			break;
		case 10:
		case 11:
		case 12:
			System.out.println(message.get(7));
			break;
		default:
			System.out.println(message.get(0));
			break;
		}

	}
}

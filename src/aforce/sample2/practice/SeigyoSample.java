package jp.co.aforce.sample.practice;

import java.util.Calendar;
import java.util.HashSet;

public class SeigyoSample {
	public static void main(String[] args) {
		System.out.println(args[0] + "　" + args[1]);
		//		if文を使った制御構文の例
		int x = 1000;

		if (x < 100) {
			System.out.println("xは100より小さい");
		} else if (x < 1000) {
			System.out.println("xは100以上1000未満");
		} else if (x < 1500) {
			System.out.println("xは100以上1500未満");
		} else {
			System.out.println("xは1500以上");
		}

		int value = 50;

		if (value == 0) {
			System.out.println("値は0です");
		} else if (1 <= value && value <= 5) {
			System.out.println("値は1以上5以下です");
		} else {
			System.out.println("値は" + value + "です");
		}

		//		switch文を使った制御構文
		int y = 1;

		switch (y) {
		case 1:
			System.out.println("yの値は1です");
			break;
		case 2:
			System.out.println("yの値は2です");
			break;
		default:
			System.out.println("yの値は1でも2でもないです");
			break;
		}

		Calendar calendar = Calendar.getInstance();
		int z = calendar.get(Calendar.DAY_OF_WEEK);

		switch (z) {
		case 1:
			System.out.println("今日の曜日は日です");
			break;
		case 2:
			System.out.println("今日の曜日は月です");
			break;
		case 3:
			System.out.println("今日の曜日は火です");
			break;
		case 4:
			System.out.println("今日の曜日は水です");
			break;
		case 5:
			System.out.println("今日の曜日は木です");
			break;
		case 6:
			System.out.println("今日の曜日は金です");
			break;
		case 7:
			System.out.println("今日の曜日は土です");
			break;
		}

		//		while文を用いた制御構文
		int p = 1;
		int amount = 0;

		while (amount < 10) {
			System.out.println(p + "を足します");
			amount = amount + p;
			p++;
		}
		System.out.println("合計は" + amount);
		//		練習問題
		int num = 1;

		while (num <= 30) {
			if (num % 3 == 0) {
				System.out.println(num + "は3の倍数です");
			}
			num++;
		}
		//		do-while文を用いた制御構文
		int q = 1;
		int amount_2 = 0;

		do {
			System.out.println(q + "を足します");
			amount_2 = amount_2 + q;
		} while (amount_2 < 10);
		System.out.println("合計は" + amount_2);

		//		練習問題
		//		do-while文を用いた制御構文
		int r = 2;

		do {
			if (r % 2 == 0) {
				System.out.println(r + "は2の倍数です");
			}
			r++;
		} while (r <= 10);

		//		別の書き方
		int s = 2;

		do {
			System.out.println(s + "は2の倍数です");
			s += 2;
		} while (s <= 10);

		//for文を用いた制御構文
		for (int i = 1; i <= 3; i++) {
			System.out.println("手順Qの実行" + i + "回目");
		}
		//カウントダウン
		for (int i = 3; i > 0; i--) {
			System.out.println("手順Qの実行" + i + "回目");
		}
		//		練習問題10 
		for (int i = 1; i <= 9; i++) {
			System.out.println("4×" + i + "＝" + i * 4);
		}

		//配列の中身をforで取り出す
		String[] fruits = new String[3];
		fruits[0] = "リンゴ";
		fruits[1] = "オレンジ";
		fruits[2] = "ブドウ";

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		//		練習問題11
		String[] day_of_week = new String[7];
		day_of_week[0] = "日";
		day_of_week[1] = "月";
		day_of_week[2] = "火";
		day_of_week[3] = "水";
		day_of_week[4] = "木";
		day_of_week[5] = "金";
		day_of_week[6] = "土";

		String[] day_of_week_en = new String[7];
		day_of_week_en[0] = "Sun";
		day_of_week_en[1] = "Mon";
		day_of_week_en[2] = "Tue";
		day_of_week_en[3] = "Wen";
		day_of_week_en[4] = "Thu";
		day_of_week_en[5] = "Fri";
		day_of_week_en[6] = "Sat";

		//		String[] enWeek = {"日","月","火",..}のようにしてもよい

		for (int i = 0; i < day_of_week.length; i++) {
			System.out.println(day_of_week[i] + "曜日は英語では" + day_of_week_en[i] + "です");
		}

		//		break文
		HashSet<String> books = new HashSet<>();
		books.add("不思議の国のアリス");
		books.add("ヘンゼルとグレーテル");
		books.add("銀河鉄道");

		for (String book : books) {
			System.out.println(book);
		}
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		//練習問題12
		System.out.println("練習問題12");
		int count = 0;
		while (true) {

			if (count == 5) {
				break;
			}
			count++;
		}
		System.out.println(count);

		//continue文
		System.out.println("continue文");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("プログラムの終了");

		//練習問題13
		System.out.println("練習問題13");
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

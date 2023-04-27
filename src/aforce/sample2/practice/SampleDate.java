package jp.co.aforce.sample.practice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class SampleDate {
	public static void main(String[] args) {
		//		Date today = new Date(1541170800000L);
		//		System.out.println(today);

		Calendar calendar = Calendar.getInstance(); //クラスからCalendarを直接呼び出し
		calendar.clear(); //初期化
		System.out.println("　" + calendar); //その時刻の情報を返す(ミリ秒)
		Date birthday = calendar.getTime(); //整形
		System.out.println("　" + birthday); //その時刻の情報を返す

		Calendar calendar_2 = Calendar.getInstance(); //クラスからCalendarを直接呼び出し
		calendar_2.clear(); //初期化
		calendar_2.set(1996, 3, 16, 11, 33, 50);
		int hourOfDay = calendar_2.get(Calendar.HOUR_OF_DAY);
		System.out.println("　" + hourOfDay);
		int dayOfWeek = calendar_2.get(Calendar.DAY_OF_WEEK);
		System.out.println("　" + dayOfWeek);
		System.out.println("　" + calendar_2.get(Calendar.YEAR));

		calendar_set();
		calendar_add();
		calendar_timezone();
		calendar_changeFormat();
		calendar_practice();
		calendar_practice_1();

		System.out.println(args);
	}

	public static void calendar_set() {
		//		Date today = new Date(1541170800000L);
		//		System.out.println(today);
		System.out.println("↓ここからカレンダーセットメソッド↓");

		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1984, 11, 26, 11, 33, 50);

		System.out.println("　" + calendar.getTime());
		calendar.set(Calendar.SECOND, 00);
		System.out.println("　" + calendar.getTime());

		System.out.println("↑ここまでカレンダーセットメソッド↑");
	}

	public static void calendar_add() {
		//		Date today = new Date(1541170800000L);
		//		System.out.println(today);
		System.out.println("↓ここからカレンダーアドメソッド↓");

		Calendar calendar = Calendar.getInstance();
		System.out.println("　" + calendar);
		calendar.add(calendar.DAY_OF_MONTH, 3);
		System.out.println(calendar.getTime());

		calendar.add(calendar.MONTH, -6);
		System.out.println("　" + calendar.getTime());

		System.out.println("↑ここまでカレンダーアドメソッド↑");
	}

	public static void calendar_timezone() {
		System.out.println("↓ここからカレンダータイムゾーンメソッド↓");
		Calendar calendar = Calendar.getInstance();
		System.out.println("　日本の時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時");

		calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println("　ロサンゼルスの時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時");
		System.out.println("↑ここまでカレンダータイムゾーンメソッド↑");
	}

	public static void calendar_changeFormat() {
		System.out.println("↓ここからカレンダー変換メソッド↓");
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd(EEEE)/ HH:mm:ss", new Locale("en", "US"));
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);
		System.out.println("↑ここまでカレンダー変換メソッド↑");
	}

	public static void calendar_practice() {
		System.out.println("↓ここから練習問題↓");

		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);

		calendar.set(2000, 0, 26);
		Date birthday = calendar.getTime();
		System.out.println(birthday);

		calendar.clear();
		calendar.set(2020, 0, 2, 10, 20, 30);
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.YEAR));

		calendar.add(calendar.HOUR_OF_DAY, -5);
		System.out.println("　" + calendar.getTime());

		calendar.clear();
		calendar.set(2000, 0, 26, 00, 00, 00);
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日(EEEE)/ HH:mm:ss");
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);

		System.out.println("↑ここまで練習問題↑");
	}

	public static void calendar_practice_1() {
		System.out.println("↓ここから練習問題１↓");

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("リンゴ");
		fruits.add("みかん");
		System.out.println(fruits);
		fruits.add(1, "ブドウ");
		System.out.println(fruits);
		fruits.remove("ブドウ");
		System.out.println(fruits);

		String fruit = "";

		try {
			fruit = fruits.get(10);
		} catch (Exception e) {
			fruit = "メロン";
		} finally {
			System.out.println(fruit);
		}

		fruits.set(1, "サトウキビ");
		System.out.println(fruits);

		ArrayList<String> pravtice = new ArrayList<>();
		pravtice.add("赤");
		pravtice.add("青");
		pravtice.add("黄色");
		pravtice.add("オレンジ");
		pravtice.add("緑");
		pravtice.add("ピンク");
		pravtice.add("紫");
		System.out.println(pravtice.get(5));
		pravtice.remove("青");
		System.out.println(pravtice);
		pravtice.add(2, "水色");
		System.out.println(pravtice);
		System.out.println(1);
		pravtice.set(6, "白");
		pravtice.add(0, "黒");
		System.out.println(pravtice);

		HashSet<String> fruits_2 = new HashSet<>();
		System.out.println(fruits_2.add("リンゴ"));
		System.out.println(fruits_2.add("みかん"));
		System.out.println(fruits_2.add("ぶどう"));
		System.out.println(fruits_2);
		fruits_2.remove("ぶどう");
		System.out.println(fruits_2);

		HashMap<String, String> members = new HashMap<>();
		members.put("naka@s.jp", "田中歩夢");
		members.put("naka@s.jp", "山田孝");

		//		System.out.println.(members);
		HashMap<String, String> practice_2 = new HashMap<>();
		practice_2.put("A001", "田中太郎");
		practice_2.put("A002", "佐藤次郎");
		practice_2.put("A003", "山田花子");
		practice_2.put("A004", "佐藤次郎");
		System.out.println(practice_2);
		practice_2.remove("A003");
		practice_2.put("A004", "高橋三郎");

		System.out.println(practice_2);

		String[] singo = { "赤", "黄", "青" };
		System.out.println(singo[0]);
		singo[2] = "茶";

		int[] array_list = { 1, 2, 3, 4, 5 };
		System.out.println(array_list[4]);

		String name = new String("データ");
		System.out.println(name);

		System.out.println("↑ここまで練習問題１↑");

	}

}

package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {

		System.out.println("");
		//練習問題1
		System.out.println("○練習問題1");

		Random random = new Random();
		int fortune = random.nextInt(4);

		String message_fortune = "凶";

		System.out.println(fortune);
		switch (fortune) {
		case 1:
			message_fortune = "吉";
			break;
		case 2:
			message_fortune = "中吉";
			break;
		case 3:
			message_fortune = "大吉";
			break;
		}
		System.out.println(message_fortune + "です");

		System.out.println("");
		//練習問題2
		System.out.println("○練習問題2");
		ArrayList<String> multipleOf7 = new ArrayList<String>();
		String out_message = "";

		int i = 1;
		//格納処理
		while (i <= 100) {
			//7の倍数ならリストに格納する
			if (i % 7 == 0) {
				multipleOf7.add(Integer.toString(i));
			}
			i++;
		}
		//出力処理
		//		multipleOf7.forEach(s -> out_message+= (s + ",")); 
		int index = 0;
		String blank_before;
		for (String s : multipleOf7) {
			if (index != 0) {
				blank_before = " , ";
			} else {
				blank_before = "";
			}
			out_message += (blank_before + s);
			index++;
		}
		System.out.println(out_message);

		System.out.println("");
		//練習問題3
		System.out.println("○練習問題3");
		String concatenationCharacter = "";
		String blank;

		String[][] nineNine = new String[9][9];
		//格納処理
		for (int k = 0; k < 9; k++) {
			for (int j = 0; j < 9; j++) {
				int num = (k + 1) * (j + 1);
				nineNine[k][j] = Integer.toString(num);
			}
		}
		//出力処理
		for (int q = 0; q < 9; q++) {
			for (int p = 0; p < 9; p++) {
				//桁数に応じて空白を設定
				if (nineNine[p][q].length() == 1) {
					blank = "  ";
				} else {
					blank = " ";
				}
				concatenationCharacter += blank + nineNine[p][q];
			}
			//1行完成したら出力する
			nineNine[0][q] = concatenationCharacter;
			System.out.println(nineNine[0][q]);
			concatenationCharacter = "";
		}
	}

}

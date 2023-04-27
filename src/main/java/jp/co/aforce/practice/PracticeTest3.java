package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		System.out.println("");
//		練習問題1
		System.out.println("○練習問題1");
		String stationery[] = {
				"シャープペンシル",
				"ボールペン",
				"リングノート",
				"クリップ",
				"消しゴム"
		};
		
		System.out.println("");
//		練習問題2
		System.out.println("○練習問題2");
		
		
		System.out.println(stationery[1]);
		
		System.out.println("");
//		練習問題3
		System.out.println("○練習問題3");
		
        List<String> shainName = new ArrayList<>() {
            {
                add("山田太郎");
                add("鈴木花子");
                add("佐藤二郎");
                add("山田太郎");
                add("高橋三郎");
            }
        };
        
		System.out.println("");
//		練習問題4
		System.out.println("○練習問題4");
		
		System.out.println("");
//		練習問題5
		System.out.println("○練習問題5");
		System.out.println(shainName.get(2));
	}
}

/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");
		System.out.println("\n本日のおすすめ商品です。\n");

		int syutoronn = 30;
		int syokora = 30;
		int pisutasyu = 30;

		System.out.println("シトロン　　　\\250・・・残り" + syutoronn);
		System.out.println("ショコラ　　　\\280・・・残り" + syokora);
		System.out.println("ピスターシュ　\\320・・・残り" + pisutasyu);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン　　　＞");
		String syutoronnCount = reader.readLine();
		int IsyutoronnCount = Integer.parseInt(syutoronnCount);

		System.out.print("ショコラ　　　＞");
		String syokoraCount = reader.readLine();
		int IsyokoraCount = Integer.parseInt(syokoraCount);

		System.out.print("ピスターシュ　＞");
		String pisutasyuCount = reader.readLine();
		int IpisutasyuCount = Integer.parseInt(pisutasyuCount);

		System.out.println("\nシトロン　　　" + IsyutoronnCount + "個");
		System.out.println("ショコラ　　　" + IsyokoraCount + "個");
		System.out.println("ピスターシュ　" + IpisutasyuCount + "個");

		System.out.println("\n合計個数　　　" + (IsyutoronnCount + IsyokoraCount + IpisutasyuCount));
		System.out.println("合計金額　　　" + (250 * IsyutoronnCount + 280 * IsyokoraCount + 320 * IpisutasyuCount));

		System.out.println("\nをお買い上げですね。\n承りました。\n");

		syutoronn -= IsyutoronnCount;
		syokora -= IsyokoraCount;
		pisutasyu -= IpisutasyuCount;

		System.out.println("シトロン　　　\\250・・・残り" + syutoronn);
		System.out.println("ショコラ　　　\\280・・・残り" + syokora);
		System.out.println("ピスターシュ　\\320・・・残り" + pisutasyu);
	}

}

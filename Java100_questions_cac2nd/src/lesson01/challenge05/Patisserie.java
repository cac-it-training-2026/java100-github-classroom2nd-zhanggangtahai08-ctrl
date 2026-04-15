/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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

		System.out.println("\nをお買い上げですね。\n承りました。");
	}

}

/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double IsyutoronnCount = Double.parseDouble(syutoronnCount);

		System.out.print("ショコラ　　　＞");
		String syokoraCount = reader.readLine();
		double IsyokoraCount = Double.parseDouble(syokoraCount);

		System.out.print("ピスターシュ　＞");
		String pisutasyuCount = reader.readLine();
		double IpisutasyuCount = Double.parseDouble(pisutasyuCount);

		System.out.println("\nシトロン　　　" + IsyutoronnCount + "個");
		System.out.println("ショコラ　　　" + IsyokoraCount + "個");
		System.out.println("ピスターシュ　" + IpisutasyuCount + "個");

		double Total_Count = IsyutoronnCount + IsyokoraCount + IpisutasyuCount;
		System.out.println("\n合計個数　　　" + Total_Count);

		syutoronn = (int) (syutoronn - IsyutoronnCount);
		syokora = (int) (syokora - IsyokoraCount);
		pisutasyu = (int) (pisutasyu - IpisutasyuCount);

		int Total_syutoronn = (int) (250 * IsyutoronnCount);
		int Total_syokora = (int) (280 * IsyokoraCount);
		int Total_pisutasyu = (int) (320 * IpisutasyuCount);
		int sum = (Total_syutoronn + Total_syokora + Total_pisutasyu);
		System.out.println("合計金額　　　" + sum);

		System.out.println("\nをお買い上げですね。\n承りました。\n");

		System.out.println("シトロン　　　\\250・・・残り" + syutoronn);
		System.out.println("ショコラ　　　\\280・・・残り" + syokora);
		System.out.println("ピスターシュ　\\320・・・残り" + pisutasyu);

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");
		System.out.println("\n売上の割合\n" + "合計金額　　　" + sum);
		System.out.println("\n内訳");
		System.out.println("シトロン　　　\\" + Total_syutoronn + "・・・" + (int) ((250 * IsyutoronnCount) / sum * 100) + "%");
		System.out.println("ショコラ　　　\\" + Total_syokora + "・・・" + (int) ((280 * IsyokoraCount) / sum * 100) + "%");
		System.out.println("ピスターシュ　\\" + Total_pisutasyu + "・・・" + (int) ((320 * IpisutasyuCount) / sum * 100) + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味　　・・・" + ((int) ((250 * IsyutoronnCount) / sum * 100) + "%"));
		System.out.println("ショコラの味　　・・・" + ((int) ((280 * IsyokoraCount) / sum * 100) + "%"));
		System.out.println("ピスターシュの味・・・" + ((int) ((320 * IpisutasyuCount) / sum * 100) + "%"));
		System.out.println("\nが楽しめます\n");
		System.out.println("\n値段は" + (sum / (int) Total_Count / 10 * 10));
	}

}

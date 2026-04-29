package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {

	String makeEggDishes(int riceNum, int saltNum, int eggNum, int oilNum) {
		String menu = null;
		if (riceNum >= 250 && saltNum >= 15 && eggNum >= 3 && oilNum >= 30) {
			menu = "クッキー";
		} else if (eggNum >= 2 && oilNum >= 15) {
			menu = "目玉焼き";
		} else if (riceNum >= 150 && eggNum >= 1) {
			menu = "卵かけごはん";
		} else if (eggNum >= 1) {
			menu = "ゆで卵";
		} else {
			menu = "霞";
		}
		return menu;
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ご飯の量を入力してください（グラム）＞");
		String riceStr = br.readLine();
		int riceNum = Integer.parseInt(riceStr);

		System.out.print("\n塩の量を入力してください（グラム）＞");
		String saltStr = br.readLine();
		int saltNum = Integer.parseInt(saltStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggStr = br.readLine();
		int eggNum = Integer.parseInt(eggStr);

		System.out.print("\n油の量を入力してください（グラム）＞");
		String oilStr = br.readLine();
		int oilNum = Integer.parseInt(oilStr);

		Robot robot = new Robot();
		String menu = robot.makeEggDishes(riceNum, saltNum, eggNum, oilNum);
		System.out.println("\n" + menu + "が出来ました。");

	}

}

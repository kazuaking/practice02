package kadai02;

import kadai02.calculator.Dcm;
import kadai02.calculator.Lcm;
import kadai02.calculator.Rohrer;
import kadai02.calculator.Round;

public class Runner {

	/**
	 * 計算処理、結果の表示を行います
	 * @param args 入力値
	 */
	public static void main(String[] args) {

		/*
		【次回課題のメモ】
		1こめ ｺﾚ
		String[] details = new String[10];
		String[] results = new String[10];

		2ｺﾒ インターフェイスがあるとできるやつ
		Object[] calculators = new Object[10];


		はっしゅ　つぎの課題
		HashMap<String, String> all_results = new HashMap<String, String>();
		*/

		// 結果を格納する配列、繰り返し回数を格納する変数の初期化
		String[] details = new String[10];
		String[] results = new String[10];
		int x = 0;

		// 入力値を引数として各計算のインスタンスを生成
		Round round = new Round(args[1], args[2]);
		Rohrer rohrer = new Rohrer(args[1], args[2]);
		Dcm dcm = new Dcm(args[1], args[2]);
		Lcm lcm = new Lcm(args[1], args[2]);

		switch (args[0]) {

		// 計算方法に「Round」と入力された場合
		case "Round" :

			details[0] = round.detail();
			results[0] = round.result();
			x = 1;

			break;

		// 計算方法に「Rohrer」と入力された場合
		case "Rohrer" :

			details[0] = rohrer.detail();
			results[0] = rohrer.result();
			x = 1;

			break;

		// 計算方法に「Dcm」と入力された場合
		case "Dcm" :

			details[0] = dcm.detail();
			results[0] = dcm.result();
			x = 1;

			break;

		// 計算方法に「Lcm」と入力された場合
		case "Lcm" :

			details[0] = lcm.detail();
			results[0] = lcm.result();
			x = 1;

			break;

		// 計算方法に「All」と入力された場合
		case "All" :

			details[0] = round.detail();
			details[1] = rohrer.detail();
			details[2] = dcm.detail();
			details[3] = lcm.detail();

			results[0] = round.result();
			results[1] = rohrer.result();
			results[2] = dcm.result();
			results[3] = lcm.result();

			x = 4;

			break;

		default :

			System.out.println("*計算方法 = " + args[0]);
			System.out.println("*入力値エラー：\"" + args[0] + "\"は計算方法にありません。入力しなおしてください");

			System.exit(1);
		}

		System.out.println("★計算方法 = " + args[0] + "\n");

		for (int i = 0; i < x; i++){

			System.out.println(details[i]);
			System.out.println(results[i] + "\n");
		}
	}
}

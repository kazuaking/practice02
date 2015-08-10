package kadai02.calculator;

import kadai02.common.ChangeNumUtil;

public class Dcm {

	private int num1;
	private int num2;

	public Dcm(String strNum1, String strNum2) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num1 = (int)changeNum.changeStringToDouble(strNum1);
		num2 = (int)changeNum.changeStringToDouble(strNum2);
	}

	/**
	 * 最大公約数を求めます
	 * @param num1 引数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大公約数
	 */
	public int calculate() {

		int big = 0;
		int small = 0;

		// 引数の大きさを比べ、変数に代入
		if(num1 >= num2) {

			big = num1;
			small = num2;
		} else {

			big = num2;
			small = num1;
		}

		// 引数の大きい方を小さい方で割り、その余りが0になるまで繰り返し処理を行う
		while(big % small != 0) {

			// 大きい方を小さい方で割った余りを変数に代入
			int remainder = big % small;

			// 小さい方を割られる数に、余りを割る数に設定
			big = small;
			small = remainder;
		}

		// 最大公約数を返す
		return small;
	}


	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public String result() {

		StringBuffer buf = new StringBuffer();

		buf.append("*Dcm：結果 = ");
		buf.append(String.valueOf(calculate()));

		// 結果をString型に変換
		String result = buf.toString();

		// 計算結果を返す
		return result;
	}

	/**
	 * 入力値など過程を表します。
	 * @return 入力値など結果までの過程
	 */
	public String detail() {

		StringBuffer buf = new StringBuffer();

		buf.append("*Dcm：引数1 = ");
		buf.append(num1);
		buf.append(", 引数2 = ");
		buf.append(num2);

		// 結果までの過程を変数に格納
		String detail = buf.toString();

		// 入力値など過程を返す
		return detail;
	}

}

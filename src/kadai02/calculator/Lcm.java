package kadai02.calculator;

import kadai02.common.ChangeNumUtil;

public class Lcm {

	public int num1;
	public int num2;

	public Lcm(String strNum1, String strNum2){

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num1 = (int)changeNum.changeStringToDouble(strNum1);
		num2 = (int)changeNum.changeStringToDouble(strNum2);
	}

	/**
	 * 最大公倍数を求めます
	 * @param num1 引き数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大勾配数を求めた結果
	 */
	private int calculate() {

		Dcm dcm = new Dcm(String.valueOf(num1), String.valueOf(num2));

		// 2つの引数の最大公約数を変数に代入
		int resultDcm = dcm.calculate();

		// 最大公倍数 = (引数1×引数2)÷引数1と引数2の最大公約数
		int lcm = (num1 * num2) / resultDcm;

		// 最大公倍数を返す
		return lcm;
	}

	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public String result() {

		StringBuffer buf = new StringBuffer();

		buf.append("*Lcm：結果 = ");
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

		buf.append("*Lcm：引数1 = ");
		buf.append(num1);
		buf.append(", 引数2 = ");
		buf.append(num2);

		// 結果までの過程を変数に格納
		String detail = buf.toString();

		// 入力値など過程を返す
		return detail;
	}
}

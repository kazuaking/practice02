package kadai02.calculator;

import kadai02.common.ChangeNumUtil;
import kadai02.common.MathUtil;

public class Round {

	private double num;
	private int keta;

	public Round(String strNum, String strKeta) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num = changeNum.changeStringToDouble(strNum);
		keta = (int)changeNum.changeStringToDouble(strKeta);
	}

	/**
	 * 四捨五入を行います。
	 * @param num 引数1
	 * @param keta 引数2
	 * @return 引数1を引数2の桁数で四捨五入した結果
	 */
	private double calculate() {

		MathUtil math = new MathUtil();

		// 四捨五入したい値が整数部の1桁目にくるように掛ける値を変数に代入
		double pow = math.calculatePow(10.0d, keta - 1);

		// 四捨五入処理を行い、変数roundに代入
		double round = (int)(num * pow + 0.5d);

		// 整数部の桁を初期値に戻す
		round /= pow;

		// 四捨五入後の値を返す
		return round;

	}

	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public String result() {

		StringBuffer buf = new StringBuffer();

		buf.append("*Round：結果 = ");
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

		buf.append("*Round：num = ");
		buf.append(num);
		buf.append(",keta = ");
		buf.append(keta);

		// 結果までの過程を変数に格納
		String detail = buf.toString();

		// 入力値など過程を返す
		return detail;
	}
}

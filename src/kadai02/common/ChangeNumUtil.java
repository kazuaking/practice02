package kadai02.common;

public class ChangeNumUtil {

	/**
	 * 入力値をdouble型に変換する
	 * @param args 引数1
	 * @return 引数1をdouble型に変換した値
	 */
	public double changeStringToDouble(String args) {

		// 入力値をdouble型に変換し、変数に代入
		double doubleChange = Double.parseDouble(args);

		// double型に変換した値を返す
		return doubleChange;
	}

	/**
	 * 入力値をint型に変換する
	 * @param args 引数1
	 * @return 引数1をint型に変換した値
	 */
	public int changeStringToInt(String args) {

		// 入力値をint型に変換し、変数に代入
		int intChange = Integer.parseInt(args);

		// int型に変換した値を返す
		return intChange;
	}

}

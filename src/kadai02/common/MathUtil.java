package kadai02.common;

public class MathUtil {

	/**
	 * べき乗の計算
	 * @param num 引数1
	 * @param beki 引数2
	 * @return 引数1を引数2回掛けた結果
	 */

	public double calculatePow (double num, int beki) {

		// 返り値を格納する変数を宣言
		double bekijo = 1.0d;

		// 引数を指定回数だけ掛ける処理
		for (int i = 0; i < beki; i++) {

			bekijo *= num;
		}

		// べき乗結果の値を返す
		return bekijo;
	}

}

package kadai02.calculator;

import kadai02.common.ChangeNumUtil;
import kadai02.common.MathUtil;

public class Rohrer {

	private double weight;
	private double height;

	public Rohrer(String strWeight, String strHeight) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		weight = changeNum.changeStringToDouble(strWeight);
		height = changeNum.changeStringToDouble(strHeight);
	}

	/**
	 * ローレル指数を計算します
	 * @param weight 引数1
	 * @param height 引数2
	 * @return 引数1と引数2を使用してローレル指数を計算した結果
	 */
	private double calculate() {

		MathUtil math = new MathUtil();

		// べき乗の計算
		double pow01 = math.calculatePow(height, 3);
		double pow02 = math.calculatePow(10.0d, 7);

		// ローレル指数 = 体重×10^7/身長^3
		double rohrer = (weight * pow02) / pow01;

		// 計算結果を返す
		return rohrer;
	}

	/**
	 * ローレル指数から太り具合の判定をします
	 * @param Rohrer 引数1
	 * @return 引数1から太り具合を判定した結果
	 */
	public String result() {

		// 結果格納変数の宣言
		String resultJudge = "";

		StringBuffer buf = new StringBuffer();

		// ローレル指数が100未満だった場合
		if (calculate() < 100.0d) {

			// 判定結果「痩せすぎ」を格納
			resultJudge = "痩せすぎ";

		// ローレル指数が100以上115未満だった場合
		} else if (calculate() >= 100.0d && calculate() < 115.0d) {

			// 判定結果「やや痩せすぎ」を格納
			resultJudge = "やや痩せすぎ";

		// ローレル指数が115以上150未満だった場合
		} else if (calculate() >= 115.0d && calculate() < 150.0d) {

			// 判定結果「平均」を格納
			resultJudge = "平均";

		// ローレル指数が150以上160未満だった場合
		}else if (calculate() >= 150.0d && calculate() < 160.0d) {

			// 判定結果「やや太りぎみ」を格納
			resultJudge = "やや太りぎみ";

		// ローレル指数が160以上だった場合
		}else if (calculate() >= 160.0d) {

			// 判定結果「太り過ぎ」を格納
			resultJudge = "太り過ぎ";
		}

		buf.append("*Rohrer：結果 = ");
		buf.append(resultJudge);

		// 結果を変数に格納
		String result = buf.toString();

		// 判定結果を返す
		return result;
	}

	/**
	 * 入力値など過程を表します。
	 * @return 入力値など結果までの過程
	 */
	public String detail() {

		StringBuffer buf = new StringBuffer();

		buf.append("*Rohrer：体重：");
		buf.append(weight);
		buf.append(", 身長：");
		buf.append(height);
		buf.append("\n ローレル指数 = ");
		buf.append(calculate());

		// 結果までの過程を変数に格納
		String detail = buf.toString();

		// 入力値など過程を返す
		return detail;
	}

}

package ensyu2_1;

public class ensyu2_1 {
	/**
	 * @関数名: main
	 * @メソッドの説明 : int型の2つの変数に小数点を代入
	 * 					　どのような結果になるか検証
	 * 					　結果：doubleからintへのキャストができないため、エラー
	 * @パラメータの説明 : なし
	 * @返り値 : なし
	 * @作成者 : 赤嶺亮介
	 * @日付 : 2023/04/05
	 */
	public static void main(String[] args) {
		//int型２つの変数それぞれに小数を代入
		int firstOperand = 156.883;
		int secondOperand = 532.613;
		//
		System.out.println("firstOperandの値は" + firstOperand + "です。");
		System.out.println("secondOperandの値は" + secondOperand + "です。");
		System.out.println("合計は" + (firstOperand+secondOperand) + "です。");
		System.out.println("平均は" + (firstOperand+secondOperand)/2 + "です。");
	}

}

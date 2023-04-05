package ensyu2_2;
/*
 * クラス名:ensyu2_2
 * 概要  :演習2-2クラス
 * 作成者:R.Aakamine
 * 作成日:2023.04.05
 */
public class ensyu2_2 {
	/**
	 * @関数名: main
	 * @メソッドの説明 : int型の3つの変数に整数を代入
	 * 					　それぞれの値と合計・平均を計算し、表示
	 * 					
	 * @パラメータの説明 : なし
	 * @返り値 : なし
	 * @作成者 : 赤嶺亮介
	 * @日付 : 2023/04/05
	 */
	public static void main(String[] args) {
		//int型の変数を３つ宣言し、整数値を代入
		int firstOperand = 2;
		int secondOperand = 18;
		int thirdOperand = 46;
		
		//3つの変数に格納されている値を表示、合計・平均を表示
		System.out.println("firstOperandの値は" + firstOperand + "です。");
		System.out.println("secondOperandの値は" + secondOperand + "です。");
		System.out.println("thirdOperandの値は" + thirdOperand + "です。");
		System.out.println("合計は" + (firstOperand+secondOperand+thirdOperand) + "です。");
		System.out.println("平均は" + (firstOperand+secondOperand+thirdOperand)/3 + "です。");
	}

}
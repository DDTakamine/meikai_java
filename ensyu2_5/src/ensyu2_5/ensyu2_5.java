package ensyu2_5;

import java.util.Scanner;
/*
 * クラス名:ensyu2_5
 * 概要  :演習2-5
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_5 {
	/*
	 * 関数名：main
	 * 概要  :２つの実数値を標準入力し、その和と平均を表示
	 * 引数  :なし
	 * 戻り値:なしine
	 * 作成日:2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードから入力した値を格納するための変数を用意
		Scanner stdIn = new Scanner(System.in);
		//一つ目の数値入力を促す
		System.out.print("xの値：");
		//標準入力された数値を格納する変数を用意
		double firstOperand = stdIn.nextDouble();
		//一つ目の数値入力を促す
		System.out.print("yの値：");
		//標準入力された数値を格納する変数を用意
		double secondOperand = stdIn.nextDouble();
		//２つの合計を計算し、画面出力
		System.out.println("２つの値の合計は" + (firstOperand+secondOperand) + "です。");
		//２つの平均を計算し、画面出力
		System.out.println("２つの値の平均は" + (firstOperand+secondOperand)/2 + "です。");
	}
}

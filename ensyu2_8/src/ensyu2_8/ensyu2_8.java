package ensyu2_8;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:ensyu2_8
 * 概要  :演習2-8
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_8 {
	/*
	 * 関数名：main
	 * 概要  : 標準入力した整数値に±５の範囲の整数値を生成
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.06
	 */
	public static void main(String[] args){
		//標準入力された数値を格納するためのクラス作成
		Scanner standardinputValue = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//基準数値を格納
		int baseValue = standardinputValue.nextInt();
		//乱数を発生させるためのクラスを作成
		Random rand = new Random();
		//乱数を格納するため、初期化
		int randomValue = 0;
		//0～10の乱数を作成して、その値から５を引くことで、
		//-5～5の範囲における乱数を発生することとする
		randomValue = rand.nextInt(11) - 5;
		//求めたい整数値を表示
		System.out.print("その値の±5の乱数を生成しました。\n"+"その値は"+(baseValue+randomValue)+"です。\n");
	}

}

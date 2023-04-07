package ensyu3_12;
/*
 * クラス名:ensyu3_12
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
import java.util.Scanner ;
/*
 * 関数名：main
 * 概要  :３つの整数値を読み込む。３つの整数値における、最小値を求めて表示
 * 引数  :なし
 * 戻り値:なし  
 * 作成日:2023.04.07  
 */
public class ensyu3_2 {
	public static void main (String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner (System.in);
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数a : "); int firstValue = standardInput.nextInt();
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数b : "); int secondValue = standardInput.nextInt();
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数c : "); int thirdValue = standardInput.nextInt();
		//１つ目の値と２つ目の値で小さいほうを選ぶ
		int minimumValue = (firstValue<=secondValue ? firstValue : secondValue);
		//もしminimumValueがthirdValue以上ならば
		if (minimumValue >= thirdValue)
			//thirdValueの値をminimumValueにコピー
			minimumValue = thirdValue;
		//最小値の表示
		System.out.println("最小値は" + minimumValue + "です。");
	}
}

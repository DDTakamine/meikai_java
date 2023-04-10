package ensyu2_9;
import java.util.Random;
/*
 * クラス名:ensyu2_9
 * 概要  :演習2-9
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_9 {
	/*
	 * 関数名：main
	 * 概要  :以下の３つの範囲からそれぞれ一つずつ実数の乱数を発生させる
	 * 		　	範囲１） 0.0以上1.0未満
	 * 		　	範囲２）0.0以上10.0未満
	 * 		　	範囲３）-1.0以上1.0未満
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.06  
	 */
	public static void main(String[] args) {
		//乱数を発生させるためのクラス作成
		Random rand = new Random();
		//発生させた乱数を格納する変数
		double randamValue;
		//範囲１での乱数を発生
		randamValue = rand.nextDouble(1.0);
		//範囲１で発生させた値を表示
		System.out.println("範囲１での乱数は"+ randamValue +"です。");
		//範囲２での乱数を発生
		randamValue = rand.nextDouble(10.0);
		//範囲２で発生させた値を表示
		System.out.println("範囲２での乱数は"+ randamValue +"です。");
		//範囲３での乱数を発生
		randamValue = rand.nextDouble(2.0);
		//範囲３で発生させた値を表示
		System.out.println("範囲３での乱数は"+ (randamValue-1) +"です。");
		
	}
}

package ensyu2_7;

import java.util.Random;
/*
 * クラス名:ensyu2_7
 * 概要  :演習2-7
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_7 {
	/*
	 * 関数名：main
	 * 概要  :以下の３つの範囲からそれぞれ一つずつ乱数を発生させる
	 * 		　	範囲１） 1以上9以下
	 * 		　	範囲２）-9以上-1以下
	 * 		　	範囲３）10以上99以下
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.06  
	 */
	public static void main(String[] args) {
		//乱数を発生させるためのクラスを作成
		Random rand = new Random();
		//範囲１の範囲で乱数を発生
		int firstRange = 1 + rand.nextInt(9);
		//範囲２の範囲で乱数を発生
		int secondRange = -1 - rand.nextInt(9);
		//範囲３の範囲で乱数を発生
		int thirdRange = 10 + rand.nextInt(90);
		//範囲１での乱数を表示
		System.out.println("1以上9以下での乱数は" + firstRange + "です。");
		//範囲２での乱数を表示
		System.out.println("-9以上-1以下での乱数は" + secondRange + "です。");
		//範囲３での乱数を表示
		System.out.println("10以上99以下での乱数は" + thirdRange + "です。");
	}
}

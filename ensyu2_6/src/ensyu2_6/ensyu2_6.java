package ensyu2_6;

import java.util.Scanner;
/*
 * クラス名:ensyu2_6
 * 概要  :演習2-6
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_6 {
	/*
	 * 関数名：main
	 * 概要  :標準入力された底辺・高さの値から三角形の面積を計算
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードから入力した値を格納するための変数を用意
		Scanner stdIn = new Scanner(System.in);
		//プログラム概要を表示
		System.out.println("三角形の面積を求めます。");
		//底辺の値を入力するように促す
		System.out.print("底辺：");
		//底辺の値を計算できるようにデータを移動
		double triangleBase = stdIn.nextDouble();
		//高さの値を入力するように促す
		System.out.print("高さ：");
		//高さの値を計算できるようにデータを移動
		double triangleHeight = stdIn.nextDouble();
		//三角形の面積を計算して、表示する
		System.out.println("三角形の面積は" + triangleBase*triangleHeight/2 + "です。");
	}

}

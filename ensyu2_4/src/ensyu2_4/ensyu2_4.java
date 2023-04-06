package ensyu2_4;

import java.util.Scanner;
	/*
	 * クラス名:ensyu2_4
	 * 概要  :演習2-4
	 * 作成者:R.Akamine
	 * 作成日:2023/04/06
	 */
public class ensyu2_4 {
	/*
	 * 関数名：main
	 * 概要  :標準入力から入力した整数値に
	 * 			・１０を加える
	 * 			・１０引く			
	 * 		  操作をする
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードから入力した値を格納するための変数を用意
		Scanner stdIn = new Scanner(System.in);
		//数値入力するように促す
		System.out.println("整数値：");
		//入力した値に対して計算できるようにデータを移動
		int a = stdIn.nextInt();
		//10足した値を出力
		System.out.println("10を加えた値は"+ (a+10) + "です。");
		//10引いた値を出力
		System.out.println("10を引いた値は"+ (a-10) + "です。");
		

	}
}


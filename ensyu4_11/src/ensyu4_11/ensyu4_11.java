package ensyu4_11;

import java.util.Scanner ;
//import java.util.System
/*
 * クラス名:ensyu4_11
 * 概要  :演習4-11
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_11 {
	/*
	 * 関数名：main
	 * 概要  :正の整数値を０かたカウントダウンするList4-4（100ページ）をfor文で実現せよ。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("カウントダウンします。");
		//数値入力促進
		System.out.print("正の整数値 : ");
		//入力した値を処理できるようにする
		int integerNumber = standardInput.nextInt();
		//iが入力された整数値に達するまでの間
		for(int i=0 ; integerNumber>=i ; ++i){
			//カウントダウンする
			System.out.println(integerNumber-i);
		}

	}
}

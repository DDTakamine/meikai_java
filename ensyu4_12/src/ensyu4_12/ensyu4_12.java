package ensyu4_12;

import java.util.Scanner ;
//import java.util.System
/*
 * クラス名:ensyu4_12
 * 概要  :演習4-12
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_12 {
	/*
	 * 関数名：main
	 * 概要  :０から正の整数値までカウントアップする。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("カウントアップします。");
		//数値入力促進
		System.out.print("正の整数値 : ");
		//入力した値を処理できるようにする
		int integerNumber = standardInput.nextInt();
		//iが入力された整数値に達するまでの間
		for(int i=0 ; integerNumber>=i ; ++i){
			//カウントアップする
			System.out.println(i);
		}

	}
}
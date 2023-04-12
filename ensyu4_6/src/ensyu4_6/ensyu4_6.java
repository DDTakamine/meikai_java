package ensyu4_6;

import java.util.Scanner;
/*
 * クラス名:ensyu4_6
 * 概要  :演習4-6
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_6{
	/*
	 * 関数名：main
	 * 概要  :List4-7,List4-8を改変
	 *        改変内容：読み込んだ値が１未満であれば改行文字を出力しないようにする。
	 *                  →１以上で改行文字を出力
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//入力の準備
		Scanner standardInput = new Scanner(System.in);
		//＊の個数をメモする変数
		int asteriskNumber;
		do {
			//０に対する対応
			System.out.println("0個の場合は表示しません");
			//数値入力を促す
			System.out.print("何個*を表示しますか：");
			//計算できるようにする
			asteriskNumber = standardInput.nextInt();
		}while(asteriskNumber<0);
		//＊を何個表示したかをメモする
		int countValue = 0;
		//表示したい＊の個数まで表示を繰り返す
		while(countValue < asteriskNumber){
			//*を表示
			System.out.print('*');
			//次の＊を表示する準備
			countValue++;
		}
		//読み込んだ値が１以上であれば
		if (asteriskNumber >= 1)
			//改行文字を出力する
			System.out.println();
	}
}

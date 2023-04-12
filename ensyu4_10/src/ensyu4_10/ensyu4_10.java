package ensyu4_10;
//数値読み込みの準備
import java.util.Scanner;
/*
 * クラス名:ensyu4_10
 * 概要  :演習4-10
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_10 {
	/*
	 * 関数名：main
	 * 概要  :list4-11を以下のように改変
	 * 　　　 読み込んだ値が１未満であらば改行文字を出力しない
	 * 　　　 →１以上で改行コードを出力
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//＊の個数を保存
		int asteriskNumber;
		do {
			//表示個数数値入力
			System.out.print("何個*を表示しますか：");
			//入力された数値を処理で使えるように変換
			asteriskNumber = standardInput.nextInt();
		//負の場合は再度入力してもらう
		}while(asteriskNumber<0);
		//出力する＊が１個以上ならば、
		if(asteriskNumber >= 1) {
			//asteriskNumberまで表示を続ける
			for (int i = 0 ; i < asteriskNumber; i++) {
				//＊を表示
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}
}


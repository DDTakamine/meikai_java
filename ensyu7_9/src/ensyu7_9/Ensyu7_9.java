package ensyu7_9;
//標準入力準備
import java.util.Scanner;
/*
* クラス名:ensyu7_8
* 概要  :演習7-8
* 作成者:R.Akamine
* 作成日:2023/04/18
*/
public class Ensyu7_9 {
	/*
	 * 関数名：readPlusIntメソッド
	 * 概要  :正の整数値：と表示してキーボードから正の整数値を読み込んで、
	 * 			その値を返却するメソッド
	 * 引数 :なし
	 * 戻り値:int型　標準入力した値
	 * 作成日:2023.04.18
	 */
	public static int readPlusInt() {
		//標準入力された値を保存
		int inputInteger = 0 ;
		//入力された値が正になるように範囲を決める
		final int positiveInteger = 0;
		//繰り返し
		do {
			//正の整数値入力を促す
			System.out.print("正の整数値：");
			//標準入力の準備
			Scanner standardInput = new Scanner(System.in);
			//標準入力の値を保存
			inputInteger = standardInput.nextInt();
		//０以下の値が入力されたら再入力
		}while(inputInteger<=positiveInteger);
		//結果を返す
		return inputInteger;
	}
	/*
	 * 関数名：main
	 * 概要  :readPlusIntメソッドを実行する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//readPlusIntメソッドを実行・結果表示
		System.out.print("返却値は"+readPlusInt()+"です。");
	}
}

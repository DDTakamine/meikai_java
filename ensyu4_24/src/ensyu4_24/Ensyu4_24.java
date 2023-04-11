package ensyu4_24;
/*
 * クラス名:ensyu4_22
 * 概要  :演習4-22
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
import java.util.Scanner;
public class Ensyu4_24 {
	/*
	 * 関数名：main
	 * 概要  :n段のピラミッドを表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//入力された値を格納する変数
		int inputNumber=0;
		//入力が正しく行われているかチェック
		do {
			//整数値の入力を促す
			System.out.println("2以上の整数：");
			//入力された値を処理できるように変換
			inputNumber = standardInput.nextInt();
		//2以上の整数でない場合繰り返し処理
		}while(inputNumber<2);
		//
		int divisorNumber=2;
		while(divisorNumber<inputNumber) {
			if(inputNumber%divisorNumber == 0) {
				System.out.println(inputNumber+"は素数ではありません");
				break;
			}
			++divisorNumber;
		}
		if(inputNumber == divisorNumber) {
			System.out.println(inputNumber+"は素数です");
		}
	}
}

package ensyu4_24;
/*
 * クラス名:ensyu4_24
 * 概要  :演習4-24
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
import java.util.Scanner;
public class Ensyu4_24 {
	/*
	 * 関数名：main
	 * 概要  :素数かどうか判定プログラム
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
		//わる数を設定　１だと全整数割り切れるので２から始める
		int divisorNumber=2;
		//入力された値よりもわる数の方が小さい間、
		while(divisorNumber<inputNumber) {
			//もし、入力された値が割ることができたら、
			if(inputNumber%divisorNumber == 0) {
				//入力された値は素数ではない
				System.out.println(inputNumber+"は素数ではありません");
				//素数でないことがわかったので、これ以上while文ですることはない
				break;
			}
			//割る数を一つ増やして、どんどん割り算していく
			++divisorNumber;
		}
		//もし、入力された値と割る数が等しい場合、
		if(inputNumber == divisorNumber) {
			//入力された値までのすべての整数で割ったので、入力された値は素数である。
			System.out.println(inputNumber+"は素数です");
		}
	}
}

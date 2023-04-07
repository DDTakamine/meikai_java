package ensyu3_5;
import java.util.Scanner;
/*
 * クラス名:ensyu3_5
 * 概要  :演習3-5
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_5 {
	/*
	 * 関数名：main
	 * 概要  :正の整数値を読み込んで、
	 * 　　　　　・５で割れたならば、その値は５で割れますと表示
	 *           ・そうでなければ、その値は５で割れませんと表示
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.07  
	 */
	public static void main (String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//正の整数入力を促す
		System.out.print("正の整数値：");
		//計算するための準備
		int inputNumber = standardInput.nextInt();
		//入力された値が負であるならば
		if (inputNumber < 0)
			//処理を終了させる
			System.out.println("正でない値が入力されました。");
		//５で割れないならば
		else if (inputNumber % 5 != 0)
			//その値は５で割り切れません。と表示
			System.out.println("その値は５で割り切れません。");
		//そうでなければ
		else 
			//５で割り切れると表示
			System.out.println("その値は５で割り切れます。");
	}

}

package ensyu3_3;
import java.util.Scanner;
/*
 * クラス名:ensyu3_3
 * 概要  :演習3_3
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_3 {
	/*
	 * 関数名：main
	 * 概要  : 明解Java　５８ページList3-5 プログラムを改変
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.07
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数入力を促す
		System.out.print("整数値：");
		//計算するための準備
		int inputNumber = standardInput.nextInt();

		//もし、整数値が正ならば
		if (inputNumber > 0)
			//その値は正です。と表示
			System.out.println("その値は正です。");
		//もし、整数値が負ならば
		else if (inputNumber < 0)
			//その値は負です。と表示
			System.out.println("その値は負です。");
		//もし、整数値が０なら
		else if (inputNumber == 0)		//ここは変更　特に変化なし
			//その値は０です。と表示
			System.out.println("その値は０です。");
	}
}

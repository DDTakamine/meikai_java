package ensyu3_6;
/*
 * クラス名:ensyu3_5
 * 概要  :演習3-5
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
import java.util.Scanner;
public class ensyu3_6 {
	/*
	 * 関数名：main
	 * 概要  :正の整数値を読み込んで、
	 * 　　　　　・10の倍数ならば、その値は10の倍数です。と表示
	 *           ・そうでなければ、その値は10の倍数ではありません。と表示
	 *        正でない値を読み込んだら、正でない値が入力されました。と表示
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
		int inputValue = standardInput.nextInt();
		//入力された値が負ならば、
		if (inputValue < 0)
			//正でない値が入力されました。と表示
			System.out.println("正でない値が入力されました。");
		//10の倍数でないならば、
		else if (inputValue%10 != 0)
			//その値は10の倍数ではありません。と表示
			System.out.println("その値はその値は10の倍数ではありません。");
		//それ以外（10の倍数）ならば、
		else 
			//その値は10の倍数です。と表示
			System.out.println("その値は10の倍です。");
	}
}

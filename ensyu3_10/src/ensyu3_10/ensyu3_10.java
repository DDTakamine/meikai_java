package ensyu3_10;
import java.util.Scanner;
/*
 * クラス名:ensyu3_10
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_10 {
	/*
	 * 関数名：main
	 * 概要  :2つの整数値を読み込む。２つの差を表示する。
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数値入力を促す
		System.out.print("整数値A：");
		//計算準備をする
		int firstInteger = standardInput.nextInt();
		//整数値入力を促す
		System.out.print("整数値B：");
		//計算準備をする
		int secondInteger = standardInput.nextInt();
		//２つの差を表示する。
		System.out.println("２つの値の差は" + (firstInteger>secondInteger ? (firstInteger-secondInteger) : (secondInteger-firstInteger)) + "です。");
	}
}

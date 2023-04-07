package ensyu3_9;
import java.util.Scanner;
/*
 * クラス名:ensyu3_8
 * 概要  :演習3-8
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_9 {
	/*
	 * 関数名：main
	 * 概要  :2つの実数値を読み込む。大きいほうを表示する。
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//実数入力を促す
		System.out.print("実数値A：");
		//計算するための準備
		double firstOperand = standardInput.nextDouble();
		//実数入力を促す
		System.out.print("実数値B：");
		//実数入力を促す
		double secondOperand = standardInput.nextDouble();
		//大きいほうを表示する。
		System.out.println("大きい方は" + (firstOperand>secondOperand ? firstOperand : secondOperand) + "です。");
	}
}

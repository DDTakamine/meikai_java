package ensyu3_4;
import java.util.Scanner;
/*
 * クラス名:ensyu3_4
 * 概要  :演習3-4
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_4 {
	/*
	 * 関数名：main
	 * 概要  :標準入力した２つの値での大小関係を表示する。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数入力を促す
		System.out.print("整数A：");
		//計算するための準備
		int FirstOperand = standardInput.nextInt();
		//整数入力を促す
		System.out.print("整数B：");
		//計算するための準備
		int secondOperand = standardInput.nextInt();

		//もし、整数Aが整数Bより大きい場合
		if (FirstOperand > secondOperand)
			//Aの方が大きいです。と表示
			System.out.println("Aの方が大きいです。");
		//もし、整数Bが整数Aより大きい場合
		else if (FirstOperand < secondOperand)
			//Bの方が大きいです。と表示
			System.out.println("Bの方が大きいです。");
		//どちらでもない場合
		else
			//AとBは等しいです。と表示
			System.out.println("AとBは等しいです。");
	}
}

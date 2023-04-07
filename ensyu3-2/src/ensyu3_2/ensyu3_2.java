package ensyu3_2;
import java.util.Scanner;
/*
	 * クラス名:ensyu3_2
	 * 概要  :演習3_2
	 * 作成者:R.Akamine
	 * 作成日:2023/04/07
	 */
public class ensyu3_2 {
	/*
	 * 関数名：main
	 * 概要  :２つの整数値を読み込み、
	 * 　　　後者が前者の約数であれば、BはAの約数です。
	 * 　　　そうでなければ、BはAの約数ではありません。　と表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.07
	 */
	public static void main(String[] arg){
		//標準入力のためにクラス作成
		Scanner standardInput = new Scanner(System.in);
		//一つの整数値の入力を促す
		System.out.print("整数A：");
		//入力された値をfirstOperandに格納し、計算準備
		int firstOperand = standardInput.nextInt();
		//二つの整数値の入力を促す
		System.out.print("整数B：");
		//入力された値をsecondOperandに格納し、計算準備
		int secondOperand = standardInput.nextInt();
		//もし、firstOperandをsecondOperandで割った余りが０ならば、
		if (firstOperand % secondOperand == 0)
			//BはAの約数です。と表示
			System.out.println("BはAの約数です。");
		//もし、secondOperandをfirstOperandで割った余りが０ならば、
		else if (secondOperand % firstOperand == 0)
			//AはBの約数です。と表示
			System.out.println("AはBの約数です。");
		//どちらでもない場合は
		else
			//約数関係はありません。と表示
			System.out.println("約数関係はありません。");
	}
}

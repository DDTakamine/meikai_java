package ensyu5_3;
import java.util.Scanner;
/*
 * クラス名:ensyu5_3
 * 概要  :演習5-3
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_3 {
	/*
	 * 関数名：main
	 * 概要  :True False 表示
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.12
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//bool型を宣言　trueを代入
		boolean firstBool = true;
		//bool型を宣言　falseを代入
		boolean secondBool = false;
		//firstBoolを表示
		System.out.println("firstBool = "+firstBool);
		//firstBoolを表示
		System.out.println("secondBool = "+secondBool);
	}
}

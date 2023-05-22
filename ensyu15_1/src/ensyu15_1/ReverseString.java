package ensyu15_1;
import java.util.Scanner;
/*
* クラス名:ReverseString
* 概要  :演習15-1
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class ReverseString {
	/*
	 * 関数名：main
	 * 概要  : 文字列を逆順で表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void main(String[] args) {
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//文字列入力を促す
		System.out.print("文字列：");
		//入力された値を格納
		String reverseString = standardInput.nextLine();
		//結果の表示
		System.out.print("逆順後：");
		//逆順になるようにループ
		for(int i=reverseString.length()-1;i>=0;i--) {
			//文字列の末尾から一つずつ表示
			System.out.print(reverseString.charAt(i));
		}
	}
}

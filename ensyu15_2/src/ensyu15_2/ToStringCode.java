package ensyu15_2;
import java.util.Scanner;
/*
* クラス名:ReverseString
* 概要  :演習15-2
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class ToStringCode {
	/*
	 * 関数名：main
	 * 概要  : 文字列を一文字ずつ文字コードに変換
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
		String StringCode = standardInput.nextLine();
		//文字列の文字数だけループを回す
		for(int i=0; i<StringCode.length();i++) {
			//文字列の一文字をintにキャスト
			System.out.println(StringCode.charAt(i)+" : "
											+(int)StringCode.charAt(i));
		}
		
	}
}

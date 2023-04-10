package ensyu2_10;
import java.util.Scanner ;
/*
 * クラス名:ensyu2_10
 * 概要  :演習2-10
 * 作成者:R.Akamine
 * 作成日:2023/04/06
 */
public class ensyu2_10 {
	/*
	 * 関数名：main
	 * 概要  :名前の姓と名を別々で入力を行い、あいさつを行う
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.06  
	 */
	public static void main(String[] args) {
		//苗字・名前を標準入力するためにクラスを作成
		Scanner standardInputValue = new Scanner(System.in);
		//苗字の入力を促す
		System.out.print("姓：");
		//標準入力から名前を受け取る
		String firstName = standardInputValue.next();
		//苗字の入力を促す
		System.out.print("名：");
		//標準入力から苗字を受け取る
		String familyName = standardInputValue.next();
		//あいさつを表示する
		System.out.print("こんにちは"+ familyName + firstName + "さん。");
	}
}

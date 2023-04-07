package ensyu3_1;
import java.util.Scanner;
/*
 * クラス名:ensyu3_1
 * 概要  :演習3_1
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_1 {
	/*
	 * 関数名：main
	 * 概要  :整数値を読み込んで、その絶対値を表示
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.07
	 */
	public static void main (String[] args){
		//標準入力のためにクラスを生成
		Scanner standardInput = new Scanner(System.in);
		//整数値入力を促す
		System.out.print("整数値：");
		//標準入力された値を計算するため、int型に格納
		int integerNumber = standardInput.nextInt();
		//もし、整数が正ならば、
		if (integerNumber >= 0)
			//整数値をそのまま表示
			System.out.println("その絶対値は" + integerNumber + "です。");
		//整数値が正以外ならば
		else 
			//マイナスをつけて表示
			System.out.println("その絶対値は" + (-integerNumber) + "です。");
	}

}

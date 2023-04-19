package ensyu7_7;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_7
 * 概要  :演習7-7
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_7 {
	/*
	 * 関数名：putStars
	 * 概要  :引数で受け取った整数値分だけ*を表示
	 * 引数  :int型　n　＊を表示する個数
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void putStars(int n){
		putChars('*',n);
	}
	/*
	 * 関数名：putChars
	 * 概要  :１つの単語と整数値を受け取り、整数値分だけ単語を連続で表示
	 * 引数  :char型：c 一文字
	 *		　int型	：n 表示する個数
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void putChars(char c,int n){
		//ｎ回繰り返す
		while(n-- > 0) {
			//引数で受け取った単語を表示
			System.out.print(c);
		}
	}
	/*
	 * 関数名：main
	 * 概要  :右下に直角がくるような直角三角形を＊で表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("右下直角の三角形を表示します。");
		//段数保存
		int numberOfStep = 0;
		//最低段数
		final int stepLimit = 1;
		//入力が正しいか確認
		do {
			//段数入力を促す
			System.out.print("段数は：");
			//入力した値を受け取る
			numberOfStep = standardInput.nextInt();
		//stepLimitより小さい値は正しくない値、再入力
		}while(numberOfStep<stepLimit);
		//スペースと＊を表示するループ
		for(int i=1; i<= numberOfStep; i++) {
			//＊を表示
			putStars(i);
			//改行を表示
			System.out.println();
		}
	}
}

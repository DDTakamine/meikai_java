package ensyu15_3;
import java.util.Scanner;
/*
* クラス名:StrinrSearch
* 概要  :演習15-3
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class StrinrSearch {
	/*
	 * 関数名：main
	 * 概要  : 文字列を探索する
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void main(String[] args) {
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//文字列入力を促す
		System.out.print("文字列s1：");
		//入力された値を格納
		String firstString = standardInput.nextLine();
		//探索する文字列入力を促す
		System.out.print("文字列s2：");
		//入力された値を格納
		String secondString = standardInput.nextLine();
		
		final int NOT_SAME = -1;
		//文字列を表示
		System.out.println("文字列s1："+firstString);
		//文字列を表示
		System.out.print("文字列s2：");
		//文字列が一致するか確認
		int loopNumber = firstString.indexOf(secondString);
		//一致する文字列があった場合は
		if(loopNumber != NOT_SAME) {
			//loopNumberまでスペースを表示
			for(int i=0;i<loopNumber;i++) {
				//スペースを表示
				System.out.print(" ");
			}
			//文字列を表示
			System.out.print(secondString);
		}
		
	}
}

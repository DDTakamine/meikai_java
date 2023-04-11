package ensyu4_20;
import java.util.Scanner;
/*
 * クラス名:ensyu4_20
 * 概要  :演習4-20
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class ensyu4_20 {
	/*
	 * 関数名：main
	 * 概要  :ｎ段の正方形を表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//
		System.out.println("正方形を表示するプログラムです");
		//
		System.out.println("何段表示しますか？");
		//
		int stepValue = standardInput.nextInt();
		//
		for(int i=0; i<stepValue; i++) {
			for(int j=0; j<stepValue; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}

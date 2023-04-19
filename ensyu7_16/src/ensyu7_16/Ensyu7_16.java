package ensyu7_16;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_16
* 概要  :演習7-16
* 作成者:R.Akamine
* 作成日:2023/04/19
*/
public class Ensyu7_16 {
	/*関数名・引数名はテキストに従う
	 * 関数名：minOf
	 * 概要  :配列aの全要素の最小値を求めるメソッド
	 * 引数  :int型　配列
	 * 戻り値:int型　要素の最小値
	 * 作成日:2023.04.19
	 */
	static int minOf(int[]a) {
		//最小値を保存する変数
		int minimamValue = 0;
		//最小値を求めていく
		for(int i=0;i<a.length;i++) {
			//もし、最小値より小さな値が見つかったら、
			if(minimamValue>a[i]) {
				//値をコピー
				minimamValue = a[i];
			}
		}
		//最小値を返す
		return minimamValue;
	}
	
	/*
	 * 関数名：main
	 * 概要  :minOfメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.19
	 */
	public static void main(String[] args) {
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//配列要素数の下限を決めた
		final int ELEMENT_MINIMAM_LIMIT = 1;
		//配列の要素数を保存
		int arrayElement = 0;
		//繰り返し
		do {
			//要素数入力
			System.out.print("要素数：");
			//入力された配列の値を保存
			arrayElement = standardInput.nextInt();
		//要素数は１以上
		}while(arrayElement < ELEMENT_MINIMAM_LIMIT);
		//配列を用意する
		int[] argumentArray = new int [arrayElement];
		//配列の要素を入力していく
		for(int i=0; i<arrayElement; i++) {
			//要素入力を促す
			System.out.print("x["+i+"]:");
			//入力した値を保存
			argumentArray[i] = standardInput.nextInt();
		}
		//minOfメソッドの返り値を確認
		System.out.println("最小値："+minOf(argumentArray));
	}
	
}

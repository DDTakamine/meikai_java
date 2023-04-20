package ensyu7_15;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_15
* 概要  :演習7-15
* 作成者:R.Akamine
* 作成日:2023/04/19
*/
public class Ensyu7_15 {
	/*関数名・引数名はテキストに従う
	 * 関数名：sumOf
	 * 概要  :配列aの全要素の合計を求めるメソッド
	 * 引数  :int型　配列
	 * 戻り値:int型　要素の合計
	 * 作成日:2023.04.19
	 */
	static int sumOf(int[] a) {
		//結果を格納
		int resultValue = 0;
		//合計を求める
		for(int i=0; i<a.length;i++) {
			//ひとつずつ足していく
			resultValue += a[i];
		}
		//結果を返す
		return resultValue;
	}
	
	/*
	 * 関数名：main
	 * 概要  :配列の合計を求める
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.19
	 */
	public static void main(String[] args) {
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//配列の要素数
		int arrayElement = 0;
		//繰り返し
		do {
			//要素数入力
			System.out.print("要素数：");
			//入力された配列の値を保存
			arrayElement = standardInput.nextInt();
		//０より小さい場合は再入力
		}while(arrayElement<0);
		//配列を用意する
		int[] argumentArray = new int [arrayElement];
		//配列の要素を入力していく
		for(int i=0; i<arrayElement; i++) {
			//要素入力を促す
			System.out.print("x["+i+"]:");
			//入力した値を保存
			argumentArray[i] = standardInput.nextInt();
		}
		//合計を表示
		System.out.println("全要素の合計："+sumOf(argumentArray));
		
		
	}
}

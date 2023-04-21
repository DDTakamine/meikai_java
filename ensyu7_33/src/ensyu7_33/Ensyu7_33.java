package ensyu7_33;
/*
* クラス名:ensyu7_33
* 概要  :演習7-33
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_33 {
	/*関数名・引数名は教本に従う
	 * 関数名 :printArray
	 * 概要   :１次元配列を表示（各要素の間には１文字分のスペースを空けること）
	 * 引数   :int型　１次元配列　a
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	static void printArray(int[] a) {
		//配列aの全要素を参照していく
		for(int arrayElement:a) {
			//数値を一つ表示して、一文字分空ける
			System.out.print(arrayElement+" ");
		}
	}
	
	
	/*関数名・引数名は教本に従う
	 * 関数名 :printArray
	 * 概要   :２次元配列を表示（各列の数字の先頭が揃うように最低限スペースを空ける）
	 * 引数   :int型　２次元配列　a
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	static void printArray(int[][] a) {
		//行を参照するループ
		for(int i=0; i<a.length; i++) {
			//列を参照する
			for(int j:a[i]) {
				//数値を一つ表示して、タブを表示
				System.out.print(j+"\t");
			}
			//１行表示が終わったら改行を表示
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//標準入力で１次元の配列や凹凸な配列が作成できるようにする
		int[] firstArray = {2,4,5,-77777,23,657};
		int[][] secondArray = { {67,23,0} ,{24,342,-92872,2983} ,{24,423,-8789} };
		
		
	}
	
}

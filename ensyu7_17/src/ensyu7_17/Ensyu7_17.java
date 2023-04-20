package ensyu7_17;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_17
* 概要  :演習7-17
* 作成者:R.Akamine
* 作成日:2023/04/19
*/
public class Ensyu7_17 {
	/*関数名・引数名はテキストに従う
	 * 関数名：linearSearchR
	 * 概要  :配列aからkeyと同じ値を探す。
	 * 		　見つかった場合は配列の末尾に近い側のindexを返す。見つからない場合は-1を返す。
	 * 引数  :int型　配列a
	 * 		  int型　key 探索する整数値
	 * 戻り値:int型　検索した値のindexを返す
	 * 				見つからなかった場合は-1を返す
	 * 作成日:2023.04.19
	 */
	static int linearSearchR(int[]a,int key) {
		//添え字の保存する変数
		int seekIndex = -1;
		//末尾まで回す
		for(int i=0;i<a.length;i++) {
			//もし、同じ値がみつかったら、
			if(a[i] == key) {
				//インデックスをコピー
				seekIndex = i;
			}
		}
		//インデックスを返す
		return seekIndex;
	}
	/*
	 * 関数名：main
	 * 概要  :linearSearchRメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.19
	 */
	public static void main(String[] args) {
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//配列要素数の下限を決めた
		final int ELEMENT_MINIMAM_LIMIT = 1;
		//値が見つからなかった場合
		final int NOT_FOUND = -1;
		//配列の要素数を保存
		int arrayElement = 0;
		//探したい整数値
		int seekKey = 0;
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
		//探したい整数値の入力を促す
		System.out.print("探したい値：");
		//入力された値を保存
		seekKey = standardInput.nextInt();
		//返り値を保存
		int resultValue = linearSearchR(argumentArray,seekKey);
		//もし、探したい値が見つからなかったら、
		if(NOT_FOUND == resultValue) {
			//見つからなかった報告
			System.out.println("見つかりませんでした。");
		//もし、見つかったら、
		}else {
			//何番目に格納されているか教える
			System.out.println("配列の"+resultValue+"番目にあります。");
		}
	}
}

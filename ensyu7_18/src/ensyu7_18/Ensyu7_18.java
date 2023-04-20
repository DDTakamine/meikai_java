package ensyu7_18;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_18
* 概要  :演習7-18
* 作成者:R.Akamine
* 作成日:2023/04/20
*/
public class Ensyu7_18 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	/*
	 * 関数名：createArray
	 * 概要  :配列を作成して、要素を標準入力により行う
	 * 引数  :なし
	 * 戻り値:　int型配列　argumentArray 作成した配列
	 * 作成日:2023.04.20
	 */
	static int[] createArray() {
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
		//作成した配列を返す
		return argumentArray;
		
	}
	/*関数名・引数名は教本に従う
	 * 関数名：aryRmv
	 * 概要  :配列aから要素a[idx]を削除するメソッドaryrmvを作成
	 * 引数  :int型配列　a    要素を排除する並列
	 * 		  int型　　　idx  削除する配列の要素インデックス
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	static int[] aryrmv(int[] a, int idx) {
		//値を一つ前の配列にコピーするループ
		for(int indexNumber=idx; indexNumber<a.length-1;indexNumber++) {
			//値をコピー
			a[indexNumber] = a[indexNumber+1];
		}
		//削除完了した配列を返す
		return a;
	}
	
	/*
	 * 関数名：main
	 * 概要  :rsryrmvメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	public static void main(String[] args) {
		//配列を用意
		int[] testArray = createArray();
		//削除する配列要素インデックスを保存
		int removeElement = 0;
		//削除するインデックスは０以上
		final int REMOVED_MINIMAM_INDEX = 0;
		//削除前の配列を表示
		System.out.print("削除前：");
		//配列表示ループ
		for(int elementNumber:testArray) {
			//要素を一つ一つ表示
			System.out.print(elementNumber+"  ");
		}
		//見た目整える為に、改行する
		System.out.println();
		//繰り返し
		do {
			//削除番号を入力
			System.out.println("何番目を削除しますか？");
			//入力された数値を保存
			removeElement = standardInput.nextInt();
		//入力された値が０以上かチェック
		}while(removeElement<REMOVED_MINIMAM_INDEX);
		//要素を削除した配列を受け取る
		testArray = aryrmv(testArray,removeElement);
		//削除後の配列表示
		System.out.print("削除後：");
		//配列表示ループ
		for(int elementNumber:testArray) {
			//一つ一つ表示
			System.out.print(elementNumber+"  ");
		}
	}
}

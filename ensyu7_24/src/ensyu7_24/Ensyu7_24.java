package ensyu7_24;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_24
* 概要  :演習7-24
* 作成者:R.Akamine
* 作成日:2023/04/20
*/
public class Ensyu7_24 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	
	/*関数名・引数名は教本に従う
	 * 関数名：aryRmvOf
	 * 概要  :配列aから要素a[idx]を削除した配列を返却するメソッド
	 * 		　削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行う
	 * 引数  :int型配列　a    要素を削除する配列
	 * 		  
	 * 作成日:2023.04.20
	 */
	static int[] arrayRmvOf(int[] a, int idx) {
		//戻り値用の配列　
		//要素を一つ削除するので、(a.length-1)
		int[] returnArray = new int [a.length-1];
		//配列a全ての要素を参照していく
		for(int i=0;i<a.length-1; i++) {
			//idxの１つ前までは、
			if(i<idx) {
				//配列aの値をコピーしていく
				returnArray[i] = a[i];
			//iがidxになったらそれ以降は
			}else {
				//配列aのインデントを一つ増やしたところをコピー
				returnArray[i] = a[i+1];
			}
		}
		//要素を削除した配列を返す
		return returnArray;
	}
	
	
	/*
	 * 関数名：createArray
	 * 概要  :配列を作成して、要素を標準入力により行う
	 * 引数  :String arrayName 配列名
	 * 戻り値:　int型配列　argumentArray 作成した配列
	 * 作成日:2023.04.20
	 */
	static int[] createArray(String arrayName) {
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
			System.out.print(arrayName+"["+i+"]:");
			//入力した値を保存
			argumentArray[i] = standardInput.nextInt();
		}
		//作成した配列を返す
		return argumentArray;
	}
	
	/*
	 * 関数名：printArray
	 * 概要  :配列の要素を表示
	 * 引数  :int型配列
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	static void printArray(int[]firstArray) {
		//配列初めのカッコ記号
		System.out.print("{");
		//配列の要素分だけループ
		for(int i=0; i<firstArray.length; i++) {
			//iの値がまだ最後まで達していないならば、
			if(i != firstArray.length-1) {
				//数値と","を表示
				System.out.print(" "+firstArray[i]+" ,");
			//最後に来たら、
			}else {
				//数値とスペースを表示
				System.out.print(" "+firstArray[i]+" ");
			}
		}
		//配列表現終わり
		System.out.print("}\n");
	}
	
	/*
	 * 関数名：main
	 * 概要  :aryRmvOfメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	public static void main(String[] args) {
		//配列を用意
		int[] testArray = createArray("a");
		//削除する要素番号
		int deleteIndex = 0;
		//削除前の配列を表示
		printArray(testArray);
		//繰り返し
		do {
			//削除する要素番号入力を促す
			System.out.print("削除する要素番号：");
			//入力された値を保存
			deleteIndex = standardInput.nextInt();
		//削除する要素番号が０よりも小さくならない　または　testArrayの要素数を越えない
		}while(deleteIndex<0 || testArray.length-1<deleteIndex);
		//arraRmvOfメゾットを実行
		testArray = arrayRmvOf(testArray,deleteIndex);
		//配列の要素を表示
		printArray(testArray);
		
	}
	
	
}

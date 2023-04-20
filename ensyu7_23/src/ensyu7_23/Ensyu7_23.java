package ensyu7_23;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_23
* 概要  :演習7-23
* 作成者:R.Akamine
* 作成日:2023/04/20
*/
public class Ensyu7_23 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	/*関数名・引数名は教本に従う
	 * 関数名：arraySrchIdx
	 * 概要  : 配列aの要素のなかで値がxである全要素のインデックスを
	 * 		   先頭から順に格納した配列を返却する
	 * 引数  :int型配列　a    探索を行う配列
	 * 		  int型　　　x    探す値
	 * 作成日:2023.04.20
	 */
	static int[] arraySrchIdx(int[] a,int x) {
		//探したい値が配列内に何個あるかを格納
		int arrayElement = 0;
		//配列内の要素全て探索
		for(int i=0; i<a.length; i++) {
			//もし、同じ値があったら、
			if(a[i] == x) {
				//arrayElement１つ増やす
				arrayElement += 1;
			}
		}
		//返り値として返す配列を作成
		int[] returnArray = new int [arrayElement];
		//探したい値のインデックスを格納する
		int returnArrayIndex = 0;
		//配列をもう一度探索
		for(int i=0; i<a.length; i++) {
			//もし、一致したら、
			if(a[i] == x) {
				//インデックスを返り値用の配列に格納
				returnArray[returnArrayIndex] = i;
				//返却用の配列のインデックスを一つ増やす
				returnArrayIndex += 1;
			}
		}
		//配列を返す
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
	 * 概要  :arraySrchIdxメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	public static void main(String[] args) {
		//操作を行う配列を作成
		int[] firstArray = createArray("a");
		//探したい値の入力
		System.out.print("探したい値：");
		//求めたい値を格納する
		int seekInteger = standardInput.nextInt();
		//返り値の配列を格納する配列
		int[] resultArray = arraySrchIdx(firstArray,seekInteger);
		//もし、返ってきた配列の長さが０ならば、
		if(resultArray.length != 0) {
			//求める配列はこれになりますと表示
			System.out.print("同じ値を持つインデックスの配列は");
			//配列を表示
			printArray(resultArray);
		//返ってきた配列の長さが０（値がない）ならば、
		}else {
			//値は探せなかったです。と表示
			System.out.print("値は探せなかったです。");
		}
	}
}

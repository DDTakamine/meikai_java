package ensyu7_21;

//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_21
 * 概要  :演習7-21
 * 作成者:R.Akamine
 * 作成日:2023/04/20
 */
public class Ensyu7_21 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	/*関数名・引数名は教本に従う
	 * 関数名：aryExchng
	 * 概要  :配列aと配列bの全要素の値を入れ替える
	 *        配列の要素が等しくない場合は、
	 *        要素数が小さいほうの要素数分の要素を交換
	 * 引数  :int型配列　a    要素を交換する配列
	 * 		  int型配列　b    要素を交換する配列
	 * 作成日:2023.04.20
	 */
	static void aryExchng(int[] a, int[] b) {
		//交換回数を格納
		int exchangeNumber = 0;
		//もし、配列bの方が長い場合
		if(a.length < b.length) {
			//交換回数は配列aの長さだけ
			exchangeNumber = a.length;
		//それ以外は
		}else {
			//交換回数は配列bの長さだけ
			exchangeNumber = b.length;
		}
		//一時保存用の配列
		int[] temporaryArray = new int [exchangeNumber];
		//exchangeNumberだけループ
		for(int i=0; i<exchangeNumber;i++) {
			//一時退避
			temporaryArray[i] = a[i];
			//値交換
			a[i] = b[i];
			//退避していた値を格納
			b[i] = temporaryArray[i];
		}
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
	 * 概要  :aryInsメソッドを実行するメソッド
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.20
	 */
	public static void main(String[] args) {
		//配列を用意
		int[] firstArray = createArray("a");
		//配列を用意
		int[] secondArray = createArray("b");
		//配列の要素を入れ替える
		aryExchng(firstArray,secondArray);
		//配列aは、
		System.out.print("a=");
		//要素はこんな感じです
		printArray(firstArray);
		//配列bは
		System.out.print("b=");
		//要素はこうなってます
		printArray(secondArray);
	}

}

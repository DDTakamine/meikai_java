package ensyu7_33;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_33
* 概要  :演習7-33
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_33 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名 :searchDigit
	 * 概要   :桁数を調べる
	 * 引数   :int型　integerValue
	 * 返り値 :int型　digitCount
	 * 作成日:2023.04.24
	 */
	static int searchDigit(int integerValue) {
		//桁数カウント変数
		int digitCount = 1;
		//１０を格納
		int tenDigit = 10;
		//負の時は
		if(integerValue<=0) {
			//桁数を一つ増やす
			digitCount += 1;
			integerValue = (-1)*integerValue; 
		}
		//tenDigitで割ると０以外の間まわる
		while(integerValue > 0) {
			//桁数を一つ増やす
			digitCount++;
			//桁数を一つ減らす
			integerValue = integerValue/tenDigit;
		}
		//桁数を返す
		return digitCount;
	}
	/*
	 * 関数名 :columnAccess
	 * 概要   :２次元配列で列ごとに（縦に）参照していき、桁数が大きい整数値を返す
	 * 			もし、その行に要素がなければ、次の行
	 * 引数   :int型　２次元配列　testArrray
	 * 		　 int型　列数　　　　columnNumber
	 * 返り値 :int型　最大桁数
	 * 作成日:2023.04.24
	 */
	
	static int columnAccess(int[][] testArray, int columnNumber){
		//列の中で最大桁数を格納
		int maxmumDigit = -1;
		//一時的に保存用
		int temporaryMaximum = 0;
		//列に対するループ
		for(int i=0;i<testArray.length; i++) {
			//columnNumberがもし、行の要素数以下ならば、
			if(columnNumber<testArray[i].length) {
				//桁数を求めて格納
				temporaryMaximum = searchDigit(testArray[i][columnNumber]);
				//もし、maxmumDigitよりも一時的に値を保存している場合、
				if(maxmumDigit<temporaryMaximum) {
					//値をコピー
					maxmumDigit = temporaryMaximum;
				}
			}
		}
		//最大桁数を返す
		return maxmumDigit;
	}
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
		//改行を表示
		System.out.println();
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :printArray
	 * 概要   :２次元配列を表示（各列の数字の先頭が揃うように最低限スペースを空ける）
	 * 引数   :int型　２次元配列　a
	 * 返り値 :なし
	 * 作成日:2023.04.25
	 */
	static void printArray(int[][] a) {
		//数値とスペースを表示するループ
		for(int i=0; i<a.length; i++) {
			//列操作に対するループ
			for(int j=0; j<a[i].length; j++) {
				//数値を表示
				System.out.print(a[i][j]);
				//スペースを表示する回数分だけループ
				for(int k=0; k<=(columnAccess(a,j)-searchDigit(a[i][j]));k++) {
					//スペースを表示
					System.out.print(" ");
				}
			}
			//改行
			System.out.println();
		}
		
	}
	/*
	 * 関数名 :makeLinearArray
	 * 概要   :1次元配列を作成
	 * 引数   :なし
	 * 返り値 :int型　配列　returnArray
	 * 作成日:2023.04.24
	 */
	static int[] makeLinearArray() {
		//配列要素を格の
		int arrayElement = 0;
		//繰り返し
		do {
			//配列の要素数を取得
			System.out.print("１次元配列の要素数：");
			//入力された値を保存
			arrayElement = standardInput.nextInt();
		//要素数が０以下なら再入力
		}while(arrayElement<1);
		//配列を準備
		int[] returnArray = new int [arrayElement];
		//配列に要素を入れていく
		for(int i=0; i<arrayElement; i++) {
			//何番目の要素入力になっているか伝える
			System.out.print(i+"番目の要素：");
			//入力された値を保存
			returnArray[i] = standardInput.nextInt();
		}
		//作成した配列を返す
		return returnArray;
	}
	
	/*
	 * 関数名 :makeMultiArray
	 * 概要   :1次元配列を作成
	 * 引数   :int型　aarayElement 作成する配列の要素数
	 * 返り値 :int型　配列　returnArray
	 * 作成日:2023.04.24
	 */
	static int[][] makeMultiArray() {
		//行数を格のう
		int rowElement = 0;
		//列数を格のう
		int columnElement = 0; 
		//繰り返し
		do {
			//配列の要素数を取得
			System.out.print("２次元配列の行数：");
			//入力された値を保存
			rowElement = standardInput.nextInt();
			//要素数が０以下なら再入力
		}while(rowElement<1);
		//配列を用意
		int[][] returnArray = new int [rowElement][];
		//行に対するループ
		for(int i=0; i<rowElement; i++) {
			//繰り返し
			do {
				//配列の要素数を取得
				System.out.print("２次元配列の列数：");
				//入力された値を保存
				columnElement = standardInput.nextInt();
			//要素数が０以下なら再入力
			}while(columnElement<1);
			//列数を決めた
			returnArray[i] = new int [columnElement];
			//要素を配列に追加する
			for(int j=0; j<columnElement; j++) {
				//要素入力を促す
				System.out.print(i+"行目"+j+"列目の要素：");
				//入力した値を保存
				returnArray[i][j] = standardInput.nextInt();
			}
		}
		//作成した配列を返す
		return returnArray;
	}	
	/*
	 * 関数名 :main
	 * 概要   :printArrayを実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.24
	 */
	public static void main(String[] args) {
		//一次元の配列を渡して、実行
		printArray(makeLinearArray());
		//２次元配列を渡して実行
		printArray(makeMultiArray());
		
		
	}
	
}

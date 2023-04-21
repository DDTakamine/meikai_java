package ensyu7_27;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_27
* 概要  :演習7-27
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_27 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	
	/*関数名・引数名は教本に従う
	 * 関数名 :addMatrix
	 * 概要   :３つの２次元配列を受け取り、行数・列数が等しいかを判定
	 * 			等しい場合は和を求めた後、trueを返す。等しくない場合は、falseを返す。
	 * 引数   :int[][] x  数値が格納されている行列
	 * 		　 int[][] y　数値が格納されている行列
	 * 		   int[][] z　和の結果を格納する行列
	 * 返り値 :boolean
	 * 作成日:2023.04.21
	 */
	static boolean addMatrix(int[][] x,int[][] y, int[][] z) {
		//もし、それぞれの行数が等しい場合、
		if(x.length==y.length && y.length==z.length && z.length==x.length) {
			//列数を調べる為のループ
			for(int i=0; i<x.length; i++) {
				//列数が等しい場合、
				if(x[i].length==y[i].length && y[i].length==z[i].length && z[i].length == x[i].length) {
					//何もしない
				//列数が等しくない場合、
				}else{
					//falseを返す
					return false;
				}
			}
		//行数が一致しない場合、
		}else {
			//falseを返す
			return false;
		}
		//行に関するループ
		for(int i=0;i<x.length;i++) {
			//列に関するループ
			for(int j=0; j<x[i].length;j++) {
				//和の計算
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		//trueを返す
		return true;
	}
	
	/*関数名・引数名は教本に従う
	 * 関数名 :printMatrix
	 * 概要   :２次元配列を行列のように表示
	 * 引数   :int型　２次元配列　m
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	static void printMatrix(int[][] m) {
		//行に関するループ
		for(int i=0; i<m.length; i++) {
			//列に関するループ
			for(int j=0; j<m[i].length; j++) {
				//要素を表示して、スペースを表示
				System.out.print(m[i][j]+"\t");
			}
			//１つ行の表示が終わったので、改行
			System.out.println();
		}
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :main
	 * 概要   :addMatrixを実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	public static void main(String[] args) {
		//デバック用　,{4, 5, 6}
		//配列を初期化
		int[][] firstMatrix = { {9, 3, 3} , {4, 5, 6} };
		//配列を初期化
		int[][] secondMatrix = { {6, 3, 4} , {5, 1, 2} };
		//配列を初期化
		int[][] thirdMatrix = new int[2][3];
		//addMatrixから返ってきた真偽値を格納
		boolean trueOrFalse;
		//配列要素の和をもとめる
		trueOrFalse = addMatrix(firstMatrix,secondMatrix,thirdMatrix);
		//行列aの表示を知らせる
		System.out.println("行列a");
		//行列aの表示
		printMatrix(firstMatrix);
		//行列bの表示を知らせる
		System.out.println("行列b");
		//行列b表示
		printMatrix(secondMatrix);
		//addMatrixの返り値がtrueの場合
		if(trueOrFalse == true) {
			//行列cの表示を知らせる
			System.out.println("行列c");
			//行列cの表示
			printMatrix(thirdMatrix);
		//返り値がtrue以外の場合、
		}else{
			//条件があってないことを知らせる
			System.out.println("行数・列数が揃っていません");
		}
	}
	
}

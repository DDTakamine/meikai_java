package ensyu7_28;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_28
* 概要  :演習7-28
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_28 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	
	
	/*関数名・引数名は教本に従う
	 * 関数名 :addMatrix
	 * 概要   :行数・列数が等しいとした場合、行列の和を求める
	 * 引数   :int[][] x  数値が格納されている行列
	 * 		　 int[][] y　数値が格納されている行列
	 * 返り値 :int型２次元配列
	 * 作成日:2023.04.21
	 */
	static int[][] addMatrix(int[][] x,int[][] y) {
		//返却用配列を用意
		int[][] sumMatrix = new int [x.length][x[0].length];
		//行に関するループ
		for(int i=0;i<x.length;i++) {
			//列に関するループ
			for(int j=0; j<x[i].length;j++) {
				//和の計算
				sumMatrix[i][j] = x[i][j] + y[i][j];
			}
		}
		//行列を返す
		return sumMatrix;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :printMatrix
	 * 概要   :２次元配列を行列のように表示
	 * 引数   :int型　２次元配列　printedMatrix
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	static void printMatrix(int[][] printedMatrix) {
		//行に関するループ
		for(int i=0; i<printedMatrix.length; i++) {
			//列に関するループ
			for(int j=0; j<printedMatrix[i].length; j++) {
				//要素を表示して、スペースを表示
				System.out.print(printedMatrix[i][j]+"\t");
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
		//配列を初期化
		int[][] firstMatrix = { {9, 3, 3} , {4, 5, 6} };
		//配列を初期化
		int[][] secondMatrix = { {6, 3, 4} , {5, 1, 2} };
		//配列を初期化
		int[][] resultMatrix = new int[2][3];
		//配列要素の和をもとめる
		resultMatrix = addMatrix(firstMatrix,secondMatrix);
		//行列aの表示を知らせる
		System.out.println("行列a");
		//行列aの表示
		printMatrix(firstMatrix);
		//行列bの表示を知らせる
		System.out.println("行列b");
		//行列b表示
		printMatrix(secondMatrix);
		//行列cの表示を知らせる
		System.out.println("行列c");
		//行列cの表示
		printMatrix(resultMatrix);

	}

}

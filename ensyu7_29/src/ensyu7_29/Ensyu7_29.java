package ensyu7_29;
//標準入力の準備
import java.util.Scanner;
/*
	* クラス名:ensyu7_29
	* 概要  :演習7-29
	* 作成者:R.Akamine
	* 作成日:2023/04/21
	*/
public class Ensyu7_29 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;

	/*関数名・引数名は教本に従う
	 * 関数名 :aaryClone2
	 * 概要   :２次元配列を受け取り、その配列のクローンを作る
	 * 引数   :int[][] a  クローンを作成する行列
	 * 返り値 :int型２次元配列
	 * 作成日:2023.04.21
	 */
	static int[][] aryClone2(int[][]a){
		return a;
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
	 * 概要   :aryClone2を実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	public static void main(String[] args) {
		//配列を初期化
		int[][] firstMatrix = { {9, 3, 3} , {4, 5, 6} };
		//クローン作成前の表示
		System.out.println("オリジナル");
		//行列を表示
		printMatrix(firstMatrix);
		//クローン作成後の表示
		System.out.println("クローン");
		//行列を表示
		printMatrix(aryClone2(firstMatrix));
		
		
	}
	
}

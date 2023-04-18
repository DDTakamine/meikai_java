package ensyu6_16;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_16
 * 概要  :演習6-16
 * 作成者:R.Akamine
 * 作成日:2023/04/17
 */
public class Ensyu6_16 {
	/*
	 * 関数名：main
	 * 概要  :４×３行列、３×４行列の積を求めるプログラム
	 * 			各要素は標準入力
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.17
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//１つめの行列の行数
		final int firstMatrixRow = 4;
		//１つ目の行列の列数
		final int firstMatrixColumn = 3;
		//２つ目の行列の行数
		final int secondMatrixRow = 3;
		//２つ目の行列の列数
		final int secondMatrixColumn = 4;
		//１つ目の行列を用意
		int[][] firstMatrix  = new int [firstMatrixRow][firstMatrixColumn];
		//２つ目の行列を用意
		int[][] secondMatrix = new int [secondMatrixRow][secondMatrixColumn];
		//計算した後の行列を用意
		int[][] newMatrix    = new int [firstMatrixRow][secondMatrixColumn];
		//行列の要素を入力
		System.out.println("１つめの行列要素の入力");
		//行に対するループ
		for(int rowNumber=0; rowNumber<firstMatrixRow;rowNumber++) {
			//列に対するループ
			for(int columnNumber=0; columnNumber<firstMatrixColumn;columnNumber++) {
				//どこの入力かわかるように表示
				System.out.print(rowNumber+"行"+columnNumber+"列の要素：");
				//入力した値を受け取る
				firstMatrix[rowNumber][columnNumber] = standardInput.nextInt();
			}
		}
		//行列の要素を入力
		System.out.println("２つめの行列要素の入力");
		//行に対するループ
		for(int rowNumber=0; rowNumber<secondMatrixRow;rowNumber++) {
			//列に対するループ
			for(int columnNumber=0; columnNumber<secondMatrixColumn;columnNumber++) {
				//どこの入力かわかるように表示
				System.out.print(rowNumber+"行"+columnNumber+"列の要素：");
				//入力した値を受け取る
				secondMatrix[rowNumber][columnNumber] = standardInput.nextInt();
			}
		}
		//計算した後の要素を一度保存
		int newElement = 0 ;
		//行に対するループ
		for(int i=0; i<firstMatrixRow; ++i) {
			//列に対するループ
			for(int j=0; j<secondMatrixColumn; ++j) {
				//初期化
				newElement=0;
				//要素一つ一つを計算していくループ
				for(int k=0; k<secondMatrixRow; ++k) {
					//計算していく
					newElement += firstMatrix[i][k] * secondMatrix[k][j];
				}
				//計算した結果を保存
				newMatrix[i][j] = newElement;
			}
		}
		//行に対するループ
		for(int i=0; i<firstMatrixRow; ++i) {
			//列に対するループ
			for(int j=0; j<secondMatrixColumn; ++j) {
				//要素一つ表示
				System.out.printf("%5d \t",newMatrix[i][j]);
			}
			//行の表示が終えたので、改行
			System.out.print("\n");
		}
	}

}

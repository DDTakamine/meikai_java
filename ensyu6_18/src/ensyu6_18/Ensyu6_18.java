package ensyu6_18;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_18
 * 概要  :演習6-18
 * 作成者:R.Akamine
 * 作成日:2023/04/17
 */
public class Ensyu6_18 {
	/*
	 * 関数名：main
	 * 概要  :行数・各行の列数・各要素の値を標準入力
	 * 			List6-18を書き換える
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.17
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		
		int rowValue    = 0;
		int columnValue = 0;
		System.out.print("行数の入力：");
		rowValue = standardInput.nextInt();
		
		
		int[][] arrayMatrix = new int[rowValue][];
		
		
		for(int i=0; i<rowValue; ++i) {
			do {
				//System.out.print("--------0以上の整数値での入力\n");
				System.out.print(i+"行目の列数：");
				columnValue = standardInput.nextInt();
			}while(columnValue < 0);
			
			arrayMatrix[i] = new int[columnValue];
			
			System.out.println(i+"行目の要素");
			for(int j=0; j<columnValue; ++j) {
				System.out.print(i+"行"+j+"列：");
				arrayMatrix[i][j] = standardInput.nextInt();
			}
		}
		
		System.out.println("\n～行列の表示～");
		for(int i=0; i<rowValue; ++i ) {
			for(int j=0; j<columnValue; ++j) {
				System.out.print(arrayMatrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}

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
		//行数を保存
		int rowValue    = 0;
		//繰り返し
		do{
			//行数の入力
			System.out.print("行数の入力：");
			//入力した値を受け取る
			rowValue = standardInput.nextInt();
		//入力された値が負の間、
		}while(rowValue<1);
		//列数を保存
		int []columnValue = new int [rowValue];
		//行数のみ定義した行列を作成
		int[][] arrayMatrix = new int[rowValue][];
		//入力された行数分だけループ
		for(int i=0; i<rowValue; ++i) {
			//正の入力が正しくされているか確認ループ
			do {
				//列数をいくつにするか聞く
				System.out.print((i+1)+"行目の列数：");
				//入力された値を保存
				columnValue[i] = standardInput.nextInt();
			//０より小さい場合、再入力
			}while(columnValue[i] < 0);
			//入力されたi行目の列数で行列を作る
			arrayMatrix[i] = new int[columnValue[i]];
			//要素を入れ込んでいく
			System.out.println((i+1)+"行目の要素");
			//要素を入れ込んでいくためのループ
			for(int j=0; j<columnValue[i]; ++j) {
				//どこの入力かがわかるように表示
				System.out.print((i+1)+"行"+(j+1)+"列：");
				//入力された値を保存
				arrayMatrix[i][j] = standardInput.nextInt();	
			}
		}
		//結果表示準備
		System.out.println("\n～行列の表示～");
		//行を操作するループ
		for(int i=0; i<rowValue; ++i ) {
			//列を操作するループ
			for(int j=0; j<columnValue[i]; ++j) {
				//要素一つ一つを表示
				System.out.printf("%5d \t",arrayMatrix[i][j]);
			}
			//１つの行が表示終わったら改行
			System.out.print("\n");
		}
	}

}

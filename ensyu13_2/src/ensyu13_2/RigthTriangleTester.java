package ensyu13_2;
import java.util.Scanner;

/*
 * クラス名:RigthDownTriangle
 * 概要  :演習13-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class RigthTriangleTester {
	//標準入力
	static Scanner standardInput = new Scanner(System.in);
	//RightTriangle型配列
	public static RigthTriangle[] TriangleArray = new RigthTriangle [4] ;
	/*
	 * 関数名：main
	 * 概要  : Shape型配列を作成し、抽象クラスの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void main(String[] args) {
		//段数を格納
		int countNumber = stepNumber();
		//LeftDownTriangleを格納
		TriangleArray[0] = new LeftDownTriangle(countNumber);
		//LeftupTriangleを格納
		TriangleArray[1] = new LeftupTriangle(countNumber);
		//RigthDownTriangleを格納
		TriangleArray[2] = new RigthDownTriangle(countNumber);
		//RigthUpTriangleを格納
		TriangleArray[3] = new RigthUpTriangle(countNumber);
		//結果を表示する
		printRightTriangle();
	}
	/*
	 * 関数名：stepNumber
	 * 概要  : step数を標準入力で確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static int stepNumber() {
		//段数を格納する変数
		int countNumber = 0 ;
		//繰り返し
		do {
			//何個要素を準備するか聞く
			System.out.println("段数：");
			//標準入力の数値を保存
			countNumber = standardInput.nextInt();
		//０以下の時は再入力
		}while(countNumber < 1);
		//countNumberを返す
		return countNumber;
	}
	/*
	 * 関数名：printRightTriangle
	 * 概要  : RightTriangle型配列を画面に表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void printRightTriangle() {
		//配列の要素分だけループ
		for(RigthTriangle i:TriangleArray) {
			//画面に表示
			i.print();
			//改行
			System.out.println();
		}
	}
}

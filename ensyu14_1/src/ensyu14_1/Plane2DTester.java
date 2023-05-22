package ensyu14_1;
import java.util.Scanner;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Parallelogram
* 概要  :演習14-1
* 作成者:R.Akamine
* 作成日:2023/05/07
*/
public class Plane2DTester {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列要素数
	final static int ARRAY_ELEMENT = 2;
	//Shape型の準備
	//public static Plane2D[] testShape = new Plane2D[ARRAY_ELEMENT];
	public static Plane2D[] testShape = new Plane2D[ARRAY_ELEMENT];
	//底辺
	private static int width = 0;
	//高さ
	private static int height = 0;
	/*
	 * 関数名：main
	 * 概要  : 動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public static void main(String[] args) {
		//長方形の準備
		System.out.println("～長方形～");
		//width,heightを設定
		setWidthHeight();
		//Retangle型を作成
		testShape[0] = new Rectangle(width,height);
		//平行四辺形の準備
		System.out.println("～平行四辺形～");
		//width,heightを設定
		setWidthHeight();
		//Parallelogram型を作成
		testShape[1] = new Parallelogram(width,height);
		//testShapeを表示
		printShape(testShape);
	}
	/*
	 * 関数名：setWidthHeight
	 * 概要  : 底辺・高さを設定
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public static void setWidthHeight() {
		//底辺
		width = checkInteger();
		//高さ
		height = checkInteger();
	}
	/*
	 * 関数名：checkInteger
	 * 概要   :整数値が正の値になるようにする
	 * 引数  :なし
	 * 戻り値 :int　正の整数値
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public static int checkInteger() {
		//チェックする値を格納
		int checkValue = 0;
		//繰り返し
		do {
			//入力を促す
			System.out.print("底辺or高さ：");
			//標準入力
			checkValue = standardInput.nextInt();
		//０以下の間繰り返し
		}while(checkValue<1);
		//返却
		return checkValue;
	}
	/*
	 * 関数名：printShape
	 * 概要   :Plane2D配列の表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public static void printShape(Plane2D[] testPlane2D) {
		//要素数だけループ
		for(int i=0;i<ARRAY_ELEMENT;i++) {
			//toString()を表示
			testPlane2D[i].toString();
			//Plane2DをShapeにキャスト
			((Shape)testPlane2D[i]).draw();
			//面積を表示
			System.out.println("面積は"+testPlane2D[i].getArea()+"です。");
		}
	}
}

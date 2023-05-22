package ensyu13_1;
import java.util.Scanner;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class ShapeTester {
	//標準入力
	static Scanner standardInput = new Scanner(System.in);
	//Shape型配列
	public static Shape[] shapeArray ;
	/*
	 * 関数名：main
	 * 概要  : Shape型配列を作成し、抽象クラスの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void main(String[] args) {
		//Shape型配列をインスタンス
		shapeArray = new Shape [elementArray()];
		//配列にShapeクラスより下位クラスのものを入れる
		prepareArray();
		//Shape配列を表示
		printShape();
		
	}
	/*
	 * 関数名：elementArray
	 * 概要  : Shape型配列の要素数を標準入力で確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static int elementArray() {
		//要素数を格納する変数
		int elementNumber = 0 ;
		//繰り返し
		do {
			//何個要素を準備するか聞く
			System.out.println("図形は何個：");
			//標準入力の数値を保存
			elementNumber = standardInput.nextInt();
		//０以下の時は再入力
		}while(elementNumber < 1);
		//elementNumberを返す
		return elementNumber;
	}
	/*
	 * 関数名：prepareArray
	 * 概要  : Shape型配列に下位クラスの要素を入れていく
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void prepareArray() {
		//どの図形を選択するか数値を格納
		int caseByCase = 0;
		//配列の要素数だけループをするための変数
		int countNumber= 0;
		//点を選択した時の数値
		final int DOT_NUMBER = 1;
		//水平直線を選択した時の数値
		final int HORAIZONTAL_NUMBER = 2;
		//垂直直線を選択した時の数値
		final int VIRTICAL_NUMBER = 3;
		//長方形を選択した時の数値
		final int RECTANGLE_NUMBER =4 ;
		//作成した下位クラスで引数として必要な数値を格納
		int firstNumber = 0;
		//作成した下位クラスで引数として必要な数値を格納
		int secondNumber = 0;
		//繰り返す
		 do{
			 //繰り返す
			 do {
				 //選択肢を表示
				 System.out.print(countNumber+"番目の図形の種類(１.点　２.水平直線　"
						 + "３.垂直直線　４.長方形)：");
				 //数値を保存
				 caseByCase = standardInput.nextInt();
			//DOT_NUMBER～RECTANGLE_NUMBER以外の入力だと再入力
			 }while(caseByCase<DOT_NUMBER || RECTANGLE_NUMBER<caseByCase);
			 
			 //もし、DOT_NUMBERなら
			 if(caseByCase == DOT_NUMBER) {
				 //Pointクラスを配列に格納
				 shapeArray[countNumber] = new Point();
				 //改行
				 System.out.println();
				//もし、HORAIZONTAL_NUMBERなら
			 }else if (caseByCase == HORAIZONTAL_NUMBER) {
				 //値を確認して格納
				 firstNumber = checkValue("水平直線の長さ：");
				//改行
				 System.out.println();
				//HorzLineクラスを配列に格納
				 shapeArray[countNumber] = new HorzLine(firstNumber);
				//もし、VIRTICAL_NUMBERなら
			 }else if(caseByCase == VIRTICAL_NUMBER) {
				//値を確認して格納
				 firstNumber = checkValue("垂直直線の長さ：");
				//改行
				 System.out.println();
				//VirtLineクラスを配列に格納
				 shapeArray[countNumber] = new VirtLine(firstNumber);
				//もし、RECTANGLE_NUMBERなら
			 }else if(caseByCase == RECTANGLE_NUMBER) {
				//値を確認して格納
				 firstNumber = checkValue("長方形の幅：");
				//値を確認して格納
				 secondNumber = checkValue("長方形の高さ：");
				//改行
				 System.out.println();
				//Rectangleクラスを配列に格納
				 shapeArray[countNumber] = new Rectangle(firstNumber,secondNumber);
			 }
			 //countNumberを増やす
			 ++countNumber;
		//配列の要素数だけループ
		}while(countNumber<shapeArray.length);
	}
	
	/*
	 * 関数名：printShape
	 * 概要  : Shape型配列を画面に表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void printShape() {
		//配列の要素分だけループ
		for(Shape i:shapeArray) {
			//画面に表示
			i.print();
			//改行
			System.out.println();
		}
	}
	/*
	 * 関数名：checkValue
	 * 概要  : 入力された値が正の整数値ならば、その値を返す
	 * 　　　　　　　　　　　０以下ならばもう一度入力する
	 * 引数  :String 入力を促す文字列
	 * 戻り値 :int returnInteger
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static int checkValue(String emotionString) {
		//返却値
		int returnInteger=0;
		
		//繰り返し
		do {
			//入力を促す
			System.out.print(emotionString);
			//キーボードから入力を受け取る
			returnInteger = standardInput.nextInt();
		//0以下の値ならば、もう一度入力
		}while(returnInteger<1);
		//値を返す
		return returnInteger;
	}
}

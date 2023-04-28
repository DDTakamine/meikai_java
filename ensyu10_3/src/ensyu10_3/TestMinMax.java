package ensyu10_3;
/*
* クラス名:ensyu7_30
* 概要  :演習7-30
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class TestMinMax {
	/*関数名・引数名は教本に従う
	 * 関数名 :main
	 * 概要   :Class MinMaxを実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	public static void main(String[] args) {
		//１つ目の変数
		int firstValue = 333;
		//２つ目の変数
		int secondValue = 0;
		//３つ目の変数
		int thirdValue = 238;
		//配列を用意
		int[] arrayValue = {32,-9,0,32,4,-53};
		
		
		//引数が２つのメソッドの表示
		System.out.println("MinMax.min(a,b) = "+ MinMax.min(firstValue,secondValue));
		//引数が３つのメソッドの表示
		System.out.println("MinMax.min(a,b,c) = "+ MinMax.min(firstValue,secondValue,thirdValue));
		//引数が１つのメソッドの表示
		System.out.println("MinMax.min(a) = "+ MinMax.min(arrayValue));
		
		//引数が２つのメソッドの表示
		System.out.println("MinMax.max(a,b) = "+ MinMax.max(firstValue,secondValue));
		//引数が３つのメソッドの表示
		System.out.println("MinMax.max(a,b,c) = "+ MinMax.max(firstValue,secondValue,thirdValue));
		//引数が１つのメソッドの表示
		System.out.println("MinMax.max(a) = "+ MinMax.max(arrayValue));
	}
}

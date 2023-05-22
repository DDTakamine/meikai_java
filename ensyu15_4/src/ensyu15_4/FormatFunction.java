package ensyu15_4;
/*
* クラス名:FormatFunction
* 概要  :演習15-4
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class FormatFunction {
	/*変数名・メソッド名は教本に従う
	 * 関数名：main
	 * 概要  : 小数点を表示する
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void main(String[] args) {
		//double x = 123565.324254353;
		//小数を指定
		double doubleNumber = 2.8988888;
		//小数部分
		int DecimalPart = 9;
		//全体の少なくともの桁数
		int totalDigit = 16;
		//小数を表示
		 printDouble(doubleNumber,DecimalPart,totalDigit);
	}
	/*
	 * 関数名：printDouble
	 * 概要  :小数点を表示する
	 * 引数  :double x 小数
	 * 　　　 int p　小数部分の桁数
	 * 		　int w　全体の少なくともの桁数
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void printDouble(double x,int p, int w) {
		//指定された桁数だけ小数点を表示
		System.out.printf(String.format("%%%d.%df\n",w,p),x);
		
		
	}
}

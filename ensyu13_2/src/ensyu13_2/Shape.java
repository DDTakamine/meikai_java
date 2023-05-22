package ensyu13_2;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public abstract class Shape {
	/*
	 * 関数名：toString
	 * 概要  : 文字列を返すメソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract String toString();
	/*
	 * 関数名：draw
	 * 概要  : 図形を描写
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract void draw();
	/*
	 * 関数名：print
	 * 概要  : 図形・toStringを描写
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void print() {
		//toStringを呼び出して改行
		System.out.println(toString());
		//図を描写
		draw();
	}
}

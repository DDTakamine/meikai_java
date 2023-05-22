package ensyu13_2;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:RigthTriangel 抽象クラス
* 概要  :演習13-2
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public abstract class RigthTriangle extends Shape{
	/*
	 * 関数名：toString
	 * 概要  : 文字列を返す抽象メソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract String toString();
	/*
	 * 関数名：draw
	 * 概要  : 直角三角形を表示する抽象メソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract void draw();
	/*
	 * 関数名：print
	 * 概要  : 文字列と直角三角形を表示する抽象メソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void print() {
		//クラスを表示する
		System.out.println(toString());
		//直角三角形を表示
		draw();
	}
	
}

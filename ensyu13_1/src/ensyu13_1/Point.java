package ensyu13_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class Point extends Shape{
	//コンストラクタ
	public Point() {
		//何もしない
	}
	/*
	 * 関数名：toString
	 * 概要  :点に関する図形情報を表す文字列を返却する
	 * 引数  :なし
	 * 戻り値 :String "Point"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		//文字列"Point"を返す
		return "Ponit";
	}
	/*
	 * 関数名：draw
	 * 概要  :+を描写
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void draw() {
		//＋を描写
		System.out.println("+");
	}
}

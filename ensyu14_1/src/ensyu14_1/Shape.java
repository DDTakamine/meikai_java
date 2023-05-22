package ensyu14_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public abstract class Shape {
	//抽象メソッド　toString
	public abstract String toString();
	//抽象メソッド　draw
	public abstract void draw();
	//メソッド　
	public void print() {
		//toStringを呼び出して改行
		System.out.println(toString());
		//図を描写
		draw();
	}
}

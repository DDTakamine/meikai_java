package ensyu13_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class HorzLine extends AbstLine{
	//----コンストラクタ------//
	public HorzLine(int length) {
		//上位クラスのlengthをインスタンス化
		super(length);
	}
	/*
	 * 関数名：toString
	 * 概要  : Stringを返却する
	 * 引数  :なし
	 * 戻り値 :String "HorzLine:" + getLength() + ")"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		//クラス名を表示
		return "HorzLine:" + getLength() ;
	}
	/*
	 * 関数名：draw
	 * 概要  : -を描写　直線を描写
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void draw() {
		//length分だけループ
		for(int i=1; i<=getLength(); i++) {
			//-を映す
			System.out.print("-");
		}
	}
}

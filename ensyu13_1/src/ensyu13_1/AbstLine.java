package ensyu13_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public abstract class AbstLine extends Shape{
	//フィールド　長さ
	private int length = 0;
	//----コンストラクタ-----//
	public AbstLine(int length) {
		//長さをセット
		setLength(length);
	}
	/*
	 * 関数名：getLength
	 * 概要  : lengthを返却する
	 * 引数  :なし
	 * 戻り値 :int length
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public int getLength() {
		//lenghを返却
		return length;
	}
	/*
	 * 関数名：setLength
	 * 概要  :インスタンス化の際のlengthを更新
	 * 引数  :int length
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void setLength(int length) {
		//lengthを更新
		this.length = length;
	}
	/*
	 * 関数名：toString
	 * 概要  :文字列を返却する
	 * 引数  :なし
	 * 戻り値 :String "AbstLine(length:" + length +")"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		return "AbstLine(length:" + length +")";
	}
}

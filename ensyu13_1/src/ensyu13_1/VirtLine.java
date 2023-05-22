package ensyu13_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class VirtLine extends AbstLine{
	//-------コンストラクタ-------//
	public VirtLine(int length) {
		//上位クラスのlenngthを継承
		super(length);
	}
	/*
	 * 関数名：toString
	 * 概要  : Stringを返却する
	 * 引数  :なし
	 * 戻り値 :"VirtLine(length:" + getLength() + ")"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		//クラス名を表示
		return "VirtLine(length:" + getLength() + ")";
	}
	/*
	 * 関数名：draw
	 * 概要  : 縦の直線を表示
	 * 引数  :なし
	 * 戻り値 :｜で縦の直線を表示
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void draw() {
		//lengthの分だけループ
		for(int i=0; i<getLength(); i++) {
			//｜を表示
			System.out.println('|');
		}
	}
	
}

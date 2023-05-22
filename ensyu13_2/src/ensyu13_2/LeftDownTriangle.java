package ensyu13_2;
/*
* クラス名LeftDownTriangle
* 概要  :演習13-2
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class LeftDownTriangle extends RigthTriangle{
	//フィールド
	public int stepNumber=0;
	//コンストラクタ
	public LeftDownTriangle(int stepNumber) {
		//段数を保存
		this.stepNumber = stepNumber;
	}
	/*
	 * 関数名：toString
	 * 概要  : 文字列を返す抽象メソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		return "LeftDownTriangle " + this.stepNumber + "step";
	}
	
	/*
	 * 関数名：draw
	 * 概要  : 左下直角三角形を表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void draw() {
		//stepNumberだけループ
		for(int i=1; i<=stepNumber; i++) {
			//iまでループ
			for(int j=1; j<=i;j++) {
				//*を表示
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

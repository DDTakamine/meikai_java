package ensyu13_2;
/*
 * クラス名:RigthDownTriangle
 * 概要  :演習13-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class RigthDownTriangle extends RigthTriangle{
	//フィールド
	public int stepNumber=0;
	//コンストラクタ
	public RigthDownTriangle(int stepNumber) {
		//stepNumberを保存
		this.stepNumber = stepNumber;
	}
	/*
	 * 関数名：toString
	 * 概要  : 文字列を返すメソッド
	 * 引数  :なし
	 * 戻り値 :String 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		//文字列を返す
		return "RigthDownTriangle " + this.stepNumber + "step";
	}

	/*
	 * 関数名：draw
	 * 概要  : 右下直角三角形を表示するメソッド
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void draw() {
		//入力された段数分だけ段を作成
		for(int i=1; i<=stepNumber; i++) {
			//i段目でスペースまたは＊を表示する
			for(int j=stepNumber; j>0; j--) {
				//もし、段数がマス目以上ならば
				if(j<=i) {
					//*を表示
					System.out.print("*");
					//それ以外（段数がマス目より小さい）ならば、
				}else {
					//スペースキーを表示
					System.out.print(" ");
				}
			}
			//改行を入れることで段の区切りとする
			System.out.print("\n");
		}
	}
}

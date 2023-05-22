package ensyu14_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Shape 抽象クラス
* 概要  :演習13-1
* 作成者:R.Akamine
* 作成日:2023/05/06
*/
public class Rectangle extends Shape implements Plane2D{
	//フィード
	private int width=0;
	//フィールド
	private int height=0;
	//コンストラクタ
	public Rectangle(int width,int height) {
		//heightを更新
		this.height = height;
		//widthを更新
		this.width = width;
	}
	/*
	 * 関数名：getArea
	 * 概要  : 長方形の面積を返却する
	 * 引数  :なし
	 * 戻り値 :int 長方形の面積
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public int getArea() {
		//長方形の面積を返す
		return width*height;
	}
	/*
	 * 関数名：toString
	 * 概要  : Stringを返却する
	 * 引数  :なし
	 * 戻り値 :"Rectangle(width:" + width + ", height:" + height + ")"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")\n";
	}
	/*
	 * 関数名：draw
	 * 概要  : 長方形を表示
	 * 引数  :なし
	 * 戻り値 :＊で長方形を表示
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	
	public void draw() {
		//heightだけループ
		for(int i=1; i<=height; i++) {
			//widthだけループ
			for(int j=1; j<=width; j++) {
				//＊を表示
				System.out.print('*');
			}
			//一行表示終わったら改行
			System.out.println();
		}
	}
	
}

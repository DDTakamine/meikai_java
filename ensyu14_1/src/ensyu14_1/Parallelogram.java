package ensyu14_1;
/*
* クラス名:Parallelogram
* 概要  :演習14-1
* 作成者:R.Akamine
* 作成日:2023/05/07
*/
public class Parallelogram extends Shape implements Plane2D{
	//底辺の幅
	private int width = 0 ;
	//高さ
	private int height = 0 ;
	//コンストラクタ
	public Parallelogram(int width,int height) {
		//底辺の幅
		this.width = width;
		//高さ
		this.height = height;
	}
	/*
	 * 関数名：getArea
	 * 概要  : 平行四辺形の面積を返却する
	 * 引数  :なし
	 * 戻り値 :int 平行四辺形の面積
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public int getArea() {
		//平行四辺形の面積を返す
		return width*height;
	}
	/*
	 * 関数名：toString
	 * 概要  : Stringを返却する
	 * 引数  :なし
	 * 戻り値 :"Parallelogram(width:" + width + ",height:" + height + ")"
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public String toString() {
		//文字列を返す
		return "Parallelogram(width:" + width + ",height:" + height + ")\n";
	}
	/*
	 * 関数名：draw
	 * 概要  : 平行四辺形を表示
	 * 引数  :なし
	 * 戻り値 :＊で平行四辺形を表示
	 * 作成者:R.Akamine
	 * 作成日:2023.05.07
	 */
	public void draw() {
		//height分ループ
		for(int i=1;i<=height;i++) {
			//height分ループ
			for(int j=1;j<=height-i;j++) {
				//スペースを表示
				System.out.print(" ");
			}
			//width分ループ
			for(int j=1;j<=width;j++) {
				//#を表示
				System.out.print("#");
			}
			//改行を入れる
			System.out.println();
		}
	}

}

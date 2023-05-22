package ensyu12_1;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:DateId
* 概要  :演習11-1
* 作成者:R.Akamine
* 作成日:2023/05/02
*/
class CarEdition extends Car{
	//走行距離
	private double totalMileage = 0.0;
	
	//-----------コンストラクタ------------//
	public CarEdition(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		//上位クラスCarのコンストラクタ
		super(name,width,height,length,fuel,purchaseDay);
	}
	/*
	 * 関数名：move
	 * 概要  :Carクラスからmoveをオーバーライドして
	 * 　　　　そこに、走行距離を加えていく処理を加える
	 * 引数  :double dx,dy 
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public boolean move(double dx,double dy) {
		//返却値保存用
		boolean trueOrFalse = super.move(dx,dy);
		//距離を計算
		double distanceMeter = Math.sqrt(dx*dx + dy*dy);
		//走行距離を増やす
		totalMileage += distanceMeter;
		//返す
		return trueOrFalse;
	}
	/*
	 * 関数名：getTotalMileage
	 * 概要  :走行距離を返す
	 * 引数  :なし
	 * 戻り値 :double totalMileage 走行距離
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public double getTotalMileage() {
		//返却
		return this.totalMileage;
	}
}

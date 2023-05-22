package ensyu12_1;

/*クラス名・メソッド名は教本に従うものとする
* クラス名:Car
* 概要  :演習12-1
* 作成者:R.Akamine
* 作成日:2023/05/02
*/
public class Car {
	//名前
	private String name;
	//車幅
	private int width;
	//車高
	private int height;
	//車長
	private int length;
	//ｘ座標
	protected double x;
	//ｙ座標
	protected double y;
	//燃料
	protected double fuel;
	//購入日
	private Day purchaseDay;
	
	//-----------コンストラクタ------------//
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		//名前
		this.name = name; 
		//車幅
		this.width = width;
		//車高
		this.height=height;
		//車長
		this.length = length;
		//燃料
		this.fuel = fuel;
		//x,y座標
		x = y = 0.0;
		//購入日
		this.purchaseDay = new Day(purchaseDay);
	}
	/*
	 * 関数名：getX()
	 * 概要  :x座標を返す
	 * 引数  :なし
	 * 戻り値 :double x x座標
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public double getX() {
		//返す
		return x;
	}
	/*
	 * 関数名：getY()
	 * 概要  :y座標を返す
	 * 引数  :なし
	 * 戻り値 :double y y座標
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public double getY() {
		//返す
		return y;
	}
	/*
	 * 関数名：getFuel()
	 * 概要  :fuelを返す
	 * 引数  :なし
	 * 戻り値 :double fuel 燃料
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public double getFuel() {
		return fuel;
	}
	/*
	 * 関数名：getPurchaseDay()
	 * 概要  :Day型にしたものを返す
	 * 引数  :なし
	 * 戻り値 :Day(purchaseDay)
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public Day getPurchaseDay() {
		//新しいDayを返す
		return new Day(purchaseDay);
	}
	/*
	 * 関数名：putSpec()
	 * 概要  :スペックを表示する
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public void putSpec() {
		//名前表示
		System.out.println("名前："+name);
		//車幅表示
		System.out.println("車幅："+width+"mm");
		//車高表示
		System.out.println("車高："+height+"mm");
		//車長表示
		System.out.println("車長："+length+"mm");
	}
	/*
	 * 関数名：move
	 * 概要  :座標から距離を計算する
	 * 引数  :double dx,dy ｘ座標・ｙ座標
	 * 戻り値 :Day(purchaseDay)
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public boolean move(double dx,double dy) {
		//三平方の定理
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		
		//もし、燃料が足りない場合
		if(dist > fuel) {
			//falseを返す
			return false;
		//燃料がある場合は、
		}else {
			//距離の分、燃料を減らす
			fuel -= dist;
			//ｘ軸への移動距離
			x += dx;
			//ｙ軸への移動距離
			y += dy;
			//trueを返す
			return true;
		}
		
	}
	
}

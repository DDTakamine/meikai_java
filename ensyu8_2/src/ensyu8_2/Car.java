package ensyu8_2;

/*クラス名・変数名は教本に従う
 * クラス名:ensyu8_2
 * 概要  :演習8-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.25
 */
class Car {
	//車種のフィールド
	private String name; 
	//車幅のフィールド
	private int width  ;
	//高さのフィールド
	private int height  ;
	//長さのフィールド
	private int length  ;
	//現在位置ｘ座標のフィールド
	private double x;
	//現在位置ｙ座標のフィールド
	private double y;
	//残りの燃料のフィールド
	private double fuel;
	//燃料タンク最大量
	private double maximumFuel ;
	//車の番号フィールド
	private int carNumber;
	//燃費のフィールド
	private double fuelConsumption;
	
	//車のコンストラクト
	Car(String name,int width,int height,int length,double x,double y,
			double fuel,double maximumFuel,String carNumber,double fuelConsumption){
		//名前
		this.name=name;
		//車幅
		this.width=width;	  
		//高さ
		this.height=height; 
		//長さ
		this.length=length;
		//残りの燃料
		this.fuel=fuel;
		//最大燃料量
		this.maximumFuel=maximumFuel;
		//燃費
		this.fuelConsumption=fuelConsumption;
		//座標
		x = y = 0.0f;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getX
	 * 概要  :ｘ座標を渡す
	 * 引数  :なし
	 * 戻り値 :doube x x座標
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	double getX(){
		//ｘ座標を返す
		return x;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getY
	 * 概要  :ｙ座標を渡す
	 * 引数  :なし
	 * 戻り値 :double y y座標
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	double getY(){
		//ｙ座標を返す
		return y;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getFuel
	 * 概要  :残り燃料を取得
	 * 引数  :なし
	 * 戻り値 :double fuel
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	double getFuel(){
		//残り燃料を返す
		return fuel;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：putSpec
	 * 概要  :スペック（名前、車幅、車高、車長、最大燃料量）を表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	void putSpec(){
		//名前の表示
		System.out.println("名前："+name);
		//車幅の表示
		System.out.println("車幅："+width+"mm");
		//車高の表示
		System.out.println("車高："+height+"mm");
		//車長の表示
		System.out.println("車長："+length+"mm");
		//最大燃料量の表示
		System.out.println("最大燃料量："+maximumFuel+"L");
	}
	
	/*メソッド名・変数名は教本に従う
	 * 関数名：putSpec
	 * 概要  :移動距離を計算し、燃料を移動距離分だけ、減らしていく
	 * 引数  :double dx x方向の移動距離
	 * 		　double dy y方向の移動距離
	 * 戻り値 :boolean
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	boolean move(double dx, double dy) {
		//三平方の定理より、移動距離を計算
		double dist = Math.sqrt(dx*dx + dy*dy);
		//返り値を格納
		boolean trueOrFalse =true;
		//移動距離よりも燃料が多い場合、
		if(dist > fuel) {
			//falseを返す
			trueOrFalse = false;
		//燃料が残っている場合
		}else {
			//燃料を移動距離*燃費分引いて
			fuel -= fuelConsumption*dist;
			//ｘ方向に移動距離分足す
			x += dx;
			//ｙ方向に移動距離分足す
			y += dy;
			//trueを返す
			trueOrFalse = true;
		}
		//返り値
		return trueOrFalse;
	}
	/*
	 * 関数名：printFuelParcentage
	 * 概要  :タンクの最大量から残りの燃料をパーセント表示
	 * 引数  :なし
	 * 戻り値 :double
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	double printFuelParcentage() {
		//百分率になおすために定義
		final int PARCENT_VALUE = 100;
		//燃料の残量をパーセント表示
		return (fuel/maximumFuel)*PARCENT_VALUE;
	}
	/*
	 * 関数名：refuelTank
	 * 概要  :残量に給油する
	 * 		  給油出来たらtrue、最大燃料量を越えたらfalseを返す
	 * 引数  :double addedFuel
	 * 戻り値 :boolean
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	boolean refuelTank(double addedFuel) {
		//返り値を格納
		boolean trueOrFalse =true;
		//給油を行って、最大量を越えたら
		if(fuel+addedFuel >= maximumFuel) {
			//falseを返す
			trueOrFalse = false;
		//最大値をこえないようならば、
		}else {
			//給油を行う
			fuel += addedFuel;
			//給油を終えたらtrueを返す
			trueOrFalse = true;
		}
		//返り値を返す
		return trueOrFalse;
	}
}


package ensyu8_2;
/*クラス名・変数名は教本に従う
 * クラス名:ensyu8_2
 * 概要  :演習8-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.25
 */
public class TestCar {
	/*メソッド名・変数名は教本に従う
	 * 関数名：main
	 * 概要  :Carクラスが動作するか確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	public static void main(String[] args) {
		//インスタンス化
		Car anpanman = new Car("anpanmango",500,3000,5000,0.0,0.0
				,300.0,300.0,"1234",24.14);
		
		
		
		//ｘ座標の取得
		System.out.println("x座標："+anpanman.getX());
		//ｙ座標の取得
		System.out.println("y座標："+anpanman.getY());
		//残り燃料の表示
		System.out.printf("%.3f %% \n",anpanman.printFuelParcentage());
		//アンパンマン号のスペック紹介
		anpanman.putSpec();
		//見やすくするための表示
		System.out.println("移動前");
		//残りの燃料を表示
		System.out.printf("%.3f %% \n",anpanman.printFuelParcentage());
		//座標移動
		anpanman.move(3.0,4.0);
		//移動後の座標
		System.out.println("(x,y)=("+anpanman.getX()+","+anpanman.getY()+")");
		//見やすくするための表示
		System.out.println("移動後");
		//残りの燃料を表示
		System.out.printf("%.3f %% \n",anpanman.printFuelParcentage());
		//給油
		anpanman.refuelTank(1.0);
		//見やすくするための表示
		System.out.println("給油後");
		//残りの燃料を表示
		System.out.printf("%.3f %% \n",anpanman.printFuelParcentage());
	}
}

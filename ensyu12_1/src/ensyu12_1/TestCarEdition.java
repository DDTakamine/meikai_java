package ensyu12_1;

public class TestCarEdition {
	/*
	 * 関数名：main
	 * 概要  :CarEditionクラスの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public static void main(String[] args) {
		//インスタンス
		CarEdition testCarEdition = new CarEdition("march",500,1500,5000,300,new Day(2022,1,10));
		//初期化できているか確認
		testCarEdition.putSpec();
		//移動前ガソリン残量確認
		System.out.println("移動前"+testCarEdition.getFuel());
		//移動する
		testCarEdition.move(8, 15);
		//移動後ガソリン残量確認
		System.out.println("移動後"+testCarEdition.getFuel());
		//走行距離の表示
		System.out.println("移動後走行距離"+testCarEdition.getTotalMileage());
	}
}

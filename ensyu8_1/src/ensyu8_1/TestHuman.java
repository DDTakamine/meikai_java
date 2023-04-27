package ensyu8_1;
/*フィールド名・クラス名は教本に従う
 * クラス名:ensyu8_1
 * 概要  :演習8-1クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.25
 */
public class TestHuman {
	/*
	 * 関数名：main
	 * 概要  :Humanクラスが正しく動くかどうかチェック
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	public static void main(String[] args) {
		//クラスをインスタンス化
		Human Akamine = new Human("赤嶺亮介",170.0f,60.0f,"19920229","東京都");
		//スペック表示
		Akamine.putSpec();
		//区切りを表示
		System.out.println("ーーーーーーーーーーーーーーーーー");
		//ゲッタ確認
		System.out.println("名前："+Akamine.getName());
		//ゲッタ確認
		System.out.println("体重："+Akamine.getWeight());
		//calculateBMIが正しく動くか確認
		System.out.printf("BMI: %.3f \n",Akamine.calculateBMI());
		//住所の表示
		System.out.println(Akamine.getAddress());
		//再登録を促す
		System.out.print("住所の再登録：");
		//住所を再登録
		Akamine.reregistrationAddress();
		//登録後確認
		System.out.print("再登録確認用：");
		//住所の表示
		System.out.println(Akamine.getAddress());
	}
}

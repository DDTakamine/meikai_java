package ensyu9_4;
/*フィールド名・クラス名は教本に従う
 * クラス名:ensyu9_4
 * 概要  :演習9-4クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class TesterHuman {
	/*
	 * 関数名：main
	 * 概要  :Humanクラスが正しく動くかどうかチェック
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	public static void main(String[] args) {
		//クラスをインスタンス化
		Human Akamine = new Human("赤嶺亮介",170.0f,60.0f,new Day(1992,02,29),"東京都");
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
		System.out.println("住所："+Akamine.getAddress());
		//生年月日の表示
		System.out.println("生年月日："+Akamine.getBirthDay());
		//区切りを表示
		System.out.println("ーーーーーーーーーーーーーーーーー");
		//toStringの表示
		System.out.println("toString動作確認\n"+Akamine.toString());
	}
}

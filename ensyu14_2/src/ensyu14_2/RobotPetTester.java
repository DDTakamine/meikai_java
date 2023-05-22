package ensyu14_2;
/*
 * クラス名:RobotPetTester
 * 概要  :演習14-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class RobotPetTester {
	/*
	 * 関数名：main
	 * 概要  : RobotPetSkinnableの確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public static void main(String[] args) {
		//RobotPetSkinnableをインスタンス化
		RobotPetSkinnable CatTypeRobot = new RobotPetSkinnable("ドラえもん","NOBI Nobita");
		//自己紹介
		CatTypeRobot.introduce();
		//家事をこなす
		CatTypeRobot.work(1);
		//スキンを変更
		CatTypeRobot.changeSkin(1);
	}
}

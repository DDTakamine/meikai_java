package ensyu14_3;
/*
 * クラス名:RobotPet
 * 概要  :演習14-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class DVDPlayerTester {
	/*
	 * 関数名：main
	 * 概要  : DVDPlayerの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public static void main(String[] args) {
		//DVDPlayerをインスタンス
		DVDPlayer sonyDVD = new DVDPlayer();
		//再生
		sonyDVD.play();
		//停止
		sonyDVD.stop();
		//スロー再生
		sonyDVD.slow();
	}
}

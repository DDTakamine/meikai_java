package ensyu14_2;
/*
 * クラス名:RobotPet
 * 概要  :演習14-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class Pet {
	//ペットの名前
	private String name;
	//飼い主の名前
	private String masterName;
	//------コンストラクタ-------//
	public Pet(String name, String masterName) {
		//ペットの名前
		this.name = name;
		//飼い主の名前
		this.masterName = masterName;
	}
	/*
	 * 関数名：getName
	 * 概要  : ペットの名前を返す
	 * 引数  :なし
	 * 戻り値 :String　ペットの名前
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public String getName() {
		//nameを返却
		return name;
	}
	/*
	 * 関数名：getMasterName
	 * 概要  : 飼い主の名前を返す
	 * 引数  :なし
	 * 戻り値 :String　飼い主の名前
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public String getMasterName() {
		//masterNameを返却
		return masterName;
	}
	/*
	 * 関数名：introduce
	 * 概要  : 自己紹介
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public void introduce() {
		//自分の名前
		System.out.print("■僕の名前は"+ name +"です！");
		//飼い主の名前
		System.out.print("■ご主人様は"+ masterName +"です！");
	}
}

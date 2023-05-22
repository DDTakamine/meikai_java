package ensyu14_2;
/*
 * クラス名:RobotPet
 * 概要  :演習14-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class RobotPet extends Pet {
	//--------コンストラクタ---------//
	public RobotPet(String name, String masterName) {
		//上位クラスからの継承
		super(name,masterName);
	}
	/*
	 * 関数名：introduce
	 * 概要  : ペットの名前を返す
	 * 引数  :なし
	 * 戻り値 :String　ペットの名前
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public void introduce() {
		//自己紹介
		System.out.println("◇私はロボット。名前は"+getName()+"。");
		//飼い主を紹介
		System.out.println("◇ご主人様は"+getMasterName()+"。");
	}
	/*
	 * 関数名：work
	 * 概要  : 家事をする
	 * 引数  :int sw
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public void work(int sw) {
		//スイッチ文
		switch(sw) {
		//掃除する
		case 0: System.out.println("掃除します。"); break;
		//洗濯する
		case 1: System.out.println("洗濯します。"); break;
		//炊事する
		case 2: System.out.println("炊事します。"); break;
		}
	}
	
}

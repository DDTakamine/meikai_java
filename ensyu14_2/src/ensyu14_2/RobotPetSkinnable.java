package ensyu14_2;

public class RobotPetSkinnable extends RobotPet implements Skinnable{
	//-----コンストラクタ-----//
	public RobotPetSkinnable(String name, String masterName) {
		//RoBotPetから引き継ぐ
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
	 * 関数名：changeSkin
	 * 概要  : スキンを変更
	 * 引数  :int skin
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	public void changeSkin(int skin) {
		System.out.print("スキンを");
		//スイッチ文
		switch(skin) {
		//漆黒
		case BLACK:   System.out.print("漆黒"); break;
		//深紅
		case RED:     System.out.println("深紅"); break;
		//柳葉
		case GREEN:   System.out.println("柳葉"); break;
		//露草
		case BLUE:    System.out.println("露草"); break;
		//豹柄
		case LEOPARD: System.out.println("豹柄"); break;
		//無地
		default:      System.out.println("無地"); break;
		}
		//お知らせ
		System.out.println("に変更しました。");
	}
}

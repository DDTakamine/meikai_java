package ensyu14_2;
/*
 * インターフェイス名:Skinnable
 * 概要  :演習14-2
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public interface Skinnable {
	//漆黒
	int BLACK = 0;
	//深紅
	int RED = 1;
	//柳葉
	int GREEN = 2;
	//露草
	int BLUE = 3;
	//豹柄
	int LEOPARD = 4;
	/*
	 * 関数名：changeSkin
	 * 概要  : スキンを変更
	 * 引数  :int skin
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.08
	 */
	void changeSkin(int skin);
}

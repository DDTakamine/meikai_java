package ensyu3_17;

import java.util.Random;
/*
 * クラス名:ensyu3_17
 * 概要  :演習3-17
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu3_17{
	/*
	 * 関数名：main
	 * 概要  :0,1,2のいずれかの乱数を発生させる。
	 			もし乱数が０ならば、”グー”を表示させる
	 			もし乱数が１ならば、”チョキ”を表示させる
	 			もし乱数が２ならば、”パー”を表示させる
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main (String[] arg){
		//乱数発生の準備
		Random rand = new Random();
		//０～２の乱数を発生
		int randValue = rand.nextInt(3);
		//乱数で発生させた数値で場合分け
		switch (randValue){
			//randValueが０のとき、グーと表示
			case 0 : System.out.println("グー"); break;
			//randValueが１のとき、チョキと表示
			case 1 : System.out.println("チョキ"); break;
			//randValueが２のとき、パーと表示
			case 2 : System.out.println("パー"); break;
		}
	}
}
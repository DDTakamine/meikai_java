package ensyu13_3;
/*
 * クラス名:Player
 * 概要  :演習13-3
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public abstract class Player {
	//じゃんけんの手を格納
	public int rockPaperScissors = 0;
	/*
	 * 関数名：toString
	 * 概要  : 抽象クラス
	 * 引数  :なし
	 * 戻り値 :String
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract String toString() ;
	/*
	 * 関数名：getRockPaperScissors
	 * 概要  : 抽象クラス
	 * 引数  :なし
	 * 戻り値 :int
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public abstract int getRockPaperScissors();
	/*
	 * 関数名：print
	 * 概要  : toStringを表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public void print() {
		//toStringを表示
		System.out.println(toString());
	}
	

}

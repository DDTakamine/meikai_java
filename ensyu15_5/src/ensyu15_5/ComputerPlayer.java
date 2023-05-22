package ensyu15_5;
import java.util.Random;
/*
 * クラス名:ComputerPlayer
 * 概要  :演習15-5
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class ComputerPlayer extends Player{
	//乱数発生インスタンス化
	private Random randomValue = new Random(); 
	//乱数発生
	public int rockPaperScissors = 1 + randomValue.nextInt(3);
	//グー
	final int ROCK_VALUE = 1;
	//チョキ
	final int SCISSORS_VALUE = 2;
	//パー
	final int PAPER_VALUE = 3;
	/*
	 * 関数名：getRockPaperScissors
	 * 概要  : RockPaperScissorsを返す
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public int getRockPaperScissors() {
		//返却
		return rockPaperScissors;
	}
	/*
	 * 関数名：toString
	 * 概要  : じゃんけんの手を返す
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public String toString() {
		//返却用文字列格納
		String returnString = " ";
		//グーの時
		if(rockPaperScissors == ROCK_VALUE) {
			//グーの時の文字列を返す
			returnString = "ComputerPlayer : グー";
		//パーの時
		}else if(rockPaperScissors == PAPER_VALUE) {
			//パーの時の文字列を返す
			returnString = "ComputerPlayer : パー";
		//チョキの時
		}else {
			//チョキの時の文字列を返す
			returnString = "ComputerPlayer : チョキ";
		}
		//返却
		return returnString;
		
	}
}

package ensyu15_5;
import java.util.Scanner;
/*
 * クラス名:HumanPlayer
 * 概要  :演習15-5
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class HumanPlayer extends Player{
	//標準入力の準備
	public Scanner standardInput = new Scanner(System.in);
	//じゃんけんの手を格納
	public int rockPaperScissors = 0;
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
		//返却用文字列
		String returnString = " ";
		//繰り返し
		do {
			//手の説明
			System.out.print("1.グー　2.チョキ　3.パー：");
			//入力を保存
			rockPaperScissors = standardInput.nextInt();
		//１～３以外の入力なら再入力
		}while(rockPaperScissors<ROCK_VALUE || PAPER_VALUE<rockPaperScissors);
		//グーの時
		if(rockPaperScissors == ROCK_VALUE) {
			//グーの時の文字列
			returnString = "HumanPlayer : グー";
		//パーの時
		}else if(rockPaperScissors == PAPER_VALUE) {
			//パーの時の文字列を返す
			returnString = "HumanPlayer : パー";
		//チョキの時
		}else {
			//チョキの時の文字列を返す
			returnString = "HumanPlayer : チョキ";
		}
		//返却
		return returnString;
	}
}

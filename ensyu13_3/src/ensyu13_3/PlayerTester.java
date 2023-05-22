package ensyu13_3;
/*
 * クラス名:ComputerPlayer
 * 概要  :演習13-3
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class PlayerTester {
	//HumanPlayer型のインスタンス化
	private static Player personPlay = new HumanPlayer();
	//ComputerPlayer型のインスタンス化
	private static Player personalComputerPlay = new ComputerPlayer();
	
	/*
	 * 関数名：main
	 * 概要  : 抽象クラスPlayerの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void main(String[] args) {
		//HumanPlayer型の情報を表示
		personPlay.print();
		//ComputerPlayer型の情報を表示
		personalComputerPlay.print();
		//じゃんけんの結果を表示
		printResult(personPlay,personalComputerPlay);
		
	}
	/*
	 * 関数名：printResult
	 * 概要  : じゃんけんの結果を表示
	 * 引数  :Player　２つ
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void printResult(Player firstPlayer, Player secondPlayer) {
		//グー
		final int ROCK_VALUE = 1;
		//チョキ
		final int SCISSORS_VALUE = 2;
		//パー
		final int PAPER_VALUE = 3;
		//プレイヤーの手を保存
		int firstValue = firstPlayer.getRockPaperScissors();
		//コンピュータの手を保存
		int secondValue = secondPlayer.getRockPaperScissors();
		//じゃんけんで勝った場合、
		if(firstValue==ROCK_VALUE&&secondValue==SCISSORS_VALUE 
				|| firstValue==PAPER_VALUE&&secondValue==ROCK_VALUE 
				|| firstValue==SCISSORS_VALUE&&secondValue==PAPER_VALUE) {
			//勝ちと表示
			System.out.print("あなたの勝ちです！");
		//負けた場合、
		}else if(firstValue==SCISSORS_VALUE&&secondValue==ROCK_VALUE 
				|| firstValue==ROCK_VALUE&&secondValue==PAPER_VALUE 
				|| firstValue==PAPER_VALUE&&secondValue==SCISSORS_VALUE) {
			//負けと表示
			System.out.print("あなたの負けです。");
		//あいこの場合、
		}else {
			//あいこと表示
			System.out.print("あいこです。");
		}
	}
}

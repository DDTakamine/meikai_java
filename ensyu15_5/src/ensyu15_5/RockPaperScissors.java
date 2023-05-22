package ensyu15_5;
/*
 * クラス名:RockPaperScissors
 * 概要  :演習15-5
 * 作成者:R.Akamine
 * 作成日:2023/05/06
 */
public class RockPaperScissors {
	//HumanPlayer型のインスタンス化
	private static Player personPlayer = new HumanPlayer();
	//ComputerPlayer型のインスタンス化
	private static Player firstComputerPlayer = new ComputerPlayer();
	//ComputerPlayer型のインスタンス化
	private static Player secondComputerPlayer = new ComputerPlayer();
	
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
		personPlayer.print();
		//ComputerPlayer型の情報を表示
		firstComputerPlayer.print();
		//ComputerPlayer型の情報を表示
		secondComputerPlayer.print();
		//じゃんけんの結果を表示
		printResult(personPlayer,firstComputerPlayer,secondComputerPlayer);
	}
	/*
	 * 関数名：printResult
	 * 概要  : じゃんけんの結果を表示
	 * 引数  :Player　２つ
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static void printResult(Player firstPlayer, Player secondPlayer,Player thirdPlayer) {
		//勝った時の定数
		final int WIN_VALUE = 2;
		//引き分けた時の定数
		final int DRAW_VALUE = -1;
		//２番目の変数と同じ時
		final int SAME_SECOND = 2;
		//３番目の変数と同じ時
		final int SAME_THIRD  = 3;
		//２番目と３番目が同じ時
		final int SAME_SECOND_THIRD  = 4;
		
		//プレイヤーの手を保存
		int firstValue = firstPlayer.getRockPaperScissors();
		//コンピュータの手を保存
		int secondValue = secondPlayer.getRockPaperScissors();
		//コンピュータの手を保存
		int thirdValue = thirdPlayer.getRockPaperScissors();
		//searchSamePlayerの値を格納
		int resultNumber = searchSamePlayer(firstValue,secondValue,thirdValue );
		//じゃんけんで勝った場合、
		if(resultNumber ==SAME_SECOND && (firstValue-thirdValue+3)%3 == WIN_VALUE) {
			//勝ちと表示
			System.out.print("あなたの勝ちです！");
		//あいこの時
		}else if(resultNumber ==SAME_THIRD && (firstValue-secondValue+3)%3 == WIN_VALUE) {
			//勝ちと表示
			System.out.print("あなたの勝ちです！");
			//負けの場合、
		}else if(resultNumber == SAME_SECOND_THIRD && (firstValue-secondValue+3)%3 == WIN_VALUE){
			//勝ちと表示
			System.out.print("あなたの勝ちです！");
		}else if(resultNumber == DRAW_VALUE ) {
			//あいこと表示
			System.out.print("あいこです！");
		}else {
			//負けと表示
			System.out.print("あなたの負けです。");
		}
	}
	/*
	 * 関数名：searchSamePlayer
	 * 概要  : 最初の値と同じ値になっているものを探す
	 * 引数  :
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.06
	 */
	public static int searchSamePlayer(int firstValue,int secondValue,int thirdValue) {
		//結果格納
		int returnValue = 0;
		//３つが等しいならば、
		if(firstValue==secondValue && secondValue==thirdValue && thirdValue==firstValue) {
			//-1を返す
			returnValue = -1;
		//１と２が等しい場合、
		}else if(firstValue == secondValue){
			//２を返す
			returnValue = 2;
		//１と３が等しい場合、
		}else if(firstValue == thirdValue) {
			//３を返す
			returnValue = 3;
		//２と３が等しい場合、
		}else if(secondValue == thirdValue) {
			//４を返す
			returnValue = 4;
		//３つそれぞれが等しくない場合、
		}else if(firstValue!=secondValue && secondValue!=thirdValue && thirdValue!=firstValue) {
			//-1を返す
			returnValue = -1;
		}
		//返す
		return returnValue;
	}
}

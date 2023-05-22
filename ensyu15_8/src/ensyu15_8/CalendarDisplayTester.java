package ensyu15_8;
/*
* クラス名:CalendarDisplay
* 概要  :演習15-8
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class CalendarDisplayTester {
	/*
	 * 関数名：main
	 * 概要  :CalendarDisplay動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.10
	 */
	public static void main(String[] args) {
		//コマンド引数に値がない場合、
		if(args.length == 0) {
			//CalendarDisplay作成
			CalendarDisplay testClass = new CalendarDisplay();
			//表示
			testClass.displayCalendarMonth();
		//コマンド引数にyearのみの時
		}else if(args.length == 1) {
			//CalendarDisplay作成
			CalendarDisplay testClass = new CalendarDisplay(Integer.parseInt(args[0]));
			//表示
			testClass.displayCalendarYear();
		//コマンド引数にYear,Monthが与えられてた時、
		}else if(args.length == 2) {
			//CalendarDisplay作成
			CalendarDisplay testClass = new CalendarDisplay(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			//表示
			testClass.displayCalendarMonth();
		}
		
	}
	
}

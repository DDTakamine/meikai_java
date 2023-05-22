package ensyu15_8;
import java.util.Calendar;
/*
* クラス名:CalendarDisplay
* 概要  :演習15-8
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class CalendarDisplay extends Day{
	
	//月ごとの日数
	private int[] monthDays = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	//カレンダー上部に表示する文字列配列
	private String[] columnName = new String[]{" Sun "," Mon "," Tue "," Wed "," Thu "," Fri "," Sat "};
	//始まりの日を明記
	final int START_DAY = 1;
	//週をまたぐかどうかを確認用変数
	private int weekControl = dayOfWeek();
	//スタートになっている曜日を返す
	private int startDay = dayOfWeek();
	//今月が何月かを格納
	private int thisMonth = getMonth();
	//
	
	//--------コンストラクタ-------//
	CalendarDisplay(){
		setYear(Calendar.DAY_OF_YEAR);
		setMonth(Calendar.DAY_OF_MONTH);
		setDate(Calendar.DATE);
	}
	CalendarDisplay(int year){
		super(year);
	}
	CalendarDisplay(int year, int month){
		super(year,month);
	}
	/*
	 * 関数名：putSpace
	 * 概要  :スペースを表示する
	 * 引数  :なし
	 * 戻り値 :String
	 * 作成者:R.Akamine
	 * 作成日:2023.05.10
	 */
	public String putSpace(){
		//スペースを返す
		return " ";
	}
	/*
	 * 関数名：reshapeString
	 * 概要  :スペース文字スペースの文字列を返す
	 * 引数  :String oneCharacter
	 * 戻り値 :String
	 * 作成者:R.Akamine
	 * 作成日:2023.05.10
	 */
	public void reshapeString(String oneCharacter) {
		//文字列を返す
		System.out.print(" "+ oneCharacter +"  ");
	}
	/*
	 * 関数名：displayCalendarMonth()
	 * 概要  :一か月分のカレンダー
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.10
	 */
	public void displayCalendarMonth() {
		
		//土曜日は６
		final int FINAL_WEEK = 7;
		
		//何月かを表示
		System.out.println("=＝＝＝＝＝＝＝"+thisMonth+"月"+"＝＝＝＝＝＝＝=");
		//曜日を表示
		for(int i=0;i<columnName.length;i++) {
			//曜日をひとつひとつ表示
			System.out.print(columnName[i]);
		}
		//改行を入れる
		System.out.println();
		//スタート曜日までスペース表示
		for(int i=0;i<startDay;i++) {
			//全角スペースを表示
			reshapeString("　");
		}
		//今月が2月ならば、
		if(thisMonth == 2) {
			//うるう年ならば、
			if(isLeapYear(getYear())==true) {
				//２月の日数を変更
				monthDays[1] = 29;
			}
		}
		//int型をStringにするためにInteger変数を用意
		Integer gearChange = 0;
		//月の日数分だけループを回す
		for(int i=1;i<=monthDays[thisMonth-1];i++) {
			//iが一桁の時
			if(i/10 == 0) {
				//イテレータをInteger型にキャスト
				gearChange = Integer.valueOf(i);
				//日を表示
				reshapeString(" "+gearChange.toString());
			//iが二桁の時
			}else {
				//イテレータをInteger型にキャスト
				gearChange = Integer.valueOf(i);
				//日を表示
				reshapeString(gearChange.toString());
			}
			//曜日を一つ増やす
			++weekControl;
			//weekControlが土曜日ならば
			if(weekControl == FINAL_WEEK) {
				//改行
				System.out.println();
				//週初めに戻す
				weekControl = 0;
			}
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名：displayCalendarYear()
	 * 概要  :一か月分のカレンダー
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.10
	 */
	public void displayCalendarYear() {
		//１～１２月まで表示
		for(int i=1;i<=12;i++) {
			//今月を１月からスタートしていく
			setMonth(i);
			thisMonth = i;
			//週をまたぐかどうかを確認用変数
			weekControl = dayOfWeek();
			//スタートになっている曜日を返す
			startDay = dayOfWeek();
			
			//表示
			displayCalendarMonth();
		}
		
	}
}

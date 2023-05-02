package ensyu10_4;
import java.time.LocalDateTime;

/*
* クラス名:ensyu10_4
* 概要  :演習10-4
* 作成者:R.Akamine
* 作成日:2023/04/28
*/
public class Day {
	
	private int year = 1;
	private int month = 1;
	private int date = 1;
	private int[] monthOfDays = { 31,28,31,30,31,30,31,31,30,31,30,31 };
	
	/*
	 * 関数名：getLeapNumber
	 * 概要  :LeapNumberを取得
	 * 引数  :なし
	 * 戻り値 :int LeapNumber
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	public static boolean isLeap(int y) {
		return y%4==0 && y%100!=0 || y%400==0;
	}
	
	// ---- コンストラクタ ----- //
	public Day() {
		//日付取得のため、インスタンス化
		LocalDateTime nowDate = LocalDateTime.now();
		//年を初期化
		this.year = nowDate.getYear();
		//月を初期化
		this.month = nowDate.getMonthValue();
		//日を初期化
		this.date = nowDate.getDayOfMonth();
	}
	//年のみ引数
	public Day(int year) {
		//年を初期化
		this.year = year;
	}
	//年と月を初期化
	public Day(int year,int month) {
		//年の初期化
		this(year);
		//月の初期化
		this.month = month;
	}
	//年・月・日の初期化
	public Day(int year,int month,int date) {
		//年・月の初期化
		this(year,month);
		//日の初期化
		this.date = date;
	}
	//Day型を引数とする
	public Day(Day d) {
		//年・月・日の初期化
		this(d.year,d.month,d.date);
	}
	/*
	 * 関数名：getYear
	 * 概要  :yearを取得
	 * 引数  :なし
	 * 戻り値 :int year
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public int getYear() {
		//yearを返す
		return year;
	}
	/*
	 * 関数名：getMonth
	 * 概要  :monthを取得
	 * 引数  :なし
	 * 戻り値 :int month
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public int getMonth() {
		//monthを返す
		return month;
	}
	/*
	 * 関数名：getDay
	 * 概要  :dateを取得
	 * 引数  :なし
	 * 戻り値 :int date
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public int getDay() {
		//dateを返す
		return date;
	}
	/*
	 * 関数名：setYear
	 * 概要  :yearを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void setYear(int year) {
		//0より小さい値が入力されると
		if(year<0) {
			//０を代入
			this.year = 0;
		//それ以外なら、
		}else {
			//yearを代入
			this.year = year;
		}
	}
	/*
	 * 関数名：setMonth
	 * 概要  :Monthを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void setMonth(int month) {
		//初期化
		this.month = month;
		//チェック
		checkMonth();
	}
	/*
	 * 関数名：setDate
	 * 概要  :dateを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void setDate(int date) {
		//初期化
		this.date = date;
		//チェック
		checkDate();
	}
	/*
	 * 関数名：set
	 * 概要  :year,month,dateを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void set(int year, int month, int date) {
		//0より小さい値が入力されると
		if(year<0) {
			//０を代入
			this.year = 0;
			//それ以外なら、
		}else {
			//yearを代入
			this.year = year;
		}
		//初期化
		this.month = month;
		//チェックする
		checkMonth();
		//初期化
		this.date = date;
		//チェック
		checkDate();
	}
	/*
	 * 関数名：isLeap
	 * 概要  :year,month,dateを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public boolean isLeap() {
		//うるう年かどうかの真偽値を返す
		return isLeap(year);
	}
	/*
	 * 関数名：dayOfWeek
	 * 概要  :曜日を返す
	 * 引数  :なし
	 * 戻り値 :int 曜日
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m==1 || m==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + date)%7;
	}
	/*
	 * 関数名：equalTo
	 * 概要  :同じ日かどうか判定
	 * 引数  :Day型　
	 * 戻り値 :boolean型
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	/*
	 * 関数名：toString
	 * 概要  :文字列を返す
	 * 引数  :なし
	 * 戻り値 :も示列
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public String toString() {
		String[] wd = {"日","月","火","水","木","金","土"};
		return String.format("%04d年%02d月%02d日（%s）",
									year,month,date,wd[dayOfWeek()]);
	}
	/*
	 * 関数名：checkMonth
	 * 概要  :正しくない月が入力された際に、修正を加える
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void checkMonth() {
		//1よりも小さい値が入力されると
		if(this.month<1) {
			//１で修正を加える
			this.month = 1;
		//１２より大きい値が入力されると
		}else if(this.month>12) {
			//１２で修正を加える
			this.month = 12;
		}
		
	}
	/*
	 * 関数名：isLeapYear
	 * 概要  :うるう年かどうか判定
	 * 引数  :int型 西暦
	 * 戻り値 :Boolean型　true・うるう年　false・平年
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	public boolean isLeapYear(int inputYear) {
		//１基準
		final int FIRST_BASE = 4;
		//２基準
		final int SECOND_BASE = 100;
		//３基準
		final int THIRD_BASE = 400;
		//返り値格納用
		boolean trueOrFalse = false;
		//FIRST_BASEで割れるなら
		if(inputYear%FIRST_BASE == 0) {
			//SECOND_BASEで割れるなら
			if(inputYear%SECOND_BASE == 0) {
				//THIRD_BASEで割れるなら
				if(inputYear%THIRD_BASE == 0) {
					//うるう年である
					trueOrFalse = true;
				//THIRD_BASEで割れないなら
				}else {
					//平年である
					trueOrFalse = false;
				}
			//SECOND_BASEで割れないなら
			}else {
				//うるう年である
				trueOrFalse = true;
			}
		//FIRST_BASEで割れないなら
		}else{
			//平年です
			trueOrFalse = false;
		}
		//返り値を返す
		return trueOrFalse;
	}
	/*
	 * 関数名：checkDate
	 * 概要  :正しくない日が入力された際に、修正を加える
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void checkDate() {
		
		//もし、1,3,5,7,8,10,12月ならば、
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			//１～３１日の入力かどうか
			if(1<=date && date<=31) {
			
			//１～３１日の入力になっていない
			}else if(date<1){
				//正しくない入力
				month = 1;
			//31日より大きい入力ならば、
			}else if(31<date) {
				//31日に修正
				month = 31;
			}
			//もし、4,6,9,11月ならば、
		}else if(month==4 || month==6 || month==9 || month==11) {
			//１～３１日の入力かどうか
			if(1<=date && date<=30) {
				//１～３１日の入力になっていない
			}else if(date<1){
				//正しくない入力
				date = 1;
			//30日より大きい
			}else if(30<date){
				//修正
				date = 30;
			}
		//もし、2月ならば、
		}else if(month == 2) {
			//うるう年ならば、
			if(isLeapYear(year)) {
				//１～２９日の入力になっていたら、
				if(1<=date && date<=29) {
				
				//１～２９日の入力になっていなかったら、
				}else if(date<1){
					//修正
					date = 1;
				//29日より大きい場合、
				}else if(29<date) {
					//修正
					date = 29;
				}
			//うるう年ではないならば、
			}else {
				//１～２８日の入力になっていたら、
				if(1<=date && date<=28) {
					//１～２８日の入力になっていなかったら、
				}else if(date<1){
					//修正
					date = 1;
				//28日より大きいと
				}else if (28<date) {
					//修正
					date =28;
				}
			}
		}
	}
	/*
	 * 関数名：setMonthOfdDays()
	 * 概要  :月ごとに何日あるか配列を作成
	 * 　　　　2月の修正を行った
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void setMonthOfDays() {
		//もし、うるう年の時は2月を29日に変更
		if(isLeap(year)) {
			//2月をうるうとしに変更
			monthOfDays[1] = 29;
		}
	}
	
	
	
	/*
	 * 関数名：calculatePassDay()
	 * 概要  :年内での経過日数を求める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	
	public void calculatePassDay() {
		//配列monthOfDaysを修正
		setMonthOfDays();
		//加算していく変数
		int passDays = 0;
		//今日の日付を足す
		passDays = date ;
		//ひと月前から1月まで日数を足し算
		for(int i=month-2; i>=0; i--) {
			//これまでの経過した月の日数を足していく
			passDays += monthOfDays[i];
		}
		//結果の表示
		System.out.println("1月１日から"+passDays+"日目です。");
	}
	
	/*
	 * 関数名：calculateDay()
	 * 概要  :年内での経過日数を求める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	
	public void calculateLastDay() {
		//配列monthOfDaysを修正
		setMonthOfDays();
		//加算していく変数
		int lastDays = 0;
		//今日の日付を足す
		lastDays = monthOfDays[month-1] - date ;
		//ひと月前から1月まで日数を足し算
		for(int i=month; i<12; i++) {
			//これまでの経過した月の日数を足していく
			lastDays += monthOfDays[i];
		}
		//結果の表示
		System.out.println("今年は残り"+lastDays+"日です。");
	}
	
	/*
	 * 関数名：judgeBeforeOrAfterInstanse()
	 * 概要  :ほかの日付との前後関係を判定
	 * 引数  :Day型
	 * 戻り値 :int型　
	 * 		　　　　　１：インスタンス変数より先にある日付
	 * 		　　　　　０：インスタンス変数と同じ日付
	 * 		　　　　 -１：インスタンス変数より過去にある日付
	 * 
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public int judgeBeforeOrAfterInstanse(Day testDay) {
		//返り値を格納
		int returnValue = 0;
		//もし、インスタンス変数の年の方が大きい場合、
		if(year>testDay.year) {
			//-1にする
			returnValue = -1;
		//もし、インスタンス変数の年の方が小さい場合、
		}else if(year<testDay.year) {
			//1にする
			returnValue = 1;
		//年が等しい場合、
		}else {
			//もし、インスタンス変数のmonthの方が大きい場合、
			if(month>testDay.month) {
				//-１にする
				returnValue = -1;
			//もし、インスタンス変数のmonthの方が小さい場合、
			}else if(month<testDay.month) {
				//1を格納
				returnValue = 1;
			//月が等しい場合、
			}else {
				//もし、インスタンス変数のdateの方が大きい場合、
				if(date>testDay.date) {
					//-1にする
					returnValue = -1;
				//もし、インスタンス変数のdateが小さい場合、
				}else if (date<testDay.date) {
					//1にする
					returnValue = 1;
				//日も等しい場合
				}else {
					//０にする
					returnValue = 0;
				}
			}
		}
		//返す
		return returnValue;
	}
	/*
	 * 関数名：judgeBeforeOrAfterClassMethod()
	 * 概要  :年内での経過日数を求める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	static int judgeBeforeOrAfterClassMethod(Day firstDay,Day secondDay) {
		//返り値を格納
		int returnValue = 0;
		//もし、最初のクラス型変数の年の方が大きい場合、
		if(firstDay.year>secondDay.year) {
			//1にする
			returnValue = 1;
			//もし、最初のクラス型変数の年の方が小さい場合、
		}else if(firstDay.year<secondDay.year) {
			//-1にする
			returnValue = -1;
			//年が等しい場合、
		}else {
			//もし、最初のクラス型変数のmonthの方が大きい場合、
			if(firstDay.month>secondDay.month) {
				//１にする
				returnValue = 1;
				//もし、インスタンス変数のmonthの方が小さい場合、
			}else if(firstDay.month<secondDay.month) {
				//-1を格納
				returnValue = -1;
				//月が等しい場合、
			}else {
				//もし、インスタンス変数のdateの方が大きい場合、
				if(firstDay.date>secondDay.date) {
					//1にする
					returnValue = 1;
					//もし、インスタンス変数のdateが小さい場合、
				}else if (firstDay.date<secondDay.date) {
					//-1にする
					returnValue = -1;
					//日も等しい場合
				}else {
					//０にする
					returnValue = 0;
				}
			}
		}
		//返す
		return returnValue;
	}
	/*
	 * 関数名：passOneDay()
	 * 概要  :日付を１日後ろに進める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void passOneDay() {
		//もし、一日加えてその月の日数を越えた場合、
		if(date+1 > monthOfDays[month-1]) {
			//もし、月に1を加えて12月を越えた場合、
			if(month+1 > 12) {
				//年に１加えて
				year += 1;
				//月は１月に
				month = 1;
				//日は１日にする
				date = (date+1) - monthOfDays[month-1];
			//もし、月に１を加えて12月を越えなかった場合は、
			}else {
				//月に１を加えて、
				month += 1;
				//日を１にする
				date = (date+1) - monthOfDays[month-1];
			}
		//もし、一日加えてその月の日数を越えなかった場合、
		}else {
			//一日加える、
			date += 1;
		}
	}
	/*
	 * 関数名：returnPassOneDay()
	 * 概要  :日付を１日後ろに進める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public Day returnPassOneDay() {
		Day newDay = new Day(this);
		//もし、一日加えてその月の日数を越えた場合、
		if(newDay.date+1 > monthOfDays[newDay.month-1]) {
			//もし、月に1を加えて12月を越えた場合、
			if(newDay.month+1 > 12) {
				//年に１加えて
				newDay.year += 1;
				//月は１月に
				newDay.month = 1;
				//日は１日にする
				newDay.date = 1;
			//もし、月に１を加えて12月を越えなかった場合は、
			}else {
				//月に１を加えて、
				newDay.month += 1;
				//日を１にする
				newDay.date = (newDay.date+1) - monthOfDays[month-1];
			}
		//もし、一日加えてその月の日数を越えなかった場合、
		}else {
			//一日加える、
			newDay.date += 1;
		}
		return newDay;
	}
	/*
	 * 関数名：backOneDay
	 * 概要  :日付を１日前に進める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void backOneDay() {
		//もし、dateが１の場合、
		if(date == 1) {
			//もし、monthが１の場合、
			if(month == 1) {
				//年から１引いて
				year -= 1;
				//月は12月にする
				month = 12;
				//日は３１日にする
				date = 31;
			//もし、月が一月以外の場合は、
			}else{
				//月に１を引いて、
				month -= 1;
				//日を１にする
				date = monthOfDays[month-1];
			}
		//もし、一日加えてその月の日数を越えなかった場合、
		}else {
			//一日加える、
			date -= 1;
		}
	}
	/*
	 * 関数名：returnBackOneDay
	 * 概要  :日付を１日前に進める
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public Day returnBackOneDay() {
		Day newDay = new Day(this);
		//もし、dateが１の場合、
		if(newDay.date == 1) {
			//もし、monthが１の場合、
			if(newDay.month == 1) {
				//年から１引いて
				newDay.year -= 1;
				//月は12月にする
				newDay.month = 12;
				//日は３１日にする
				newDay.date = 31;
			//もし、月に１を加えて12月を越えなかった場合は、
			}else {
				//月に１を加えて、
				newDay.month -= 1;
				//日を１にする
				newDay.date = monthOfDays[month-1];
			}
		//もし、一日引いてその月の日数を越えなかった場合、
		}else {
			//一日引く、
			newDay.date -= 1;
		}
		return newDay;
	}
	
	/*
	 * 関数名：passNDay()
	 * 概要  :日付をN日後ろに進める
	 * 引数  :int型　n
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void passNDay(int n) {
		//ｎ回ループ
		for(int i=0;i<n-1;i++) {
			//１回ずつ進めていく
			passOneDay();
		}
	}
	
	/*
	 * 関数名：returnPassNDay
	 * 概要  :日付をn日後ろに進める
	 * 引数  :Day testDay
	 *        int n
	 * 戻り値 :Day testDay
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	 public Day returnPassNDay(int n) {
		 Day newDay = new Day(this);
		//n回ループ
		for(int i=0;i<n;i++) {
			//返り値無視
			newDay.passOneDay();
		}
		
		//ｎ-1回目だけ返り値を返す
		return newDay;
	}
	/*
	 * 関数名：backNDay()
	 * 概要  :日付をN日前に進める
	 * 引数  :int型　n
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public void backNDay(int n) {
		//ｎ回ループ
		for(int i=0;i<n-1;i++) {
			//１回ずつ進めていく
			backOneDay();
		}
	}
	
	/*
	 * 関数名：returnBackNDay()
	 * 概要  :日付をn日後ろに進める
	 * 引数  :Day testDay
	 *        int n
	 * 戻り値 :Day testDay
	 * 作成者:R.Akamine
	 * 作成日:2023.05.01
	 */
	public Day returnBackNDay(int n) {
		Day newDay = new Day(this);
		//n-1回ループ
		for(int i=0;i<n;i++) {
			//返り値無視
			newDay.backOneDay();
		}
		return newDay;
	}
}

package ensyu13_4;


/*フィールド名・クラス名は教本に従う
 * クラス名:Day
 * 概要  :演習9-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.26
 */
public class Day {
	//年を１で初期化
	private int year = 1;
	//月を１で初期化
	private int month = 1;
	//日を１で初期化
	private int date = 1;
	//コンストラクタ
	//引数なし
	public Day() {	
	}
	//年だけ引数としてとるコンストラクタ
	public Day(int year) {
		//年をセット
		this.year = year ;
	}
	//年・月を引数としてとるコンストラクタ
	public Day(int year,int month) {
		//年をセット
		this(year);
		//月をセット
		this.month = month;
	}
	//年・月・日を引数としてとるコンストラクタ
	public Day(int year,int month,int date) {
		//年・月をセット
		this(year,month);
		//日をセット
		this.date = date;
	}
	//Dayクラスを引数として受け取るコンストラクタ
	public Day(Day d) {
		//年・月・日をセット
		this(d.year,d.month,d.date);
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getYear
	 * 概要  :年を取得
	 * 引数  :なし
	 * 戻り値 :Day year
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public int getYear(){
		//年を返す
		return year;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getMonth
	 * 概要  :月を取得
	 * 引数  :なし
	 * 戻り値 :Day month
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public int getMonth(){
		//月を返す
		return month;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getDay
	 * 概要  :日を取得
	 * 引数  :なし
	 * 戻り値 :Day date
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public int getDay(){
		//dateを返す
		return date;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：setYear
	 * 概要  :年を設定
	 * 引数  :int year
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public void setYear(int year) {
		//年をセットする
		this.year = year;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：setMonth
	 * 概要  :月を設定
	 * 引数  :int month
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public void setMonth(int month) {
		//月をセットする
		this.month = month;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：setDay
	 * 概要  :月を設定
	 * 引数  :int date
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public void setDate(int date) {
		//日をセットする
		this.date = date;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：set
	 * 概要  :年月日を設定
	 * 引数  :int year
	 * 		  int month
	 * 		  int date
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public void set(int year,int month, int date) {
		//年を設定
		this.year = year;
		//月を設定
		this.month = month;
		//日を設定
		this.date = date;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：dayOfWeek
	 * 概要  :曜日を計算して返す
	 * 引数  :なし
	 * 戻り値 :曜日を返す
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public int dayOfWeek() {
		//年変数
		int y = year;
		//月変数
		int m = month;
		//月が１月または２月なら、
		if(	 m==1 || m==2 ) {
			//年を一つ引く
			y--;
			//１２を月に加える
			m += 12;
		}
		//曜日を求める
		return ( y + y/4 - y/100 + y/400 + (13*m+8)/5 + date )%7;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：dayOfWeek
	 * 概要  :日付が等しいかどうかを判定
	 * 引数  :Day 年・月・日を持つクラス
	 * 戻り値 :boolean
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public boolean equalTo(Day d) {
		//条件式が等しいかどうか判定
		return year == d.year && month == d.month && date == d.date;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：toString
	 * 概要  :文字列表現を返す
	 * 引数  :なし
	 * 戻り値 :String 年月日（曜日）を返す
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public String toString() {
		//文字列で曜日を定義
		String[] wd = {"日","月","火","水","木","金","土"};
		//年・月・日の文字列を返す
		return String.format("%04d年%02d月%02d日(%s)"
				,year,month,date,wd[dayOfWeek()]);
	}
	/*
	 * 関数名：checkDate
	 * 概要  : 1,3,5,7,8,10,12月は１～３１日の入力になっているか？
	 * 　　　　4,6,9,11月は１～３０日の入力になっているか？
	 * 　　　　2月はうるう年ならば１～２８日の入力になっているか？
	 * 　　　　　　　平年ならば１～２７日の入力になっているか？
	 * 　　　　を確認する
	 * 引数  :なし
	 * 戻り値 :boolean型　入力が正しいとtrue、正しくない場合はfalseを返す
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public boolean checkDate() {
		//真偽値を格納
		boolean trueOrFalse = true;
		//もし、1,3,5,7,8,10,12月ならば、
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			//１～３１日の入力かどうか
			if(1<=date && date<=31) {
				//正しい入力
				trueOrFalse = true;
				//１～３１日の入力になっていない
			}else {
				//正しくない入力
				trueOrFalse = false;
			}
			//もし、4,6,9,11月ならば、
		}else if(month==4 || month==6 || month==9 || month==11) {
			//１～３１日の入力かどうか
			if(1<=date && date<=30) {
				//正しい入力
				trueOrFalse = true;
				//１～３１日の入力になっていない
			}else {
				//正しくない入力
				trueOrFalse = false;
			}
			//もし、2月ならば、
		}else if(month == 2) {
			//うるう年ならば、
			if(isLeapYear(year)) {
				//１～２９日の入力になっていたら、
				if(1<=date && date<=29) {
					//正しい入力
					trueOrFalse = true;
					//１～２９日の入力になっていなかったら、
				}else {
					//正しくない入力
					trueOrFalse = false;
				}
				//うるう年ではないならば、
			}else {
				//１～２８日の入力になっていたら、
				if(1<=date && date<=28) {
					//正しい入力
					trueOrFalse = true;
					//１～２８日の入力になっていなかったら、
				}else {
					//正しくない入力
					trueOrFalse = false;
				}
			}
			//月の入力が１～１２月以外になっていたら
		}else {
			//正しくない入力
			trueOrFalse = false;
		}
		//そもそも、yearが負だったら、
		if(year<0) {
			//正しくない入力
			trueOrFalse = false;
		}
		//返り値
		return trueOrFalse;
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
}

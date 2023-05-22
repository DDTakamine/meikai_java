package ensyu12_1;

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
}

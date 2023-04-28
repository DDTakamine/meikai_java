package ensyu9_5;
/*フィールド名・クラス名は教本に従う
 * クラス名:Period
 * 概要  :演習9-5クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class Period {
	//フィールド設定
	//開始時点
	private Day from = new Day(0000,00,00);
	//終了時点
	private Day to = new Day(0000,00,00);

	//コンストラクタ
	//from,toを決める
	public Period(Day from,Day to) {
		//教本指定
		this.from = from;
		//教本指定
		this.to = to;
	}
	/*
	 * 関数名：getStart
	 * 概要  :開始日を取得
	 * 引数  :なし
	 * 戻り値 :String fromの文字列
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public String getStart() {
		return from.toString();
	}
	/*
	 * 関数名：getFinal
	 * 概要  :開始日を取得
	 * 引数  :なし
	 * 戻り値 :String toの文字列
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public String getFinal() {
		return to.toString();
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
	 * 関数名：countLeapYear
	 * 概要  :何回うるう年があるか数える
	 * 引数  :Day型 basePeriod   期間の開始
	 * 　　　 Day型 finalPeriod  期間の終わり
	 * 戻り値 :int型　うるう年の回数
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	public int countLeapYear() {
		//カウント変数
		int countNumber = 0;
		//開始日から終了日まで繰り返す
		for(int temporaryYear=from.getYear();temporaryYear<=to.getYear();temporaryYear++) {
			//temporaryYearがうるう年ならば
			if(isLeapYear(temporaryYear) == true) {
				//回数を増やす
				countNumber += 1;
			}
		}
		//返す
		return countNumber;
	}
	
	/*
	 * 関数名：isRightInputPeriod
	 * 概要  :入力された開始日と終了日が正しいかどうか判定
	 * 引数  :Day型 from
	 *        Day型 to
	 * 戻り値 :Boolean型　期間として正しい時、true
	 * 　　　　　　　　　同じ日付の場合もtrue
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	boolean isRightInputPeriod() {
		//年の差分
		int diffirenceYear = to.getYear() - from.getYear();
		//月の差分
		int diffirenceMonth = to.getMonth() - from.getMonth();
		//年の差分
		int diffirenceDay = to.getDay() - from.getDay();
		//結果格納変数
		boolean trueOrFalse = false;
		//年の差分が０より大きいならば、
		if(diffirenceYear > 0) {
			//正しい入力
			trueOrFalse = true;
		//入力年が同じならば、
		}else if(diffirenceYear == 0) {
			//もし、入力月の差が正ならば、
			if(diffirenceMonth>0) {
				//正しい
				trueOrFalse = true;
			//入力月の差が等しい場合、
			}else if(diffirenceMonth == 0) {
				//もし、入力日が０以上の時、
				if(diffirenceDay>=0) {
					//正しい入力
					trueOrFalse = true;
				//0以下の場合、
				}else {
					//正しくない入力
					trueOrFalse = false;
				}
			//入力月の差が０より小さい場合、
			}else {
				//正しくない入力
				trueOrFalse = false;
			}
		//年の差分が０より小さいならば、
		}else {
			//間違えた期間入力
			trueOrFalse = false;
		}
		//値を返す
		return trueOrFalse;
	}
}

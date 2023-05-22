package id;
import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:DateId
* 概要  :演習11-1
* 作成者:R.Akamine
* 作成日:2023/05/02
*/
public class DateId {
	//counterを用意
	protected static int counter;
	//idを用意
	protected int id;
	//初期化子
	static {
		//インスタンス
		GregorianCalendar today = new GregorianCalendar();
		//年の取得
		int y = today.get(YEAR);
		//月の取得
		int m = today.get(MONTH);
		//日の取得
		int d = today.get(DATE);
		//日付を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n",y,m,d);
		//yyyymmdd形式で保存
		counter = y*1000000 + m*10000 + d*100;
	}
	//----------コンストラクタ------------//
	public DateId() {
		//カウンターを増やす
		id = ++counter;
	}
	/*
	 * 関数名：getId
	 * 概要  :idを取得
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public int getId() {
		//返す
		return id;
	}
}

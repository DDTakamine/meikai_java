package Ensyu9_3_0426;

public class Account {	//名前をスペースで初期化
	private String name = "    ";
	//口座番号をXXXXで初期化
	private String no = "XXXX";
	//口座残高
	private long balance = 0;
	//口座開設日 yyyy.mm.ddで初期化
	private String openDay = "yyyy.mm.dd";
	//nameだけコンストラクタとする
	public Account(String name) {
		//nameを入力
		this.name = name;
	}
	//name,noコンストラクタとする
	public Account(String name,String no) {
		//nameを入力
		this(name);
		//口座番号を入力
		this.no = no;
	}
	//name,no,openDayコンストラクタとする
	public Account(String name,String no,String openDay) {
		//name,noを入力
		this(name,no);
		//口座開設日を入力
		this.openDay = openDay;
	}
	//name,no,openDay,balanceコンストラクタとする
		public Account(String name,String no,String openDay,long balance) {
		//name,no,openDayを入力
		this(name,no,openDay);
		//口座残高を入力
		this.balance = balance;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getName
	 * 概要  :名前を返す
	 * 引数  :なし
	 * 戻り値 :String name 名前
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	String getName() {
		//名前を返す
		return name ;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getNo
	 * 概要  :口座番号を返す
	 * 引数  :なし
	 * 戻り値 :String no 口座番号
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	String getNo() {
		//名前を返す
		return no ;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getOpenDay
	 * 概要  :口座開設日を返す
	 * 引数  :なし
	 * 戻り値 :String openDay 口座開設日
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	String getOpenDay() {
		//口座開設日を返す
		return openDay;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getBalance
	 * 概要  :口座残高を返す
	 * 引数  :なし
	 * 戻り値 :long balance 口座残高
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	long getBalance() {
		//名前を返す
		return balance;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：deposit
	 * 概要  :k円口座に預ける
	 * 引数  :long k 預り金
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	void deposit(long k) {
		//k円足す
		balance += k;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：withdraw
	 * 概要  :k円口座からおろす
	 * 引数  :long k 戻し金
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	void withdraw(long k) {
		//k円足す
		balance -= k;
	}
	/*
	 * 関数名：toString
	 * 概要  :口座番号・名前・口座開設日を表示
	 * 引数  :なし
	 * 戻り値 :String 口座番号・名前・口座開設日を表示した文字列
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public String toString() {
		//文字列を返す
		return String.format("%s / %s / %s",no,name,openDay);
	}
	
}

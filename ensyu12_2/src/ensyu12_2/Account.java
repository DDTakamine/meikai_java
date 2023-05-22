package ensyu12_2;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Acount
* 概要  :演習12-2
* 作成者:R.Akamine
* 作成日:2023/05/04
*/
public class Account {
	//カウント変数
	protected static int counter = 0;
	//名義人
	private String name = " ";
	//口座番号
	private String no = "0000";
	//口座残高
	private long balance = 000;
	//口座番号
	protected int id = 0000;
	//定期預金残高
	static long fixedDeposit ;
	
	
	//インスタンス初期化子
	{
		//インスタンスが作成される度に呼び出される
		System.out.println("明解銀行で口座開設ありがとうございます。");
	}
	//------コンストラクタ------//
	//引数なし
	public Account() {
		//カウントを一つ増やす
		id = ++counter;	
	}
	//nameのみ引数
	public Account(String name) {
		//nameを初期化
		this.name = name;
		//カウントを一つ増やす
		id = ++counter;	
	}
	//nameとnoで初期化
	public Account(String name,String no) {
		//nama初期化
		this(name);
		//銀行口座初期化
		this.no = no;	
		//カウントを増やす
		id = ++counter;	
	}
	//nameとnoとbalanceを初期化
	public Account(String name,String no, long balance) {
		//nameとnoを初期化
		this(name,no);
		//残高を初期化
		this.balance = balance;
		//カウントを増やす
		id = ++counter;	
	}
	
	
	/*
	 * 関数名：getName
	 * 概要  :名前を取得
	 * 引数  :なし
	 * 戻り値 :String name　名前
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public String getName() {
		//nameを返す
		return name;
	}
	/*
	 * 関数名：getno
	 * 概要  :口座番号を取得
	 * 引数  :なし
	 * 戻り値 :String no　口座番号
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public String getNo() {
		//noを返す
		return no;
	}
	/*
	 * 関数名：getBalance
	 * 概要  :銀行残高を取得
	 * 引数  :なし
	 * 戻り値 :String no　口座残高
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public long getBalance() {
		//balanceを返す
		return balance;
	}
	/*
	 * 関数名：getId
	 * 概要  :銀行Idを取得
	 * 引数  :なし
	 * 戻り値 :int Id 口座Id
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public int getId() {
		//idを返す
		return id;
	}
	/*
	 * 関数名：getCounter
	 * 概要  :counterを取得
	 * 引数  :なし
	 * 戻り値 :int counter カウント変数
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public int getCounter() {
		//counterを返す
		return counter;
	}

	/*
	 * 関数名：deposit
	 * 概要  :口座残高を増やす
	 * 引数  :long k 増やす額
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public void deposit(long k) {
		//balanceをkだけ増やす
		balance += k;
	}
	/*
	 * 関数名：withdraw
	 * 概要  :口座残高から金額を－
	 * 引数  :long k 口座から引く金額
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public void withdraw(long k) {
		//ｋだけ引く
		balance -= k;
	}

}

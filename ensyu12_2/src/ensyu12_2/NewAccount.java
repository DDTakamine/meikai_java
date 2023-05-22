package ensyu12_2;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Acount
* 概要  :演習12-2
* 作成者:R.Akamine
* 作成日:2023/05/04
*/
public class NewAccount extends Account{
	//定期預金残高
	long fixedDeposit ;
	
	//nameとnoとbalanceを初期化
	public NewAccount(String name,String no, long balance,long fixedDeposit) {
		//nameとnoを初期化
		super(name,no,balance);
		//残高を初期化
		this.fixedDeposit = fixedDeposit;
		//カウントを増やす
		id = ++counter;	
	}
	/*
	 * 関数名：getFixedDeposit
	 * 概要  :定期残高を取得
	 * 引数  :なし
	 * 戻り値 :long fixedDeposit
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	public long getBalance() {
		//定期残高を返却
		return super.getBalance() + fixedDeposit;
	}	
	/*
	 * 関数名：addFixedDeposit
	 * 概要  :定期残高を増加
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	public void addFixedDeposit() {
		//定期口座に追加する金額
		final long ADD_DEPOSIT = 100000;
		//追加する
		fixedDeposit += ADD_DEPOSIT;
	}
	/*変数名・メソッド名は教本に従う
	 * 関数名：comBalance
	 * 概要  :定期残高を比較する
	 * 引数  :Account a,b
	 * 戻り値 :int returnValue
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	public void printNewAccount() {
		//口座番号の表示
		System.out.println("AccountNumber:"+this.getNo());
		//名前の表示
		System.out.println("氏名:"+this.getName());
		//残高の表示
		System.out.println("口座残高:"+this.getBalance());
		//区切り
		System.out.println("------------------------------");
	}
	
	/*変数名・メソッド名は教本に従う
	 * 関数名：comBalance
	 * 概要  :定期残高を比較する
	 * 引数  :Account a,b
	 * 戻り値 :int returnValue
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	static int comBalance(Account a,Account b) {
		//結果格納
		int returnValue = 0;
		//定期口座の残高を比較
		returnValue = compareNumber(a.getBalance(),b.getBalance());
		//結果を返す
		return returnValue;
	}/*
	 * 関数名：compareNumber
	 * 概要  :数値を比較する
	 * 引数  :int  firstNumber,secondNumber
	 * 戻り値 :int returnValue
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	static int compareNumber(long firstNumber,long secondNumber) {
		//結果格納変数
		int returnValue = 0;
		//最初の数値が大きい場合
		if(firstNumber > secondNumber) {
			//1を返す
			returnValue = 1;
		//2番目の数値が大きい場合、
		}else if(firstNumber < secondNumber) {
			//-1を返す
			returnValue =-1;
		//２つの数値が等しい場合
		}else {
			//０を返す
			returnValue = 0;
		}
		//結果を返す
		return returnValue;
	}	
}

package ensyu12_2;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:Acount
* 概要  :演習12-2
* 作成者:R.Akamine
* 作成日:2023/05/04
*/
public class TestNewAccount {
	/*
	 * 関数名：main
	 * 概要  :NewAccountを表示する
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.04
	 */
	public static void main(String[] args) {
		//最初の残高が大きい場合
		final int A_BIGGER = 1;
		//２つ目の残高が大きい場合
		final int B_BIGGER = -1;
		
		//インスタンス化 普通口座残高:100　定期預金:0
		NewAccount firstAccount = new NewAccount("佐藤","1234",100,0);
		//インスタンス化 普通口座残高:200　定期預金:1000
		NewAccount secondAccount = new NewAccount("鈴木","4321",200,1000);
		//インスタンス化 普通口座残高:100　定期預金:0
		Account forthAccount = new Account("佐藤","1234",1000);
		//インスタンス化 普通口座残高:200　定期預金:1000
		Account fifthAccount = new Account("鈴木","4321",2000);
		
		//操作前の情報確認
		System.out.println("操作前のアカウント情報");
		//口座情報を表示
		firstAccount.printNewAccount();
		//口座情報を表示
		secondAccount.printNewAccount();
		//定期預金を増やす
		firstAccount.addFixedDeposit();
		
		
		
		//操作前の情報確認
		System.out.println("操作後のアカウント情報");
		//口座情報を表示
		firstAccount.printNewAccount();
		//口座情報を表示
		secondAccount.printNewAccount();
		//もし、firstAccountが大きい場合、
		if(NewAccount.comBalance(firstAccount,secondAccount) == A_BIGGER) {
			//firstAccontが大きいことを表示
			System.out.println("firstAccountが大きい");
		//もし、secondAccountが大きい場合、
		}else if(NewAccount.comBalance(firstAccount,secondAccount) == B_BIGGER){
			//secondAccontが大きいことを表示
			System.out.println("secondAccountが大きい");
		}else {
			//同じ
			System.out.println("同じ");
		}
		
		
		//もし、forthAccountが大きい場合、
		if(NewAccount.comBalance(forthAccount,fifthAccount) == A_BIGGER) {
			//forthAccountが大きいことを表示
			System.out.println("forthAccountが大きい");
			//もし、fifthAccountが大きい場合、
		}else if(NewAccount.comBalance(forthAccount,fifthAccount) == B_BIGGER){
			//fifthAccountが大きいことを表示
			System.out.println("fifthAccountが大きい");
		}else {
			//同じ
			System.out.println("同じ");
		}
		
		//もし、firstAccountが大きい場合、
		if(NewAccount.comBalance(firstAccount,fifthAccount) == A_BIGGER) {
			//firstAccontが大きいことを表示
			System.out.println("firstAccountが大きい");
			//もし、secondAccountが大きい場合、
		}else if(NewAccount.comBalance(firstAccount,fifthAccount) == B_BIGGER){
			//secondAccontが大きいことを表示
			System.out.println("fifthAccountが大きい");
		}else {
			//同じ
			System.out.println("同じ");
		}
	}
}


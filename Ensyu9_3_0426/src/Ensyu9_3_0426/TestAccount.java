package Ensyu9_3_0426;
/*
 * クラス名:TestAccount
 * 概要  :演習9-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.26
 */
public class TestAccount {
	/*
	 * 関数名：main
	 * 概要  :Accountクラスの動作確認
	 * 引数  :なし
	 * 戻り値 :Day year
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public static void main(String[] args) {
		//Accountを作成
		Account Akamine = new Account("赤嶺亮介","123-456","2023/04/26",1000000000);
		//名前だけ渡す
		System.out.println("Account(String name)");
		//Account型をインスタンス化
		Account firthAccount = new Account(Akamine.getName());
		//アカウント情報を表示
		printAccount(firthAccount);

		//名前・口座番号を渡す
		System.out.println("Account(String name)");
		//Account型をインスタンス化
		Account secondAccount = new Account(Akamine.getName(),Akamine.getNo());
		//アカウント情報を表示
		printAccount(secondAccount);
		
		//名前・口座番号を渡す
		System.out.println("Account(String name)");
		//Account型をインスタンス化
		Account thirdAccount = new Account(Akamine.getName(),Akamine.getNo(),Akamine.getOpenDay());
		//アカウント情報を表示
		printAccount(thirdAccount);
		
		//名前・口座番号を渡す
		System.out.println("Account(String name)");
		//Account型をインスタンス化
		Account forthAccount = new Account(Akamine.getName(),Akamine.getNo(),Akamine.getOpenDay(),Akamine.getBalance());
		//アカウント情報を表示
		printAccount(forthAccount);
		
	}
	/*
	 * 関数名：printAccount
	 * 概要  :アカウント情報を表示
	 * 引数  :Account testData 
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public static void printAccount(Account testData) {
		//名前の表示
		System.out.println("◇"+testData.getName());
		//口座番号の表示
		System.out.println("口座番号："+testData.getNo());
		//口座開設日の表示
		System.out.println("口座開設日："+testData.getOpenDay());
		//口座残高の表示
		System.out.println("口座残高："+testData.getBalance());
		//toString()が正しく動作している確認
		System.out.println(testData.toString());
	}
	
	
}

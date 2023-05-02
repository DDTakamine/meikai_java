package ensyu10_5;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:TestAccount
* 概要  :演習10-5
* 作成者:R.Akamine
* 作成日:2023/05/02
*/
public class TestAccount {
	/*
	 * 関数名：main
	 * 概要  :Acountクラスの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public static void main(String[] args) {
		//テストを行う表示
		System.out.println("firstTest------------------------");
		//最初のアカウント
		Account firstTest = new Account();
		//アカウント情報を表示
		firstTest.putAccount();
		//テストを行う表示
		System.out.println("secondTest------------------------");
		//２つのアカウント
		Account secondTest = new Account();
		//アカウント情報を表示
		secondTest.putAccount();
		//テストを行う表示
		System.out.println("thirdTest------------------------");
		//３つのアカウント
		Account thirdTest = new Account();
		//アカウント情報を表示
		thirdTest.putAccount();
		//テストを行う表示
		System.out.println("firthTest------------------------");
		//４つのアカウント
		Account firthTest = new Account();
		//アカウント情報を表示
		firthTest.putAccount();
	}
}

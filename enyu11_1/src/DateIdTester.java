import id.DateId;
/*クラス名・メソッド名は教本に従うものとする
* クラス名:DateId
* 概要  :演習11-1
* 作成者:R.Akamine
* 作成日:2023/05/02
*/
public class DateIdTester {
	/*
	 * 関数名：main
	 * 概要  :Acountクラスの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public static void main(String[] args) {
		//DateIdの作成
		DateId a = new DateId();
		//インスタンス
		//a.DateId();
		//DateIdの作成
		DateId b = new DateId();
		//インスタンス
		//b.DateId();
		//DateIdの作成
		DateId c = new DateId();
		//インスタンス
		//c.DateId();
		//aの識別番号表示
		System.out.println("aの識別番号："+a.getId());
		//bの識別番号表示
		System.out.println("bの識別番号："+b.getId());
		//cの識別番号表示
		System.out.println("cの識別番号："+c.getId());
		
	}
}

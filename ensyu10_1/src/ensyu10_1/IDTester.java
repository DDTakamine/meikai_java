package ensyu10_1;
/*フィールド名・クラス名は教本に従う
 * クラス名:Day
 * 概要  :演習9-5クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
class Id {
	//カウント
	static int counter = 0;
	
	private int id;
	//-- コンストラクタ --//
	public Id() {
		id = ++counter;
	}
	/*メソッド名・変数名は教本に従う
	 * 関数名：getId
	 * 概要  :Idを取得
	 * 引数  :なし
	 * 戻り値 :int Id 
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	public int getId() {
		return id;
	}
	/*
	 * 関数名：getMaxId
	 * 概要  :最後に与えた識別番号を返すクラスメゾット
	 *　　　　インスタンスをｎ個生成した時点で呼び出すとｎを返すことになる
	 * 引数  :なし
	 * 戻り値 :int n インスタンスを生成した個数
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	static int getMaxId() {
		return counter ;
	}
}
/*フィールド名・クラス名は教本に従う
 * クラス名:Day
 * 概要  :演習9-5クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class IDTester {
	/*メソッド名・変数名は教本に従う
	 * 関数名：getYear
	 * 概要  :年を取得
	 * 引数  :なし
	 * 戻り値 :Day year
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public static void main(String[] args) {
		//インスタンス化
		Id a = new Id();
		//インスタンス化
		Id b = new Id();
		//インスタンス化
		Id c = new Id();
		//aの識別番号を取得
		System.out.println("aの識別番号："+a.getId());
		//bの識別番号を取得
		System.out.println("bの識別番号："+b.getId());
		//bの識別番号を取得
		System.out.println("cの識別番号："+c.getId());
		//クラス型変数でのカウンター確認
		System.out.println("Id.counter = " + Id.counter);
		//クラス型変数でのカウンター確認
		System.out.println("Id.getMaxId() = " + Id.getMaxId());
		//インスタンスaでのカウンタ
		System.out.println("a.counter = " + a.counter);
		//インスタンスbでのgetMaxId()
		System.out.println("b.getMaxId() = " + b.getMaxId());
		//インスタンスaでのcounter
		System.out.println("a.counter = " + a.counter);
		//bの識別番号
		System.out.println("bの識別番号："+b.getId());
	}
	
}

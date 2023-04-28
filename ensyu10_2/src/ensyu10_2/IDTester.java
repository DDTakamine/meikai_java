package ensyu10_2;
import java.util.Scanner;
/*フィールド名・クラス名は教本に従う
 * クラス名:ExId
 * 概要  :演習10-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.28
 */
class ExId {
	//カウント
	static int counter = 1;
	//id保持用変数
	private int id ;
	//leapNumberだけidがとびとびの値になる
	static int leapNumber ;
	//更新されて何回目か保存する
	static int temporaryNumber ;
	//-- コンストラクタ --//
	public ExId() {
		
		//カウンタ変数を増やして、idに格納
		id = counter + leapNumber*temporaryNumber;
		//カウンタ変数をひとつ増やす
		counter += 1;
		//とびとびの値を変更してからのインスタンス回数
		temporaryNumber += 1;
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
		//idを返す
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
		//カウンタを返す
		return counter ;
	}
	/*
	 * 関数名：getLeapNumber
	 * 概要  :LeapNumberを取得
	 * 引数  :なし
	 * 戻り値 :int LeapNumber
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	public static int getLeapNumber() {
		//とびとびの値を返す
		return leapNumber;
	}
	
	/*
	 * 関数名：setLeapNumber
	 * 概要  :LeapNumberを変更
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	public static void setLeapNumber(int newLeapNumber) {
		//初期化
		temporaryNumber=1;
		//とびとびの値を変更
		leapNumber = newLeapNumber-1;
	}

}

/*フィールド名・クラス名は教本に従う
 * クラス名:IDTester
 * 概要  :演習10-2クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.28
 */
public class IDTester {
	/*メソッド名・変数名は教本に従う
	 * 関数名：main
	 * 概要  :クラス変数とインスタンス変数での値保持の違いを検証
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.28
	 */
	public static void main(String[] args) {
		//標準入力
		Scanner standardInput = new Scanner(System.in);
		//入力された値を格納
		int inputNumber = 0;
		//インスタンス化
		ExId firstExId = new ExId();
		//インスタンス化
		ExId secondExId = new ExId();
		//インスタンス化
		ExId thirdExId = new ExId();
		//aの識別番号を取得
		System.out.println("aの識別番号："+firstExId.getId());
		//bの識別番号を取得
		System.out.println("bの識別番号："+secondExId.getId());
		//cの識別番号を取得
		System.out.println("cの識別番号："+thirdExId.getId());
		//繰り返し
		do {
			//促す
			System.out.println("値を入力してください");
			//入力した値を格納
			inputNumber = standardInput.nextInt();
		//負ならば繰り返す
		}while(inputNumber < 1);
		
		//とびとびの値を変更
		ExId.setLeapNumber(inputNumber);
		
		//インスタンス化
		ExId forthExId = new ExId();
		//cの識別番号を取得
		System.out.println("dの識別番号："+forthExId.getId());
		//インスタンス化
		ExId fifthExId = new ExId();
		//cの識別番号を取得
		System.out.println("eの識別番号："+fifthExId.getId());
		//インスタンス化
		ExId sixthExId = new ExId();
		//cの識別番号を取得
		System.out.println("eの識別番号："+sixthExId.getId());
	}
	
}

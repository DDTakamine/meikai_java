package ensyu7_30;
//標準入力の準備
import java.util.Scanner;
/*
* クラス名:ensyu7_30
* 概要  :演習7-30
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_30 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//配列の要素数は最低でも１とする
	static final int ELEMENT_MINIMAM_LIMIT = 1;
	
	/*関数名・引数名は教本に従う
	 * 関数名 :min
	 * 概要   :２つのint型の最小値を求める
	 * 引数   :int型　a
	 * 		   int型　b
	 * 返り値 :int型　temporaryValue
	 * 作成日:2023.04.21
	 */
	static int min(int a, int b) {
		//一時保存用変数
		int temporaryValue = a;
		//もし、ｂの方が小さい場合、
		if(temporaryValue > b) {
			//temporaryValueにｂの値をコピー
			temporaryValue = b;
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :min
	 * 概要   :３つのint型の最小値を求める
	 * 引数   :int型　a
	 * 		   int型　b
	 * 		   int型　c
	 * 返り値 :int型　temporaryValue
	 * 作成日:2023.04.21
	 */
	static int min(int a, int b, int c) {
		//一時保存用変数
		int temporaryValue = a;
		//もし、ｂの方が小さい場合、
		if(temporaryValue > b) {
			//temporaryValueにｂの値をコピー
			temporaryValue = b;
		//もし、ｃの方が小さい場合、
		}else if(temporaryValue > c) {
			//temporaryValueにｃの値をコピー
			temporaryValue = c;
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :min
	 * 概要   :int型配列の最小値を求める
	 * 引数   :int型　a
	 * 返り値 :int型　teporaryValue
	 * 作成日:2023.04.21
	 */
	static int min(int a[]) {
		//一時保存用変数
		int temporaryValue = a[0];
		for(int i=0;i<a.length;i++) {
			if(temporaryValue>a[i]) {
				temporaryValue = a[i];
			}
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :main
	 * 概要   :min()をオーバーロードして、実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	public static void main(String[] args) {
		//１つ目の変数
		int firstValue = 3;
		//２つ目の変数
		int secondValue = -3;
		//３つ目の変数
		int thirdValue = 238;
		//配列を用意
		int[] arrayValue = {32,-9,0,32,4,-53};
		//引数が２つのメソッドの表示
		System.out.println("min(a,b) = "+ min(firstValue,secondValue));
		//引数が３つのメソッドの表示
		System.out.println("min(a,b,c) = "+ min(firstValue,secondValue,thirdValue));
		//引数が１つのメソッドの表示
		System.out.println("min(a) = "+ min(arrayValue));
	}

}

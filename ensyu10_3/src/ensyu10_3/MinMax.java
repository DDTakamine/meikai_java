package ensyu10_3;
/*
* クラス名:ensyu10-3
* 概要  :演習7-30
* 作成者:R.Akamine
* 作成日:2023/04/28
*/
public class MinMax {
	
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
		//配列の要素分だけ回す
		for(int i=0;i<a.length;i++) {
			//配列が小さいならば
			if(temporaryValue>a[i]) {
				//値をコピー
				temporaryValue = a[i];
			}
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	
	
	
	/*関数名・引数名は教本に従う
	 * 関数名 :max
	 * 概要   :２つのint型の最大値を求める
	 * 引数   :int型　a
	 * 		   int型　b
	 * 返り値 :int型　temporaryValue
	 * 作成日:2023.04.28
	 */
	static int max(int a, int b) {
		//一時保存用変数
		int temporaryValue = a;
		//もし、ｂの方が小さい場合、
		if(temporaryValue < b) {
			//temporaryValueにｂの値をコピー
			temporaryValue = b;
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :max
	 * 概要   :３つのint型の最大値を求める
	 * 引数   :int型　a
	 * 		   int型　b
	 * 		   int型　c
	 * 返り値 :int型　temporaryValue
	 * 作成日:2023.04.21
	 */
	static int max(int a, int b, int c) {
		//一時保存用変数
		int temporaryValue = a;
		//もし、ｂの方が小さい場合、
		if(temporaryValue < b) {
			//temporaryValueにｂの値をコピー
			temporaryValue = b;
		//もし、ｃの方が小さい場合、
		}else if(temporaryValue < c) {
			//temporaryValueにｃの値をコピー
			temporaryValue = c;
		}
		//temporaryValueを返す
		return temporaryValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :max
	 * 概要   :int型配列の最大値を求める
	 * 引数   :int型　a
	 * 返り値 :int型　teporaryValue
	 * 作成日:2023.04.21
	 */
	static int max(int a[]) {
		//一時保存用変数
		int temporaryValue = a[0];
		//配列要素分だけ回す
		for(int i=0;i<a.length;i++) {
			//大きいならば
			if(temporaryValue<a[i]) {
				//値をコピー
				temporaryValue = a[i];
			}
		}
		//temporaryValueを返す
		return temporaryValue;
	}
}

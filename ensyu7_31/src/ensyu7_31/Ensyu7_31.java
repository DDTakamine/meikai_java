package ensyu7_31;
/*
* クラス名:ensyu7_31
* 概要  :演習7-31
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_31 {
	/*関数名・引数名は教本に従う
	 * 関数名 :absolute
	 * 概要   :絶対値を返す
	 * 引数   :int型　x
	 * 返り値 :int型　
	 * 作成日:2023.04.21
	 */
	static int absolute(int x) {
		//初期化
		int returnValue = x;
		//returnValueが0より小さい場合、
		if(returnValue < 0) {
			//符号を反転させる
			returnValue = -x;
		}
		//値を返す
		return returnValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :absolute
	 * 概要   :絶対値を返す
	 * 引数   :long型　x
	 * 返り値 :long型　
	 * 作成日:2023.04.21
	 */
	static long absolute(long x) {
		//初期化
		long returnValue = x;
		//returnValueが0より小さい場合、
		if(returnValue < 0) {
			//符号を反転させる
			returnValue = -x;
		}
		//値を返す
		return returnValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :absolute
	 * 概要   :絶対値を返す
	 * 引数   :float型　x
	 * 返り値 :float型　
	 * 作成日:2023.04.21
	 */
	static float absolute(float x) {
		//初期化
		float returnValue = x;
		//returnValueが0より小さい場合、
		if(returnValue < 0) {
			//符号を反転させる
			returnValue = -x;
		}
		//値を返す
		return returnValue;
	}
	/*関数名・引数名は教本に従う
	 * 関数名 :absolute
	 * 概要   :絶対値を返す
	 * 引数   :double型　x
	 * 返り値 :double型　
	 * 作成日:2023.04.21
	 */
	static double absolute(double x) {
		//初期化
		double returnValue = x;
		//returnValueが0より小さい場合、
		if(returnValue < 0) {
			//符号を反転させる
			returnValue = -x;
		}
		//値を返す
		return returnValue;
	}
	
	public static void main(String[] args) {
		//引数用変数を初期化
		int    intValue    = -5;
		//引数用変数を初期化
		long   longValue   = -192;
		//引数用変数を初期化
		float  floatValue  = -3.14f;
		//引数用変数を初期化
		double doubleValue = -2.718;
		//int型の値を渡した場合
		System.out.printf("absolute(int x)  \t= \t %d \n",absolute(intValue));
		//long型の値を渡した場合
		System.out.printf("absolute(long x)\t= \t %d \n",absolute(longValue));
		//float型の値を渡した場合
		System.out.printf("absolute(float x)\t= \t %.4f \n",absolute(floatValue));
		//double型の値を渡した場合
		System.out.printf("absolute(double x)\t= \t %.4f \n",absolute(doubleValue));
	}
}

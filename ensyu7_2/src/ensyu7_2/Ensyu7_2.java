package ensyu7_2;
/*
 * クラス名:ensyu7_2
 * 概要  :演習7-2
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_2 {
	/*
	 * 関数名：min
	 * 概要  :最小値を求める
	 * 引数  :int型　３つの整数を受け取る
	 * 戻り値:int型　最小値が返ってくる
	 * 作成日:2023.04.18
	 */
	public static int min(int a, int b, int c) {
		//保存用の変数を用意
		int temporaryValue = a;
		//ｂよりも大きい場合は
		if(temporaryValue > b) {
			//ｂをコピー
			temporaryValue = b;
		//ｃよりも大きい場合は
		}else if(temporaryValue > c) {
			//ｃをコピー
			temporaryValue = c;
		}
		//最小値を返す
		return temporaryValue;
	}
	/*
	 * 関数名：main
	 * 概要  :minメソッドを使うためのメイン
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//値を一つ用意
		int firstOperand  = 28;
		//値を一つ用意
		int secondOperand = -5;
		//値を一つ用意
		int thirdOperand  = 189;
		//返り値を表示
		System.out.println("返り値は"+min(firstOperand,secondOperand,thirdOperand)+"です。");
		
	}

}

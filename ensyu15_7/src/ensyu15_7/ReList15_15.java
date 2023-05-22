package ensyu15_7;
/*
* クラス名:ReList15_15
* 概要  :演習15-7
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class ReList15_15 {
	/*
	 * 関数名：main
	 * 概要  : 合計を表示する
	 * 引数  :コマンド引数
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void main(String[] args) {
		//合計を格納する変数
		double sum = 0.0;
		//拡張for文にした
		for(String oneValue:args) {
			//一文字をdoubleにして足し算
			sum += Double.parseDouble(oneValue);
		}
		//合計を表示
		System.out.printf("合計は%.3f",sum);
	}
}

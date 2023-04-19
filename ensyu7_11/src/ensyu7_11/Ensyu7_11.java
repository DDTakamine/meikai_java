package ensyu7_11;
/*
 * クラス名:ensyu7_10
 * 概要  :演習7-10
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_11 {
	/*
	 * 関数名：main
	 * 概要  :整数を左右にシフトした値、２乗のべき乗で除算・乗算した値を等しくなることを
	 * 			確認するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//整数値
		int  integerValue     = 1;
		//右シフトした結果を保存
		int  rightShiftValue  = 0;
		//左シフトした結果を保存
		int  leftShiftValue   = 0;
		//何回シフトするか
		final int STEP_NUMBER = 31;
		//割る数または掛ける数として利用
		final int BIT_NUMBER = 2;
		//右シフトさせて値を保存
		rightShiftValue = integerValue >> STEP_NUMBER;
		//左シフトさせて値を保存
		leftShiftValue  = integerValue << STEP_NUMBER;
		//右シフトの結果を表示
		System.out.println(integerValue + "を"+STEP_NUMBER+"ビット右にシフトさせた値:" + rightShiftValue);
		//左シフトの結果を表示
		System.out.println(integerValue + "を"+STEP_NUMBER+"ビット右にシフトさせた値:" + leftShiftValue);
		//一時保存用の変数
		int temporaryNumber= integerValue;
		//STEP_NUMBER回割り算を実行するループ
		for(int i=0; i<STEP_NUMBER; i++) {
			//BIT_NUMBERで割り算する
			temporaryNumber = temporaryNumber/BIT_NUMBER;
		}
		//割り算結果を表示
		System.out.println(integerValue+"を"+STEP_NUMBER+"回割った値："+temporaryNumber);
		//値を再度入れなおす
		temporaryNumber= integerValue;
		//STEP_NUMBER回かけ算を実行するループ
		for(int i=0; i<STEP_NUMBER; i++) {
			//BIT_NUMBERでかけ算する
			temporaryNumber = temporaryNumber*BIT_NUMBER;
		}
		//かけ算結果を表示
		System.out.println(integerValue+"を"+STEP_NUMBER+"回割った値："+temporaryNumber);
	}
}

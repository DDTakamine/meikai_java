package ensyu6_1;
/*
 * クラス名:ensyu6_1
 * 概要  :演習6-1
 * 作成者:R.Akamine
 * 作成日:2023/04/13
 */
public class Enayu6_1 {
	/*
	 * 関数名：main
	 * 概要  :double型の要素５配列を生成し、全要素の値を表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.13
	 */
	public static void main(String[] args){
		//配列を用意
		double[] doubleValue = new double[5];
		//０番目の配列を初期化
		doubleValue[0] = 0.00000d;
		//１番目の配列を初期化
		doubleValue[1] = 0.00001d;
		//２番目の配列を初期化
		doubleValue[2] = 0.00002d;
		//３番目の配列を初期化
		doubleValue[3] = 0.00003d;
		//４番目の配列を初期化
		doubleValue[4] = 0.00004d;
		//配列の要素全てを参照するループ
		for(int i =0; i<doubleValue.length; ++i) {
			//結果を表示
			System.out.println("doubleValue["+ i +"]  =  " + doubleValue[i]);
		}
		
	}
}

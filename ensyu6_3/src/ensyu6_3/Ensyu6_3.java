package ensyu6_3;
/*
 * クラス名:ensyu6_2
 * 概要  :演習6-2
 * 作成者:R.Akamine
 * 作成日:2023/04/13
 */
public class Ensyu6_3 {
	/*
	 * 関数名：main
	 * 概要  :double型要素５の配列に、1.1,2.2,3.3,4.4,5.5
	 * 			を代入して表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.13
	 */
	public static void main(String[] args){
		//double型要素５の配列を用意
		double[] doubleArray = new double[5];
		//初期化ループ
		for(int i=1; i<=doubleArray.length; ++i) {
			//初期化
			doubleArray[i-1] = (double)1.1*i;
		}
		//５個の要素をすべて表示
		for(int i=0; i<doubleArray.length; ++i) {
			//結果表示
			System.out.println("doubleArray["+i+"] = "+doubleArray[i]);
		}
	}
}

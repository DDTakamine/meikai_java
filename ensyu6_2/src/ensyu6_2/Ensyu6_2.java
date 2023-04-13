package ensyu6_2;
/*
 * クラス名:ensyu6_2
 * 概要  :演習6-2
 * 作成者:R.Akamine
 * 作成日:2023/04/13
 */
public class Ensyu6_2 {
	/*
	 * 関数名：main
	 * 概要  :int型要素５の配列に、5,4,3,2,1を代入して表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.13
	 */
	public static void main(String[] args){
		//int型要素５の配列を用意
		int[] intArray = new int[5];
		//初期化を行うループ
		for(int i=0; i<intArray.length; ++i) {
			//5,4,3,2,1と代入を行う
			intArray[i] = 5-i;
		}
		//要素５の配列の値を表示
		for(int i=0; i<intArray.length; ++i) {
			//要素０番目から順次表示
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
	}

}

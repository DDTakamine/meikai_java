package ensyu6_13;
//乱数発生準備
import java.util.Random;
/*
 * クラス名:ensyu6_13
 * 概要  :演習6-13
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_13 {
	/*
	 * 関数名：main
	 * 概要  :配列aの全要素を配列bに対して、逆順にコピーするプログラムを作成。
	 * 			なお、二つの配列の要素数は同一であると仮定する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	public static void main(String[] args){
		//配列の要素数を決める
		final int ARRAY_ELEMENT = 5 ;
		//乱数の範囲を決める
		final int RANDOM_RANGE = 20;
		//配列aを用意
		int[] firstArray = new int[ARRAY_ELEMENT];
		//配列bを用意
		int[] secondArray = new int[ARRAY_ELEMENT];
		//乱数発生準備
		Random randomValue = new Random();
		//配列に要素をいれる
		for(int i=0; i<ARRAY_ELEMENT; i++) {
			//乱数を一つ一つに入れる
			firstArray[i] = randomValue.nextInt(RANDOM_RANGE);
			//並び替える前の表示
			System.out.println("firstArray["+i+"]="+firstArray[i]);
		}
		//並び替えのお知らせ
		System.out.println("並び替え後");
		
		//全体で入れ替えを行う
		for(int i=0; i<ARRAY_ELEMENT; ++i) {
			//一つ一つの入れ替え
			secondArray[i] = firstArray[ARRAY_ELEMENT-1-i];
		}
		//配列を表示するループ
		for(int i=0; i<ARRAY_ELEMENT; ++i) {
			//secondArrayの表示
			System.out.println("secondArray["+i+"]="+secondArray[i]);
		}
	}
	

}

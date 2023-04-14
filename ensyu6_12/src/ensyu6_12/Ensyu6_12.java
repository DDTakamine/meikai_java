package ensyu6_12;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_11
 * 概要  :演習6-11
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_12 {
	/*
	 * 関数名：main
	 * 概要  :配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//乱数発生準備
		Random randomValue = new Random();
		//乱数の範囲を指定
		final int RANDOMRANGE = 30;
		//配列の要素数を指定
		final int ARRAYELEMENT = 6;
		//配列を作成
		int[] intArray = new int[ARRAYELEMENT];
		//配列に乱数を作成
		for(int i=0; i<ARRAYELEMENT; i++) {
			//乱数を格納
			intArray[i] =  randomValue.nextInt();
			//配列の表示
			System.out.println("a[ "+i+" ]  =  "+intArray[i]);
		}
		//退避用変数
		int temporaryNumber = 0;
		//ランダムな順となるように配列のインデックスを決める
		int randomIndex = randomValue.nextInt(ARRAYELEMENT);
		//全ての配列に対して値を一度は入れ替える
		for(int i=0; i<ARRAYELEMENT; i++) {
			//値を退避
			temporaryNumber = intArray[i];
			//空になった変数に値を入れる
			intArray[i] = intArray[randomIndex];
			//最初に退避した値を、別の変数に入れなおす
			intArray[randomIndex] = temporaryNumber;
		}
		//並び替えしたことを伝える
		System.out.println("要素の並びを逆転しました。");
		//配列に乱数を作成
		for(int i=0; i<ARRAYELEMENT; i++) {
			//入れ替え後の配列の表示
			System.out.println("a[ "+i+" ]  =  "+intArray[i]);
		}
	}
}

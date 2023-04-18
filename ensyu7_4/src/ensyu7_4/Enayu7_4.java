package ensyu7_4;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:Ensyu7_4
 * 概要  :演習7-4
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Enayu7_4 {
	/*
	 * 関数名：min
	 * 概要  :最小値を求める
	 * 引数  :int型　３つの整数を受け取る
	 * 戻り値:int型　最小値が返ってくる
	 * 作成日:2023.04.18
	 */
	public static int sumUp(int n) {
		//結果を保存する
		int resultValue = 0;
		//１～ｎまでの足し算
		for(int i=1; i<=n; i++) {
			//１～ｎまで足して行く
			resultValue += i;
		}
		//足し算結果を返す
		return resultValue;
	}
	/*
	 * 関数名：main
	 * 概要  :sumUpメソッドを使うためのメイン
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//初期化
		int sumInteger = 0;
		//繰り返し
		do {
			//入力を促す
			System.out.println("いくつまでの足し算を行いますか？");
			//標準入力の準備
			Scanner standardInput = new Scanner(System.in);
			//入力した値を保存
			sumInteger = standardInput.nextInt();
		//入力された値が正しくない間、
		}while(sumInteger<1);
		//結果を表示
		System.out.print(sumUp(sumInteger));
	}
}

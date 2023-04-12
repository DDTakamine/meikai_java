package ensyu4_17_;
import java.util.Scanner;
/*
 * クラス名:ensyu4_18
 * 概要  :演習4-18
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_17_ {
	/*
	 * 関数名：main
	 * 概要  :１～ｎまでの整数値の２乗値を表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//入力された整数を保存
		int integerValue=1;
		do {
			//入力を促す
			System.out.println("ｎの値：");
			//計算できるように処理
			integerValue = standardInput.nextInt();
		//１より小さい値が入力されたら再入力
		}while(integerValue<1);
		//約数の個数をメモ
		int countValue=0;
		//入力された整数までの整数で割り算する
		for(int i=1; i<integerValue+1; ++i) {
			//もし、integerValueを割ることができる整数があったら、
			if(integerValue%i == 0) {
				//約数として、出力
				System.out.println(i);
				//約数の個数を一つ増やす
				++countValue;
			}	
		}
		//結果を出力
		System.out.println("約数は"+countValue+"個です。");
		
	}
}

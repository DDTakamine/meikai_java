package ensyu4_18;
import java.util.Scanner;
/*
 * クラス名:ensyu4_18
 * 概要  :演習4-18
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_18 {
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
		//入力を促す
		System.out.println("ｎの値：");
		//計算できるように処理
		int maxValue = standardInput.nextInt();
		//１乗、2乗、3乗、・・・と計算していく
		for(int i=1; i<maxValue+1; i++) {
			//結果の表示
			System.out.println(i + "の２乗は" + i*i);
		}
		
	}

}

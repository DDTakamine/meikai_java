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
		//入力された値を保存
		//1807298の２乗は-2144051452となる
		//1807298を境目に負となる
		int maxValue=0;
		do{
			//入力を促す
			System.out.println("ｎの値：");
			//計算できるように処理
			maxValue = standardInput.nextInt();
		//１より小さい値が入力された場合
		}while(maxValue<1);
		//１の２乗、２の２乗、３の２乗、・・・と計算していく
		for(int i=1; i<maxValue+1; i++) {
			//結果の表示
			System.out.println(i + "の２乗は" + i*i);
		}
		
	}

}

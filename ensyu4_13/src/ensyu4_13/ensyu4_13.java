package ensyu4_13;

import java.util.Scanner;
/*
 * クラス名:ensyu4_13
 * 概要  :演習4-13
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
public class ensyu4_13 {
	/*
	 * 関数名：main
	 * 概要  :
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//数値入力を促す
		System.out.println("１からｎまでの和を求めますか？");
		//いくつまで和をもとめるか
		int integerN;
		//繰り返し
		do {
			//ｎの値を聞く
			System.out.print("nの値：");
			//入力された値を計算できるように処理
			integerN = standardInput.nextInt();
		//入力されたｎの値が０以下ならもう一度入力
		}while(integerN <= 0);
		//和を行った結果をメモ
		int resultNumber = 0;
		//nまで足し算をする
		for(int i=0;i<integerN;++i) {
			//resultNumber にどんどん足していく
			resultNumber += i;
		}
	}
}

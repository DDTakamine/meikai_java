package ensyu4_14;

import java.util.Scanner;
/*
 * クラス名:ensyu4_14
 * 概要  :演習4-14
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
public class ensyu4_14 {
	/*
	 * 関数名：main
	 * 概要  :ensyu4-13を書き換えて、
	 *           nの値：５
	 *           1 + 2 + 3 + 4 + 5 = 15
	 *        と出力するプログラムを作成
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
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
		for(int i=1;i<integerN+1;++i) {
			//数字を先に出力
			System.out.print(i+" ");
			//最後の数字以外には＋を表示する
			if(i!=integerN) {
				//+を表示
				System.out.print("+"+" ");
			}
			//resultNumber にどんどん足していく
			resultNumber += i;
		}
		//足し算の結果を表示
		System.out.print("= "+ resultNumber);
	}
}
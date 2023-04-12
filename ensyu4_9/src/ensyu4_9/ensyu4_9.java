package ensyu4_9;

import java.util.Scanner;
/*
 * クラス名:ensyu4_9
 * 概要  :演習4-9
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_9{
	/*
	 * 関数名：main
	 * 概要  :正の整数値ｎを読み込んで、１～ｎまでの積を求めるプログラム
	 *        参考：n=24以上になると符号が負になる。また、数が大きくなると０になる。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//標準入力準備
		Scanner standardInput = new Scanner(System.in);
		//入力する数値を保存
		int inputedNumber;
		do {
			//計算する値入力を促す
			System.out.print("nの値：");
			//入力された値が計算できるようにする
			inputedNumber = standardInput.nextInt();
		//0以下で再入力
		}while(inputedNumber<=0);
		//0!は１として考える
		//入力した値が65より大きくなると０になる
		//入力した値が24より大きくなると負の数が表記される
		long resultValue = 1;	
		//いくつまで数えたかを数える
		int countNumber = 1;
		//いくつまで掛け算したか数える変数が入力された値に達するまで
		while(countNumber <= inputedNumber){
			//resultValueとcountNumberの掛け算をする
			resultValue *= countNumber;
			//次の数に進む
			++countNumber;
		}
		//結果表示
		System.out.print("１から"+inputedNumber+"までの積は"+resultValue+"です。");
	}
}

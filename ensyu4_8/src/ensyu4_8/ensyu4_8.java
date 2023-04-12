package ensyu4_8;

import java.util.Scanner;
/*
 * クラス名:ensyu4_8
 * 概要  :演習4-8
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_8{
	/*
	 * 関数名：main
	 * 概要  :正の整数値を読み込んで、その桁数を出力する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//標準入力できるように準備
		Scanner standardInput = new Scanner(System.in);
		//入力した値を保存
		int inputedNumber;
		do {
			//整数値入力を促す
			System.out.print("整数値：");
			//入力された値を処理ができるようにする
			inputedNumber = standardInput.nextInt();
		}while(inputedNumber<=0);
		//桁数をメモする
		int countNumber = 0;
		//inputedNumberが０でない間は
		while(inputedNumber != 0){
			//桁数を一つ増やす
			countNumber++;
			//一の位を消して、数字を右にズラす
			inputedNumber /= 10;
		}
		//数えた桁数を表示
		System.out.println("その値は"+countNumber+"桁です。");
	}
}

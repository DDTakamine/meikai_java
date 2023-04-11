package ensyu4_3;

import java.util.Scanner;
/*
 * クラス名:ensyu4_3
 * 概要  :演習4-3
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_3{
	/*
	 * 関数名：main
	 * 概要  :２桁の整数値を入力。入力された値の小さい数値から大きい数値までの整数値を出力する。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数値入力を促す
		System.out.print("整数A:");
		//入力された値を処理できるようにする
		int firstNumber = standardInput.nextInt();
		//整数値入力を促す
		System.out.print("整数B:");
		//入力された値を処理できるようにする
		int secondNumber = standardInput.nextInt();
		//一時避難変数を初期化して用意
		int temporary = 0;
		//もし、１つ目に入力された値が２つ目に入力された値よりも大きいならば、
		if (firstNumber > secondNumber){
			//１つ目の値を避難
			temporary = firstNumber ;
			//２つ目の値を１つ目の値とする
			firstNumber = secondNumber ;
			//避難しておいた値を２つ目の値とする
			secondNumber = temporary ;
		}
		//繰り返し処理するための変数
		int countNumber = 0 ;
		//小さい値から大きい値まで整数を繰り返し表示
		do{
			//整数を表示
			System.out.print((firstNumber+countNumber) + " ");
			//次の整数を表示する準備
			++countNumber ;
		//大きい値になるまで繰り返す
		}while((firstNumber+countNumber) <= secondNumber);
	}
}

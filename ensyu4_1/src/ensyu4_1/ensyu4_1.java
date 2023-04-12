package ensyu4_1;

import java.util.Scanner;
/*
 * クラス名:ensyu4_1
 * 概要  :演習4-1
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_1{
	/*
	 * 関数名：main
	 * 概要  :教本５８ページ　List3-5　プログラムを好きなだけ
	 　　　　　何度も繰り返して入力・出力できるプログラムに改変
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main (String[] arg){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//再度、数値入力をするかどうかを確認する際の変数
		int retryControl = 0;
		//好きな回数だけ数値入力を行う
		do{
			//整数値入力を促す
			System.out.println("数字を入力してください。");
			//入力された値を計算できるようにする
			int inputedValue = standardInput.nextInt();
			//入力された値が正ならば、
			if(inputedValue > 0)
				//その値は正ですと表示
				System.out.println("その値は正です。");
			//もし、入力された値が負ならば、
			else if (inputedValue < 0)
				//その値は負ですと表示
				System.out.println("その値は負です。");
			//もし、入力された値が正でも負でもないならば、
			else	
				//その値は０ですと表示
				System.out.println("その値は０です。");
			//もう一度整数値を入力するかどうか問う
			System.out.println("もう一度？　１・・・Yes ２・・・No");
			//入力された値を処理できるように格納
			retryControl = standardInput.nextInt();
		//もし、もう一度整数値を入力する場合、繰り返し処理を行う
		}while(retryControl == 1);
	}
}
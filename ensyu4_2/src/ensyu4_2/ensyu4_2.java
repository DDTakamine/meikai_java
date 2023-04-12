package ensyu4_2;


import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:ensyu4_2
 * 概要  :演習4-2
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_2{
	/*
	 * 関数名：main
	 * 概要  :２桁の整数値をランダムに発生させて、その値を推測するゲーム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main (String[] arg){
		//乱数発生準備
		Random randValue = new Random();
		//標準入力を行う準備
		Scanner standardInput = new Scanner(System.in);
		//乱数発生
		int correctAnswer = randValue.nextInt(90)+10;
		//ゲーム開始
		System.out.println("数あてゲームを開始！");
		//ルール説明
		System.out.println("１０～９９の数を当ててください。");
		//推測した値
		int guessesNumber=0;
		//推測を繰り返す
		do{
			do {
				//推測を促す
				System.out.println("いくつかな？");
				//入力された値を処理できるようにする
				guessesNumber = standardInput.nextInt();
			//入力が正しくない場合は再度入力する
			}while(guessesNumber<10 || 99<guessesNumber);
			//もし、推測した値が正解よりも大きい
			if(guessesNumber > correctAnswer)
				//もっと小さな値ですと表示
				System.out.println("もっと小さな値です。");
			//もし、推測した値が正解よりも小さい場合
			else if (guessesNumber < correctAnswer)
				//もっと大きな値ですと出力
				System.out.println("もっと大きな値です。");
		//推測した値と正解が違う時は再度推測するように促す
		}while(guessesNumber != correctAnswer);
		//正解ですと表示
		System.out.println("正解です！！");
	}
}

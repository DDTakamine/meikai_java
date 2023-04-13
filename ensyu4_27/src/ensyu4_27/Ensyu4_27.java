package ensyu4_27;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名:ensyu4_23
 * 概要  :演習4-23
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_27 {
	/*
	 * 関数名：main
	 * 概要  :数当てゲームを何回もできるようにする
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
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
		//回数制限する変数
		int countControl=0;
		//ループをコントロール
		int loopControl=0;
		//回数を繰り返し聞く
		do {
			//回数制限を設ける
			System.out.print("回数制限をします\n何回にしますか？");
			//入力された値を処理できるようにする
			countControl = standardInput.nextInt();
			//入力が正しくない場合は再度入力する
		}while(countControl<=0);
		//目印
		Outer:
			//推測を繰り返す
			do{
				//推測するときに正しい値になっているか？
				do {
					//推測を促す
					System.out.println("いくつかな？");
					//入力する数値を知らせる
					System.out.print("10～99の整数を入力：");
					//入力された値を処理できるようにする
					guessesNumber = standardInput.nextInt();
					//入力が正しくない場合は再度入力する
				}while(guessesNumber<10 || 99<guessesNumber);
				//もし、推測した値が正解よりも大きい
				if(guessesNumber > correctAnswer) {
					//もっと小さな値ですと表示
					System.out.println("もっと小さな値です。");
				}
				//もし、推測した値が正解よりも小さい場合
				else if (guessesNumber < correctAnswer) {
					//もっと大きな値ですと出力
					System.out.println("もっと大きな値です。");
				}
				//正解になったならば、
				else{
					//正解ですと表示
					System.out.println("正解です！！");
				}
				//ゲーム回数を一回増やす
				++loopControl;
				//もし、ゲーム回数とループ回数が等しいならば、
				if(countControl==loopControl) {
					//回数に達したことを伝える
					System.out.println("回数制限に達しました。");
					//ゲーム終了を伝える
					System.out.println("ゲームを終了します");
					//ループから抜ける
					break Outer;
				}

			//推測した値と正解が違う時は再度推測するように促す
			}while(guessesNumber != correctAnswer);
	}
}
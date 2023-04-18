package ensyu7_10;
//乱数発生準備
import java.util.Random;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_10
 * 概要  :演習7-10
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_10 {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//乱数発生の準備
	static Random randomValue = new Random();
	//問題数を定義
	static final int QUESTION_NUMBER = 4;
	/*
	 * 関数名：confirmRetry
	 * 概要  :もう一度、問題を出すかを聞く
	 * 引数  :なし
	 * 戻り値:boolean型　もう一度出題：true
	 * 作成日:2023.04.18
	 */
	static boolean confirmRetry() {
		int countValue = 0 ;
		do {
			System.out.print("もう一度？＜Yes...1/No...0＞");
			countValue = standardInput.nextInt();
		}while(countValue!=0 && countValue!=1);
		return countValue == 1;
	}
	/*
	 * 関数名：selectQuestionAnswer
	 * 概要  :問題を選び、それに対応する答えを返す
	 * 引数  :int型　firstValue　 第一オペランド
	 * 				 secondValue　第二オペランド
	 * 				thirdOperand  第三オペランド
	 * 戻り値:正解の数値
	 * 作成日:2023.04.18
	 */
	static int selectQuestionAnswer(int firstValue, int secondValue,int thirdValue) {
		//ランダムに問題を選ぶ
		int randomQuestion = randomValue.nextInt(QUESTION_NUMBER);
		//正解の数値を保存
		int correctAnswer=0;
		//問題番号で場合分け
		switch(randomQuestion) {
		//問題１の場合
		case 0:
			//問題を表示する
			System.out.print(firstValue+"+"+secondValue+"+"+thirdValue+"=");
			//正解を計算しておく
			correctAnswer = firstValue + secondValue + thirdValue ;
			//switch文から抜ける
			break;
		//問題２の場合
		case 1:
			//問題を表示する
			System.out.print(firstValue+"+"+secondValue+"-"+thirdValue+"=");
			//正解を計算しておく
			correctAnswer = firstValue + secondValue - thirdValue ;
			//switch文から抜ける
			break;
		//問題３の場合
		case 2:
			//問題を表示する
			System.out.print(firstValue+"-"+secondValue+"+"+thirdValue+"=");
			//正解を計算しておく
			correctAnswer = firstValue - secondValue + thirdValue ;
			//switch文から抜ける
			break;
		//問題４の場合
		case 3:
			//問題を表示する
			System.out.print(firstValue+"-"+secondValue+"-"+thirdValue+"=");
			//正解を計算しておく
			correctAnswer = firstValue - secondValue - thirdValue ;
			//switch文から抜ける
			break;
		}
		//正解の数値を返す
		return correctAnswer;
	}
	
	/*
	 * 関数名：main
	 * 概要  :List7-11を改良し、４つの問題がランダムに出題するようにする。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		Random randomValue = new Random();
		//プログラム説明
		System.out.println("暗算力トレーニング!!");
		//繰り返し
		do {
			//乱数で計算で使う数値を作る
			int firstOperand = randomValue.nextInt(900)+100;
			//乱数で計算で使う数値を作る
			int secondOperand = randomValue.nextInt(900)+100;
			//乱数で計算で使う数値を作る
			int thirdOperand = randomValue.nextInt(900)+100;
			//正解を保存
			int correctAnswer=0;
			//入力した値を保存する変数
			int inputAnswer  =0;
			//返ってきた数値を保存
			correctAnswer = selectQuestionAnswer(firstOperand,secondOperand,thirdOperand);
			//正解するまで繰り返す
			while(true) {
				//入力した値を保存
				inputAnswer = standardInput.nextInt();
				//もし、正解したら
				if(inputAnswer == correctAnswer) {
					//while文から抜ける
					break;
				}
				//不正解を知らせる
				System.out.println("違いますよ！！");
			}
		//ユーザーにもう一度問題を出してほしいか聞く
		}while(confirmRetry());
	}
}

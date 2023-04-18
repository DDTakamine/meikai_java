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
	/*
	 * 関数名：main
	 * 概要  :List7-11を改良し、４つの問題がランダムに出題するようにする。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	static Scanner standardInput = new Scanner(System.in);
	static Random randomValue = new Random();
	static final int QUESTION_NUMBER = 4;
	
	static boolean confirmRetry() {
		int countValue = 0 ;
		do {
			System.out.print("もう一度？＜Yes...1/No...0＞");
			countValue = standardInput.nextInt();
		}while(countValue!=0 && countValue!=1);
		return countValue == 1;
	}
	/*
	 * 関数名：main
	 * 概要  :List7-11を改良し、４つの問題がランダムに出題するようにする。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	static int selectQuestionAnswer(int firstValue, int secondValue,int thirdValue) {
		int randomQuestion = randomValue.nextInt(QUESTION_NUMBER);
		int correctAnswer=0;
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
			//
			int inputAnswer  =0;
			correctAnswer = selectQuestionAnswer(firstOperand,secondOperand,thirdOperand);
			while(true) {
				
				inputAnswer = standardInput.nextInt();
				if(inputAnswer == correctAnswer) {
					break;
				}
				System.out.println("違いますよ！！");
			}
		}while(confirmRetry());
	}
}

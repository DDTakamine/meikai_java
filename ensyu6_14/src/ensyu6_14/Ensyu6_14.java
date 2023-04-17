package ensyu6_14;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_14
 * 概要  :演習6-14
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_14 {
	/*
	 * 関数名：main
	 * 概要  :英単語学習プログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//乱数発生準備
		Random randomValue = new Random();
		//乱数範囲設定
		final int RANDOM_RANGE = 12;
		//正解を配列にまとめる
		String[] answerMonth = {"January"  ,"February","March"   ,"April" ,
								"May"      ,"June"    ,"July"    ,"August"  ,
								"September","October" ,"November","December"};
		//再度、出題するかどうか聞く際の変数
		int loopControl     = 0 ;
		//何月を出題するか乱数を格納
		int questionNumber  = 0 ;
		//一つ前の質問と同じにならないようにする
		int notSameQuestion = 0 ;
		//プログラム説明
		System.out.println("英語の月名を入力してください。");
		//入力方法説明
		System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");
		//再度、問題を出すかどうか聞く為のループ
		do {
			//一つ前の質問と問題がかぶらないようにする
			do {
				//1~RANDOM_RANGEまでで何月の質問をするのか決める
				questionNumber = randomValue.nextInt(RANDOM_RANGE) + 1 ;
			//前の問題と同じ問題になっていたら再度問題を選ぶ
			}while(questionNumber == notSameQuestion);
			//今の問題番号をメモ
			notSameQuestion = questionNumber;
			//質問を投げかける
			System.out.print(questionNumber+"月：");
			//入力を受け取る
			String inputString = standardInput.next();
			//正解ならば、
			if(answerMonth[questionNumber-1].equals(inputString)  ==  true) {
				//正解表示
				System.out.println("正解です!!");
			//不正解ならば、
			}else {
				//不正解と表示
				System.out.println("不正解です。");
			}
			//もう一度問題を出すか？
			System.out.print("もう一度？  1...Yes  それ以外...No  :  ");
			//入力した値を格納
			loopControl = standardInput.nextInt();
			//整える改行
			System.out.println("\n");
		//1の間、質問を出し続ける
		}while(loopControl == 1);

	}
}

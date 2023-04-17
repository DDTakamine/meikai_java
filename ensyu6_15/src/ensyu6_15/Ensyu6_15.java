package ensyu6_15;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
* クラス名:ensyu6_15
* 概要  :演習6-15
* 作成者:R.Akamine
* 作成日:2023/04/17
*/
public class Ensyu6_15 {
	/*
	 * 関数名：main
	 * 概要  :英単語学習プログラム（曜日）
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.17
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//乱数発生準備
		Random randomValue = new Random();
		//乱数範囲設定
		final int RANDOM_RANGE = 7;
		//正解を配列にまとめる
		String[] answerDay = {"sunday"  , "monday" , "tuesday"  ,"wednesday" ,
								"thursday", "friday" , "saturday"   };
		//問題を出す際に、表示する文字列
		String[] questionDay = { "日曜日","月曜日","火曜日","水曜日",
							  "木曜日","金曜日","土曜日"};
		//再度、出題するかどうか聞く際の変数
		int loopControl     = 0 ;
		//何曜日を出題するか乱数を格納
		int questionNumber  = 0 ;
		//一つ前の質問と同じにならないようにする
		int notSameQuestion = 0 ;
		//プログラム説明
		System.out.println("英語の曜日を入力してください。");
		//入力方法説明
		System.out.println("すべて小文字とします。");
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
			System.out.print(questionDay[ questionNumber-1 ]+"：");
			//入力を受け取る
			String inputString = standardInput.next();
			//正解ならば、
			if(answerDay[questionNumber-1].equals(inputString)  ==  true) {
				//正解表示
				System.out.println("正解です!!");
			//不正解ならば、
			}else {
				//繰り返し
				do {
				//不正解と表示
				System.out.println("不正解です。再入力します。");
				//入力を受け取る
				inputString = standardInput.next();
			//不正解の間、
			}while(answerDay[questionNumber-1].equals(inputString)  !=  true);
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

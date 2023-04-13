package ensyu6_6;
import java.util.Scanner;
/*
 * クラス名:ensyu6_6
 * 概要  :演習6-6
 * 作成者:R.Akamine
 * 作成日:2023/04/13
 */
public class Ensyu6_6 {
	/*
	 * 関数名：main
	 * 概要  :テストの点数の合計点・平均点・最高点・最低点を表示するプログロム
	 * 			人数と点数は標準入力
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.13
	 */
	public static void main(String[] args){
		//標準入力を行う準備
		Scanner standardInput = new Scanner(System.in);
		//人数を入力
		int peopleNumber = 0;
		//繰り返し
		do {
			//人数の入力を促す
			System.out.print("人数を入力します。");
			//人数入力したあとに処理できるようにする
			peopleNumber = standardInput.nextInt();
		//０以下の人数の時は再度入力
		}while(peopleNumber <=0);
		//得点を保存する配列を用意
		int[] scoreArray = new int[peopleNumber];
		//合計値、最大値、最小値を初期化
		int sumValue=0;  int maxValue=0;  int minValue=100;
		//得点を人数分入力するループ
		for(int i=0; i<peopleNumber; i++) {
			//点数を正しく入力するためのループ
			do {
				//人数分の得点入力を促す
				System.out.println((i+1)+"人目の得点を入力します。");
				//標準入力から値を受け取る
				scoreArray[i]  = standardInput.nextInt();
			}while(scoreArray[i] < 0 || 100 < scoreArray[i]);
		}
		//合計、最大値、最小値を求めるループ
		for(int i=0; i<peopleNumber; i++) {
			//合計を求める
			sumValue += scoreArray[i];
			//もし、maxValueの値が最大でない場合、
			if(maxValue<scoreArray[i]) {
				//値をコピーする
				maxValue = scoreArray[i];
			}
			//もし、minValueの値が最小でない場合、
			if(minValue>scoreArray[i]) {
				//値をコピーしてくる
				minValue = scoreArray[i];
			}
		}
		//合計点の表示
		System.out.println("合計："+sumValue);
		//平均点の表示
		System.out.println("平均："+(double)sumValue/peopleNumber);
		//最高点の表示
		System.out.println("最高点："+maxValue);
		//最小点の表示
		System.out.println("最小点："+minValue);
	}
}

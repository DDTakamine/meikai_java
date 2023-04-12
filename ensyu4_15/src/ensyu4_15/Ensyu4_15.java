package ensyu4_15;
import java.util.Scanner;
/*
 * クラス名:ensyu4_15
 * 概要  :演習4-15
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
public class Ensyu4_15 {
	/*
	 * 関数名：main
	 * 概要  :身長と標準体重の対応表を表示するプログラムを作成。
	 * 　　　　表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込む。
	 * 　　　　標準体重は（身長ー100）×0.9によって求められる。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args) {
		//標準入力のための準備
		Scanner standardInput = new Scanner(System.in) ;
		//開始値を保存
		int startValue=0;
		//最終値を保存
		int finalValue=0;
		//増分を保存
		int differenceValue=0;
		do {
			//開始の身長を入力
			System.out.print("開始何ｃｍから：");
			//計算できるように処理
			startValue = standardInput.nextInt();
		//負の値が入力されると再度入力
		}while(startValue<0);
		do {
			//終了値を入力
			System.out.print("終了何ｃｍまで：");
			//計算できるように処理
			finalValue = standardInput.nextInt();
		//負の値が入力されると再度入力
		}while(finalValue<0);
		do {
			//増分を入力
			System.out.print("増分何ｃｍごと：");
			//計算できるように処理
			differenceValue = standardInput.nextInt();
		//負の値が入力されると再度入力
		}while(differenceValue<=0);
		//項目を表示
		System.out.println("身長"+"      "+"標準体重");
		//開始値から終了値を増分だけ増えていくように設定
		for(int i=startValue; i<= finalValue; i+=differenceValue) {
			//身長と計算した標準偏差を表示
			System.out.println( i +" "+(i-100)*0.9);
		}
	}
}

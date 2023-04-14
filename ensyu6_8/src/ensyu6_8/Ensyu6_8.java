package ensyu6_8;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_8
 * 概要  :演習6-8
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_8 {
	/*
	 * 関数名：main
	 * 概要  :double型の配列　全要素の合計と平均を求める
	 * 			要素数と全要素の値はキーボードから読み込む
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//配列の要素数を保存
		int arrayElement = 0;
		do {
			//要素数の入力を促す
			System.out.print("要素数：");
			//要素数を受け取る
			arrayElement = standardInput.nextInt();
		//０以下の入力を受け付けない
		}while(arrayElement < 1);
		//double型の配列準備
		double[] doubleArray = new double[arrayElement];
		//要素追加ループ
		for(int i=0; i<arrayElement; ++i) {
			//要素追加を促す
			System.out.println(i+"番目の要素追加");
			//入力した値を配列に追加
			doubleArray[i] = standardInput.nextDouble();
		}
		//合計保存変数
		double sumValue = 0.0;
		//合計計算ループ
		for(int i=0; i<arrayElement; i++) {
			//一つ一つ足し算
			sumValue += doubleArray[i];
		}
		//合計の表示
		System.out.printf("合計： %.3f \n",sumValue);
		//平均の表示
		System.out.printf("平均：%.3f \n",sumValue/arrayElement);
		
	}
	
}

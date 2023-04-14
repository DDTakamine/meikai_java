package ensyu6_9;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_9
 * 概要  :演習6-9
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_9 {
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
		//乱数発生準備
		Random randomValue = new Random();
		//乱数の範囲を指定
		final int RANDOMRANGE = 10;
		//要素数の保存用
		int arrayElement = 0;
		//要素数が正しく入力できるようにループ
		do {
			//要素数入力を促す
			System.out.print("要素数：");
			//入力した値を保存
			arrayElement = standardInput.nextInt();
		//要素数は１以上とする
		}while(arrayElement<1);
		//乱数保存用配列を用意
		int[] intArray = new int[arrayElement];
		//乱数を発生させ、保存するループ
		for(int i=0; i<arrayElement; i++) {
			//１～RANDOMRANGEで乱数を発生させて、保存
			intArray[i] = randomValue.nextInt(RANDOMRANGE)+1; 
		}
		//配列を表示する
		System.out.print("intArray = {"  );
		//配列の要素を表示する為のループ
		for(int i=0; i<arrayElement; i++) {
			//配列の最後に来る前までは
			if(i != arrayElement-1) {
				//要素とコンマを表示
				System.out.print(intArray[i] + ", ");
			//配列の最後に来たら、
			}else {
				//数値とカッコを表示
				System.out.print(intArray[i] + " } ");
			}
		}
	}
}

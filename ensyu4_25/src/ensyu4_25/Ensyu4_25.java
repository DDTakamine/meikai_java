package ensyu4_25;
import java.util.Scanner;
/*
 * クラス名:ensyu4_25
 * 概要  :演習4-25
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_25 {
	/*
	 * 関数名：main
	 * 概要  :List4-18を平均も求めることができるようにプログラムを書き換える
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("整数を加算します");
		//整数の個数を保存
		int integerQuantity=0;
		//繰り返し
		do {
			//加算する整数の個数入力を促す
			System.out.print("何個加算しますか：");
			//入力した値を処理できるようにする
			integerQuantity = standardInput.nextInt();
		//入力は１より値となるようにする
		}while(integerQuantity<1);
		//合計をまとめる変数
		int sumNumber = 0;
		//何個まで数を足したか数える
		int countNumber=0;
		//countNumberがintegerQuantityより小さい間、
		while(countNumber<integerQuantity) {
			//整数値入力を促す
			System.out.print("整数：");
			//入力した整数値を一時的に格納する
			int temporaryInteger = standardInput.nextInt();
			//次に入れる値を合計に足した結果1000を超える場合は、
			if(sumNumber+temporaryInteger > 1000) {
				//合計が1000超えたことを知らせる
				System.out.println("合計が1000を超えました");
				//最後の数値は無視
				System.out.println("最後の数字は無視します");
				//これ以上は整数を入力しない
				break;
			}
			//合計を加算していく
			sumNumber += temporaryInteger;
			//何回足し算をしたかメモ
			++countNumber;
			
		}
		//合計の表示
		System.out.print("合計は"+sumNumber+"です。");
		//平均の表示
		System.out.print("平均は"+sumNumber/countNumber+"です。");
		
	}
}

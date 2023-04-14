package ensyu6_10;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_10
 * 概要  :演習6-10
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Ensyu6_10 {
	/*
	 * 関数名：main
	 * 概要  :連続する要素が同じ値にならないように演習6-9のプログラムを作成
	 * 			要素数は標準入力
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//乱数発生準備
		Random randomValue = new Random();
		//乱数作成するために１０を格納
		final int RANDOMRANGE = 10;
		//要素数の保存用
		int arrayElement = 0;
		//要素数が正しく入力できるようにループ
		do {
			//要素数入力を促す
			System.out.print("要素数：");
			//入力した値を保存
			arrayElement = standardInput.nextInt();
		}while(arrayElement<1);
		//乱数保存用配列を用意
		int[] intArray = new int[arrayElement];
		//乱数を発生させ、保存するループ
		for(int i=0; i<arrayElement; i++) {
			//0番目以外で、
			if(i != 0) {
				//値が連続しないように処理を加える
				do {
					//一度、１～RANDOMRANGEの範囲で乱数発生。配列に格納
					intArray[i] = randomValue.nextInt(RANDOMRANGE)+1;
				//一つ前の要素と同じにならないか確認
				}while(intArray[i-1] == intArray[i]);
			//０番の時は
			}else {
				//乱数をそのまま入れる
				intArray[i] = randomValue.nextInt(RANDOMRANGE)+1;
			}
		}
		//配列を表示する
		System.out.print("intArray = { "  );
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

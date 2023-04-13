package ensyu6_5;
import java.util.Scanner;
/*
 * クラス名:ensyu4_23
 * 概要  :演習4-23
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu6_5 {
	/*
	 * 関数名：main
	 * 概要  :配列に数値を入力していく。その結果を表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力を行う準備
		Scanner standardInput = new Scanner(System.in);
		//要素数を保存
		int arrayElement=0;
		//繰り返し
		do {
			//要素数入力を促す
			System.out.print("要素：");
			//要素数を処理できるようにする
			arrayElement = standardInput.nextInt();
		//０以下の整数値が入力されたら再度入力してもらう
		}while(arrayElement<=0);
		//入力した数値を保存する
		int[] intArray = new int[arrayElement];
		//配列に数値を入れていく
		for(int i=0; i<arrayElement; i++) {
			//入力を促す
			System.out.print("intArray["+i+"] = ");
			//入力した数値を配列に入れ込む
			intArray[i] = standardInput.nextInt();
		}
		//結果を表示する
		System.out.print("intArrray = {");
		//配列の数値を表示する為のループ
		for(int i=0;i<arrayElement; ++i) {
			//要素の最後ではないとき、
			if(i != arrayElement-1) {
				//","も表示
				System.out.print(intArray[i]+",");
			//最後の時は
			}else {
				//"}"も表示する
				System.out.print(intArray[i]+"}");
			}
		}
	}
}

package ensyu6_4;
//乱数発生準備
import java.util.Random;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_4
 * 概要  :演習6-4
 * 作成者:R.Akamine
 * 作成日:2023/04/13
 */
public class Ensyu6_4 {
	/*
	 * 関数名：main
	 * 概要  :List6-5を書き換えて、縦表示にする
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.13
	 */
	public static void main(String[] args){
		//乱数発生準備
		Random rand = new Random();
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		
		int arrayElement=0;
		do {
			//要素数入力を促す
			System.out.print("要素数：");
			//要素数を処理できるようにする
			arrayElement = standardInput.nextInt();	
		}while(arrayElement <1);
		
		//乱数を入れる配列を用意
		int[] intArray = new int[arrayElement];
		//どのような値が格納されているか確認
		for(int i=0; i<arrayElement; i++) {
			//１～１０乱数発生させて、格納
			intArray[i] = 1 + rand.nextInt(10);
			//確認の為、表示
			System.out.println("intArray["+i+"] = "+intArray[i]);
		}
		//乱数は１～１０の為、最大値は１０
		final int maxValue =10 ;
		//上の段から１マスずつ見ていく
		//iは段数、jはマスを参照していく
		for(int i=0; i<maxValue;i++) {
			//１つの段のマスを確認していく
			for(int j=0; j<arrayElement; j++) {
				//もし、10-段数　と　配列に格納されている値が同じならば、
				if(intArray[j] == maxValue-i) {
					//*を表示
					System.out.print("* ");
					intArray[j] -= 1;
				}else {
					System.out.print("  ");
				}
			}
			//一段終了のため、改行コードを入れる
			System.out.print("\n");
		}
		//区切りを表示
		System.out.println("---------------------------");
		//要素数 % 10 を表示する
		for(int i=0; i<arrayElement; ++i) {
			//要素数の表示
			System.out.print(i%10+" ");
		}
		
	}
}

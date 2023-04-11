package ensyu3_15;
import java.util.Scanner ;
/*
 * クラス名:ensyu3_15
 * 概要  :演習3-15
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_15 {
	/*
	 * 関数名：main
	 * 概要  :２つの整数値を読み込んで、降順（大きい順）にソートする
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner starndardInput = new Scanner(System.in);
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数a："); int firstValue = starndardInput.nextInt();
		//２つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数b："); int secondValue = starndardInput.nextInt();
		//一時避難用箱を用意
		int tempValue;
		//もし、２つ目の値が大きいならば、
		if (firstValue<secondValue){
			//一つ目の値を一時避難
			tempValue = firstValue;
			//一つ目の箱に２つ目の値を格納
			firstValue = secondValue;
			//避難しておいた値を２つ目の箱に格納
			secondValue = tempValue;			
		}
		//ソート後を出力
		System.out.println("ソート後：");
		//ソート後を出力
		System.out.println("a=" + firstValue + " b=" + secondValue);
	}
}

package ensyu3_11;
import java.util.Scanner;
/*
 * クラス名:ensyu3_10
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_11 {
	/*
	 * 関数名：main
	 * 概要  :２つの整数値を読み込む。
	 * 　　　　もし、二つの差が１０以下ならば、それらの差は１０以下です。と表示
	 * 　　　　もし、二つの差が１１以上ならば、それらの差は１０以上です。と表示
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main (String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数値入力を促す
		System.out.print("整数値A：");
		//計算準備をする
		int firstValue = standardInput.nextInt();
		//整数値入力を促す
		System.out.print("整数値B：");
		//計算準備をする
		int secondValue = standardInput.nextInt();
		//差を計算して、
		int differanceValue = firstValue>=secondValue ? firstValue-secondValue : secondValue-firstValue ;
		//もし、二つの差が１０以下ならば、
		if (differanceValue <= 10)
			//それらの差は１０以下です。と表示
			System.out.println("それらの差は１０以下です。");
		//もし、二つの差が１１以上ならば
		else 
			//それらの差は１０以上です。と表示
			System.out.println("それらの差は１１以上です。");

	}
}

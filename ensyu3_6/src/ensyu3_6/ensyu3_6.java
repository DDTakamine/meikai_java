package ensyu3_6;
import java.util.Scanner;
/*
 * クラス名:ensyu3_7
 * 概要  :演習3-7
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_6 {
	/*
	 * 関数名：main
	 * 概要  :正の整数値を読み込んで、
	 * 　　　　　　・３で割った余りが０ならば、その値を３で割った時の余りは０です。と表示
	 * 　　　　　　・３で割った余りが１ならば、その値を３で割った時の余りは１です。と表示
	 * 　　　　　　・３で割った余りが２ならば、その値を３で割った時の余りは２です。と表示
	 * 　　　　ただし、正でない値が入力されたら、正でない値が入力されました。と表示
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.07  
	 */
	public static void main (String[] arg){
		//標準入力の準備
		Scanner standarInput = new Scanner(System.in);
		//正の整数入力を促す
		System.out.print("正の整数値：");
		//計算するための準備
		int inputNumber  = standarInput.nextInt();
		//負の値が入力されたならば、
		if (inputNumber < 0)
			//正でない値が入力されました。と表示して、処理終了。
			System.out.println("正でない値が入力されました。");
		//３で割った余りが０ならば、
		else if (inputNumber%3 == 0)
			//その値を３で割った時の余りは０です。と表示
			System.out.println("その値を３で割った時の余りは０です。");
		//３で割った余りが１ならば、
		else if (inputNumber%3 == 1)
			//その値を３で割った時の余りは１です。と表示
			System.out.println("その値を３で割った時の余りは1です。");
		//３で割った余りが２ならば
		else
			//その値を３で割った時の余りは２です。と表示
			System.out.println("その値を３で割った時の余りは2です。");
	}
}

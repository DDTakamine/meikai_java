package ensyu3_7;
import java.util.Scanner;
/*
 * クラス名:ensyu3_5
 * 概要  :演習3-5
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_7 {
	/*
	 * 関数名：main
	 * 概要  :正の整数値を読み込んで、
	 * 　　　　　・３で割って余りが０ならば、その値を３で割った時の余りは０です。と表示
	 *           ・３で割って余りが１ならば、その値を３で割った時の余りは1です。と表示
	 *           ・３で割って余りが２ならば、その値を３で割った時の余りは2です。と表示
	 *        正でない値を読み込んだら、正でない値が入力されました。と表示
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	
	
	
	public static void main (String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//正の整数入力を促す
		System.out.print("正の整数値：");
		//計算するための準備
		int inputNmber = standardInput.nextInt();
		//正でない値を読み込んだら
		if (inputNmber < 0)
			//正でない値が入力されました。と表示
			System.out.println("正でない値が入力されました。");
		//３で割って余りが０ならば
		else if (inputNmber%3 == 0)
			//その値を３で割った時の余りは０です。と表示
			System.out.println("その値を３で割った時の余りは０です。");
		//３で割って余りが１ならば
		else if (inputNmber%3 == 1)
			//その値を３で割った時の余りは1です。と表示
			System.out.println("その値を３で割った時の余りは1です。");
		//３で割って余りが２ならば
		else
			//その値を３で割った時の余りは2です。と表示
			System.out.println("その値を３で割った時の余りは2です。");
	}
}

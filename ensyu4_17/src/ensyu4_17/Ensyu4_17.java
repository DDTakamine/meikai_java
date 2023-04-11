package ensyu4_17;
import java.util.Scanner;
/*
 * クラス名:ensyu4_16
 * 概要  :演習3-16
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
public class Ensyu4_17 {
	/*
	 * 関数名：main
	 * 概要  :読み込んだ整数値の全ての約数を表示するList4-13を書き換えて、
	 * 　　　　約数表示が終えた後に、約数の個数を表示するプログラムの作成
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args) {
		//標準入力のための準備
		Scanner standardInput = new Scanner(System.in);
		//整数値入力を促す
		System.out.println("整数値：");
		//計算できるように処理
		int inputedValue = standardInput.nextInt();
		//個数を数える変数
		int countNumber = 0;
		//１～(入力された値)まで１つずつ整数を見ていく
		for(int divisorNumber=1; divisorNumber<=inputedValue; divisorNumber++) {
			//もし、入力された値÷divisorNumber の余りが０ならば、
			if(inputedValue % divisorNumber == 0) {
				//わる数（divisorNumber）を表示
				System.out.println(divisorNumber);
				//個数を１つ増やす
				countNumber += 1;
			}
		}
		//数えた個数の表示
		System.out.println("約数は"+countNumber+"個です。");
		
	}

}

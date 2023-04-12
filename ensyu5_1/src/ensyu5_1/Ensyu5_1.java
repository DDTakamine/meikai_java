package ensyu5_1;
import java.util.Scanner;
/*
 * クラス名:ensyu5_1
 * 概要  :演習5-1
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_1 {
	/*
	 * 関数名：main
	 * 概要  :
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.12
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//入力する値を保存
		int inputNumber=0;
		//整数入力を促す
		System.out.print("整数値：");
		//入力された値を処理できるようにする
		inputNumber = standardInput.nextInt();
		//
		System.out.printf("8進数では %o です。\n",inputNumber);
		System.out.printf("10進数では %x です。\n",inputNumber);
	}
}

package ensyu5_4;
import java.util.Scanner;
/*
 * クラス名:ensyu5_3
 * 概要  :演習5-3
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_4 {
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
		
		int firstOperand  = 0;
		int secondOperand = 0;
		int thirdOperand  = 0;
		
		//入力を促す
		System.out.print("１つ目の値：");
		//入力した値を計算できるようにする
		firstOperand = standardInput.nextInt();
		//入力を促す
		System.out.print("２つ目の値：");
		//入力した値を計算できるようにする
		secondOperand = standardInput.nextInt();
		System.out.print("３つ目の値：");
		//入力した値を計算できるようにする
		thirdOperand = standardInput.nextInt();
		
		//合計を出力
		System.out.println("３つの値の合計 : "+(firstOperand+secondOperand+thirdOperand));
		//平均を出力
		System.out.println("３つの値の平均 : "+(double)(firstOperand+secondOperand+thirdOperand)/3);
		
	}
}

package ensyu5_2;
import java.util.Scanner;
/*
 * クラス名:ensyu5_1
 * 概要  :演習5-1
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_2 {
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
		//float型を宣言
		float x = 0.0f;
		//double型を宣言
		double y = 0.0d;
		//変数説明
		System.out.println("変数xはfloat型、変数yはdouble型です。");
		//入力を促す
		System.out.print("x : ");
		//入力された値を処理できるようにする
		x = standardInput.nextFloat();  
		//入力を促す
		System.out.print("y : ");
		//入力された値を処理できるようにする
		y = standardInput.nextDouble();
		//float型を表示
		System.out.println("x = "+ x);
		//double型を表示
		System.out.println("y = "+ y);
		
		
	}
}

package ensyu3_13;
import java.util.Scanner ;
/*
 * クラス名:ensyu3_13
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_13 {
	/*
	 * 関数名：main
	 * 概要  :３つの整数値を読み込む。その値の中央値を計算し、表示する。
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main (String[] arg){
		//入力した値を読み込む準備
		Scanner standardInput = new Scanner (System.in);
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数a : "); int firstOperand = standardInput.nextInt();
		//２つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数b : "); int secondOperand = standardInput.nextInt();
		//３つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数c : "); int thirdOperand = standardInput.nextInt();
		//もし、１番目が一番小さく３番目が一番大きい　または　１番目が一番大きく３番目が一番小さいならば、
		if (firstOperand<=secondOperand && secondOperand<=thirdOperand || thirdOperand<=secondOperand && secondOperand<=firstOperand)
			//中央値は２番目の値
			System.out.println("中央値は" + secondOperand + "です。");
		//もし、１番目が一番小さく２番目が一番大きい　または　２番目が一番小さく１番目が一番大きいならば、
		else if (firstOperand<=thirdOperand && thirdOperand<=secondOperand || secondOperand<=thirdOperand && thirdOperand<=firstOperand)
			//中央値は３番目の値
			System.out.println("中央値は" + thirdOperand + "です。");
		//もし、２番目が一番小さく３番目が一番大きい　または　３番目が一番小さく２番目が一番大きいならば、
		else if (secondOperand<=firstOperand && firstOperand<=thirdOperand || thirdOperand<=firstOperand && firstOperand<=secondOperand)
			//中央値は１番目の値
			System.out.println("中央値は" + firstOperand + "です。");
	}
}

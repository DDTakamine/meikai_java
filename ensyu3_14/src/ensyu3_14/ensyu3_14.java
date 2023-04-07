package ensyu3_14;
import java.util.Scanner ;
/*
 * クラス名:ensyu3_14
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_14 {
	/*
	 * 関数名：main
	 * 概要  :２つの整数値を読み込み、小さいほうと大きいほうをそれぞれ表示する。
	 * 　　　　ただし、２つの値が同じ場合は２つの値は同じです。と出力する。
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//入力した値を読み込む準備
		Scanner standardInput = new Scanner(System.in);
		//１つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数a："); int firstValue = standardInput.nextInt();
		//２つ目の整数値の入力を促し、計算できるようにする
		System.out.print("整数b："); int secondValue = standardInput.nextInt();
		//もし、最初の値が大きいならば、
		if (firstValue>secondValue){
			//大きい値はfirstValue
			System.out.println("大きい値は" + firstValue + "です。");
			//小さい値はsecondValue
			System.out.println("小さい値は" + secondValue + "です。");
		}
		//２番目の値が大きい場合
		else if(firstValue<secondValue){
			//大きい値はfirstValue
			System.out.println("大きい値は" + secondValue + "です。");
			//小さい値はsecondValue
			System.out.println("小さい値は" + firstValue + "です。");
		}
		//それ以外（２つの値が等しい）場合
		else{
			//等しいと表示
			System.out.println("二つの値は同じです。");
		}
	}
}

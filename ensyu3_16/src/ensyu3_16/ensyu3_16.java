package ensyu3_16;
import java.util.Scanner ;
/*
 * クラス名:ensyu3_16
 * 概要  :演習3-16
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu3_16{
	/*
	 * 関数名：main
	 * 概要  :３つの整数値を読み込んで小さい順にソートする
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//最初の値の入力
		System.out.print("整数a："); int firstOperand = standardInput.nextInt();
		//2番目の値の入力
		System.out.print("整数b："); int secondOperand = standardInput.nextInt();
		//３番目の値の入力
		System.out.print("整数c："); int thirdOperand = standardInput.nextInt();
		//実行前の表示
		System.out.println("ソート前：");
		//実行前の表示
		System.out.println("a=" + firstOperand + " b=" + secondOperand + " c=" + thirdOperand);
		//一時避難用の変数を用意
		int tempValue;
		//もし、aがbより大きい場合
		if (firstOperand>secondOperand){
			//aの値を退避
			tempValue = firstOperand ;
			//bの値をaにコピー
			firstOperand = secondOperand ;
			//退避させた値をbに格納
			secondOperand = tempValue;
		}
		//もし、aがcより大きい場合
		if (firstOperand>thirdOperand){
			//もし、aがcより大きい場合
			tempValue = firstOperand ;
			//cの値をaにコピー
			firstOperand = thirdOperand ;
			//退避させた値をcに格納
			thirdOperand = tempValue ;
		}
		//もし、bがcより大きい場合
		if (secondOperand>thirdOperand){
			//もし、bがcより大きい場合
			tempValue = secondOperand ;
			//cの値をbにコピー
			secondOperand = thirdOperand ;
			//退避させた値をcに格納
			thirdOperand = tempValue;	
		}
		//結果表示
		System.out.println("ソート後：");
		//値を表示
		System.out.println("a=" + firstOperand + " b=" + secondOperand + " c=" + thirdOperand);
	}
}
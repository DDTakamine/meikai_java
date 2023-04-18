package ensyu7_3;
/*
 * クラス名:ensyu7_3
 * 概要  :演習7-3
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_3 {
	/*
	 * 関数名：med
	 * 概要  :中央値を求める
	 * 引数  :int型　３つの整数を受け取る
	 * 戻り値:int型　中央値が返ってくる
	 * 作成日:2023.04.18
	 */
	public static int med(int firstOperand,int secondOperand,int thirdOperand) {
		int resultValue = 0;
		//もし、１番目が一番小さく３番目が一番大きい　または　１番目が一番大きく３番目が一番小さいならば、
		if (firstOperand<=secondOperand && secondOperand<=thirdOperand || thirdOperand<=secondOperand && secondOperand<=firstOperand) {
			//中央値は２番目の値
			resultValue = secondOperand;
		//もし、１番目が一番小さく２番目が一番大きい　または　２番目が一番小さく１番目が一番大きいならば
		}else if (firstOperand<=thirdOperand && thirdOperand<=secondOperand || secondOperand<=thirdOperand && thirdOperand<=firstOperand) {
			//中央値は３番目の値
			resultValue = thirdOperand;
		//もし、２番目が一番小さく３番目が一番大きい　または　３番目が一番小さく２番目が一番大きいならば、	
		}else if (secondOperand<=firstOperand && firstOperand<=thirdOperand || thirdOperand<=firstOperand && firstOperand<=secondOperand) {
			//中央値は１番目の値
			resultValue = firstOperand;
		}
		
		return resultValue ;
	}
	/*
	 * 関数名：main
	 * 概要  :medメソッドを使うためのメイン
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//値を一つ作る
		int firstOperand = 293;
		//値を一つ作る
		int secondOperand = -19;
		//値を一つ作る
		int thirdOperand = 830;
		System.out.println(med(firstOperand,secondOperand,thirdOperand));
	}
	
}

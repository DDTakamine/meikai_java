package ensyu4_7;


import java.util.Scanner;
/*
 * クラス名:ensyu4_7
 * 概要  :演習4-7
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_7{
	/*
	 * 関数名：main
	 * 概要  :読み込んだ値の個数だけ、＊と＋を交互に表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args){
		//入力準備
		Scanner standardInput = new Scanner(System.in);
		//何個表示するか保存
		int printedNumber;
		do {
			//表示個数入力を促す
			System.out.print("何個表示しますか：");
			//表示個数を処理できる形にする
			printedNumber = standardInput.nextInt();
		//０以下入力で再入力
		}while(printedNumber<=0);
		//表示が終わった個数をメモ
		int coutnValue = 0;
		//表示する個数に表示した個数が達するまでの間、
		while(coutnValue < printedNumber){
			//もし、表示した個数が偶数ならば、
			if (coutnValue%2 == 0)
				//＊を表示
				System.out.print('*');
			//それ以外（表示した個数が奇数ならば）、
			else
				//+を表示する
				System.out.print('+');
			//表示した個数を１つ増やしてメモ
			coutnValue++;
		}
	}
}

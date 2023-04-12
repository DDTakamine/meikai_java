package ensyu4_5;

import java.util.Scanner;
/*
 * クラス名:ensyu4_5
 * 概要  :演習4-5
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_5{
	/*
	 * 関数名：main
	 * 概要  :List4-5(102ページ)においてx--が--xとなった場合、
	 * 　　　　出力結果がどうなるか検討せよ。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("カウントダウンします。");
		//カウントする変数の用意
		int countNumber ;
		//正の整数が正しく入力されているか確認
		do{
			//正の整数入力を促す
			System.out.print("正の整数値：");
			//入力された値が処理できるようにする
			countNumber = standardInput.nextInt();
		//負の値が入力されたら再度入力してもう
		}while(countNumber <= 0);
		/*
		while(countNumber >= 0){
			System.out.println(countNumber--);
		}
		//実行結果 10 9 8 7 6 5 4 3 2 1 0
		*/
		//カウントダウンする
		while(countNumber >= 0){
			//値を一つずつ減らしながら表示
			System.out.println(--countNumber);
		}
		//実行結果　9 8  7 6 5 4 3 2 1 0 -1
	}
}

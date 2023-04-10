package ensyu4_4;


import java.util.Scanner;
/*
 * クラス名:ensyu4_4
 * 概要  :演習4-4
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu4_4{
	/*
	 * 関数名：main
	 * 概要  :明解Java P.100 List4-4のwhile分終了後に
	 　　　　　xの値が-1になることを確認する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("カウントダウンします。");
		//カウントダウンする変数
		int countNumber ;
		//正の整数がにゅうりょくされるようにする
		do{
			//正の整数の入力を促す
			System.out.print("正の整数値：");
			//入力された値を処理できるようにする
			countNumber = standardInput.nextInt();
		//負の値が入力されたら再度入力してもう
		}while(countNumber <= 0);
		//デクリメントを繰り返し行う
		while(countNumber >= 0){
			//countNumberを表示
			System.out.println(countNumber);
			//カウントダウンする
			countNumber--;
		}
		//区切りを表示
		System.out.println("------------------------");
		//while分が終了した後のcountNumberがいくつになっているか確認
		System.out.println(countNumber);
	}
}
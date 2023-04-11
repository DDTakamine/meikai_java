package ensyu4_22;
import java.util.Scanner;

/*
 * クラス名:ensyu4_22
 * 概要  :演習4-22
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_22 {
	/*
	 * 関数名：main
	 * 概要  :n段のピラミッドを表示するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//段数の入力を促す
		System.out.println("段数は：");
		//入力した数値を処理できるようにする
		int stepValue = standardInput.nextInt();
		//段数を作成するループ
		for(int i=1; i<stepValue+1; i++) {
			//マス目をコントロールするループ
			for(int j=1; j<2*stepValue; j++) {
				//全てのマス目の真ん中から（i-1）だけ右と左の範囲にjが入ったら、
				if(stepValue-(i-1) <= j && j <= stepValue+(i-1)) {
					//＊を表示
					System.out.print("*");
				//ｊがそれ以外の範囲にいる場合は
				}else {
					//スペースを表示
					System.out.print(" ");
				}
			}
			//一段の区切りとして改行コードを出力
			System.out.print("\n");
		}
		
	}
}

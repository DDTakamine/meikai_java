package ensyu4_16;
import java.util.Scanner;
/*
 * クラス名:ensyu4_16
 * 概要  :演習3-16
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
public class Ensyu4_16 {
	/*
	 * 関数名：main
	 * 概要  :読み込んだ個数だけ、＊を表示するプログラムの作成
	 * 			５個表示するごとに改行するプログラム
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main(String[] args) {
		//標準入力のための準備
		Scanner standardInput = new Scanner(System.in);
		//＊の個数を保存
		int astariskValue;
		do {
			//開始の身長を入力
			System.out.println("何個＊を表示しますか：");
			//計算できるように処理
			astariskValue = standardInput.nextInt();
		//０以下の入力は再度入力
		}while(astariskValue<=0);
		//astariskValueの値だけ繰り返し
		for(int i = 1; i<astariskValue+1; ++i) {
			//＊１個を表示
			System.out.print("*");
			//もし＊が５の倍数分だけ表示しているなら
			if(i%5 == 0) {
				//改行する
				System.out.print("\n");
			}
		}
	}

}

package ensyu4_21;
import java.util.Scanner;
/*
 * クラス名:ensyu4_21
 * 概要  :演習4-21
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_21 {
	/*
	 * 関数名：main
	 * 概要  :List4-16(p.124)を参考に、直角が左上、右下、右上
	 * 			になる三角形を表示するプログラム
	 * 			一段目＊
	 * 			二段目＊＊
	 * 			三段目＊＊＊
	 * 			四段目＊＊＊＊
	 * 				　↑
	 *				　１
	 *				　マ
	 *				　ス 
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		int stepValue=0;
		do {
			//段数の入力を促す
			System.out.print("段数は：");
			//入力した数値を処理できるようにする
			stepValue = standardInput.nextInt();
		//段数は１以上からの入力
		}while(stepValue<1);
		//どんな直角三角形かを説明
		System.out.println("直角が左上に来る三角形");
		//iは段数を表す変数
		//入力された段数分だけ段を作成
		for(int i=0; i<stepValue; i++) {
			//i段目で＊を表示する
			for(int j=0; j<stepValue-i; j++) {
				//＊の表示
				System.out.print("*");
			}
			//改行を入れることで段の区切りとする
			System.out.print("\n");
		}
		//どんな直角三角形かを説明
		System.out.println("直角が右上に来る三角形");
		//入力された段数分だけ段を作成
		for(int i=0; i<stepValue; i++) {
			//i段目でスペースまたは＊を表示する
			for(int j=0; j<stepValue; j++) {
				//もし、段数がマス目以上ならば
				if(j>=i) {
					//*を表示
					System.out.print("*");
				//それ以外（段数がマス目より小さい）ならば、
				}else {
					//スペースキーを表示
					System.out.print(" ");
				}
			}
			//改行を入れることで段の区切りとする
			System.out.print("\n");
		}
		//どんな直角三角形かを説明
		System.out.println("直角が右下に来る三角形");
		//入力された段数分だけ段を作成
		for(int i=1; i<stepValue+1; i++) {
			//i段目でスペースまたは＊を表示する
			for(int j=stepValue; j>0; j--) {
				//もし、段数がマス目以上ならば
				if(j<=i) {
					//*を表示
					System.out.print("*");
					//それ以外（段数がマス目より小さい）ならば、
				}else {
					//スペースキーを表示
					System.out.print(" ");
				}
			}
			//改行を入れることで段の区切りとする
			System.out.print("\n");
		}
		
	}

}

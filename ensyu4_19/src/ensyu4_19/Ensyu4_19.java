package ensyu4_19;
import java.util.Scanner;
/*
 * クラス名:ensyu4_18
 * 概要  :演習4-18
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_19 {
	/*
	 * 関数名：main
	 * 概要  :List4-1(p.95)の月読み込みにおいて、
	 * 			１～１２以外の入力がされた場合は、
	 * 			再入力させるように修正したプログラムを作成
	 * 			（do文の中にdo文が入る2重ループ）
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//もう一度季節を聞くための変数
		int retryValue ;
		//何月か入力してもらうための変数
		int monthValue ;
		//好きな回数だけ季節を聞くためのループ
		do {
			//入力が正しく行えているか確認のためのループ
			do {
				//何月か聞く
				System.out.print("季節を求めます。\n何月ですか：");
				//入力した値を計算できるように準備
				monthValue = standardInput.nextInt();
			//１～１２月以外の入力では再度入力し直し
			}while(monthValue<1 || 12<monthValue);
			
			//もし、3月から5月までならば、
			if( monthValue>=3 && monthValue<=5 ) {
				//それは春ですと出力
				System.out.println("それは春です。");
			//6月から8月までならば、
			}else if ( monthValue>=6 && monthValue<=8 ) {
				//それは夏ですと出力
				System.out.println("それは夏です。");
			////9月か11月までならば、
			}else if ( monthValue>=9 && monthValue<=11 ) {
				//それは秋ですと出力
				System.out.println("それは秋です。");
			//もし、12月、1月、2月ならば
			}else if ( monthValue==12 || monthValue==1 || monthValue==2 ) {
				//それは冬ですと出力
				System.out.println("それは冬です。");
			}
			//再度、季節を聞くかどうか確認
			System.out.print("もう一度？　１・・・Yes / 2・・・No");
			//処理が行えるようにする
			retryValue = standardInput.nextInt();
		//もう一度入力したい間
		}while(retryValue == 1);
		
		
	}
}

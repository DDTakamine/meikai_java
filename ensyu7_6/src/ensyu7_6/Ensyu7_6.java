package ensyu7_6;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_5
 * 概要  :演習7-5
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_6 {
	/*
	 * 関数名：main
	 * 概要  :月によって季節を表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void printSeason(int m) {
		//月毎に季節を表示するために、場合分け
		switch (m){
			//１月ならば、冬と表示
			case 1 : System.out.println("冬"); break;
			//２月ならば、冬と表示
			case 2 : System.out.println("冬"); break;
			//３月ならば、冬と表示
			case 3 : System.out.println("春"); break;
			//４月ならば、春と表示
			case 4 : System.out.println("春"); break;
			//５月ならば、春と表示
			case 5 : System.out.println("春"); break;
			//６月ならば、春と表示
			case 6 : System.out.println("夏"); break;
			//７月ならば、夏と表示
			case 7 : System.out.println("夏"); break;
			//８月ならば、夏と表示
			case 8 : System.out.println("夏"); break;
			//９月ならば、夏と表示
			case 9 : System.out.println("秋"); break;
			//１０月ならば、秋と表示
			case 10 : System.out.println("秋"); break;
			//１１月ならば、秋と表示
			case 11 : System.out.println("秋"); break;
			//１２月ならば、秋と表示
			case 12 : System.out.println("冬"); break;
		}
	}
	/*
	 * 関数名：main
	 * 概要  :printSeasonメソッドを使うためのメイン
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//標準入力のための準備
		Scanner standardInput = new Scanner(System.in);
		//何月かを保存
		int monthValue = 0;
		//繰り返し
		do{
			//何月かの入力
			System.out.println("月を入力してください。");
			//入力された値を場合分けするための準備
			monthValue = standardInput.nextInt();
		//１～１２以外の入力は再度入力
		}while(monthValue < 1 | 12 < monthValue);
		//何月かをprintSeasonメソッドに渡す
		printSeason(monthValue);
	}		
}

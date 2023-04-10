package ensyu3_18;

import java.util.Scanner;
/*
 * クラス名:ensyu3_18
 * 概要  :演習3-18
 * 作成者:R.Akamine
 * 作成日:2023/04/10
 */
class ensyu3_18{
	/*
	 * 関数名：main
	 * 概要  :何月かを標準入力。それによって、季節を表示する。
	 　　　　　　もし１月ならば、”冬”を表示させる
	 　　　　　　もし２月ならば、”冬”を表示させる
	 　　　　　　もし３月ならば、”冬”を表示させる
	 　　　　　　もし４月ならば、”春”を表示させる
	 　　　　　　もし５月ならば、”春”を表示させる
	 　　　　　　もし６月ならば、”春”を表示させる
	 　　　　　　もし７月ならば、”夏”を表示させる
	 　　　　　　もし８月ならば、”夏”を表示させる
	 　　　　　　もし９月ならば、”夏”を表示させる
	 　　　　　　もし１０月ならば、”秋”を表示させる
	 　　　　　　もし１１月ならば、”秋”を表示させる
	 　　　　　　もし１２月ならば、”秋”を表示させる
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.10
	 */
	public static void main (String[] arg){
		//標準入力のための準備
		Scanner standardInput = new Scanner(System.in);
		//何月かの入力
		System.out.println("月を入力してください。");
		//入力された値を場合分けするための準備
		int monthValue = standardInput.nextInt();
		//月毎に季節を表示するために、場合分け
		switch (monthValue){
			//１月ならば、冬と表示
			case 1 : System.out.println("冬"); break;
			//２月ならば、冬と表示
			case 2 : System.out.println("冬"); break;
			//３月ならば、冬と表示
			case 3 : System.out.println("冬"); break;
			//４月ならば、春と表示
			case 4 : System.out.println("春"); break;
			//５月ならば、春と表示
			case 5 : System.out.println("春"); break;
			//６月ならば、春と表示
			case 6 : System.out.println("春"); break;
			//７月ならば、夏と表示
			case 7 : System.out.println("夏"); break;
			//８月ならば、夏と表示
			case 8 : System.out.println("夏"); break;
			//９月ならば、夏と表示
			case 9 : System.out.println("夏"); break;
			//１０月ならば、秋と表示
			case 10 : System.out.println("秋"); break;
			//１１月ならば、秋と表示
			case 11 : System.out.println("秋"); break;
			//１２月ならば、秋と表示
			case 12 : System.out.println("秋"); break;
			//入力が正しくない場合はエラー表示
			default : System.out.println("入力が正しくありません。終了します。");
		}
	}
}
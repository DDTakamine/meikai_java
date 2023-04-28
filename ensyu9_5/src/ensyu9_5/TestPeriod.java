package ensyu9_5;
//標準入力
import java.util.Scanner; 
/*フィールド名・クラス名は教本に従う
 * クラス名:TestPeriod
 * 概要  :演習9-5クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class TestPeriod {
	//標準入力
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：main
	 * 概要  :Periodクラスが正しく動くかどうかチェック
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	public static void main(String[] args) {
		//一時保管用年変数
		int temporaryYear = 0;
		//一時保管用月変数
		int temporaryMonth = 0;
		//一時保管用日変数
		int temporaryDay = 0;
		//開始地点
		Day startPoint = new Day(2000,02,29);
		//終了地点
		Day endPoint = new Day(2100,02,29);

		//startPointが正しいか確認
		while(startPoint.checkDate()!=true) {
			//再入力
			System.out.println("開始時点の再入力");
			//年の再入力を促す
			System.out.print("年：");
			//入力を保存
			temporaryYear = standardInput.nextInt();
			//月の再入力を促す
			System.out.print("月：");
			//入力を保存
			temporaryMonth = standardInput.nextInt();
			//日の再入力を促す
			System.out.print("日：");
			//入力を保存
			temporaryDay = standardInput.nextInt();
			//セットしなおし
			startPoint.set(temporaryYear, temporaryMonth, temporaryDay);
		}
		//endPointが正しいか確認
		while(endPoint.checkDate()!=true) {
			//再入力
			System.out.println("終了時点の再入力");
			//年の再入力を促す
			System.out.print("年：");
			//入力を保存
			temporaryYear = standardInput.nextInt();
			//月の再入力を促す
			System.out.print("月：");
			//入力を保存
			temporaryMonth = standardInput.nextInt();
			//日の再入力を促す
			System.out.print("日：");
			//入力を保存
			temporaryDay = standardInput.nextInt();
			//セットしなおし
			endPoint.set(temporaryYear, temporaryMonth, temporaryDay);
		}
		//期間を設定
		Period testPeriod = new Period(startPoint,endPoint);
		//もし、入力がただしければ、
		if(testPeriod.isRightInputPeriod() == true) {
			//開始日の表示
			System.out.println(testPeriod.getStart());
			//終了時の表示
			System.out.println(testPeriod.getFinal());
			//うるう年の表示
			System.out.println("うるう年の回数："+testPeriod.countLeapYear()+"回です");
		//正しくなければ、
		}else {
			//終了する
			System.out.println("期間の入力が正しくありません");
		}
		
	}

}

package ensyu10_4;
import java.util.Scanner;
/*フィールド名・クラス名は教本に従う
 * クラス名:Day
 * 概要  :演習9-5クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class TestDay {
	/*
	 * 関数名：main
	 * 概要  :Dayクラスで作成したメソッドの動作確認
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.02
	 */
	public static void main(String[] args) {
		//クラス型変数を作成
		Day testDay = new Day();
		//未来の定数
		final int FUTURE_VALUE = 1;
		//過去の定数
		final int PASS_VALUE = -1;
		//初期化の様子を表示
		System.out.println(testDay.toString());
		//インスタンス変数を作成
		Day newDay = inputDate();
		//新しいインスタンスを表示
		System.out.println(newDay.toString());
		//今年入って経過した日数を表示
		newDay.calculatePassDay();
		//今年の残りの日数を表示
		newDay.calculateLastDay();
		//入力を促す
		System.out.println("first Day の入力");
		//インスタンスを作成
		Day firstDay = inputDate();
		//前後関係を確認
		int resultValue = newDay.judgeBeforeOrAfterInstanse(firstDay);
		//前後関係を確認した後の変数で場合分け
		if(resultValue==FUTURE_VALUE) {
			//未来の表示
			System.out.println("インスタンス変数よりも未来です。");
		//-1の場合、
		}else if(resultValue == PASS_VALUE) {
			//過去の表示
			System.out.println("インスタンス変数よりも過去です。");
		//同じ日の場合
		}else {
			//同じ日の表示
			System.out.println("同じ日付です。");
		};
		
		//secondDayの入力を促す
		System.out.println("second Day の入力");
		//インスタンス
		Day secondDay = inputDate();
		//前後関係を調べる
		resultValue = Day.judgeBeforeOrAfterClassMethod(firstDay,secondDay);
		//もし、未来ならば、
		if(resultValue==FUTURE_VALUE) {
			//未来ですと表示
			System.out.println("first Day の方が未来です。");
		//過去ならば、
		}else if(resultValue == PASS_VALUE) {
			//過去ですと表示
			System.out.println("first Day の方が過去です。");
		//同じ日付ならば、
		}else {
			//同じ日付と表示
			System.out.println("同じ日付です。");
		};
		//インスタンス
		Day thirdDay = new Day(secondDay.getYear(),secondDay.getMonth(),secondDay.getDay());
		//区切り
		System.out.println("------------------------------------------");
		//一日進める
		secondDay.passOneDay();
		//表示
		System.out.println(secondDay.toString());
		//処理の表示
		System.out.println("thidDay.returnPassOneDay");
		//結果の表示
		System.out.println( thirdDay.returnPassOneDay().toString());
		//区切り
		System.out.println("------------------------------------------");
		//一日戻る
		secondDay.backOneDay();
		//結果表示
		System.out.println(secondDay.toString());
		//処理の表示
		System.out.println("thidDay.returnBackOneDay");
		//結果表示
		System.out.println( thirdDay.returnBackOneDay().toString());
		//区切り
		System.out.println("------------------------------------------");
		//３６５日進める
		secondDay.passNDay(365);
		//結果表示
		System.out.println(secondDay.toString());
		//処理の表示
		System.out.println("Day.returnPassNDay(5)");
		//結果表示
		System.out.println( thirdDay.returnPassNDay(5).toString());
		//区切り
		System.out.println("------------------------------------------");
		//３６５日戻す
		secondDay.backNDay(365);
		//結果表示
		System.out.println(secondDay.toString());
		//処理の表示
		System.out.println("Day.returnBackNDay(5)");
		//結果表示
		System.out.println( thirdDay.returnBackNDay(5).toString());
		
	}
	
	public static Day inputDate() {
		//インスタンス変数を用意
		Day temporaryDay = new Day();
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//年の入力
		System.out.print("年の入力：");
		//年を入力
		int inputYear = standardInput.nextInt();
		//年をセット
		temporaryDay.setYear(inputYear);
		//月の入力
		System.out.print("月の入力：");
		//月を入力
		int inputMonth = standardInput.nextInt();
		//年をセット
		temporaryDay.setMonth(inputMonth);
		//年の入力
		System.out.print("日の入力：");
		//年を入力
		int inputDate = standardInput.nextInt();
		//年をセット
		temporaryDay.setDate(inputDate);
		//結果を返す
		return temporaryDay;
	}
}

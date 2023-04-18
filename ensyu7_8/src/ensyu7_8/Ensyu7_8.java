package ensyu7_8;
//乱数発生準備
import java.util.Random;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_8
 * 概要  :演習7-8
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_8 {
	/*
	 * 関数名：random
	 * 概要  :a以上b未満の乱数を生成して、その値を返却するメソッド。
	 * 			bがaより小さい場合はaの値をそのまま返却
	 * 引数 :int型　a 乱数の範囲（最小）
	 * 		 int型　b 乱数の範囲（最大）
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static int random(int a, int b) {
		Random randomValue = new Random();
		//もし、aの方が大きいならば、
		if(b < a) {
			//a	の値を返す
			return a;
		}
		//指定された範囲で乱数を発生させて返り値とする
		return (a + randomValue.nextInt(b-a)); 
	}
	/*
	 * 関数名：main
	 * 概要  :a～bの範囲で乱数を発生・表示させる
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		int firstArgument = 0;
		int secondArgument = 0;
		
		
		//入力を促す
		System.out.println("いくつからいくつまでの範囲で乱数を発生させますか？");
		//１つめの入力を促す
		System.out.print("１つ目：");
		//入力された値を保存
		firstArgument = standardInput.nextInt(); 
		//２つめの入力を促す
		System.out.print("２つ目：");
		//入力された値を保存
		secondArgument = standardInput.nextInt(); 
		
		System.out.println("発生させた乱数は"+random(firstArgument,secondArgument)+"です。");
		
	}
}

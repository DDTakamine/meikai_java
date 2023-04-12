package ensyu4_26;
import java.util.Scanner;
/*
 * クラス名:ensyu4_26
 * 概要  :演習4-26
 * 作成者:R.Akamine
 * 作成日:2023/04/11
 */
public class Ensyu4_26 {
	/*
	 * 関数名：main
	 * 概要  :List4-19を平均も求めることができるようにプログラムを書き換える
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.11
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.print("整数を加算します");
		//整数の個数
		int integerQuantity=0;
		do {
			//加算する整数の個数入力を促す
			System.out.print("何個加算しますか：");
			//入力した値を処理できるようにする
			integerQuantity = standardInput.nextInt();
		//個数は１以上
		}while(integerQuantity<1);
		//合計をまとめる変数
		int sumNumber = 0;
		//何個まで数を足したか数える
		int countNumber=0;
		int loopControl=0;
		
		//countNumberがintegerQuantityより小さい間、
		while(loopControl<integerQuantity) {
			//整数値入力を促す
			System.out.println("整数：");
			//入力した整数値を一時的に格納する
			int temporaryInteger = standardInput.nextInt();
			//何個整数を入力したかメモ
			++loopControl;
			//もし、負の値が入力されたら、
			if(temporaryInteger<0) {
				//警告
				System.out.println("負の数は加算しません。");
				//続ける
				continue;
			}
			//合計を加算していく
			sumNumber += temporaryInteger;
			//何回整数足し算したかをメモ
			++countNumber;

		}
		//全て負の場合は合計も０、平均も０になる。
		//その際に、countNumberが０となり、０で割る処理がでてしまうので、
		//それに対応するための処理を加える
		//通常考えている場合
		if(countNumber!=0) {
			//合計の表示
			System.out.println("合計は"+sumNumber+"です。");
			//平均の表示
			System.out.println("平均は"+sumNumber/countNumber+"です。");
		//全て負の数が入力された場合の対応
		}else {
			//合計の表示
			System.out.println("合計は0です。");
			//平均の表示
			System.out.println("平均は0です。");
		}
		

	}


}

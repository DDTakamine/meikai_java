package ensyu7_12;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_12
 * 概要  :演習7-12
 * 作成者:R.Akamine
 * 作成日:2023/04/19
 */
public class Ensyu7_12 {
	/*
	 * 関数名：rRotate
	 * 概要  :ｎビット右回転した値
	 * 引数  :int型　x 10進数から２進数にして右回転する
	 * 				 n ｎ回だけ右回転する
	 * 戻り値:int型　rotatedValue 回転した後の整数値
	 * 作成日:2023.04.19
	 */
	static int rRotate(int x, int n) {
		//後ろのバイナリーを保存
		int tailBit = 1;
		//シフトするビットを保存
		int shiftBit= 0;
		//int型は32ビット
		final int MAX_BIT_NUMBER = 32;
		//後ろのｎビットを保存
		tailBit = x<<(MAX_BIT_NUMBER-n);
		//xの値をnだけ左シフトして、下位ｎビットに０を入れる
		shiftBit = x >>>n;
		//tailBit shiftBitで論理和をとる
		x = tailBit | shiftBit;
		//結果を返す
		return x;
	}
	/*
	 * 関数名：lRotate
	 * 概要  :ｎビット左回転した値
	 * 引数  :int型　x 10進数から２進数にして左回転する
	 * 				 n ｎ回だけ左回転する
	 * 戻り値:int型　rotatedValue 回転した後の整数値
	 * 作成日:2023.04.19
	 */
	static int lRotate(int x, int n) {
		//先頭のバイナリーを保存
		int headBit = 1;
		//シフトするビットを保存
		int shiftBit= 0;
		//int型は32ビット
		final int MAX_BIT_NUMBER = 32;
		//先頭のｎビットを保存
		headBit = x>>>(MAX_BIT_NUMBER-n);
		//printBit(headBit);
		//xの値をnだけ左シフトして、下位ｎビットに０を入れる
		shiftBit = x <<n;
		//printBit(shiftBit);
		x = headBit | shiftBit;
		//結果を返す
		return x;
	}
	/*
	 * 関数名：printBit
	 * 概要  :引数で受け取った整数値を２進数で表現する
	 * 引数  :int型　x 整数値
	 * 戻り値:void
	 * 作成日:2023.04.19
	 */
	static void printBit(int x) {
		//31からイテレーターを減らしていく
		for(int i=31; i>=0; i--) {
			//ひとつひとつビットを表示
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名：main
	 * 概要  :回転を表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.19
	 */
	public static void main(String[] args){
		//回転させる整数値
		int integerValue = 0;
		//シフトさせる回数
		int bitShift     = 0;
		//結果を保存
		int resultValue  = 0;
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力
		System.out.print("整数値の入力");
		//標準入力の値を保存
		integerValue = standardInput.nextInt();
		//繰り返し
		do {
			//整数値の入力
			System.out.print("シフトさせるビット数：");
			//標準入力の値を保存
			bitShift = standardInput.nextInt();
		//シフトする回数が０以下の場合、再入力
		}while(bitShift <= 0);
		//回転前を表示
		System.out.println("右回転前の整数値:"+integerValue);
		//回転させる前の整数値を２進数表現
		printBit(integerValue);
		//bitShift分だけ回転させる
		resultValue = rRotate(integerValue,bitShift);
		//回転前を表示
		System.out.println("右回転後の整数値:"+resultValue);
		//回転させた後の整数値を２進数表現
		printBit(resultValue);	
		//区切りを表示
		System.out.println("------------------------------");
		//回転前を表示
		System.out.println("左回転前の整数値:"+integerValue);
		//回転させる前の整数値を２進数表現
		printBit(integerValue);
		//bitShift分だけ回転させる
		integerValue = lRotate(integerValue,bitShift);
		//回転前を表示
		System.out.println("左回転後の整数値:"+integerValue);
		//回転させた後の整数値を２進数表現
		printBit(integerValue);	
	}
}

package ensyu7_13;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_13
 * 概要  :演習7-13
 * 作成者:R.Akamine
 * 作成日:2023/04/19
 */
public class Enayu7_13 {
	//int型は32ビット
	static final int MAX_BIT_NUMBER = 32;
	/*
	 * 教本242ページのList7-13より引用
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
	 * 関数名：rRotate(ensyu7_12より引用)
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
	 * 関数名：lRotate(ensyu7_12より引用)
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
		//先頭のｎビットを保存
		headBit = x>>>(MAX_BIT_NUMBER-n);
		//xの値をnだけ左シフトして、下位ｎビットに０を入れる
		shiftBit = x <<n;
		//headBit shiftBit 論理和をとる
		x = headBit | shiftBit;
		//結果を返す
		return x;
	}
	/*
	 * 関数名と引数名は教本の演習問題に従う
	 * 関数名：set
	 * 概要  :posビット目を１にした値を返す
	 * 引数  :int型　x   ビットを変更する整数
	 * 				 pos 指定するビット目を格納
	 * 戻り値:int型　resultValue 結果を格納
	 * 作成日:2023.04.19
	 */
	static int set(int x, int pos) {
		//posビット目を最下位ビットになるように右回転をした
		int editBinary = rRotate(x,pos);
		//もし、最下位ビットが０ならば、
		if((editBinary&1) == 0) {
			//１を加える
			editBinary += 1;
		}
		//右回転したので、左回転してもとに戻す
		int resultValue = lRotate(editBinary,pos);
		//結果を返す
		return resultValue ;
	}
	/*
	 * 関数名と引数名は教本の演習問題に従う
	 * 関数名：reset
	 * 概要  :posビット目を０にした値を返す
	 * 引数  :int型　x   ビットを変更する整数
	 * 				 pos 指定するビット目を格納
	 * 戻り値:int型　resultValue 結果を格納
	 * 作成日:2023.04.19
	 */
	static int reset(int x, int pos) {
		//posビット目を最下位ビットになるように右回転をした
		int editBinary = rRotate(x,pos);
		//もし、最下位ビットが1ならば、
		if((editBinary&1) != 0) {
			//１をひく
			editBinary -= 1;
		}
		//右回転したので、左回転してもとに戻す
		int resultValue = lRotate(editBinary,pos);
		//結果を返す
		return resultValue ;
	}
	
	/*
	 * 関数名と引数名は教本の演習問題に従う
	 * 関数名：reset
	 * 概要  :posビット目を０にした値を返す
	 * 引数  :int型　x   ビットを変更する整数
	 * 				 pos 指定するビット目を格納
	 * 戻り値:int型　editbinary 結果を格納
	 * 作成日:2023.04.19
	 */
	static int inverse(int x, int pos) {
		//編集するバイナリーを用意する
		int editBinary = x;
		
		//もし、ｘをiだけ右シフトして、その最下位ビットが１ならば、
		if((x>>pos & 1)==1) {
			//最下位ビットを０にする
			editBinary = reset(editBinary,pos);
			//その最下位ビットが０ならば、
		}else {
			//最下位ビットを１にする
			editBinary = set(editBinary,pos);
		}
		//結果を返す
		return editBinary;
	}
	/*
	 * 
	 * 関数名：printResult
	 * 概要  :値の変化前と後の様子を表示（バイナリー形式表示）
	 * 引数  :int型　beforeInteger 
	 * 				 afterInteger  
	 * 戻り値:void
	 * 作成日:2023.04.19
	 */
	
	static void printResult(int beforeInteger,int afterInteger) {
		//変化前の整数値
		System.out.println("変化前の整数値："+beforeInteger);
		//変化前のバイナリー
		printBit(beforeInteger);
		//変化後の整数値
		System.out.println("変化後の整数値："+afterInteger);
		//変化後のバイナリー
		printBit(afterInteger);
		//区切り
		System.out.println("--------------------------------------");
	}
	
	/*
	 * 関数名：main
	 * 概要  :set,reset,inverseを表示していく
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.19
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//整数値入力
		System.out.print("整数値：");
		//入力された値を保存
		int inputInteger = standardInput.nextInt();
		//基準となるビット目を保存
		int posBit = 0;
		//入力された値が正の値、０となるようにする
		final int positiveValue = 0;
		//繰り返し
		do {
			//整数値入力
			System.out.print("ビット目：");
			//ビット目を保存
			posBit = standardInput.nextInt();
		//入力が正の値となるまで繰り返す
		}while(posBit<positiveValue || MAX_BIT_NUMBER<=posBit);
		//setメソッド
		System.out.println("～setメソッド～");
		//結果表示
		printResult(inputInteger,set(inputInteger,posBit));
		//resetメソッド
		System.out.println("～resetメソッド～");
		//結果表示
		printResult(inputInteger,reset(inputInteger,posBit));
		//setメソッド
		System.out.println("～inverseメソッド～");
		//結果表示
		printResult(inputInteger,inverse(inputInteger,posBit));
	}
}

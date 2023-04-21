package ensyu7_32;
/*
* クラス名:ensyu7_32
* 概要  :演習7-32
* 作成者:R.Akamine
* 作成日:2023/04/21
*/
public class Ensyu7_32 {
	/*
	 * 関数名：printBit
	 * 概要  :引数で受け取った整数値を２進数で表現する
	 * 引数  :byte型　x 整数値
	 * 戻り値:void
	 * 作成日:2023.04.21
	 */
	static void printBit(byte x) {
		final int MAX_BIT = 8; 
		//MAX_BITからイテレーターを減らしていく
		for(int i=MAX_BIT-1; i>=0; i--) {
			//ひとつひとつビットを表示
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名：printBit
	 * 概要  :引数で受け取った整数値を２進数で表現する
	 * 引数  :short型　x 整数値
	 * 戻り値:void
	 * 作成日:2023.04.21
	 */
	static void printBit(short x) {
		final int MAX_BIT = 16; 
		//MAX_BITからイテレーターを減らしていく
		for(int i=MAX_BIT-1; i>=0; i--) {
			//ひとつひとつビットを表示
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名：printBit
	 * 概要  :引数で受け取った整数値を２進数で表現する
	 * 引数  :int型　x 整数値
	 * 戻り値:void
	 * 作成日:2023.04.21
	 */
	static void printBit(int x) {
		final int MAX_BIT = 32; 
		//MAX_BITからイテレーターを減らしていく
		for(int i=MAX_BIT-1; i>=0; i--) {
			//ひとつひとつビットを表示
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名：printBit
	 * 概要  :引数で受け取った整数値を２進数で表現する
	 * 引数  :long型　x 整数値
	 * 戻り値:void
	 * 作成日:2023.04.21
	 */
	static void printBit(long x) {
		final int MAX_BIT = 64; 
		//MAX_BITからイテレーターを減らしていく
		for(int i=MAX_BIT-1; i>=0; i--) {
			//ひとつひとつビットを表示
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名 :main
	 * 概要   :printBitを実行する
	 * 引数   :なし
	 * 返り値 :なし
	 * 作成日:2023.04.21
	 */
	public static void main(String[] args) {
		//8bit -128～127
		byte byteValue = -72;
		//16ビット -32,768～32,767
		short shortValue = 32542;
		//32ビット -2,147,483,648～2,147,483,647
		int intValue = -382929;
		//64ビット -9,223,372,036,854,775,808～9,223,372,036,854,775,807
		long longValue = 328497232; 
		
		//byte型の変数の数値を表示
		System.out.print("printBit(byte)\n整数値："+byteValue+"\n");
		//ビットを表示
		printBit(byteValue);
		//short型の変数の数値を表示
		System.out.print("printBit(short)\n整数値："+shortValue+"\n");
		//ビットを表示
		printBit(shortValue);
		//int型の変数の数値を表示
		System.out.print("printBit(int)\n整数値："+intValue+"\n");
		//ビットを表示
		printBit(intValue);
		//long型の変数の数値を表示
		System.out.print("printBit(long)\n整数値："+longValue+"\n");
		//ビットを表示
		printBit(longValue);

	}
}

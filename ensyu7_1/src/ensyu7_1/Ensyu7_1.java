package ensyu7_1;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu7_1
 * 概要  :演習7_1
 * 作成者:R.Akamine
 * 作成日:2023/04/18
 */
public class Ensyu7_1 {
	/*
	 * 関数名：signOf
	 * 概要  :引数が負の時はー１、０の時は０、正の時は１を返す
	 * 引数  :int型　全ての整数値
	 * 戻り値:int型　ー１、０、１
	 * 作成日:2023.04.18
	 */
	public static int signOf(int integerValue) {
		//もし、引数が負なら、
		if(integerValue < 0) {
			//-1を返す
			return -1 ;
		//０ならば、
		}else if(integerValue == 0) {
			//０を返す
			return 0;
		//正ならば、
		}else {
			//１を返す
			return 1;
		}
	}
	/*
	 * 関数名：main
	 * 概要  :正か負か０になるかどうかを判定
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.18
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//プログラム説明
		System.out.println("正負の判定をします。");
		//入力を促す
		System.out.print("値を入力してください：");
		//数値を受け取る
		int signWhich = signOf(standardInput.nextInt());
		//返り値を表示
		System.out.println(signWhich+"が返り値です");
	}
	
	

}

package ensyu5_6;
import java.util.Scanner;
/*
 * クラス名:ensyu5_6
 * 概要  :演習5-6
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_6 {
	/*
	 * 関数名：main
	 * 概要  :
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.12
	 */
	public static void main(String[] args){
		//標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		//float型の変数の準備
		int intValue = 0;
		//int型の変数の準備
		int   deltaValue = 1000;
		
		System.out.println("   float       int  ");
		System.out.println("---------------------");
		
		for(float floatValue = 0.0F; floatValue<=1.0F; floatValue+=0.001F) {
			System.out.println(floatValue + "  " + (float)intValue/deltaValue );
			++intValue;
		}
		
	}
}

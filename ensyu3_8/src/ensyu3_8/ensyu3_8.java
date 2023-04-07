package ensyu3_8;
import java.util.Scanner;
/*
 * クラス名:ensyu3_8
 * 概要  :演習3-8
 * 作成者:R.Akamine
 * 作成日:2023/04/07
 */
public class ensyu3_8 {
	/*
	 * 関数名：main
	 * 概要  :キーボードから読み込んだ点数に応じて、
	 *         優 80～100/良 70～79/可 60～69/不可 0～59
	 * 引数  :なし
	 * 戻り値:なし  
	 * 作成日:2023.04.07  
	 */
	public static void main(String[] arg){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//得点入力を促す
		System.out.print("点数を入力してください。");
		//計算するための準備
		int score = standardInput.nextInt();
		//もし、得点が0～59ならば、
		if (0<=score && score <= 59)
			//不可と表示
			System.out.println("不可");
		//もし、得点が60～ならば、
		else if (60<=score && score <= 69)
			//可と表示
			System.out.println("可");
		//もし、得点が70～79ならば、
		else if (70<=score && score <= 79)
			//良と表示
			System.out.println("良");
		////もし、得点が80～100ならば、
		else if (80<=score && score <= 100)
			//優と表示
			System.out.println("優");
	}
}

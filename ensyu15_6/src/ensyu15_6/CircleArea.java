package ensyu15_6;
import static java.lang.Math.*;
/*
* クラス名:CircleArea
* 概要  :演習15-6
* 作成者:R.Akamine
* 作成日:2023/05/09
*/
public class CircleArea {
	/*
	 * 関数名：main
	 * 概要  : 円の円周・面積を求める
	 * 引数  :コマンド引数
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.05.09
	 */
	public static void main(String[] args) {
		//コマンド引数を受け取る
		double radiusValue = Double.parseDouble(args[0]);
		//もし、０以下なら
		if(radiusValue<=0) {
			//終了を伝える
			System.out.println("入力が負の値です。\nプログラムを終了します");
		//入力した値が正ならば、
		}else {
			//円周の長さ
			System.out.printf("円周：%.3f\n",2*radiusValue*PI);
			//円の面積
			System.out.printf("円の面積：%.3f\n",radiusValue*radiusValue*PI);
		}
	}
}

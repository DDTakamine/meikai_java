package ensyu5_7;

/*
 * クラス名:ensyu5_6
 * 概要  :演習5-6
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_7 {
	/*
	 * 関数名：main
	 * 概要  :
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.12
	 */
	public static void main(String[] args){
		int secondValue;
		for(float floatValue = 0.0F; floatValue<=1.0F; floatValue += 0.001) {
			System.out.println("２乗前の数値 : " + floatValue);
			System.out.println("２乗の結果 　: " + floatValue*floatValue);
			System.out.println("ーーーーーーーーーーーーーーーーーーー");
		}
	}
}

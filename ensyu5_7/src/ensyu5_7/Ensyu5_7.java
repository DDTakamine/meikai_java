package ensyu5_7;

/*
 * クラス名:ensyu5_7
 * 概要  :演習5-7
 * 作成者:R.Akamine
 * 作成日:2023/04/12
 */
public class Ensyu5_7 {
	/*
	 * 関数名：main
	 * 概要  :0.0から1.0まで0.001ごとに２乗を表示する
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.12
	 */
	public static void main(String[] args){
		//0.001刻みでループを回す
		for(float floatValue = 0.0F; floatValue<=1.0F; floatValue += 0.001) {
			//２乗前の表示
			System.out.println("２乗前の数値 : " + floatValue);
			//２乗後の表示
			System.out.println("２乗の結果 　: " + floatValue*floatValue);
			//区切る
			System.out.println("ーーーーーーーーーーーーーーーーーーー");
		}
	}
}

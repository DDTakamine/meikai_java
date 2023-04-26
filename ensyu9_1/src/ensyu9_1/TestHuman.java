package ensyu9_1;
/*フィールド名・クラス名は教本に従う
 * クラス名:TestHuman
 * 概要  :演習9-1クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.26
 */
public class TestHuman {
	/*
	 * 関数名：main
	 * 概要  :クラスの配列を作成。作成方法は教本に従う
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.26
	 */
	public static void main(String[] args) {

		//Humanクラスの配列を作成。生成時に要素を初期化
		Human[] imaginaryFriends = {
				//一人目の作成
				new Human("鈴木",178.9f,68.1f,"19830425","東京"),
				//二人目の作成
				new Human("佐藤",168.9f,60.0f,"19930629","大阪"),
				//三人目の作成
				new Human("田中",198.9f,78.4f,"19930428","福岡"),
				//四人目の作成
				new Human("高橋",198.9f,78.4f,"19731113","北海道"),
		};
		//Humanクラスを作成。生成後の要素に値を代入する
		Human[] falseFriends;
		//値を代入していく
		falseFriends = new Human[]{
				//一人目の作成
				new Human("鈴木",178.9f,68.1f,"19830425","東京"),
				//二人目の作成
				new Human("佐藤",168.9f,60.0f,"19930629","大阪"),
				//三人目の作成
				new Human("田中",198.9f,78.4f,"19930428","福岡"),
				//四人目の作成
				new Human("高橋",198.9f,78.4f,"19731113","北海道"),
		};
		//putSpec()でimaginaryFriendsの要素確認
		for(int i=0;i<imaginaryFriends.length;i++) {
			//スペック表示
			imaginaryFriends[i].putSpec();
			//改行を入れる
			System.out.println();
		}
		//見た目を整える
		System.out.println("------------------------------");
		//putSpec()でfalseFriendsの要素確認
		for(int i=0;i<falseFriends.length;i++) {
			//スペック表示
			falseFriends[i].putSpec();
			//改行を入れる
			System.out.println();
		}
	}
	
}

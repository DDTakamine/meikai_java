package ensyu9_4;
//標準入力の準備
import java.util.Scanner;
/*フィールド名・クラス名は教本に従う
 * クラス名:ensyu9_4
 * 概要  :演習9-4クラス
 * 作成者:R.Akamine
 * 作成日:2023.04.27
 */
public class Human {
	//標準入力の準備
	static Scanner standardInput = new Scanner(System.in);
	//名前のフィールド
	private String name = "   "   ; 
	//身長のフィールド
	private float height = 000.00f ;
	//体重のフィールド
	private float weight = 00.00f ;
	//生年月日のフィールド
	private Day birthDay = new Day() ;
	//住所のフィールド
	private String address = "XXXX";
	//人間のコンストラクタ
	Human(String name,float height,float weight){
		//名前
		this.name = name;
		//身長
		this.height = height;
		//体重
		this.weight = weight;
	}
	//人間のコンストラクタ
	Human(String name,float height,float weight,Day birthDay){
		
		//名前・身長・体重
		this(name,height,weight);
		//生年月日 
		this.birthDay=birthDay;
	}
	//人間のコンストラクタ
	Human(String name,float height,float weight,Day birthDay,String address){
		//名前・身長・体重・生年月日
		this(name,height,weight,birthDay);
		//住所
		this.address=address;	
	}
	/*
	 * 関数名：getName
	 * 概要  :名前を取得
	 * 引数  :なし
	 * 戻り値 :String name　名前
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	String getName(){
		//名前を返す
		return name;
	}
	/*
	 * 関数名：getHeight
	 * 概要  :身長を取得
	 * 引数  :なし
	 * 戻り値 :float height　身長
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	float getHeight(){
		//身長を返す
		return height;
	}
	/*
	 * 関数名：getweight
	 * 概要  :体重を取得
	 * 引数  :なし
	 * 戻り値 :float weight　体重
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	float getWeight(){
		//体重を返す
		return weight;
	}
	/*
	 * 関数名：getBirthDay
	 * 概要  :住所を取得
	 * 引数  :なし
	 * 戻り値 :Day birthDay
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	Day getBirthDay(){
		//住所を返す
		return birthDay;
	}
	/*
	 * 関数名：getaddress
	 * 概要  :住所を取得
	 * 引数  :なし
	 * 戻り値 :String address　住所
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	String getAddress(){
		//住所を返す
		return address;
	}
	/*
	 * 関数名：calculateBMI
	 * 概要  :BMIを計算
	 * 引数  :なし
	 * 戻り値 :double 　BMI
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	double calculateBMI(){
		//百分率にする処理
		final int TRANCERATE_METER=100;
		//BMIを計算して表示
		return (weight*TRANCERATE_METER*TRANCERATE_METER)/(height*height);
	}
	/*
	 * 関数名：putSpec
	 * 概要  :スペック（名前、身長、体重、住所）を表示
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	void putSpec(){
		//名前を表示
		System.out.println("名前："+name);
		//身長を表示
		System.out.println("身長："+height+"cm");
		//体重を表示
		System.out.println("体重："+weight+"kg");
		//住所を表記
		System.out.println("住所："+address);
		//生年月日を表記
		System.out.println("生年月日："+birthDay);
	}
	/*
	 * 関数名：reregistrationAddress
	 * 概要  :住所を再登録
	 * 引数  :なし
	 * 戻り値 :なし
	 * 作成者:R.Akamine
	 * 作成日:2023.04.25
	 */
	void reregistrationAddress() {
		//文字列を受け取る
		address = standardInput.nextLine();
		//再登録した内容を表示
		System.out.println("住所として"+address+"を登録します");
	}
	/*
	 * 関数名：toString
	 * 概要  :Human情報を表示
	 * 引数  :なし
	 * 戻り値 :String Human情報文字列
	 * 作成者:R.Akamine
	 * 作成日:2023.04.27
	 */
	public String toString() {
		return String.format("◆%s \n 身長：%.2f 体重：%.2f \n 生年月日：%s \n 住所：%s", 
						name,height,weight,birthDay,address);
	}
}

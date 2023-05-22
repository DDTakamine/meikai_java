/**
 * ensyu13_4
 * @author R.Akamine
 * 
 */

package ensyu13_4;
//標準入力の準備
import java.util.Scanner;

/**
* Humanクラス
* @author R.Akamine
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
	/**
	 * コンストラクタ
	 * @param  name 名前
	 * @param  height 身長
	 * @param  weight 体重
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public Human(String name,float height,float weight){
		//名前
		this.name = name;
		//身長
		this.height = height;
		//体重
		this.weight = weight;
	}
	/**
	 * コンストラクタ
	 * @param  name 名前
	 * @param  height 身長
	 * @param  weight 体重
	 * @param  birthDay 誕生日
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public Human(String name,float height,float weight,Day birthDay){

		//名前・身長・体重
		this(name,height,weight);
		//生年月日 
		this.birthDay=birthDay;
	}
	/**
	 * コンストラクタ
	 * @param  name 名前
	 * @param  height 身長
	 * @param  weight 体重
	 * @param  birthDay 誕生日
	 * @param  address 住所
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public Human(String name,float height,float weight,Day birthDay,String address){
		//名前・身長・体重・生年月日
		this(name,height,weight,birthDay);
		//住所
		this.address=address;	
	}
	/**
	 *
	 * 概要  :名前を取得
	 * @return String name　名前
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public String getName(){
		//名前を返す
		return name;
	}
	/**
	 * 
	 * 概要    身長を取得
	 * @return  float height　身長
	 * @author  R.Akamine
	 * 作成日:2023.04.25
	 */
	public float getHeight(){
		//身長を返す
		return height;
	}
	/**
	 * 関数名：getweight概要  :体重を取得
	 * @return  float weight　体重
	 * @author  R.Akamine
	 * 作成日:2023.04.25
	 */
	public float getWeight(){
		//体重を返す
		return weight;
	}
	/**
	 * 
	 * 概要  :住所を取得
	 * @return  Day birthDay
	 * @author  R.Akamine
	 * 作成日:2023.04.27
	 */
	public Day getBirthDay(){
		//住所を返す
		return birthDay;
	}
	/**
	 * 
	 * 概要  :住所を取得
	 * @return  String address　住所
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public String getAddress(){
		//住所を返す
		return address;
	}
	/**
	 * 
	 * 概要  :BMIを計算
	 * @return double 　BMI
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public double calculateBMI(){
		//百分率にする処理
		final int TRANCERATE_METER=100;
		//BMIを計算して表示
		return (weight*TRANCERATE_METER*TRANCERATE_METER)/(height*height);
	}
	/**
	 * 概要  :スペック（名前、身長、体重、住所）を表示
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public void putSpec(){
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
	/**
	 * 
	 * 概要  :住所を再登録
	 * @author R.Akamine
	 * 作成日:2023.04.25
	 */
	public void reregistrationAddress() {
		//文字列を受け取る
		address = standardInput.nextLine();
		//再登録した内容を表示
		System.out.println("住所として"+address+"を登録します");
	}
	/**
	 * 
	 * 概要  :Human情報を表示
	 * @return String Human情報文字列
	 * @author R.Akamine
	 * 作成日:2023.04.27
	 */
	public String toString() {
		//文字列を返す
		return String.format("◆%s \n 身長：%.2f 体重：%.2f \n 生年月日：%s \n 住所：%s", 
						name,height,weight,birthDay,address);
	}
}

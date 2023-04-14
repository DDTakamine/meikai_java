package ensyu6_7;
//乱数発生準備
import java.util.Random;
//標準入力の準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_7
 * 概要  :演習6-7
 * 作成者:R.Akamine
 * 作成日:2023/04/14
 */
public class Enayu6_7 {
	/*
	 * 関数名：main
	 * 概要  :探索するキー値と同じ値の要素が複数存在する場合、
	 * 			最も末尾側に位置する要素を見つけるプログラムを作成
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.14
	 */
	public static void main(String[] args){
		//乱数発生準備
		Random randValue = new Random();
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//乱数の範囲をしてい
		final int RANDOMRANGE = 10;
		//配列要素数を保存
		final int ARRAYELEMENT = 12;
		//乱数を保存する配列を用意
		int[] intArray = new int[ARRAYELEMENT];
		//配列に乱数を入れていく
		for(int i=0; i<ARRAYELEMENT; i++) {
			//1～10の値を乱数発生
			intArray[i] = randValue.nextInt(RANDOMRANGE) + 1;
		}
		//配列の値を表示していく
		System.out.print("配列aの全要素の値\n{ ");
		//配列を一つ一つ参照
		for(int i=0; i<ARRAYELEMENT; i++) {
			//値を表示
			System.out.print(intArray[i]+" ");
		}
		//改行
		System.out.print("}\n");
		//探す値を保存
		int keyValue=0;
		//繰り返しを行う
		do {
			//探す値の入力を促す
			System.out.print("探す値：");
			//入力された値を保存
			keyValue = standardInput.nextInt();
		//１～RANDOMRANGE以外の値ならば再入力
		}while(keyValue<0 || RANDOMRANGE-1<keyValue);
		//探したい値が格納されているindexを保存する変数
		int sentinelIndex= -1;
		//配列全要素を調べる
		for(int i=0; i<ARRAYELEMENT; i++) {
			//もし、配列の要素と探したい値が等しいならば、
			if(intArray[i] == keyValue) {
				//sentinelIndexの値を書き換える
				sentinelIndex = i;
			}
		}
		//もし、sentinelIndexが初期化された時の値でないならば、
		if(sentinelIndex != -1) {
			//格納されている場所を教えてあげる
			System.out.print("それはa[" + sentinelIndex + "] にあります。");
		//もし、sentinelIndexが初期化された時の値ならば
		}else {
			//探している値は配列にない
			System.out.print("それはありません");
		}
	}
}

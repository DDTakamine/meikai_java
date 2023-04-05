package ensyu2_3;

import java.util.Scanner;
/*
 * クラス名:ensyu2_3
 * 概要  :演習2-3クラス
 * 作成者:R.Aakamine
 * 作成日:2023.04.05
 */
public class ensyu2_3 {
	/**
	 * @関数名: main
	 * @メソッドの説明 : 標準入力で読み込んだ整数値をそのまま表示
	 * @パラメータの説明 : なし
	 * @返り値 : なし
	 * @作成者 : R.Akamine
	 * @日付 : 2023/04/05
	 */
	public static void main(String[] args) {
		//Scanner クラスをstdInとして生成
		Scanner standardInput = new Scanner(System.in);
		//整数値を入力するように促す
		System.out.print("整数値：");
		//入力した値を保存
		int valueStoreged = standardInput .nextInt();
		//入力された値を画面出力
		System.out.println("入力された値は" + valueStoreged + "です。");
	}
}

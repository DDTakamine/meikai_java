package ensyu6_19;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_19
 * 概要  :演習6-19
 * 作成者:R.Akamine
 * 作成日:2023/04/17
 */
public class Ensyu6_19 {
	/*
	 * 関数名：main
	 * 概要  :クラス数・各クラスの人数・全員の点数を読み込んで、
	 * 			点数の合計点と平均点を求めるプログラムを作成
	 * 			合計点と平均点はクラスごとのものと、全体のものとする。
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.17
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//クラス数を保存
		int classNumber=0;
		//繰り返し
		do {
			//クラス数の入力
			System.out.print("クラス数：");
			//入力された値を保存
			classNumber = standardInput.nextInt();
		//クラス数は負の値ではダメ
		}while(classNumber<1);
		//全生徒の得点を保存する配列を用意
		double[][] allScore = new double[classNumber][];
		//クラスの生徒数を保存
		int studentsNumber = 0;
		//クラスについてのループ
		for(int i=0; i<classNumber; i++) {
			//正しい値が入力されるか確認ループ
			do {
				//クラスの人数確認
				System.out.print((i+1)+"組の人数：");
				//入力された値を保存
				studentsNumber = standardInput.nextInt();
				//全ての生徒の得点を保存する配列の人数を確定していく
				allScore[i] = new double[studentsNumber];
			//人数が負の間、
			}while(studentsNumber < 0);
			//各生徒の得点を入力していく
			for(int j=0; j<studentsNumber; j++) {
				//正しい入力がされるか確認
				do {
					//どの生徒の得点が入力しているのか知らせる
					System.out.print((i+1)+"組"+j+"番"+"の点数：");
					//入力した値を保存
					allScore[i][j] = standardInput.nextInt();
				//負の値が入力されている間、
				}while(allScore[i][j] < 0);
			}
		}
		//クラスごとの得点を保存
		double[] classTotal = new double[classNumber];
		//全生徒の得点を保存
		double allTotal   = 0;
		//クラス数分ループ
		for(int i=0; i<classNumber; i++) {
			//クラスの人数分ループ
			for(int j=0; j<allScore[i].length; j++) {
				//全生徒の合計
				allTotal      += allScore[i][j];
				//クラスごとの合計
				classTotal[i] += allScore[i][j];
			}
		}
		//結果を表示
		System.out.print("　組｜　合計 \t 平均　\n");
		//区切りを表示
		System.out.print("----＋-------------------\n");
		//クラスごとに結果を表示
		for(int i=0; i<classNumber; i++) {
			//クラスごとの表示
			System.out.printf(" %d組｜　　%.0f \t %.1f　\n",i,classTotal[i],classTotal[i]/allScore[i].length);
		}
		//区切りの表示
		System.out.print("----＋-------------------\n");
		//全体の点数を表示
		System.out.printf("  計|　　%.0f \t %.1f　\n",allTotal,allTotal/(allScore.length));

	}

}

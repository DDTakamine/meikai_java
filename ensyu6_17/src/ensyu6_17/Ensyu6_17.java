package ensyu6_17;
//標準入力準備
import java.util.Scanner;
/*
 * クラス名:ensyu6_17
 * 概要  :演習6-17
 * 作成者:R.Akamine
 * 作成日:2023/04/17
 */
public class Ensyu6_17 {
	/*
	 * 関数名：main
	 * 概要  :６人の２科目（国語・数学）の点数を読みこんで、科目・学生ごとの平均を求めよ
	 * 引数  :なし
	 * 戻り値:なし
	 * 作成日:2023.04.17
	 */
	public static void main(String[] args){
		//標準入力の準備
		Scanner standardInput = new Scanner(System.in);
		//生徒数
		final int STUDENTS_NUMBER = 6;
		//科目数
		final int SUBJECT_NUMBER  = 2; 
		//生徒数×科目数分の配列を用意
		int[][] studentsScore = new int [STUDENTS_NUMBER][SUBJECT_NUMBER];
		//人数分ループ
		for(int i=0; i<STUDENTS_NUMBER; ++i) {
			//i番目の人の得点入力を促す
			System.out.println((i+1)+"番目の得点入力");
			//科目分ループ
			for(int j=0; j<SUBJECT_NUMBER; ++j) {
				//繰り返し
				do {
					//国語の得点入力
					if(j==0) {
						//国語の得点入力
						System.out.print("国語の得点：");
						//数学の得点入力
					}else {
						//数学の得点入力
						System.out.print("数学の得点：");
					}
					//入力した値を受け取る
					studentsScore[i][j] = standardInput.nextInt();
				//０～１００の得点しか受け付けない
				}while(studentsScore[i][j] < 0 || 100 <studentsScore[i][j]);
			}
		}
		//生徒ごとの合計得点
		double[] studentsTotal = new double[STUDENTS_NUMBER];
		//科目毎の合計得点
		double[] subjectTotal  = new double[SUBJECT_NUMBER];
		//生徒数分ループ
		for(int i=0; i<STUDENTS_NUMBER; i++) {
			//科目数分ループ
			for(int j=0; j<SUBJECT_NUMBER; j++) {
				//科目ごとの平均を求める
				studentsTotal[i] += studentsScore[i][j];
			}
		}
		//科目数分ループ
		for(int i=0; i<SUBJECT_NUMBER; i++) {
			//生徒数分ループ
			for(int j=0; j<STUDENTS_NUMBER; j++) {
				//生徒ごとの平均を求める
				subjectTotal[i] += studentsScore[j][i];
			}
		}
		//生徒平均
		for(int i=0; i<STUDENTS_NUMBER; i++) {
			//何番目の生徒かを表示
			System.out.print(i+"番目の生徒平均");
			//数値を表示
			System.out.printf("%.3f \n",studentsTotal[i]/SUBJECT_NUMBER);
		}
		//国語平均
		System.out.printf("国語平均：%.3f \n",subjectTotal[0]/STUDENTS_NUMBER);
		//数学平均
		System.out.printf("数学平均：%.3f \n",subjectTotal[1]/STUDENTS_NUMBER);
		
		
	}

}

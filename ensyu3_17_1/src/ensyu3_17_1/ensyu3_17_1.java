package ensyu3_17_1;
import java.util.Scanner;
public class ensyu3_17_1 {
	public static void main(String[] args)
	{
		//標準入力準備
		Scanner standardInput = new Scanner(System.in);
		System.out.println("０：グー　１：チョキ　２：パー");
		//計算する準備
		int inputNumber = standardInput.nextInt();
		//入力された値を場合分け
		switch(inputNumber)
		{
			//グーと表示
			case 0 : System.out.println("グー");break;
			//チョキと表示
			case 1 : System.out.println("チョキ");break;
			//パーと表示
			case 2 : System.out.println("パー");break;		
			//その他は正しくない入力
			default : System.out.println("正しくない値が入力されました");
		}
	}
}

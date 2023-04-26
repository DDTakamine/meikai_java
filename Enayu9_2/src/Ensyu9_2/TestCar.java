package Ensyu9_2;

public class TestCar {
	public static void main(String[] args) {
		//Dayを作成
		Day testDay = new Day(1998,9,28);
		
		//引数なし
		System.out.println("Day();");
		//Dayクラス作成
		Day firstDay = new Day();
		//表示
		System.out.println(firstDay);

		//yearコンストラクタ
		System.out.println("Day(int year);");
		//Dayクラス作成
		Day secondDay = new Day(testDay.getYear());
		//表示
		System.out.println(secondDay);

		//year・monthコンストラsクタ
		System.out.println("Day(int year,int month);");
		//Dayクラス作成
		Day thirdDay = new Day(testDay.getYear(),testDay.getMonth());
		//表示
		System.out.println(thirdDay);
		
		//year・month・dateコンストラクタ
		System.out.println("Day(int year,int month,int date);");
		//Dayクラス作成
		Day fourthDay = new Day(testDay.getYear(),testDay.getMonth(),testDay.getDay());
		//表示
		System.out.println(fourthDay);
		
		//year・month・dateコンストラクタ
		System.out.println("Day(Day d);");
		//Dayクラス作成
		Day fifthDay = new Day(testDay);
		//表示
		System.out.println(fifthDay);
	}
}

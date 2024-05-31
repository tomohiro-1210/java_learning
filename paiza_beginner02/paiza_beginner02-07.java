// 複数の条件を組み合わせる - AND・論理積
public class Main {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10 + 1);
        int number2 = (int)(Math.random() * 20 + 1);
		System.out.println("number1は" + number1);
		System.out.println("number2は" + number2);
		if (number1 <= 5 && number2 >= 10) {
			System.out.println("スキ！"); // 条件式が成立したときの処理
		}
		if (number1 >= 6 && number2 <= 5){
			System.out.println("嫌いなのだ！");
		}
    }
}

// 30~60はあたりの表示をする
public class Main {
	public static void main(String[] args){
		int number = (int)(Math.random() * 100 + 1);

		System.out.println(number);

		if ( number >= 30 && number <= 60){
			System.out.println("あたり");
		} else {
			System.out.println("はずれ");
		}
	}
}

// 演習課題1
public class Main{
	public static void main(String[] args) {
		double rand = (Math.random() * 10) + 1;
		int number = (int)rand;
		System.out.println("あなたの順位は" + number + "位です");

		if( number == 1 ){
			System.out.println("あなたの順位は" + number + "位です");
		}else if ( number >= 2 && number <= 5 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("あと少し");
		}else{
			System.out.println("あなたの順位は" + number + "位です");
		}
	}
}
// if文による条件分岐　比較演算子
public class Main {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 10 + 1);
		System.out.println(number);
		if (number <= 5) {
			System.out.println("スキ！"); // 条件式が成立したときの処理
		}
		if (number >= 6){
			System.out.println("嫌いなのだ！");
		}

		// a == b :aとbは等しい
		// a > b :aはbより大きい
		// a < b :aはbより小さい
		// a >= b :aはb以上
		// a <= b :aはb以下
	}
}

// 時間で〇〇中を判定するプログラム
public class Main {
	public static void main(String[] args){
		int time = (int)(Math.random() * 24);
		System.out.println(time);

		if( time <= 11 ){
			System.out.println("今は午前" + time + "時");
		}else if ( time >= 12 ){
			System.out.println("今は午後" + time + "時");
		}
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args){
		int age = (int)(Math.random() * 5 + 18);

		if( age <= 19){
			System.out.println(age + "才は飲酒不可");
		}else if (age >= 20){
			System.out.println(age + "才は飲酒可能");
		}
	}
}

// 演習課題2
public class Main {
	public static void main(String[] args){
		int place = (int)(Math.random() * 12 + 1);

		if( place <= 6){
			System.out.println(place + "位入賞");
		}else if ( place >= 7){
			System.out.println(place + "位入賞圏外");
		}
	}
}


// 値段を計算する
public class Main {
	public static void main(String[] args){
		// apple_price リンゴの単価
		int apple_price = ;
		// apple_num リンゴを買う数
		int apple_buy = ;

		System.out.println("リンゴの単価は" + apple_price + "円です");

		System.out.println("リンゴを" + apple_buy + "個買います");
		
		int apple_total = apple_price * apple_buy;

		System.out.println("リンゴを買った合計金額は" + apple_total  + "円です");

	}
}

// ランダムに値段を計算する
public class Main {
	public static void main(String[] args) {
		// apple_price リンゴの単価
		int apple_price = (int)(Math.random() * 10 + 1) * 50;
		// apple_num リンゴを買う数
		double apple_buy = Math.random() * 100 + 1;
	    int apple_num = (int)apple_buy;
		
		System.out.println("リンゴの単価は" + apple_price + "円です");

		System.out.println("リンゴを" + apple_num + "個買います");
		
		int apple_total = apple_price * apple_num;

		System.out.println("リンゴを買った合計金額は" + apple_total  + "円です");
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args){
 
		int slimes = (int)(Math.random() * 10 + 1);
		int slime_heavy = 100 * slimes;


		System.out.println("体重100キロのスライムが" + slimes + "匹あらわれた。");
		System.out.println("スライムの合計体重は、" + slime_heavy + "キロです。");
	}
}

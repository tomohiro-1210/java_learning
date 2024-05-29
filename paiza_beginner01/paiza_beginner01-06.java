// 数の表示とサイコロ
public class Main {
	public static void main(String[] args) {
	   //intは整数（Stringは文字列）
		int number = 100 * 3000;
		System.out.println("メタルスライムが" + number + "匹あらわれた！");
	}
}

// ランダム関数
public class Main {
	public static void main(String[] args) {
	   // ランダム関数(Math.random)
	    double rand = Math.random() * 100 + 1; 
	    System.out.println("ランダム関数の結果→" + rand);
	    
	   //intは整数（Stringは文字列）
		int number = (int)rand; //(int)は小数点以下を切り捨てる
		System.out.println("メタルスライムが" + number + "匹あらわれた！");
	}
}

// 演習課題１(サイコロの出目を制御)
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 6 + 1;
		int number = (int)rand;
		System.out.println("サイコロの目は" + number + "です");
	}
}

// 演習課題2（ダメージ計算）
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 50 + 49;
		int number = (int)rand;
		System.out.println("モンスターに、" + number + "のダメージを与えた");
	}
}

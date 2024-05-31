// 条件の評価結果
public class Main {
    public static void main(String[] args) {
		int a = (int)(Math.random() * 100 + 1);
		int b = (int)(Math.random() * 200 + 1);

		System.out.println("aは" + a + "で、bは" + b);

		if ( a >= 50 || b >= 100){
			System.out.println("あたり！");
		} else {
			System.out.println("はずれ");
		}
    }
}

// 演習課題1
public class Main {
    public static void main(String[] args){
        double rand = (Math.random() * 10) + 1;
        int number = (int)rand;
        System.out.println("あなたの順位は" + number + "位です");

        boolean flag = number <= 3;
        System.out.println(flag); //trueかfalseを判定している
        if( number <= 3 ){
            System.out.println("入賞おめでとう");
        }
    }
}



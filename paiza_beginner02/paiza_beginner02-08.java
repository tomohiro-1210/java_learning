// 複数の条件を組み合わせる - OR
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

// 30以下または６０以上のときあたり
public class Main {
	public static void main(String[] args){
		int c = (int)(Math.random() * 100 + 1);

		if ( c <= 30 || c >= 60){
			System.out.println("あたり");
		} else {
			System.out.println("はずれ");
		}
	}
}

// 演習課題
public class Main {
    public static void main(String[] args) {
        double rand = (Math.random() * 71) + 30;
        int discomfort = (int) rand;
        System.out.println("不快指数は" + discomfort + "です。");

        //　ここにifを追加する
		if ( discomfort <= 55 || discomfort >= 70){
        	System.out.println("不快です");
		}
    }
}

// オリジナルのこと
public class Main {
    public static void main(String[] args){
        double rand = (Math.random() * 100) + 1;
        int treasure = (int)rand;
        
        String treasure_class;
        String name = "フリーレン";

        if(treasure == 1) {
            treasure_class = "sword";
            System.out.println("<p class=\"" + treasure_class + "\">" + name + "は勇者の剣を手に入れた！</p>");
        } else if(treasure >= 2 && treasure <= 99) {
            System.out.println("<p class=\"" + treasure_class + "\">なんと宝箱はミミックだった！" + name + "はかまれてしまった！</p>");
        } else {
            System.out.println("<p>" + name + "は何も見つけられなかった。</p>");
        }
        System.out.println("<style> p{ font-weight: bold; } </style>");
        System.out.println("<style> .sword{ color: blue; font-size: 24px; } </style>");
        System.out.println("<style> .mimic{ color: green; } </style>");
    }
}

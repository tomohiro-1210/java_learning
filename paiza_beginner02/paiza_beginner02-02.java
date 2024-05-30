public class Main {
	public static void main(String[] args){
		int number = 2;
		if( number == 1 ){
			System.out.println("好き！");
		}else if ( number == 2 ){
			System.out.println("どちらでもない");
		}else {
			System.out.println("嫌い！");
		}
	}
}

// 信号機を模したプログラム
public class Main {
    public static void main(String[] args){
        int color_number = 2;
        String color;
        
        if( color_number == 1 ){
            color = "red";
            System.out.println("<p class=\"" + color + "\">赤</p>");
        } else if ( color_number == 2 ){
            color = "yellow";
            System.out.println("<p class=\"" + color + "\">黄</p>");
        } else {
            color = "blue";
            System.out.println("<p class=\"" + color + "\">青</p>");
        }
        
        System.out.println("<style> p{ font-weight:bold; }</style>");
        System.out.println("<style> ." + color + "{ color:" + color + "; }</style>");
    }
}

// 演習1
public class Main{
	public static void main(String[] args){
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");

		if( number == 1 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("おめでとう！");
		} else if( number == 2 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("あと少し！");
		}else{
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("よくがんばったね");
		}
	}
}

// 演習2
public class Main{
	public static void main(String[] args){
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");

		if( number == 1 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("おめでとう！");
		} else if( number == 2 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("あと少し！");
		}else{
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("よくがんばったね");
		}
	}
}
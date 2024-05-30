// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int a = 0;
		if( a == 1){
			String class_name = "like";
			System.out.println("<p class=" + class_name + ">好きなら好きなだけ追いかけろ！</p>");
		}else{
			String class_name = "hate";
			System.out.println("<p class=" + class_name + ">嫌いならはっきりと伝えておいてや！</p>");

		}

		System.out.println("<style> p{ font-weight: bold;  } </style>");
		System.out.println("<style> .like{ color:red; } </style>");
		System.out.println("<style> .hate{ color:blue; } </style>");
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args){
		int number = (int)(Math.random() * 3 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		
		if( number == 1 ){
			System.out.println("あなたの順位は" + number + "位です");
			System.out.println("おめでとう！");
		}else{
			System.out.println("あなたの順位は" + number + "位です");
		}
	}
}

// 演習課題2
public class Main {
	public static void main(String[] args){
		int rank = (int)(Math.random()* 5 + 1);
		System.out.println("あなたの順位は" + rank + "位です");
		System.out.println("おめでとう！");

		if( rank == 1 ){
			System.out.println("あなたの順位は" + rank + "位です");
			System.out.println("おめでとう！");
		}else{
			System.out.println("あなたの順位は" + rank + "位です");
			System.out.println("あと少し！");
			}

	}
}

// 演習課題3
public class Main{
	public static void main(String[] args){
		int number = ((int)(Math.random() * 3 + 1)) * 100;

		if( number == 300) {
			System.out.println("あなたの得点は" + number + "ポイントです");
			System.out.println("おめでとう！");
		}
		if(number == 100 || number == 200){
			System.out.println("あなたの得点は" + number + "ポイントです");
		}
	}
}

// 演習課題4
public class Main{
	public static void main(String[] args){
		int number = ((int)(Math.random() * 3 + 1)) * 100;

		if( number == 300 ){
			System.out.println("あなたの得点は" + number + "ポイントです");
			System.out.println("おめでとう！");
		}
		if( number == 200 || number == 100 ){
			System.out.println("あなたの得点は" + number + "ポイントです");
			System.out.println("ざんねん！");
		}
	}
}
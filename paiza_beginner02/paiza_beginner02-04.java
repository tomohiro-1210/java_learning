// おみくじ
public class Main {
	public static void main(String[] args){
		int omikuji = (int)(Math.random() * 100 + 1);
		
		// System.out.println(omikuji);

		if(omikuji == 1){
			System.out.println("大吉");
		}else if(omikuji <= 2 ){
			System.out.println("中吉");
		}else if (omikuji <= 4){
			System.out.println("末吉");
		}else if (omikuji <= 8){
			System.out.println("小吉");
		}else if (omikuji <= 16){
			System.out.println("凶");
		}else{
			System.out.println("大凶");
		}
	}
}

// 演習課題1
public class Main{
	public static void main(String[] args){
		int omikuji_number = (int)(Math.random() * 100 + 1);

		System.out.println(omikuji_number);

		if(omikuji_number >= 30){
			System.out.println("omikujiの中身は" + omikuji_number + "なので大吉");
		}else{
			System.out.println("omikujiの中身は" + omikuji_number + "なので大凶");
		}
	}
}
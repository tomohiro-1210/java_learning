import java.util.Calendar;
// 西暦年から平成年を求める
public class Main {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		// int year = (int)(Math.random() * 31 + 1989);
		

		System.out.println("西暦" + year + "年");
		
			int heisei = year - 1988;
			if( heisei == 1 ){
				System.out.println("平成元年、昭和６４年、8523Fの一部が昭和６４年製造というレア車両");
			} else if ( heisei >= 2 ){
				System.out.println("平成" + heisei + "年:" + year + "年");
			}
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args){
		int year = (int)(Math.random() * 64 + 1926);
		System.out.println("西暦" + year + "年");

		int showa = year - 1925;
		if ( showa == 1 ){
			System.out.println("昭和元年");
		} else {
			System.out.println("昭和" + showa + "年です。");
		}
	}
}

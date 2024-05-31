// 税込み金額を計算する
public class Sub {
    public static void sub(String[] args){
        int price = 1980;
        System.out.println("定価は" + price + "円");
        
        
        double discount = 0.85;
        int discountPrice = (int)(price * discount);
        System.out.println("割引価格は" + discountPrice + "円です");

        int amount = (int)(discountPrice * 1.1);
        System.out.println("税込み金額は" + amount + "円です");
        
        int people = 4;
        System.out.println("人数が" + people + "人の場合");

        int amountPerPeople = (int)(amount / people);
        System.out.println("一人当たりの金額は" + amountPerPeople + "円です")
    }
}

// 演習課題1
public class Price {
    public static void price(String[] args){
        int price = 128;
        int weight = 300;
        int amount = price * weight / 100;
        System.out.println("100グラム" + price + "円の肉、" + weight + "グラムは、" + amount + "円です。");
    }
}
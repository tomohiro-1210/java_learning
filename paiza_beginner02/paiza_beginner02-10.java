// データ型
public class Main {
    public static void main(String[] args) {
        // int number = 1;//数値
        // String text = "テキスト"; //文字列
        // boolean; //論理、trueかfalseで判定する。

        System.out.println(10 / 3);
        System.out.println(10 / 3.0);

        // 小数点を整数にする
        double π = 3.14; //ここでのdoubleは少数を定義するときに使う？
        System.out.println(π);
        System.out.println((int)π);

        // 整数を少数にする
        int number2 = 3;
        System.out.println(number2);
        System.out.println((double)number2);//少数を整数にする

        double number3 = 1.1415;
        System.out.println(number3);

        String text = "123.45";
        System.out.println(text);
        System.out.println(Integer.perseInt(text));//文字列を数値に変換？
        System.out.println(Double.parseDouble(text));//文字列を少数に変換？
    }
}

// 演習課題
public class Main {
    public static void main(String[] args) {
        String text = "0.08";
        System.out.println((int)text);
    }
}
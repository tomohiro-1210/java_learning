// クラスを作成する
public class Main {
    public static void main(String[] args){
        // オブジェクトを作る
        Player player1 = new Player(); // new Player()で作ったオブジェクトを呼び出せる

        // オブジェクトの呼び出し
        player1.walk();
        player1.treasure();

        // Monsterオブジェクトを作る
        Monster monsters = new Monster();

        // Monsterオブジェクトの呼び出し。
        monsters.slime();
        monsters.king();
    }
}

// 自作クラス
class Player{

    public static void walk(){
        System.out.println("勇者は荒野を歩いていた");
    }

    public static void treasure(){
        System.out.println("勇者はひかりのたてを見つけた！");
    }

}

class Monster{
    public static void slime(){
        System.out.println("スライムがあらわれた！<br>おおからすがあらわれた！<br>ヒドラがあらわれた！");
    }

    public static void king(){
        System.out.println("キングヒドラがあらわれた！<br>キングヒドラのこうげき！<br>キングヒドラはもえさかるかえんをはいた！");
    }
}

// 演習課題1
public class Main{
    public static void main(String[] args){
        Greeting greeting_main = new Greeting();

        greeting_main.sayHello();
    }
}

class Greeting {
    public void sayHello(){
        System.out.println("hello paiza");
    }
}

// 演習課題2
public class Main{
    public static void main(String[] args){
        Greeting paiza = new Greeting();
        paiza.sayHello();
    }
}

class Greeting{
    public void sayHello(){
        System.out.println("hello java");
    }
}

// 演習課題3
public class Main {
    public static void main(String[] args){
        Greeting paiza = new Greeting();
        paiza.sayHello();
    }
}

class greeting{
    public void sayHello(){
        System.out.println("hello paiza");
    }
}
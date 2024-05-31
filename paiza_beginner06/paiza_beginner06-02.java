// 	メソッドを作る　
public class Main {
	// メインメソッド、これが標準で呼び出される
	public static void main(String[] args){
		String greeting = "Hello World!!";

		System.out.println(greeting);

		// 自作メソッドを呼び出している
		sayMimic();
		dragon();
	}

	// 自作メソッド、メインメソッドに当てはめて使う？
	public static void sayMimic(){
		System.out.println("なんと宝箱はミミックだった！");

		// 自作メソッド:dragon、先に書いたメソッドしか呼び出すことができない模様。
		dragon();
	}

	// 自作メソッド：dragon　、mimicで呼び出していいる。
	public static void dragon(){
		System.out.println("ドラゴンはひのいきを吐いた！");
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args){
		sayHello();
	}

	public static void sayHello(){
		System.out.println("hello paiza");
	}
}

// 演習課題2
public class Main {
	public static void main(String[] args){
		sayHello();
	}

	public static void sayHello() {
		String text = "hello java";

		System.out.println(text);
	}
}

// 演習課題3
public class Main {
	public static void main(String[] args){
		sayHello();
	}

	public static void sayHello(){
		String greeting = "hello ";
		String programing = "paiza";

		System.out.println(greeting + programing);
	}
}
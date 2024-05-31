// RPGのクリティカルヒットを再現
// 比較演算子 == > < >= <= !=


// スライムと戦っている。
// 1から10のサイコロをふって、
// 6未満：サイコロの目だけダメージを与えたと表示。
// 6以上：クリティカルヒットとして、100のダメージを与えたと表示。
public class Main {
	public static void main(String[] args) {
        int number = (int)(Math.random() * 10 + 1);

		if(number < 6){
			System.out.println("主人公は" + number + "のダメージをあたえた！");
		}else{
			System.out.println("かいしんの一撃！主人公は100のダメージをあたえた！！");
		}
	}
}


// 演習課題1
// スライムと戦っている。
// 1から10のサイコロをふって、
// 6未満：サイコロの目だけダメージを与えたと表示。
// 6以上：クリティカルヒットとして、100のダメージを与えたと表示。
// さらに、1から2のサイコロをふって、
// 1：追加攻撃として、10のダメージを与えたと表示。
// 2：追加攻撃に失敗したと表示。
public class Main{
	public static void main(String[] args){
		int hit = (int)(Math.random() * 10 + 1);

		if ( hit < 6 ) {
			System.out.println("スライムに" + hit + "のダメージを与えた");
		} else {
			System.out.println("クリティカルヒット!スライムに、100のダメージを与えた!!");
		}

		int add = (int)(Math.random() * 2 + 1);
		if  ( add == 1 ) {
			System.out.println("追加攻撃!スライムに、10のダメージを与えた!!!");
		} else {
			System.out.println("追加攻撃に失敗!");
		}
	}
}
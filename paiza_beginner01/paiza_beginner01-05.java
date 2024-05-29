// 変数を使う
public class Main {
	public static void main(String[] args) {
	   // 文字列を格納する変数
	    String player_jobs = "スラリン";
	    System.out.println(player_jobs);
		System.out.println(player_jobs + "は、荒野を歩いていた");
		System.out.println(player_jobs + "は、モンスターと戦った");
		System.out.println(player_jobs + "は、モンスターをたおした");
		System.out.println(player_jobs + "は、勇者の剣を手に入れた！");
		System.out.println(player_jobs + "は、勇者の剣を使った！竜巻がモンスターの群れを襲う！");
	}
}

// 演習課題1
public class Main {
	public static void main(String[] args) {
		String player = "勇者";
		System.out.println(player + "は、レベルアップした");
	}
}

// 演習課題2
public class Main {
	public static void main(String[] args) {
		String player1 = "勇者";
		System.out.println(player1 + "の体力が回復した");
	}
}

// 演習課題3
public class Main {
	public static void main(String[] args) {
		String party = "勇者と戦士、魔法使い、僧侶";
		System.out.println(party + "の体力が回復した");
	}
}

// 演習課題4
public class Main {
	public static void main(String[] args) {
		String player = "<p>勇者</p>";
		System.out.println(player + "は、荒野を歩いていた");
		System.out.println(player + "は、モンスターと戦った");
		System.out.println(player + "は、モンスターをたおした");	    
		System.out.println("<style> p{ color: blue; display: inline;} </style>");

	}
}

class Sample1_14_1 { //クラスというのは、「⚪︎⚪︎.java」という一つのプログラム全体を表している設計図のことである。クラスは1つのファイルにつき、1つのクラスだけ定義するようにすること。

	public static void main(String[] args) { //丸括弧のすぐ左側がメソッド名になるので、mainメソッドになる。

		//メソッドのしくみ

		int print = sum( 2 , 3 ) ; //関数の丸括弧の中に入れるデータのことを、「引数」と言う。「sum( 2 , 3 )」の箇所で、関数の名前、および、引数情報が書いてあると、sumメソッドの方に場面が移る。
		//呼び出し元から呼び出し先にデータを渡すことを「値渡し」と言う。
		System.out.println("print：" + print);

	}

	static int sum( int num1 , int num2 ) { //丸括弧のすぐ左側がメソッド名になるので、sumメソッドになる。引数として渡されてきたデータのことを「仮引数」と言う。

		int calcResult = num1 + num2 ;

		return calcResult ; //「calcResult」は戻り値になる。戻り値は呼び出し元（「sum( 2 , 3 )」）の箇所に戻る。

	}

}
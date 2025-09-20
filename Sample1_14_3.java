class Sample1_14_3 {
	
	public static void main(String[] args) {
		
		//オーバーロードのしくみ
		//同じクラス内で同じメソッド名だが、「引数の型や引数の数が違っていれば定義できるよ」という機能が「オーバーロード」になる。
		
		//sumメソッド（int型の引数2つ）の呼び出し
		int print1 = sum( 2 , 3 ) ;
		System.out.println("print1：" + print1);
		
		//sumメソッド（double型の引数2つ）の呼び出し
		double print2 = sum( 1.2 , 1.3 ) ;
		System.out.println("print2：" + print2);
		
		//sumメソッド（int型の引数3つ）の呼び出し
		int print3 = sum( 2 , 3 , 4 ) ;
		System.out.println("print3：" + print3);
		
	}
	
	//sum（int型の引数2つ）
	static int sum( int num1 , int num2 ) {
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
	//sumメソッド（double型の引数2つ）
	static double sum( double num1 , double num2 ) {
		
		double calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
	//sum（int型の引数3つ）
	static int sum( int num1 , int num2 , int num3 ) {
		
		int calcResult = num1 + num2 + num3 ;
		
		return calcResult ;
		
	}
	
}

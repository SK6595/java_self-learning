class Sample1_12_3 {
	public static void main (String[] args) {
		
		//if-elseのしくみ
		
		int customerAge = Integer.parseInt(args[0]) ;  //顧客の年齢
		
		if( customerAge < 12 ){
			
			System.out.println("「お父さんかお母さんは？」");
			
		}else if( customerAge < 20 ){
			
			System.out.println("「未成年の方にお酒は売れません」");
			
		}else if( customerAge > 80 ){
			
			System.out.println("「そろそろお酒を控えた方がよいのではないですか？」");
			
		}else{
			
			System.out.println("「お会計220円になります」");
			
		}
	}
}


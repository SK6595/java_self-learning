/*-< 演習：Ex1_10_1 >---------------------------------
コマンドライン引数として数字を1つ受け取り、その数字の数だけ
「＊」を繋げた文字列を表示するプログラムを作ってください。
例：受け取った数字が5→「＊＊＊＊＊」が表示される
----------------------------------------------------*/
class Ex1_10_1 {
	public static void main (String[] args) {

		//コマンドライン引数で好きな数字を1つ受け取る
		int receiveNumber = Integer.parseInt(args[0]) ;    //(10行目)アンダーバーに適切な処理を埋めてください

		//最終的に表示するString型変数（初期値：""（0文字の文字列））
		String display = "";              //(13行目)変更しないでください

		/*
		**以下にreceiveNumberの数だけ「＊」を繋げた文字列を
		**displayに格納する処理を書いてください。
		**※必ずfor文を使用してください。
		*/

		for( int i = 0 ; i < 4 ; i++ ){


				//displayを更新する
				//　（なにで？）

				display += "＊" ;

		}



		//「＊」を繋げた文字列を表示
		System.out.println(display) ;     //(32行目)変更しないでください

	}
}

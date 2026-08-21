public class Main9 {
  public static void main(String[] args) {
    // 「int[]」は、int型とは全く別の型
    // int型の要素を代入できる配列変数scoresを用意し、int型の要素を5つ作成してscoresに代入し、配列scoresの完成
    int[] scores = new int[5];
    // 作った要素の数はプログラム内で調べることができる。
    int num = scores.length;
    System.out.println("要素の数:" + num);
    // 2つ目の要素scores[1]に代入
    scores[1] = 30;
    System.out.println(scores[1]);
    // 配列の要素は自動的に初期化され、5つの要素は全て0で初期化される。
    System.out.println(scores[0]);
  }
}
public class Main13 {
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 80};
    // ループが1周するたびに任意の変数名「value」に指定した変数に配列の要素の内容が格納
    // 配列の要素を1つずつ取り出すループを簡単に書くための特殊なfor文（拡張for文）
    for (int value : scores) {
      System.out.println(value);
    }
    int[] arrayA = {1, 2, 3};
    int[] arrayB;
    // arrayBにコピーされるのは arrayAに入っている先頭番地
    // 変数arrayBは変数arrayAと同じ配列を参照する
    arrayB = arrayA;
    arrayB[0] = 100;
    // arrayB[0] = 100;を実行するのはarrayA[0] = 100;と同じになる
    System.out.println(arrayA[0]);
  }
}
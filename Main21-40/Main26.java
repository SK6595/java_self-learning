public class Main26 {
  // int型配列を作成して戻すメソッド
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    // 配列を戻す（戻り値が配列型変数）
    // 配列の先頭要素のアドレスがmainメソッドに戻される
    // 戻り値で配列を返せば 複数の値を呼び出し元に返すことも可能となる
    return newArray;
  }
  public static void main(String[] args) {
    // 返ってきた戻り値を配列変数arrayに代入
    // その結果 makeArrayメソッドで作成された配列を参照できるようになる
    int[] array = makeArray(3);
    // arrayの全要素を出力
    for (int i : array) {
      System.out.println(i);
    }
  }
}
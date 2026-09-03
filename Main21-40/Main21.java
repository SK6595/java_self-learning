public class Main {
  public static int add(int x, int y) {
    int ans = x + y;
    // return文は値を戻すだけでなく メソッドの終了も行う
    // return文の後に処理を書いても
    return ans;
  }
  public static void main(String[] args) {
    // 戻り値は変数で受けずにそのまま使うこともできる
    // 呼び出したメソッドに戻り値があっても 絶対に変数で受け取らないといけないわけではない
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}
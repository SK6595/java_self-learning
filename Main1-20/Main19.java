public class Main19 {
  public static void main(String[] args) {
    // ()の中の値を渡してaddメソッドを呼び出す
    add(100, 20);
    add(200, 50);
  }
  // 複数の値を受け取るaddメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}

// 引数の数が異なる場合
public class Main23 {
  // 1つ目のaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  // 2つ目のaddメソッド
  public static int add(int x, int y, int z) {
    return x + y + z;
  }
  public static void main(String[] args) {
    // 1つ目のaddメソッドが呼び出される
    System.out.println("10+20=" + add(10, 20));
    // 2つ目のaddメソッドが呼び出される
    System.out.println("10+20+30=" + add(10, 20, 30));
  }
}
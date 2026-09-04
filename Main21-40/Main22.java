// 引数の型が異なる場合
// 仮引数が異なれば同じ名前のメソッドを複数定義することが許されている
// オーバーロードはシグネチャが重複しない場合のみ夜される
public class Main22 {
  // 1つ目のメソッド
  // 仮引数がint型
  public static int add(int x, int y) {
    return x + y;
  }
  // 2つ目のメソッド
  // 仮引数がdouble型
  public static double add(double x, double y) {
    return x + y;
  }
  // 3つ目のaddメソッド
  // 仮引数がString型
  public static String add(String x, String y) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println(add(10, 20));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello", "World"));
  }
}
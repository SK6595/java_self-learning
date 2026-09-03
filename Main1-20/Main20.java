public class Main20 {
  // 戻り値が整数のため voidではなくint
  public static int add(int x, int y) {
    int ans = x + y;
    // 戻り値の110がansに代入
    return ans;
  }
  public static void main(String[] args) {
    // 戻り値がaddメソッドの()の中に返る
    // 戻り値をans変数として受け取っている
    int ans = add(100, 10);
  }
}
public class Main18 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    // メソッドを呼び出す際 ()の中に値を入れておくと その値が引数として呼び出される側のhelloメソッドに渡される
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  // ()の中で文字列変数nameを宣言
  // helloメソッドが呼び出されると 変数nameに呼び出し元から引数として渡された値が自動的に代入され メソッドブロック内で使用可能になる
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
}
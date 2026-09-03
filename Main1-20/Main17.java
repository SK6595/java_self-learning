// 処理の流れは main() → methodA() → methodB() の順に実行
public class Main17 {
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  public static void main(String[] args) {
    methodA();
  }
}
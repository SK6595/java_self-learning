public class Main4 {
  public static void main(String[] args) {
      System.out.println("あなたの名前を入力してください。");
      String name = new java.util.Scanner(System.in).nextLine(); // キーボードからの入力を待つ
      System.out.println("あなたの年齢を入力してください。");
      int age = new java.util.Scanner(System.in).nextInt(); // キーボードからの入力を待つ
      System.out.println
        ("ようこそ、" + age + "歳の" + name + "さん");
      int x = 5;
      int y = 10;
      String ans = "x+yは" + (x + y);
      System.out.println(ans);
  }
}

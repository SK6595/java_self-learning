public class Main3 {
  public static void main(String[] args) {
    String age = "31";
    int n = Integer.parseInt(age); // String型をint型に変換
    System.out.println
      ("あなたは来年、" + (n + 1) + "歳になりますね。");
    int r = new java.util.Random().nextInt(90);
    System.out.println("あなたはたぶん、" + r + "歳ですね？"); // 89までをランダムな整数で表示する
  }
}

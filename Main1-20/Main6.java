public class Main6 {
  public static void main(String[] args) {
    // 変数名はiではなくても良いが、必ず3つとも同じものを使う。
    for (int i = 0; i < 10; i++) { // 初期化処理、繰り返し条件、繰り返し時処理　の順で表示
      System.out.println("こんにちは");
    }
    for (int i = 0; i < 3; i++) {
      System.out.print("現在" + (i + 1) + "周目→");
    }
  }
}
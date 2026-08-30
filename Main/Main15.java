public class Main15 {
  public static void main(String[] args) {
    // 練習問題4-1
    // int[] points = new int[4];
    // double[] weights = new double[5];
    // boolean[] answers = new boolean[3];
    // String[] names = new String[3];
    
    // 練習問題4-2
    // int[] moneyList = {121902, 8302, 55100};
    // for (int i = 0; i < moneyList.length; i++) {
    //   System.out.println(moneyList[i]);
    // }
    // for (int m : moneyList) {
    //   System.out.println(m);
    // }
    
    // 練習問題4-3（例外エラー）
    // int[] counts = null;
    // float[] heights = {171.3F, 175.0F};
    // System.out.println(counts[1]);
    // System.out.println(heights[2]);
    
    // 練習問題4-4
    // 配列の準備
    int[] numbers = {3, 4, 9};
    // メッセージの表示
    System.out.println("1桁の数字を入力してください");
    // キーボードからの数字入力
    int input = new java.util.Scanner(System.in).nextInt();
    // 配列を回しながら判定
    for (int n : numbers) {
      if (n == input) {
        System.out.println("アタリ！");
      }
    }
  }
}
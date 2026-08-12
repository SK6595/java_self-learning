public class Main5 {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.print("あなたの名前を入力してください＞");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.print("あなたの年齢を入力してください＞");
    String ageString =
      new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(age  + "歳の" + name +
      "さん、あなたの運気番号は" + fortune + "です");
    System.out.println(" (1: 大吉　2:中吉　3:吉　4:凶) ");

    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩にいきます");
    } else {
      System.out.println("映画を見ます");
    }
    // boolean doorClose = true;
    // 無限ループ
    // while (doorClose == true) {
    //   System.out.println("ノックする");
    //   System.out.println("1分待つ");
    // }
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) + 1;
    switch (fortune) {
      case 1, 2 -> {
        System.out.println("いいね！");
      }
      // 伝統的なswitch文の記法
      // case 1,2:
      //   System.out.println("いいね！");
      //   break;
      case 3 -> {
        System.out.println("普通です");
      }
      // 伝統的なswitch文の記法
      // case 3:
      //   System.out.println("普通です");
      //   break;
      case 4, 5 -> {
        System.out.println("うーん・・・");
      }
      // 伝統的なswitch文の記法
      // case 4, 5:
      //   System.out.println("うーん・・・");
    }
  }
}
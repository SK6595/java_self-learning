public class Main7 {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j); // 掛け算の結果を出力
        System.out.print(" "); // 空白を出力
      }
      System.out.println(""); // 改行を出力
    }
    
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹いっぱいです");
    } else {
      System.out.println("はらぺこです");
    }
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
    boolean tenki = false;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("映画を見ます");
      System.out.println("寝ます");
    }
    System.out.print("[メニュー]1：検索 2：登録 3：削除 4：変更＞");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1-> {
        System.out.println("検索します");
      }
      case 2-> {
        System.out.println("登録します");
      }
      case 3-> {
        System.out.println("削除します");
      }
      case 4-> {
        System.out.println("変更します");
      // 変数selectedが1から4のいずれでもない場合は何もしないため、defaultラベルの記述は
      }
    }
  }
}

// 条件式
// weight == 60
// (age1 + age2) * 2 > 60
// age % 2 == 1
// name.equals(湊)
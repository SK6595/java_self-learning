public class Main { // 外側のブロックはクラスブロック
  public static void main(String[] args) { // 内側のブロックはメソッドブロック
    System.out.println("菅原拓真です");
    System.out.println("31歳です");
    System.out.println("お酒が好きです");
    System.out.println("31 + 31の計算をします");
    System.out.println(31 + 31);
    System.out.println(35 - 10);
    System.out.println(-5 * 2);
    System.out.println(6 * 6 * 3.14);
    System.out.println("こたえは" + 64);
    int x;
    x = 6;
    System.out.println(x * x * 3.14);
    int age = 20;
    System.out.println("私の年齢は" + age);
    age = 31;
    System.out.println("・・・いや、本当の年齢は" + age);
    final double PI = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    int a = 3;
    int b = 5;
    int c = a * b;
    System.out.println("縦幅3横幅5の長方形の面積は、" + c);
    boolean result = true;
    char favoriteCharacter = '駆';
    double pi = 3.14; // float pi = 3.14Fでも可
    long number = 314159265853979L;
    String msg = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
    System.out.println("私の好きな記号は二重引用符(\")です"); //¥記号よりもバックスラッシュが標準
    /*String prof1 = "名前：朝香あゆみ\n （あさかあゆみ）";
    String prof2 = """
                   名前：湊雄輔
                           （みなとゆうすけ）
                   """;
    System.out.println(prof1);
    System.out.println(prof2);
    */
    a++;
    System.out.println(a);
  }
}
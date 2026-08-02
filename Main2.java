public class Main2 {
  public static void main(String[] args) {
    int age = (int)3.2; // 強制的な型変換
    System.out.println(age);
    double d = 8.5 / 2; // 2(int型)を2.0(double型)に変換
    long l = 5 + 2L; // 5(int型)を5L(long型)に変換
    System.out.println(d);
    System.out.println(l); 
    String msg = "私の年齢は" + 23; // 片方のオペランドがString型なら、もう一方もString型に変換してから連結する
    System.out.println(msg);
  }
}
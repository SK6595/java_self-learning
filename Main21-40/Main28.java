public class Main28 {
  public static void main(String[] args) {
    String title = "お誘い";
    String address = "dumy@example.com";
    String text = "今度、飲みに行きませんか";
    email(address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}
public class Main {
  public static void main(String[] args) {
    int[] heights = {172, 149, 152, 191, 155};
    // java.util.Arraysは Javaが標準で提供するAPIの一部である
    java.util.Arrays.sort(heights);
    for (int h : heights) {
      // Systemは 実はjava.lang.System
      System.out.println(h);
    }
  }
}
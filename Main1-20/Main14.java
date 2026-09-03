public class Main14 {
  public static void main(String[] args) {
    // int[][] scores = new int[2][3];
    // scores[0][0] = 40; 
    // scores[0][1] = 50;
    // scores[0][2] = 60;
    // scores[1][0] = 80;
    // scores[1][1] = 60;
    // scores[1][2] = 70;
    // System.out.println(scores[1][1]);
    
    // Javaにおける2次元配列は 正確には表ではなく「配列の配列」となる。
    // 以下は 要素数2の行配列（親配列）の中に それぞれ要素数3の列配列（子配列）が入る。
    int[][] scores = {{40, 50, 60}, {80, 60, 70}};
    System.out.println(scores.length);
    System.out.println(scores[0].length);
  }
}

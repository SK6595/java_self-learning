package calcapp.main;
// import文はソースコードの先頭に ただしpackage文より後に記述する
import calcapp.logics.CalcLogic;
// ソースファイル名とクラス名は同じにする必要がある
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    // あるクラスから別パッケージのクラスを利用する場合 クラス名の前に所属パッケージ名を付ける（パッケージ名を頭に付けた完全なクラス名）
    // 完全なクラス名のことを 完全限定クラス名や完全修飾クラス名 または 略してFQCNと言う
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
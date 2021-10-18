class CTest {
  int test = 2;

  void judge(int a) {
    if (a % test == 0) {
      if (a > 0) {
        System.out.println("此數為偶數");
      } else {
        System.out.println("此數為0");
      }
    } else {
      System.out.println("此數為奇數");
    }
  }
}

public class Class07 {
  public static void main(String[] args) {
    CTest Test = new CTest();
    Test.judge(3);
    Test.judge(8);
    Test.judge(0);
  }
}

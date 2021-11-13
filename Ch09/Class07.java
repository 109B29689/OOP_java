class Math {
  public static void power(int x, int n) {
    int Ans = 1;
    for (int i = 1; i <= n; i++) {
      Ans *= x;
    }
    System.out.println("power(int x, int n)呼叫,x=" + x + " n=" + n + " Ans=" + Ans);
  }
}

public class Class07 {
  public static void main(String[] args) {
    Math.power(2, 5);
    Math.power(3, 2);
  }
}

/* output-------------
power(int x, int n)呼叫,x=2 n=5 Ans=32
power(int x, int n)呼叫,x=3 n=2 Ans=9
--------------------*/

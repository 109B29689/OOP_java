abstract class Math {
  protected int ans;

  public void show() {
    System.out.println("ans=" + ans);
  }

  public abstract void add(int a, int b);

  public abstract void sub(int a, int b);

  public abstract void mul(int a, int b);

  public abstract void div(int a, int b);
}

class Compute extends Math {
  public void add(int a, int b) {
    ans = a + b;
  }

  public void sub(int a, int b) {
    ans = a - b;
  }

  public void mul(int a, int b) {
    ans = a * b;
  }

  public void div(int a, int b) {
    ans = a / b;
  }
}

public class Class02 {
  public static void main(String[] args) {
    Compute cmp = new Compute();
    cmp.add(3, 5);
    cmp.show();
    cmp.sub(3, 5);
    cmp.show();
    cmp.mul(3, 5);
    cmp.show();
    cmp.div(3, 5);
    cmp.show();
  }
}

/* output---
ans=8
ans=-2
ans=15
ans=0
------------*/

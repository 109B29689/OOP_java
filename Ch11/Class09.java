interface Math {
  public void show();

  public abstract void add(int a, int b);

  public abstract void sub(int a, int b);

  public abstract void mul(int a, int b);

  public abstract void div(int a, int b);
}

interface AdvancedMath {
  public void mod(int a, int b);

  public void fac(int a);

  public void pow(int a, int b);
}

class Compute implements Math, AdvancedMath {
  int ans;

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

  public void show() {
    System.out.println("ans=" + ans);
  }

  public void mod(int a, int b) {
    ans = a % b;
  }

  public void fac(int a) {
    for (int i = 1, b = 1; i <= a; i++)
      ans = (b *= i);
  }

  public void pow(int a, int b) {
    for (int i = 1, c = a; i < b; i++)
      ans = (c *= a);
  }
}

public class Class09 {
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
    cmp.mod(14, 5);
    cmp.show();
    cmp.fac(5);
    cmp.show();
    cmp.pow(5, 3);
    cmp.show();
  }
}
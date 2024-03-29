interface Show_ans{
  public void show();
}
interface Math extends Show_ans{

  public void add(int a, int b);

  public void sub(int a, int b);

  public void mul(int a, int b);

  public void div(int a, int b);
}
class Compute implements Math {
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
}

public class Class13 {
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
-----------*/

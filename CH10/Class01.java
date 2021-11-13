class Caaa {
  public int num1;
  public int num2;

  public void show() {
    System.out.println("num1=" + num1 + " num2=" + num2);
  }
}

class Cbbb extends Caaa {
  public void set_num(int a, int b) {
    num1 = a;
    num2 = b;
    System.out.println("呼叫Cbbb子類別,變更繼承自Caaa父類別的num1與num2");
  }
}

public class Class01 {
  public static void main(String[] args) {
    Cbbb bb = new Cbbb();
    bb.set_num(5, 10);
    bb.show();
  }
}

/* output-------------
呼叫Cbbb子類別,變更繼承自Caaa父類別的num1與num2
num1=5 num2=10
--------------------*/

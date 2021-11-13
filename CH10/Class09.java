
class Caaa {
  private int num;

  public Caaa(int n) {
    num = n;
  }

  public int get() {
    return num;
  }

  public void display() {
    System.out.println("printed from Caaa class");
  }
}

class Cbbb extends Caaa {
  public Cbbb(int n) {
    super(n);
  }

  public void display() {
    super.display();
    System.out.println("printed from Cbbb class");
  }

  public void show() {
    System.out.println("num=" + get());
  }
}

public class Class09 {
  public static void main(String[] args) {
    Caaa bb = new Cbbb(0);
    bb.display();
    System.out.println("兩者都會呼叫，父類別先，子類別後");
  }
}

/* output-------------
printed from Caaa class
printed from Cbbb class
兩者都會呼叫，父類別先，子類別後
--------------------*/

class CTriangle {
  protected int base;
  protected int height;

  protected void show() {
    System.out.println("base=" + base + ", height=" + height);
  }
}

class CData extends CTriangle {
  public CData(int b, int h) {
    super();
    base = b;
    height = h;
  }

  public void area() {
    show();
    System.out.println("area=" + base * height / 2.0);
  }
}

public class Class06 {
  public static void main(String[] args) {
    CData obj = new CData(3, 8);
    obj.area();
  }
}

/* output-------------
base=3, height=8
area=12.0
--------------------*/

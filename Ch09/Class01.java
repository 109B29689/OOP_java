class CRectangle {
  int width;
  int height;

  public CRectangle(int w, int h) {
    width = w;
    height = h;
    System.out.println("CRectangle(int w, int h)呼叫");
  }

  public CRectangle() {
    this(10, 8);
    System.out.println("CRectangle()呼叫，由this()生成");
  }

  public void show() {
    System.out.println("width=" + width + " height=" + height);
  }
}

public class Class01 {
  public static void main(String[] args) {
    CRectangle cr1 = new CRectangle(20, 16);
    cr1.show();
    CRectangle cr2 = new CRectangle();
    cr2.show();
  }
}

/* output-------------
CRectangle(int w, int h)呼叫
width=20 height=16
CRectangle(int w, int h)呼叫
CRectangle()呼叫，由this()生成
width=10 height=8
--------------------*/

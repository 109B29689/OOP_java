abstract class CShape {
  protected String color;

  public void setColor(String str) {
    color = str;
  }

  public void CShape(String str) {
    color = str;
  }

  public abstract void show();
}

class CRectangle extends CShape {
  protected int width, height;

  public CRectangle(int w, int h) {
    width = w;
    height = h;
  }

  public void show() {
    System.out.print("color=" + color + ",  ");
    System.out.println("area=" + width * height);
  }
}

class CCircle extends CShape {
  protected double radius;

  public CCircle(double r) {
    radius = r;
  }

  public void show() {
    System.out.print("color=" + color + ",  ");
    System.out.println("area=" + 3.14 * radius * radius);
  }
}

public class Class01 {
  public static void main(String args[]) {
    CRectangle rect = new CRectangle(5, 10);
    rect.setColor("Yellow 此為setColor定義");
    rect.show();
    rect.CShape("Black 此為CShape定義");
    rect.show();

    CCircle cir = new CCircle(2.0);
    cir.setColor("Green 此為setColor定義");
    cir.show();
    cir.CShape("White 此為CShape定義");
    cir.show();
  }
}

/* output--------------------------------
color=Yellow 此為setColor定義,  area=50
color=Black 此為CShape定義,  area=50
color=Green 此為setColor定義,  area=12.56
color=White 此為CShape定義,  area=12.56
----------------------------------------*/

class Car {
  protected String owner;
  protected String id;

  public void CRectangle(String own, String s) {
    owner = own;
    id = s;
  }

  public void show() {
    System.out.println("車主姓名:" + owner);
    System.out.println("車牌號碼:" + id);
  }
}

class CColor extends Car {
  protected String color;

  public CColor(String own, String s, String c) {
    super.CRectangle(own, s);
    color = c;
  }

  public void show() {
    super.show();
    System.out.println("車主姓名:" + owner);
    System.out.println("車牌號碼:" + id);
    System.out.println("車身顏色" + color);
  }
}

public class Class17 {
  public static void main(String[] args) {
    CColor mycar = new CColor("Riaan", "A1-2345", "Black");
    mycar.show();
    System.out.println("由於Caaa的show已被設為final，只要設為final就無再做修改，除非將final更改為public");
  }
}

/* output------------------------------------------------------------------
車主姓名:Riaan
車牌號碼:A1-2345
車主姓名:Riaan
車牌號碼:A1-2345
車身顏色Black
由於Caaa的show已被設為final，只要設為final就無再做修改，除非將final更改為public
-------------------------------------------------------------------------*/

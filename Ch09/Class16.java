class CCircle {
  private static double pi = 3.14;
  private double radius;

  public CCircle(double r) {
    radius = r;
  }

  public void show() {
    System.out.println("radius=" + radius + " area=" + pi * radius * radius);
  }
}

public class Class16 {
  public static void main(String args[]) {
    CCircle cir[];
    cir = new CCircle[6];
    for (int i = 0; i < cir.length; i++) {
      cir[i] = new CCircle(i);
      cir[i].show();
    }
  }
}

/* output-------------
radius=0.0 area=0.0
radius=1.0 area=3.14
radius=2.0 area=12.56
radius=3.0 area=28.259999999999998
radius=4.0 area=50.24
radius=5.0 area=78.5
--------------------*/

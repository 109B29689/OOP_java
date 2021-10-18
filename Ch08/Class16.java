class CSphere {
  private int x;
  private int y;
  private int z;
  private int radius;

  void setLocation(int X, int Y, int Z) {
    x = X;
    y = Y;
    z = Z;
  }

  void setRadius(int r) {
    radius = r;
  }

  void surfaceArea(Double a) {
    double surfaceArca = 2 * radius * a;
  }

  void volume(double a) {
    double volume = radius * radius * radius * a;
  }

  void showCenter() {
    System.out.println("圓心(" + x + "," + y + "," + z + ")");
  }
}

public class Class16 {
  public static void main(String[] args) {
    CSphere cs = new CSphere();
    cs.setLocation(3, 4, 5);
    cs.setRadius(1);
    cs.surfaceArea(3.14);
    cs.volume(3.14);
    cs.showCenter();
  }
}

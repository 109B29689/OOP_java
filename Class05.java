import javax.swing.Box;

class CBox {
  int length;
  int width;
  int height;

  void volume() {
    System.out.println("volume=" + length * width * height);
  }

  void surfaceArca() {
    System.out.println("surfaceArca=" + length * width);
  }

  void showDate() {
    System.out.println("length=" + length);
    System.out.println("width=" + width);
    System.out.println("height=" + height);
  }

  void showAll() {
    System.out.println("length=" + length);
    System.out.println("width=" + width);
    System.out.println("height=" + height);
    System.out.println("surfaceArca=" + length * width);
    System.out.println("volume=" + length * width * height);
  }
}

public class Class05 {
  public static void main(String[] args) {
    CBox box = new CBox();
    box.length = box.width = box.height = 1;
    box.volume();
    box.surfaceArca();
    box.showDate();
    box.showAll();
  }
}

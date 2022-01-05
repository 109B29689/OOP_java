import java.io.FileInputStream;
import java.io.IOException;
public class Class11 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("Ch14\\number.txt");
    int fisa = fis.available();
    byte fisb[] = new byte[fisa];
    int fisr = fis.read(fisb);
    String fiss = new String(fisb, 0, fisr);
    System.out.println(fiss);
    fis.close();
  }
}

/*output---
12
34
63
14
16
56
---------*/

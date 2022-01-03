import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Class05 {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("Ch14\\donkey.txt", StandardCharsets.UTF_8);
    char[] data = new char[64];
    fr.skip(9);
    int n = fr.read(data);
    String a = new String(data, 0, n);
    System.out.println(a);
    System.out.println("Characters read=" + n);
  }
}

/*output-------------------
我從來也不騎
有一天我心血來潮騎著去趕集
Characters read=21
-------------------------*/

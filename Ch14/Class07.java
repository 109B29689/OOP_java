import java.io.*;
import java.nio.charset.StandardCharsets;

public class Class07 {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("Ch14\\donkey.txt", StandardCharsets.UTF_8);
    BufferedReader br = new BufferedReader(fr);
    String a;
    while ((a = br.readLine()) != null) {
      if (a.equals("有一天我心血來潮騎著去趕集"));
      else System.out.println(a);
    }
    fr.close();
  }
}

/*output--------
我有一隻小毛驢
我從來也不騎
--------------*/

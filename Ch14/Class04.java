import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Class04 {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("Ch14\\donkey.txt", StandardCharsets.UTF_8);  //由於此檔的編碼為UTF_8所以使用StandardCharsets.UTF_8來讀取，否則將出現亂碼，若編碼為ANSI即可直接讀取
    char[] data = new char[64];
    int n = fr.read(data);
    String a = new String(data, 0, n);
    System.out.println(a);
    System.out.println("Characters read=" + n);
  }
}

/*output-------------------
我有一隻小毛驢
我從來也不騎
有一天我心血來潮騎著去趕集
Characters read=30
-------------------------*/

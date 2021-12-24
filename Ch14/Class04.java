import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Class04 {
  public static void main(String args[]) throws IOException {
    FileReader fr = new FileReader("Ch14\\donkey.txt", StandardCharsets.UTF_8);
    char[] data = new char[64];
    int n = fr.read(data);
    String a = new String(data, 0, n);
    System.out.println(a);
    System.out.println("Characters read=" + n);
    System.out
        .println(
            "不一樣，因為在windows裡，換行字元是\"\\r\\n\"兩個字元\n我有一隻小毛驢\\r\\n   (七個字元+換行字元=九個字元)\n我從來也不騎\\r\\n   (六個字元+換行字元=八個字元)\n有一天我心血來潮騎著去趕集   (十三個字元)\n總共三十個字元");
  }
}

/*output-----------------------------------------
我有一隻小毛驢
我從來也不騎
有一天我心血來潮騎著去趕集
Characters read=30
不一樣，因為在windows裡，換行字元是"\r\n"兩個字元
我有一隻小毛驢\r\n   (七個字元+換行字元=九個字元)
我從來也不騎\r\n   (六個字元+換行字元=八個字元)
有一天我心血來潮騎著去趕集   (十三個字元)
總共三十個字元
-----------------------------------------------*/

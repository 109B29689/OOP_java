import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class Main
{
   public static void main(String args[]) throws IOException
   {
     FileReader fra=new FileReader("aaa.txt");
     FileReader frb=new FileReader("bbb.txt");
     FileWriter fwc=new FileWriter("ccc.txt");
     char ca[]=new char[32],cb[]=new char[32];
     int a=fra.read(ca),b=frb.read(cb);
     String sa=new String(ca,0,a),sb=new String(cb,0,b);
     fwc.write(sa);
     fwc.write("\n");
     fwc.write(sb);
     fwc.flush();
     fra.close();
     frb.close();
     fwc.close();
   }
}

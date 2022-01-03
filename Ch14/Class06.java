import java.io.*;
public class Class06
{
   public static void main(String args[])
   {
      try
      {
        char data[]=new char[128];
        FileReader fr=new FileReader("Ch14\\train.txt");
        int num=fr.read(data);
        String str=new String(data,0,num);
        System.out.println("Characters read= "+num);
        System.out.println(str);
        fr.close();
      }catch(IOException ioe){}
   }
}

/*output---------------
Characters read= 29
火車快飛，火車快飛
越過高山，飛過小溪
不知走了幾百里
---------------------*/

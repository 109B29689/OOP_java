import java.io.FileReader;
import java.io.IOException;
public class Class09
{
   public static void main(String args[]) throws IOException
   {
     FileReader fra=new FileReader("aaa.txt");
     FileReader frb=new FileReader("bbb.txt");
     FileReader frc=new FileReader("ccc.txt");
     char ca[]=new char[32],cb[]=new char[32],cc[]=new char[64];
     int a=fra.read(ca),b=frb.read(cb),c=frc.read(cc);
     String sa=new String(ca,0,a),sb=new String(cb,0,b),sc=new String(cc,0,c);
     System.out.println(sa+"\n");
     System.out.println(sb+"\n");
     System.out.println(sc+"\n");
     fra.close();
     frb.close();
     frc.close();
   }
}

/*output--------------------------
Look before you leap.

Make hay while the sun shines.

Look before you leap.
Make hay while the sun shines.
--------------------------------*/

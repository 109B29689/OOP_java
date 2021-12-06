package pack08;
import pack08.subpack1.CCircle;
import pack08.subpack1.subsubpack.CStyle;
public class Class08
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      cir.show();
      CStyle sty=new CStyle(1);
   }
}

/*output--------------------------
show() in class CCircle called
style1
--------------------------------*/

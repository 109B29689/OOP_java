class CBank
{
   private static int sum=0;
   public synchronized static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;
      try
      {
         Thread.sleep((int)(1000*Math.random()));
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer implements Runnable
{
   public void run()
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);
   }
}
public class Class13
{
   public static void main(String args[])
   {
      Thread t1=new Thread(new CCustomer());
      Thread t2=new Thread(new CCustomer());
      t1.start();
      t2.start();
   }
}

/*output---
sum= 100
sum= 200
sum= 300
sum= 400
sum= 500
sum= 600
---------*/

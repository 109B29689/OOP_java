class A implements Runnable
{
  private int a;
  private String s;
  public A(int a,String s)
  {
    this.a=a;
    this.s=s;
  }
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      try
      {
        Thread.sleep(a);
      }
      catch(InterruptedException ie){}
      System.out.println(s);
    }
  }
}
public class Class09
{
  public static void main(String args[])
  {
    Thread t1=new Thread(new A(1000,"Thread 1 is running"));
    Thread t2=new Thread(new A(2500,"Thread 2 is running"));
    t1.start();
    t2.start();
  }
}

/*output--------------
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 2 is running
Thread 2 is running
Thread 2 is running
Thread 2 is running
Thread 2 is running
Thread 2 is running
--------------------*/

class PrePaid extends Thread
{
  private int sum=200;
  public synchronized void talk(int fee)
  {
    try
    {
      sleep(1);
    }catch(InterruptedException ie){}
    sum-=fee;
    System.out.printf("sum=%d%n",sum);
  }
  public void run()
  {
    for(int i=0;i<3;i++)
    {
      int fee=((int)(100*Math.random()));
      if(sum>10)
        talk(fee);
    }
  }
}
public class Class14
{
  public static void main(String args[])
  {
    Thread t=new Thread(new PrePaid());
    t.start();
  }
}

/*output---
sum=116
sum=26
sum=-6
---------*/

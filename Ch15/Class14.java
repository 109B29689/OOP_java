class PrePaid extends Thread
  {
    static int sum=200;
    public synchronized static void talk(int fee)
    {
      try
        {
          sleep((int)(Math.random()*1000));
        }
      catch(InterruptedException ie){}
      sum-=fee;
      if(sum>0)
        System.out.printf("通話費%d元，餘額%d元%n",fee,sum);
    }
    public void run()
    {
        while(sum>10)
          {
            int fee=((int)(Math.random()*99));
              talk(fee);
          }
    }
  }
public class Class14 {  
  public static void main(String args[]) { 
    PrePaid pp1=new PrePaid();
    PrePaid pp2=new PrePaid();
    PrePaid pp3=new PrePaid();
    pp1.start();
    pp2.start();
    pp3.start();
  } 
}

/*output--------------
通話費3元，餘額197元
通話費11元，餘額186元
通話費96元，餘額90元
通話費15元，餘額75元
--------------------*/

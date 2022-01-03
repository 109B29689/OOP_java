class CTest implements Runnable
{
  private String id;
  public CTest(String id)
  {
    this.id=id;
  }
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      try
      {
        Thread.sleep((int)(Math.random()*2000));
      }
      catch(InterruptedException ie){}
      System.out.println(id+" "+i);
    }
  }
}
public class Class10
{
  public static void main(String args[])
  {
    Thread hi=new Thread(new CTest("Hello"));
    Thread bye=new Thread(new CTest("Good bye"));
    Thread morning=new Thread(new CTest("Good morning"));
    Thread night=new Thread(new CTest("Good night"));
    hi.start();
    bye.start();
    morning.start();
    night.start();
  }
}

/*output--------
Good night 1
Good bye 1
Good night 2
Good morning 1
Hello 1
Good night 3
Good night 4
Good bye 2
Good night 5
Good morning 2
Hello 2
Hello 3
Good bye 3
Good bye 4
Good morning 3
Hello 4
Good morning 4
Good morning 5
Good bye 5
Hello 5
--------------*/

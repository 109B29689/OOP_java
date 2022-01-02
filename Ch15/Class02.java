class CTest extends Thread
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
      for(int j=0;j<100000000;j++);
      System.out.println(id+" "+i);
    }
  }
}
public class Class02
{
  public static void main(String args[])
  {
    CTest hi=new CTest("Hello");
    CTest bye=new CTest("Good bye");
    hi.run();
    bye.run();
    System.out.println("由於程式是循序執行，所以第23行hi.run()會先執行呼叫run()函數，等執行完後才執行第24行bye.run()呼叫run()函數，等執行完後結束");
  }
}

/*output-------------------------------------------------------------------------------------------------------------
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Good bye 1
Good bye 2
Good bye 3
Good bye 4
Good bye 5
由於程式是循序執行，所以第23行hi.run()會先執行呼叫run()函數，等執行完後才執行第24行bye.run()呼叫run()函數，等執行完後結束
--------------------------------------------------------------------------------------------------------------------*/

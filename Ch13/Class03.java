import java.util.Scanner;
public class Class03{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=12,den=sc.nextInt();
    System.out.println("and of main()!!");
    try{                                           // (檢查)執行有錯誤的程式
      if(den==0) throw new ArithmeticException();  // 拋出例外，ArithmeticException(算術異常)就是執行錯誤的原因
      else System.out.println(num/den);
    }
    catch(ArithmeticException e){                  //捕捉到ArithmeticException此例外，e為記錄錯誤訊息的變數
      System.out.println("除數為0");
      System.out.println(e);
    }
    finally{                                       //必會執行的程式
      System.out.println("當den=0時，導致num除以0就會出現以下錯誤:java.lang.ArithmeticException");  // e等於java.lang.ArithmeticException這串錯誤訊息
    }
  }
}

/*output--------------------------------------------------------------
input 0
and of main()!!
除數為0
java.lang.ArithmeticException
當den=0時，導致num除以0就會出現以下錯誤:java.lang.ArithmeticException

input 3
and of main()!!
4
當den=0時，導致num除以0就會出現以下錯誤:java.lang.ArithmeticException
---------------------------------------------------------------------*/

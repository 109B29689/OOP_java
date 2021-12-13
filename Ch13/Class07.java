public class Class07{
  public static void test() throws ArithmeticException{
    int num=12,den=0,ans=num/den;
    if(den==0) throw new ArithmeticException();
    else System.out.println(ans);
  }
  public static void main(String args[]){
    System.out.println("and of main()!!");
    try{
      test();
    }
    catch(ArithmeticException a){
      System.out.println(a+" throwed");
    }
  }
}

/*output--------------------------------------------
and of main()!!
java.lang.ArithmeticException: / by zero throwed
--------------------------------------------------*/

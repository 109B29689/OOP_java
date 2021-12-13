class Ctest{
  public void test(){
    int num=12,den=0,ans=num/den;
    if(den==0) throw new ArithmeticException();
    else System.out.println(ans);
  }
}
public class Class08{
  public static void main(String args[]){
    Ctest ct=new Ctest();
    System.out.println("and of main()!!");
    try{
      ct.test();
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

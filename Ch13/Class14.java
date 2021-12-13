import java.util.Scanner;
class IntegerTooSmall extends Exception{}
class IntegerTooLarge extends Exception{}
public class Class14{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{
      int a=sc.nextInt();
      if(a<10) throw new IntegerTooSmall();
      else if(a>70) throw new IntegerTooLarge();
      else System.out.println(a);
    }catch(IntegerTooSmall its){
      System.out.println("您輸入的整數的值太小");
    }catch(IntegerTooLarge itl){
      System.out.println("您輸入的整數的值太大");
    }catch(Exception e){
      System.out.println("拋出"+e+"例外");
      System.out.println("您輸入的不是整數");
    }
  }
}

/*output-----------------------------------
input 9
您輸入的整數的值太小

input 10
10

input 70
70

input 71
您輸入的整數的值太大

input 10.1
拋出java.util.InputMismatchException例外
您輸入的不是整數
------------------------------------------*/

import java.util.Scanner;
class NotTriangle extends Exception{}
class EquilateralTriangle extends Exception{}
class NotEquilateralTriangle extends Exception{}
public class Class12{
  public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{
    if((a+b)<c || (a+c)<b || (b+c)<a) throw new NotTriangle();
    else if(a==b && b==c && a==c) throw new  EquilateralTriangle();
    else throw new NotEquilateralTriangle();
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{
      triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }catch(NotTriangle nt){
      System.out.println("不構成三角形");
    }catch(EquilateralTriangle et){
      System.out.println("這是正三角形");
    }catch(NotEquilateralTriangle net){
      System.out.println("這不是正三角形");
    }
  }
}

/*output--------
input 3 3 3
這是正三角形

input 3 4 5
這不是正三角形

input 1 1 3
不構成三角形
--------------*/

import java.util.Scanner;
public class Class02{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=12,den=sc.nextInt();
    System.out.println("and of main()!!");
    if(den==0) System.out.println("除數為0");
    else System.out.println(num/den);
  }
}

/*output-----------
input 0
and of main()!!
除數為0

input 3
and of main()!!
4
-----------------*/

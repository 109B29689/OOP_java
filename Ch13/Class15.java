import java.lang.Math;
import java.io.*;
class ArgumentOutOfBound extends Exception{}
public class Class15 {
  public static void mySqrt(int n) throws ArgumentOutOfBound{
    if(n<0) throw new ArgumentOutOfBound();
    else System.out.println(Math.sqrt(n));
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br;
    br=new BufferedReader(new InputStreamReader(System.in));
    int n;
    try{
      mySqrt(Integer.parseInt(br.readLine()));
    }
    catch(ArgumentOutOfBound aooe){
      System.out.println("n小於0");
    }
  }
}

/*output------
input 100
10

input -100
n小於0
------------*/

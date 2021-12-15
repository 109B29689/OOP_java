import java.lang.Math;
import java.io.*;
class ArgumentOutOfBound extends Exception{}
public class Main {
  public static void mySqrt(int n) throws ArgumentOutOfBound{
    if(n<0) throw new ArgumentOutOfBound();
    else System.out.println(Math.sqrt(n));
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br;
    br=new BufferedReader(new InputStreamReader(System.in));
    int n;
    try{
      n=Integer.parseInt(br.readLine());
      mySqrt(n);
    }
    catch(ArgumentOutOfBound aooe){
      System.out.println("n小於0");
    }
  }
}

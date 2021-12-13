import java.util.Scanner;
class StringException extends Exception{
}
public class Class13{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		try {
			if(a.equals("520")) throw new StringException();
			else System.out.println(a);
		}
		catch(StringException b) {
			System.out.println("這是由字串520所引起的例外");
		}
	}
}

/*output-----------------
input 520
這是由字串520所引起的例外

input hello
hello
-----------------------*/

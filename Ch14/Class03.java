import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Class03 {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        int j=0,k=Integer.parseInt(a);
        for(int i=1;i<=k;i++) j+=i;
        System.out.println(j);
    }
}

/*output---
input 27
378
---------*/

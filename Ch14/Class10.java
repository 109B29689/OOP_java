import java.io.*;
import java.lang.Math;
public class Class10.java{
  public static void main(String args[])throws IOException{
    FileWriter fw=new FileWriter("rand.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    for(int i=0;i<1000;i++){
      bw.write(Double.toString(Math.random()*100000)+1);
      if(i<999) bw.newLine();
    }
    bw.flush();
    fw.close();
    FileReader fr=new FileReader("rand.txt");
    FileWriter fw2=new FileWriter("rand2.txt");
    BufferedWriter bw2=new BufferedWriter(fw2);
    BufferedReader br=new BufferedReader(fr);
    int k=0;
    double b,A[]=new double[1000],c=0,total=0;;
    String a;
    while((a=br.readLine())!=null)
    {
      b=Double.parseDouble(a);
      if(k==0)
      {
        k++;
        A[0]=b;
      }
      else
      {
        k++;
        A[k-1]=b;
        for(int i=0;i<k-1;i++)
          for(int j=0;j<k-1;j++)
          {
            if(A[j]>A[j+1])
            {
              c=A[j];
              A[j]=A[j+1];
              A[j+1]=c;
            }
          }
      }
      total+=b;
    }
    System.out.printf("平均值 = %f%n最大值 = %f%n最小值 = %f%n",total/1000,A[999],A[0]);
    for(int i=0;i<k;i++)
    {
      bw2.write(Double.toString(A[i]));
      if(i<k-1) bw2.newLine();
    }
    bw2.flush();
    fw2.close();
    fr.close();
  }
}

/*output----------------
平均值 = 51322.507535
最大值 = 99809.687064
最小值 = 209.245732
----------------------*/

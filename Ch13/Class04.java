public class Class04{
  public static void main(String args[]){
    int num=12;
    int den[]={12,0,3,0,0,4};
    for(int i=0;i<10;i++){
      if(i<den.length){
      if(den[i]==0) System.out.println("程式執行有誤");
      else System.out.println("ans="+num/den[i]);
      }
      else System.out.println("程式執行有誤");
    }
  }
}

/*output-------
ans=1
程式執行有誤
ans=4
程式執行有誤
程式執行有誤
ans=3
程式執行有誤
程式執行有誤
程式執行有誤
程式執行有誤
--------------*/

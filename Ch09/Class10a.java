class CRational{
  public int n;
  public int d;
  public void setN(int num){
    n=num;
  }
  public void setD(int num){
    d=num;
  }
  public void show(){
    System.out.println(n+"/"+d);
  }
  public void setND(int num,int den){
    this.n=num;
    this.d=den;
  }
}
class Main {  
  public static void main(String args[]) { 
    CRational aaa=new CRational();
    aaa.setN(2);
    aaa.setD(5);
    aaa.show();
    aaa.setND(3,7);
    aaa.show();
  } 
}

/*output----
2/5
3/7
----------*/

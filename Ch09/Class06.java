class Caaa{
  public void add2n(int n){
    if(n%2==0) System.out.println((n+1)*n/2);
   else System.out.println((((n-1)/2)*(n+1))+(n+1)/2);
  }
}
class Class06 {  
  public static void main(String args[]) {
    Caaa ca1=new Caaa();
    Caaa ca2=new Caaa();
    ca1.add2n(5);
    ca2.add2n(10);
  }
}

/*output---
15
55
---------*/

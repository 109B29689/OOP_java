class CCircle{
  final double pi=3.14;
  public void area(double r){
    System.out.println("area(double r)="+r*r*pi);
  }
  public void area(float r){
    System.out.println("area(float r)="+r*r*pi);
  }
  public void area(int r){
    System.out.println("area(int r)="+r*r*pi);
  }
}
class Class13 {  
  public static void main(String args[]) {
    CCircle cir=new CCircle();
    cir.area(2);
    cir.area(2.2f);
    cir.area(2.2);
  } 
}

/*output----------------------------
area(int r)=12.56
area(float r)=15.197600479125978
area(double r)=15.197600000000003
----------------------------------*/
